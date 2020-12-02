package wbio.app.arbolado;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;

import android.Manifest;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.icu.text.SimpleDateFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class AltaArbol extends AppCompatActivity implements View.OnClickListener{

    ImageView alta_back_arrrow;

    private SearchView searchView;
    private ListView listView;
    ArrayList<String> valores;
    ArrayAdapter<String> adapter;

    LinearLayout layoutList;
    Button btn_add_tronco;

    String Especie = "";
    Button btn_alta_arbol;

    EditText input_altura_arbol, input_inicio_copa, input_tronco, input_copa_norte, input_copa_este,input_porcentaje_copa;
    Button btn_altura_arbol, btn_inicio_copa, btn_copa_norte, btn_copa_este, btn_porcentaje_copa,btn_alta_arbol_atras,btn_tronco_help;

    ArrayList<String> troncoList =  new ArrayList<>();

    TextView tv_coordenadas;

    String lat,lon;
    String troncos;

    ImageView imageView_arbol1, imageView_arbol2, imageView_arbol3;

    int selectedImg;

    Uri ImageUri;
    private static final int PICK_IMAGE = 1;
    static final int REQUEST_TAKE_PHOTO = 2;

    String currentPhotoPath = "";

    ServerUrl url;

    ProgressDialog mydialog;
    int serverResponseCode = 0;

    RequestQueue queue;
    ProgressDialog mProgressDialog;
    String nombre_imagen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alta_arbol);

        //Recuperar los datos recibidos de AltaMapsActivity
        tv_coordenadas = AltaArbol.this.findViewById(R.id.tv_coordenadas);

        lat = getIntent().getExtras().getString("lat");
        lon = getIntent().getExtras().getString("lon");
        String coordenada = "Coordenadas del arbol: "+lat + "," + lon;
        tv_coordenadas.setText(coordenada);

        //------------botones de ayuda--------------------------------

        btn_altura_arbol = this.findViewById(R.id.btn_altura_arbol);
        btn_altura_arbol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createHelpDialog("altura").show();
            }
        });

        btn_inicio_copa = this.findViewById(R.id.btn_inicio_copa);
        btn_inicio_copa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createHelpDialog("copa").show();
            }
        });

        btn_tronco_help = this.findViewById(R.id.btn_tronco_help);
        btn_tronco_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createHelpDialog("tronco").show();
            }
        });

        btn_copa_norte = this.findViewById(R.id.btn_copa_norte);
        btn_copa_norte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createHelpDialog("copa_norte").show();
            }
        });

        btn_copa_este = this.findViewById(R.id.btn_copa_este);
        btn_copa_este.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createHelpDialog("copa_este").show();
            }
        });
        btn_porcentaje_copa = this.findViewById(R.id.btn_porcentaje_copa);
        btn_porcentaje_copa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createHelpDialog("porcentaje_copa").show();
            }
        });
        //-------------------------------------------------------------

        btn_alta_arbol_atras = this.findViewById(R.id.btn_alta_arbol_atras);
        btn_alta_arbol_atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AltaArbol.this, AltaArbolMaps.class);
                startActivity(i);
            }
        });


        searchView = AltaArbol.this.findViewById(R.id.searchView_alta);

        searchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //search_bar.onActionViewExpanded();
                //searchView.setIconified(false);
                //searchView.onActionViewExpanded();
                //Toast.makeText(AltaArbol.this, "Mostrar lista", Toast.LENGTH_LONG).show();
            }
        });

        searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener()
        {
            @Override
            public void onFocusChange(final View v, final boolean hasFocus)
            {
                if (hasFocus)
                {
                    // Collapse the searchbox on ActionBar
                    //searchViewMenuItem.collapseActionView();
                    //Toast.makeText(AltaArbol.this, "Mostrar lista", Toast.LENGTH_LONG).show();
                    listView = AltaArbol.this.findViewById(R.id.lv_especie);
                    listView.setBackgroundColor(Color.WHITE);
                    valores = new ArrayList<>();

                    BaseDatos base = new BaseDatos();
                    valores = null;//base.getNOMBRE_COMUN();
                    ArrayList<String> nombre_cientifico = null;//base.getNOMBRE_CIENTIFICO();
                    ArrayList<String> nombre_temp = null;//base.getNOMBRE_COMUN_MAYA();
                    ArrayList<String> nombre_maya = new ArrayList<String>();
                    ArrayList<String> nombre_otros = new ArrayList<String>();

                    for(int i=0; i<nombre_cientifico.size();i++){
                        nombre_cientifico.set(i, nombre_cientifico.get(i).toUpperCase());
                    }

                    //eliminar los NA en el nombre comun maya
                    for(int i=0;i<nombre_temp.size();i++){
                        if(nombre_temp.get(i)!="NA"){
                            nombre_maya.add(nombre_temp.get(i));
                        }
                    }
                    //agregar otros nombres comunes
                    nombre_temp = null;//base.getOTROS_NOMBRES_COMUNES();
                    //eliminar los NA en otros nombres comunes
                    for(int i=0;i<nombre_temp.size();i++){
                        if(nombre_temp.get(i)!="NA"){
                            nombre_otros.add(nombre_temp.get(i));
                        }
                    }

                    valores.addAll(nombre_cientifico);
                    valores.addAll(nombre_maya);
                    valores.addAll(nombre_otros);

                    //-------------------------------------------------

                    adapter =new ArrayAdapter<String>(AltaArbol.this, android.R.layout.simple_list_item_1, valores);
                    listView.setAdapter(adapter);

                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                            String valor = listView.getAdapter().getItem(position).toString();
                            //Toast.makeText(AltaArbol.this, "Has pulsado: "+ valor, Toast.LENGTH_LONG).show();
                            searchView.setQuery(valor, true);
                            Especie = valor;
                        }
                    });

                }else{
                    //Toast.makeText(AltaArbol.this, "borrar lista", Toast.LENGTH_LONG).show();
                    listView = AltaArbol.this.findViewById(R.id.lv_especie);
                    valores = new ArrayList<>();
                    adapter =new ArrayAdapter<String>(AltaArbol.this, android.R.layout.simple_list_item_1, valores);
                    listView.setAdapter(adapter);
                }
            }
        });

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {

                searchView.clearFocus();

                if(valores.contains(s)){
                    try {
                        adapter.getFilter().filter(s);
                    }catch (Exception e){

                    }
                }else{

                }

                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                try {
                    adapter.getFilter().filter(s);
                }catch(Exception e){

                }
                return false;
            }

        });


        layoutList =  AltaArbol.this.findViewById(R.id.layout_list);
        btn_add_tronco = AltaArbol.this.findViewById(R.id.btn_add_tronco);
        btn_add_tronco.setOnClickListener(this);


        //------------Formulario---------------------------------------
        input_altura_arbol = AltaArbol.this.findViewById(R.id.input_altura_arbol);
        input_inicio_copa = AltaArbol.this.findViewById(R.id.input_inicio_copa);
        input_tronco = AltaArbol.this.findViewById(R.id.input_tronco);
        input_copa_norte = AltaArbol.this.findViewById(R.id.input_copa_norte);
        input_copa_este = AltaArbol.this.findViewById(R.id.input_copa_este);
        input_porcentaje_copa = AltaArbol.this.findViewById(R.id.input_porcentaje_copa);

        btn_alta_arbol = AltaArbol.this.findViewById(R.id.btn_alta_arbol);
        btn_alta_arbol.setOnClickListener(this);






        imageView_arbol1 = AltaArbol.this.findViewById(R.id.imageView_arbol1);
        imageView_arbol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedImg = 1;
                FotoGallery();

            }
        });



        if(ContextCompat.checkSelfPermission(AltaArbol.this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission( AltaArbol.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(AltaArbol.this,
                    new String[]{ Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.CAMERA },
                    1000);
        }//*/

        selectedImg = 0;

        url = new ServerUrl();
        mydialog = null;
        queue = Volley.newRequestQueue(this);
    }//end of ceateview

    public AlertDialog createHelpDialog(String opcion) {
        final AlertDialog alertDialog;
        final AlertDialog.Builder builder = new AlertDialog.Builder(AltaArbol.this);
        // Get the layout inflater
        LayoutInflater inflater = getLayoutInflater();
        // Inflar y establecer el layout para el dialogo
        // Pasar nulo como vista principal porque va en el diseño del diálogo
        View v = inflater.inflate(R.layout.dialog_help, null);
        //builder.setView(inflater.inflate(R.layout.dialog_signin, null))
        Button btn_aceptar = (Button)v.findViewById(R.id.btn_dialog_aceptar);
        ImageView imagen = (ImageView)v.findViewById(R.id.dialog_help_image);

        //redimensionar la imagen de acuerdo a la opcion
        if(opcion.equals("alta")){
            float scale = getResources().getDisplayMetrics().density;
            int dpWidthInPx  = (int) (300 * scale);
            int dpHeightInPx = (int) (241 * scale);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dpWidthInPx, dpHeightInPx);
            imagen.setImageResource(R.drawable.help_altura);
            imagen.setLayoutParams(layoutParams);


            //imagen.setImageResource(R.drawable.title_edu_gp2);
        }
        if(opcion.equals("copa")){
            float scale = getResources().getDisplayMetrics().density;
            int dpWidthInPx  = (int) (316 * scale);
            int dpHeightInPx = (int) (337 * scale);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dpWidthInPx, dpHeightInPx);
            imagen.setImageResource(R.drawable.help_copa);
            imagen.setLayoutParams(layoutParams);

            //imagen.setImageResource(R.drawable.title_edu_gp2);
        }
        if(opcion.equals("tronco")){
            float scale = getResources().getDisplayMetrics().density;
            int dpWidthInPx  = (int) (294 * scale);
            int dpHeightInPx = (int) (177 * scale);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dpWidthInPx, dpHeightInPx);
            imagen.setImageResource(R.drawable.help_tronco);
            imagen.setLayoutParams(layoutParams);

            //imagen.setImageResource(R.drawable.title_edu_gp2);
        }
        if(opcion.equals("copa_norte")){
            float scale = getResources().getDisplayMetrics().density;
            int dpWidthInPx  = (int) (294 * scale);
            int dpHeightInPx = (int) (253 * scale);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dpWidthInPx, dpHeightInPx);
            imagen.setImageResource(R.drawable.help_norte);
            imagen.setLayoutParams(layoutParams);

            //imagen.setImageResource(R.drawable.title_edu_gp2);
        }
        if(opcion.equals("copa_este")){
            float scale = getResources().getDisplayMetrics().density;
            int dpWidthInPx  = (int) (294 * scale);
            int dpHeightInPx = (int) (253 * scale);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dpWidthInPx, dpHeightInPx);
            imagen.setImageResource(R.drawable.help_este);
            imagen.setLayoutParams(layoutParams);

            //imagen.setImageResource(R.drawable.title_edu_gp2);
        }
        if(opcion.equals("porcentaje_copa")){
            float scale = getResources().getDisplayMetrics().density;
            int dpWidthInPx  = (int) (294 * scale);
            int dpHeightInPx = (int) (349 * scale);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dpWidthInPx, dpHeightInPx);
            imagen.setImageResource(R.drawable.help_porcentaje);
            imagen.setLayoutParams(layoutParams);

            //imagen.setImageResource(R.drawable.title_edu_gp2);
        }


        builder.setView(v);
        alertDialog = builder.create();
        // Add action buttons
        btn_aceptar.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Aceptar
                        alertDialog.dismiss();

                    }
                }
        );

        return alertDialog;
    }



    public void FotoGallery()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(AltaArbol.this);
        builder.setMessage("Subir foto del arbol");

        builder.setPositiveButton("Tomar foto", new DialogInterface.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            public void onClick(DialogInterface dialog, int id) {
                //do things
                tomarFoto();

            }
        });

        builder.setNegativeButton("Seleccionar de galeria", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                //do things

                cargarGaleria();
            }
        });

        builder.setNeutralButton("Cancelar", new DialogInterface.OnClickListener()     {
            public void onClick(DialogInterface dialog, int id) {
                //do things
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }// en of dialog

    public void cargarGaleria(){

        Intent gallery = new Intent();
        gallery.setType("image/*");
        gallery.setAction(Intent.ACTION_GET_CONTENT);

        startActivityForResult(Intent.createChooser(gallery, "Select Picture"), PICK_IMAGE);

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void tomarFoto(){

        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE); //Lanzamos la aplicacion de camara, existente es un objeto
        //Intent takePictureIntent = new Intent();

        // Ensure that there's a camera activity to handle the intent
        if ( takePictureIntent.resolveActivity(AltaArbol.this.getPackageManager()) != null){ //Si ya se tomo una foto previamente.
            // Create the File where the photo should go
            File photoFile = null;
            try {
                photoFile = createImageFile(); //Recupera el nombre y la ruta donde se guarda la imagen.
                //Toast.makeText(getActivity(), "Archivo Creado en " + photoFile.toString(), Toast.LENGTH_LONG ).show();
            } catch (IOException ex) { // Error occurred while creating the File
                ex.printStackTrace();
                //Toast.makeText(getActivity(), "Error capturando foto", Toast.LENGTH_SHORT).show();
            }
            // Continue only if the File was successfully created
            if (photoFile != null) { //Si la imagen tomada no es un elemento vacio.
                //Uri photoURI = FileProvider.getUriForFile(this,BuildConfig.APPLICATION_ID.concat(".provider"), photoFile); //com.example.testapi
                Uri photoURI = FileProvider.getUriForFile(AltaArbol.this, "wbio.app.Arbolado", photoFile);
                /*ContentValues values = new ContentValues();
                values.put(MediaStore.Images.Media.TITLE, "MyPicture");
                values.put(MediaStore.Images.Media.DESCRIPTION, "Photo taken on " + System.currentTimeMillis());
                Uri photoURI = getContentResolver().insert( MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values );//*/

                takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI);//*/
                //Toast.makeText(getActivity(), "Camara lanzada la URI es :"+photoURI.toString(), Toast.LENGTH_LONG).show();
                startActivityForResult(takePictureIntent, REQUEST_TAKE_PHOTO);//*/ Lanza la actividad de la camara y espera a que el resultado termine.
            }
        }

    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    private File createImageFile() throws IOException {

        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()); //String con el formato de la fecha
        String imageFileName = "Backup_" + timeStamp + "_"; //Nombre de la imagen

        //getExternalFilesDir(); crea una copia en el directorio de la aplicaion
        File storageDir = AltaArbol.this.getExternalFilesDir(Environment.DIRECTORY_PICTURES); //Direcctorio donde se almacenara la imagen
        File image = File.createTempFile( //Crea la imagen con nombre, extencion y ruta
                imageFileName,".jpg", storageDir );
        // Save a file: path for use with ACTION_VIEW intents
        currentPhotoPath = image.getAbsolutePath();
        return image;
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode,  Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == PICK_IMAGE && resultCode == Activity.RESULT_OK && data!=null){
            Uri temp = data.getData();
            ImageUri = temp;
            //ImageUri = data.getData();

            try{
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(AltaArbol.this.getContentResolver(), ImageUri);
                if(selectedImg == 1){
                    imageView_arbol1.setImageBitmap(bitmap);
                }
                if (selectedImg == 2){
                    imageView_arbol2.setImageBitmap(bitmap);
                }
                if(selectedImg == 3){
                    imageView_arbol3.setImageBitmap(bitmap);
                }

            }catch (IOException e){
                e.printStackTrace();
            }
        }//pick image

        if (requestCode == REQUEST_TAKE_PHOTO && resultCode == Activity.RESULT_OK) {

            if(selectedImg == 1){
                imageView_arbol1.setImageURI(Uri.parse(currentPhotoPath));
            }
            if(selectedImg ==2){
                imageView_arbol2.setImageURI(Uri.parse(currentPhotoPath));
            }
            if(selectedImg == 3){
                imageView_arbol3.setImageURI(Uri.parse(currentPhotoPath));
            }

        }

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_add_tronco:
                addView();
                break;
            case R.id.btn_alta_arbol:
                if(validateForm())
                {


                    altaArbol();


                }

                break;
        }

    }

    private void altaArbol() {

        //SendFile();
        //uploadImage();
        //Toast.makeText(getActivity(), "Arbol Registrado", Toast.LENGTH_LONG).show();
        //uploadFile();
        ConfirmarEnvio("Enviar información", "Aceptar", "Cancelar");
    }

    public void ConfirmarEnvio(String mensaje, String positivo, String negativo)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(AltaArbol.this);
        builder.setMessage(mensaje);

        builder.setPositiveButton(positivo, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                //do things

                mydialog = ProgressDialog.show(AltaArbol.this, "", "Enviando Archivo...", true);
                //uploadFile(uploadFilePath + uploadFileName);
                new Thread(new Runnable() {
                    public void run() {
                        AltaArbol.this.runOnUiThread(new Runnable() {
                            public void run() {
                                //messageText.setText("uploading started.....");
                                //messageText.setText(myFile.readFile(MainActivity.this.getFilesDir().toString(), "MiArchivo"));
                            }
                        });

                        uploadFile();

                    }
                }).start();


            }
        });

        builder.setNegativeButton(negativo, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                //do things
            }
        });

        /*builder.setNeutralButton("CANCEL", new DialogInterface.OnClickListener()     {
            public void onClick(DialogInterface dialog, int id) {
                //do things
            }
        });*/
        AlertDialog alert = builder.create();
        alert.show();
    }// en of ConfirmarEnvio

    public void uploadFile() {
        String sourceFileUri = ImageUri.toString();
        try {
            sourceFileUri = PathUtil.getPath(AltaArbol.this, ImageUri);
        }catch (Exception e){

        }
        HttpURLConnection mHttpURLConnection = null;
        DataOutputStream mOutputStream = null;
        String strLineEnd = "\r\n";
        String strTwoHyphens = "--";
        String strUpLoadServerUri = ServerUrl.getUploadImageServer();
        String strBoundary = "*****";
        int bytesRead, bytesAvailable, bufferSize;
        byte[] buffer;
        int maxBufferSize = 1 * 1024 * 1024;
        File sourceFile = new File(sourceFileUri);

        nombre_imagen = "";
        nombre_imagen = Especie.toString().toLowerCase().replace(" ", "_");
        //quitar acentos
        nombre_imagen = nombre_imagen.replace("á", "a");
        nombre_imagen = nombre_imagen.replace("é", "e");
        nombre_imagen = nombre_imagen.replace("í", "i");
        nombre_imagen = nombre_imagen.replace("ó", "o");

        nombre_imagen = nombre_imagen+"_"+random_id()+".jpg";

        if (!sourceFile.isFile()) {

            mydialog.dismiss();



            AltaArbol.this.runOnUiThread(new Runnable() {
                public void run() {
                    //messageText.setText("Source File not exist :"+uploadFilePath + "" + uploadFileName);
                    //Toast.makeText(getActivity(), "Source File not exist ", Toast.LENGTH_LONG).show();
                }
            });

        }
        else
        {

            try {

                // open a URL connection to the Servlet
                FileInputStream fileInputStream = new FileInputStream(sourceFile);
                URL url = new URL(strUpLoadServerUri);

                // Open a HTTP connection to the URL

                mHttpURLConnection = (HttpURLConnection) url.openConnection();
                mHttpURLConnection.setDoInput(true); // Allow Inputs
                mHttpURLConnection.setDoOutput(true); // Allow Outputs
                mHttpURLConnection.setUseCaches(false); // Don't use a Cached Copy

                mHttpURLConnection.setRequestMethod("POST");
                mHttpURLConnection.setRequestProperty("Connection","Keep-Alive");
                mHttpURLConnection.setRequestProperty("ENCTYPE","multipart/form-data");
                mHttpURLConnection.setRequestProperty("Content-Type","multipart/form-data;boundary=" + strBoundary);
                mHttpURLConnection.setRequestProperty("uploaded_file",sourceFileUri);
                //mHttpURLConnection.setRequestProperty("foto",sourceFileUri);

                //mHttpURLConnection.setRequestProperty("Opcion","1");

                mOutputStream = new DataOutputStream(mHttpURLConnection.getOutputStream());

                mOutputStream.writeBytes(strTwoHyphens + strBoundary + strLineEnd);
                mOutputStream.writeBytes("Content-Disposition: form-data; name=\"uploaded_file\";filename="+ nombre_imagen + strLineEnd);
                //mOutputStream.writeBytes("Content-Disposition: form-data; name=\"foto\";filename="+ sourceFileUri + strLineEnd);
                // mOutputStream.writeBytes("Content-Disposition: form-data; name=\"Opcion\";" + strLineEnd);

                mOutputStream.writeBytes(strLineEnd);

                // create a buffer of maximum size
                bytesAvailable = fileInputStream.available();

                bufferSize = Math.min(bytesAvailable, maxBufferSize);
                buffer = new byte[bufferSize];

                // read file and write it into form...
                bytesRead = fileInputStream.read(buffer, 0, bufferSize);

                while (bytesRead > 0) {

                    mOutputStream.write(buffer, 0, bufferSize);
                    bytesAvailable = fileInputStream.available();
                    bufferSize = Math.min(bytesAvailable, maxBufferSize);
                    bytesRead = fileInputStream.read(buffer, 0, bufferSize);

                }

                // send multipart form data necesssary after file data...
                mOutputStream.writeBytes(strLineEnd);
                mOutputStream.writeBytes(strTwoHyphens + strBoundary + strTwoHyphens + strLineEnd);

                // Responses from the server (code and message)
                serverResponseCode = mHttpURLConnection.getResponseCode();

                // close the streams //
                fileInputStream.close();
                mOutputStream.flush();
                mOutputStream.close();

            } catch (MalformedURLException ex) {
                ex.printStackTrace();

                Toast.makeText(AltaArbol.this, "Upload file to server error: " + ex.getMessage(), Toast.LENGTH_LONG).show();

            } catch (Exception e) {
                e.printStackTrace();

                Toast.makeText(AltaArbol.this, "Exception : " + e.getMessage(), Toast.LENGTH_LONG).show();
            }
        }

        if (serverResponseCode == 200) {

            mydialog.dismiss();

            AltaArbol.this.runOnUiThread(new Runnable() {
                public void run() {
                    //Toast.makeText(getActivity(), "Archivo enviado exitosamente",Toast.LENGTH_SHORT).show();
                    makePost(url.getUrl()+"/setMarkers");
                }
            });
        }
        else{

            mydialog.dismiss();

            AltaArbol.this.runOnUiThread(new Runnable() {
                public void run() {

                    TerminarAlert("Ocurrio un error al subir la información");

                    //ConfirmarUpload("Archivo enviado exitosamente", "Aceptar");
                }
            });
        }
    }// end of uploadFile

    public void makePost(String myurl){

        mProgressDialog = ProgressDialog.show(AltaArbol.this,"Guardando información", "Porfavor espere...",false,false);

        StringRequest postRequest = new StringRequest(Request.Method.POST, myurl,
                new Response.Listener<String>()
                {
                    @Override
                    public void onResponse(String response) {
                        // response

                        if(response.contains("ok")) {

                            mProgressDialog.dismiss();
                            TerminarAlert("Información enviada con éxito");
                            //Show success toast
                            //Toast.makeText(mContext,"Correo enviado",Toast.LENGTH_SHORT).show();

                        }
                        else {
                            mProgressDialog.dismiss();
                            //respuesta.setText(response);
                        }
                    }
                },
                new Response.ErrorListener()
                {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // error
                        //respuesta.setText("Ocurrio un error en la conexión");
                        mProgressDialog.dismiss();
                        TerminarAlert("Ocurrio un error en la conexión, intentelo más tarde");
                    }
                }){
            @Override
            protected Map<String, String> getParams()
            {
                String ruta = "https://www.plataformaciudadanacovid.com/Arbolado/uploads/"+nombre_imagen;

                Map<String, String> params = new HashMap<String, String>();
                params.put("name", Especie);
                params.put("lat", lat);
                params.put("lon", lon);
                params.put("url", ruta);

                return params;
            }
        };
        queue.add(postRequest);
    }//end of makePost

    public void TerminarAlert(String mensaje)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(AltaArbol.this);
        builder.setMessage(mensaje);

        builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                //do things
            }
        });

        AlertDialog alert = builder.create();
        alert.show();
    }// en of ConfirmarEnvio

    public String random_id(){
        char [] chars = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();
        // Longitud del array de char.
        int charsLength = chars.length;
        // Instanciamos la clase Random
        Random random = new Random();
        // Un StringBuffer para componer la cadena aleatoria de forma eficiente
        StringBuffer buffer = new StringBuffer();
        // Bucle para elegir una cadena de 10 caracteres al azar
        for (int i=0;i<5;i++){
            // Añadimos al buffer un caracter al azar del array
            buffer.append(chars[random.nextInt(charsLength)]);
        }
        // Y solo nos queda hacer algo con la cadena
        String salida =  buffer.toString();
        return salida;
    }


    /*private void sendEmail(ArrayList<String> datosIncentivos) {
        //Toast.makeText(getActivity(), "Enviar Email", Toast.LENGTH_LONG).show();
        String message = "";
        String subject = "Solicitud de Incentivo por Arbolado Urbano";
        String email = datosIncentivos.get(3);

        for(int i=0;i<datosIncentivos.size();i++){
            message = message + datosIncentivos.get(i) +"\n";
        }
        message = message + tv_coordenadas.getText().toString()+"\n";
        message = message + "Nombre de la especie: "+ Especie + "\n";
        message = message + "Altura del arbol: "+ input_altura_arbol.getText().toString() + "\n";
        message = message + "Altura del inicio de la copa: "+ input_inicio_copa.getText().toString() + "\n";
        message = message + "Circunferencia del tronco principal: "+ input_tronco.getText().toString() + "\n";
        message = message + "Circunferencia de los troncos: "+ troncos + "\n";
        message = message + "Diámetro de la copa Norte-Sur: "+ input_copa_norte.getText().toString() + "\n";
        message = message + "Diámetro de la copa este-oeste: "+ input_copa_este.getText().toString() + "\n";
        message = message + "Porcentaje de Copa: "+ input_porcentaje_copa.getText().toString() + "\n";


        JavaMailAPI javaMailAPI = new JavaMailAPI(getContext(), email, subject, message);

        Bitmap bitmap = ((BitmapDrawable)imageView_arbol1.getDrawable()).getBitmap();
        javaMailAPI.addImage(bitmap);
        javaMailAPI.execute();
    }*/

    public boolean validateForm(){
        if(Especie.isEmpty()){
            Toast.makeText(AltaArbol.this, "Debe seleccionar la especie del Árbol ", Toast.LENGTH_LONG).show();
        }
        else if(selectedImg == 0){
            Toast.makeText(AltaArbol.this, "Debe cargar al menos una imagen", Toast.LENGTH_LONG).show();
        }
        else if(input_altura_arbol.getText().toString().isEmpty()){
            input_altura_arbol.setError("Este campo no puede estar vacío");
        }
        else if(input_inicio_copa.getText().toString().isEmpty()){
            input_inicio_copa.setError("Este campo no puede estar vacío");
        }
        else if(input_tronco.getText().toString().isEmpty()){
            input_tronco.setError("Este campo no puede estar vacío");
        }
        else if(input_copa_norte.getText().toString().isEmpty()){
            input_copa_norte.setError("Este campo no puede estar vacío");
        }
        else if(input_copa_este.getText().toString().isEmpty()){
            input_copa_este.setError("Este campo no puede estar vacío");
        }
        else if(input_porcentaje_copa.getText().toString().isEmpty()){
            input_porcentaje_copa.setError("Este campo no puede estar vacío");
        }
        else{
            input_altura_arbol.setError(null);
            input_inicio_copa.setError(null);
            input_tronco.setError(null);
            input_copa_norte.setError(null);
            input_copa_este.setError(null);
            input_porcentaje_copa.setError(null);
            getTroncos();
            troncos = "";
            for(int i=0;i<troncoList.size();i++)
            {
                troncos = troncos + troncoList.get(i)+"-";
            }

            // la variable troncos tiene las circunferencias de los troncos dinamicos

            //Toast.makeText(getActivity(), "Datos enviados ", Toast.LENGTH_LONG).show();
            return true;
        }
        return false;
    }

    public void getTroncos(){
        troncoList.clear();

        for(int i=0; i<layoutList.getChildCount();i++){
            View crickerView = layoutList.getChildAt(i);
            EditText editText = crickerView.findViewById(R.id.edit_add);

            if(!editText.getText().toString().isEmpty()){
                troncoList.add(editText.getText().toString());
            }

        }
    }



    private void addView() {
        final View nuevaView = getLayoutInflater().inflate(R.layout.row_add,null,false);
        EditText editText = nuevaView.findViewById(R.id.edit_add);
        Button btn_row_remove = nuevaView.findViewById(R.id.btn_row_remove);

        btn_row_remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                removeView(nuevaView);
            }
        });

        layoutList.addView(nuevaView);

    }

    private void removeView(View view){
        layoutList.removeView(view);
    }



}