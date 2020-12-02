package wbio.app.arbolado;

import android.content.res.Resources;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Juego2Fragment extends Fragment {

    ImageView img_back_arrrow;
    ImageView img1, img2,img3,img4,img5;

    TextView juego_especie;
    String nivel,especie, nombre;
    int pregunta,aciertos;
    //BaseDatos base;
    int index=0;
    ArrayList<String> opciones,especies;
    ArrayList<String> imagenes;

    TextView tv_preguntas;

    ArrayList<String> NombreCientifico,NombreComun, nImagenes;

    ArrayList<String> NombreCientifico1,NombreComun1, nImagenes1;


    public Juego2Fragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_juego2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //base = new BaseDatos();
        NombreCientifico = new ArrayList<>();
        NombreComun= new ArrayList<>();
        nImagenes = new ArrayList<>();

        Bundle datosRecuperados = getArguments();
        nivel = datosRecuperados.getString("nivel");
        pregunta = datosRecuperados.getInt("pregunta");
        aciertos = datosRecuperados.getInt("aciertos");
        NombreCientifico = datosRecuperados.getStringArrayList("NombreCientifico");
        NombreComun = datosRecuperados.getStringArrayList("NombreComun");
        nImagenes = datosRecuperados.getStringArrayList("nImagenes");

        NombreCientifico1 = new ArrayList<>();
        NombreComun1= new ArrayList<>();
        nImagenes1 = new ArrayList<>();

        NombreCientifico1 = NombreCientifico;
        NombreComun1 = NombreComun;
        nImagenes1 = nImagenes;


        String acum = "";
        for(int i=0;i<nImagenes1.size();i++){
            acum+=NombreCientifico1.get(i)+"-"+nImagenes1.get(i)+"\n";
        }
        //Toast.makeText(getActivity(), "Datos:\n"+acum, Toast.LENGTH_LONG).show();



        //---------formar la imagen aleatoria-------------
        imagenes = new ArrayList<>();
        index = getRandom(0,4);
        especie = NombreCientifico.get(index); //seleccionar la especie aleatoria

        //-----reordenar las especies para las fotos------------
        especies = new ArrayList<>();
        especies = NombreCientifico;


        juego_especie = getActivity().findViewById(R.id.juego2_especie);
        nombre = NombreComun.get(index);
        juego_especie.setText(nombre);

        //Collections.shuffle(especies);

        //imagen 1
        int cantidadImagen = getNumeroImagenes(especies.get(0));
        int n = getNumeroRandom(1,cantidadImagen); //devuelve un numero aleatorio entre min y max
        String cadena = especies.get(0).toLowerCase().replace("-","_")+"_"+Integer.toString(n);
        String resID = ServerUrl.getUrlImage()+cadena+".jpg";
        img1 = getActivity().findViewById(R.id.img_juego1);

        Picasso.get().load(resID).placeholder(R.drawable.loading).resize(180,180).centerCrop().into(img1, new Callback() {
            @Override
            public void onSuccess() {
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(), e.toString(), Toast.LENGTH_LONG).show();
            }
        });
        imagenes.add(resID);



        //imagen 2
        cantidadImagen = getNumeroImagenes(especies.get(1));
        n = getNumeroRandom(1,cantidadImagen); //devuelve un numero aleatorio entre min y max
        cadena = especies.get(1).toLowerCase().replace("-","_")+"_"+Integer.toString(n);
        resID = ServerUrl.getUrlImage()+cadena+".jpg";
        img2 = getActivity().findViewById(R.id.img_juego2);

        Picasso.get().load(resID).placeholder(R.drawable.loading).resize(180,180).centerCrop().into(img2, new Callback() {
            @Override
            public void onSuccess() {
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(), e.toString(), Toast.LENGTH_LONG).show();
            }
        });

        imagenes.add(resID);

        //imagen 3
        cantidadImagen = getNumeroImagenes(especies.get(2));
        n = getNumeroRandom(1,cantidadImagen); //devuelve un numero aleatorio entre min y max
        cadena = especies.get(2).toLowerCase().replace("-","_")+"_"+Integer.toString(n);
        resID = ServerUrl.getUrlImage()+cadena+".jpg";
        img3 = getActivity().findViewById(R.id.img_juego3);
        Picasso.get().load(resID).placeholder(R.drawable.loading).resize(180,180).centerCrop().into(img3, new Callback() {
            @Override
            public void onSuccess() {
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(), e.toString(), Toast.LENGTH_LONG).show();
            }
        });
        imagenes.add(resID);

        //imagen 4
        cantidadImagen = getNumeroImagenes(especies.get(3));
        n = getNumeroRandom(1,cantidadImagen); //devuelve un numero aleatorio entre min y max
        cadena = especies.get(3).toLowerCase().replace("-","_")+"_"+Integer.toString(n);
        resID = ServerUrl.getUrlImage()+cadena+".jpg";
        img4 = getActivity().findViewById(R.id.img_juego4);

        Picasso.get().load(resID).placeholder(R.drawable.loading).resize(180,180).centerCrop().into(img4, new Callback() {
            @Override
            public void onSuccess() {
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(), e.toString(), Toast.LENGTH_LONG).show();
            }
        });
        imagenes.add(resID);

        //imagen 5
        cantidadImagen = getNumeroImagenes(especies.get(4));
        n = getNumeroRandom(1,cantidadImagen); //devuelve un numero aleatorio entre min y max
        cadena = especies.get(4).toLowerCase().replace("-","_")+"_"+Integer.toString(n);
        resID = ServerUrl.getUrlImage()+cadena+".jpg";
        img5 = getActivity().findViewById(R.id.img_juego5);

        Picasso.get().load(resID).placeholder(R.drawable.loading).resize(180,180).centerCrop().into(img5, new Callback() {
            @Override
            public void onSuccess() {
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(), e.toString(), Toast.LENGTH_LONG).show();
            }
        });
        imagenes.add(resID);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(), "imagen:"+especies.get(0)+" respuesta:"+especie, Toast.LENGTH_LONG).show();
                if(especies.get(0).equals(especie)){
                    ok();
                    //createCustomDialogOK().show();
                    //Toast.makeText(getActivity(), "correcto", Toast.LENGTH_LONG).show();
                }
                else{
                    //createCustomDialogIncorrect().show();
                    incorrect();
                }

            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //createCustomDialogOK2();
                //Toast.makeText(getActivity(), "imagen:"+especies.get(1)+" respuesta:"+especie, Toast.LENGTH_LONG).show();
                if(especies.get(1).equals(especie)){
                    ok();
                    //createCustomDialogOK().show();
                    //Toast.makeText(getActivity(), "correcto", Toast.LENGTH_LONG).show();
                }
                else{
                    //createCustomDialogIncorrect().show();
                    incorrect();
                }
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(), "imagen:"+especies.get(2)+" respuesta:"+especie, Toast.LENGTH_LONG).show();
                if(especies.get(2).equals(especie)){
                    ok();
                    //createCustomDialogOK().show();
                    //Toast.makeText(getActivity(), "correcto", Toast.LENGTH_LONG).show();
                }
                else{
                    //createCustomDialogIncorrect().show();
                    incorrect();
                }
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(), "imagen:"+especies.get(3)+" respuesta:"+especie, Toast.LENGTH_LONG).show();
                if(especies.get(3).equals(especie)){
                    ok();
                    //createCustomDialogOK().show();
                    //Toast.makeText(getActivity(), "correcto", Toast.LENGTH_LONG).show();
                }
                else{
                    //createCustomDialogIncorrect().show();
                    incorrect();
                }
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Toast.makeText(getActivity(), "imagen:"+especies.get(4)+" respuesta:"+especie, Toast.LENGTH_LONG).show();
                if(especies.get(4).equals(especie)){
                    ok();
                    //createCustomDialogOK().show();
                    //Toast.makeText(getActivity(), "correcto", Toast.LENGTH_LONG).show();
                }
                else{
                    //createCustomDialogIncorrect().show();
                    incorrect();
                }
            }
        });

        tv_preguntas = getActivity().findViewById(R.id.tv_preguntas2);
        tv_preguntas.setText(Integer.toString(pregunta) + " de 15");


    }//oncreate

    public int getNumeroImagenes(String nombre){
        //Toast.makeText(getActivity(), "getNumeroImagenes:"+nombre, Toast.LENGTH_LONG).show();

        int indice = 0;
        indice = NombreCientifico.indexOf(nombre);
        int n = Integer.parseInt(nImagenes.get(indice));
        return n;
    }


    public int getRandom(int min, int max){

        Random r = new Random();
        int result = r.nextInt(max - min + 1) + min;
        return result;
    }

    private int getNumeroRandom(int Low, int High) {
        Random r = new Random();
        int Result = r.nextInt(High-Low) + Low;
        return Result;
    }

    /*public AlertDialog createCustomDialogOK() {
        final AlertDialog alertDialog2;
        final AlertDialog.Builder builder2 = new AlertDialog.Builder(getContext());
        // Get the layout inflater
        LayoutInflater inflater = getLayoutInflater();
        // Inflar y establecer el layout para el dialogo
        // Pasar nulo como vista principal porque va en el diseño del diálogo
        View v = inflater.inflate(R.layout.dialog_ok, null);
        //builder.setView(inflater.inflate(R.layout.dialog_signin, null))
        Button btn_aceptar = (Button)v.findViewById(R.id.btn_dialog_success);
        //Button btnCancel = (Button)v.findViewById(R.id.btn_cancel);
        builder2.setView(v);
        alertDialog2 = builder2.create();
        // Add action buttons
        btn_aceptar.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Aceptar
                        alertDialog2.dismiss();
                        NextGame(true);
                    }
                }
        );

        return alertDialog2;
    }*/

    /*public AlertDialog createCustomDialogIncorrect() {
        final AlertDialog alertDialog;
        final AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        // Get the layout inflater
        LayoutInflater inflater = getLayoutInflater();
        // Inflar y establecer el layout para el dialogo
        // Pasar nulo como vista principal porque va en el diseño del diálogo
        View v = inflater.inflate(R.layout.dialog_incorrect, null);
        //builder.setView(inflater.inflate(R.layout.dialog_signin, null))
        Button btn_aceptar = (Button)v.findViewById(R.id.btn_dialog_incorrect);
        TextView respuesta = (TextView) v.findViewById(R.id.dialog_respuesta);
        respuesta.setText(nombre);
        //Button btnCancel = (Button)v.findViewById(R.id.btn_cancel);
        builder.setView(v);
        alertDialog = builder.create();

        //encontrar la imagen correcta
        ImageView dialog_image = (ImageView) v.findViewById(R.id.dialog_image);
        int index = 0;
        for(int i=0;i<imagenes.size();i++){
            if(especies.get(i).equals(especie)){
                index = i;
            }
        }
        dialog_image.setImageResource(imagenes.get(index));

        // Add action buttons
        btn_aceptar.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Aceptar
                        alertDialog.dismiss();
                        NextGame(false);
                    }
                }
        );

        return alertDialog;
    }
*/
    public void ok(){
        Fragment fragment = null;
        fragment = new DialogOK();
        String nombre = "nav_juego";
        //----------Enviar datos al fragment----------------------------
        Bundle datosAEnviar = new Bundle();
        datosAEnviar.putString("nivel", nivel);
        datosAEnviar.putInt("pregunta", pregunta);
        datosAEnviar.putInt("aciertos", aciertos);
        datosAEnviar.putStringArrayList("NombreCientifico", NombreCientifico1);
        datosAEnviar.putStringArrayList("NombreComun", NombreComun1);
        datosAEnviar.putStringArrayList("nImagenes", nImagenes1);
        fragment.setArguments(datosAEnviar);
        //----------------------------------------------------------------
        //replacing the fragment
        if (fragment != null) {
            FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragment);
            ft.addToBackStack(nombre);
            ft.commit();
        }
        DrawerLayout drawer = (DrawerLayout) getActivity().findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

    }
    public void incorrect(){
        int index = 0;
        for(int i=0;i<imagenes.size();i++){
            if(especies.get(i).equals(especie)){
                index = i;
            }
        }
        //dialog_image.setImageResource(imagenes.get(index));
        Fragment fragment = null;
        fragment = new DialogIncorrect();
        String nombref = "nav_juego";
        //----------Enviar datos al fragment----------------------------
        Bundle datosAEnviar = new Bundle();
        datosAEnviar.putString("nivel", nivel);
        datosAEnviar.putInt("pregunta", pregunta);
        datosAEnviar.putInt("aciertos", aciertos);
        datosAEnviar.putString("respuesta",nombre );
        datosAEnviar.putString("resID",imagenes.get(index) );
        datosAEnviar.putStringArrayList("NombreCientifico", NombreCientifico1);
        datosAEnviar.putStringArrayList("NombreComun", NombreComun1);
        datosAEnviar.putStringArrayList("nImagenes", nImagenes1);

        fragment.setArguments(datosAEnviar);

        //----------------------------------------------------------------
        //replacing the fragment
        if (fragment != null) {
            FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragment);
            ft.addToBackStack(nombref);
            ft.commit();
        }
        DrawerLayout drawer = (DrawerLayout) getActivity().findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);


    }

    /*private void NextGame(boolean correcto) {

        if(correcto)
            aciertos = aciertos + 1;
        pregunta = pregunta +1;


        Fragment fragment = null;
        fragment = new JuegoFragment();
        String nombre = "nav_juego";

        //----------Enviar datos al fragment----------------------------
        Bundle datosAEnviar = new Bundle();
        datosAEnviar.putString("nivel", nivel);
        datosAEnviar.putInt("pregunta", pregunta);
        datosAEnviar.putInt("aciertos", aciertos);
        fragment.setArguments(datosAEnviar);


        //replacing the fragment
        if (fragment != null) {
            FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragment);
            ft.addToBackStack(nombre);
            ft.commit();
        }

        DrawerLayout drawer = (DrawerLayout) getActivity().findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }*/
}