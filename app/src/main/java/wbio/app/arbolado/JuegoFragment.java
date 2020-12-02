package wbio.app.arbolado;

import android.app.ProgressDialog;
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

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Random;


public class JuegoFragment extends Fragment {

    ImageView img_back_arrrow,img_Juego;
    Button btn_opcion1, btn_opcion2,btn_opcion3,btn_opcion4,btn_opcion5;
    String nivel,especie;
    int  pregunta, aciertos;
    //BaseDatos base;
    int index=0;
    ArrayList<String> opciones, NombreCientifico,NombreComun, nImagenes;
    TextView tv_preguntas;


    public JuegoFragment() {
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
        return inflater.inflate(R.layout.fragment_juego, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //base = new BaseDatos();

        Bundle datosRecuperados = getArguments();
        nivel = datosRecuperados.getString("nivel");
        pregunta = datosRecuperados.getInt("pregunta");
        aciertos = datosRecuperados.getInt("aciertos");

        NombreCientifico = new ArrayList<>();
        NombreComun=new ArrayList<>();
        nImagenes = new ArrayList<>();

        NombreCientifico = datosRecuperados.getStringArrayList("NombreCientifico");
        NombreComun = datosRecuperados.getStringArrayList("NombreComun");
        nImagenes = datosRecuperados.getStringArrayList("nImagenes");


        String acum = "";
        for(int i=0;i<nImagenes.size();i++){
            acum+=NombreCientifico.get(i)+"-"+nImagenes.get(i)+"\n";
        }
        //Toast.makeText(getActivity(), "Datos:\n"+acum, Toast.LENGTH_LONG).show();

        //---------------------------------------------------------------
        //---------------------------------------------------------------
        index = getRandom(0,4);
        especie = NombreCientifico.get(index).toLowerCase().replace("-","_"); //seleccionar la especie aleatoria
        int cantidadImagen = Integer.parseInt(nImagenes.get(index));
        int n = getRandom(1,cantidadImagen-1); //devuelve un numero aleatorio entre min y max

        //Toast.makeText(getContext(),especie , Toast.LENGTH_LONG).show();


        //cambia la imagen
        String cadena = especie+"_"+Integer.toString(n);
        String resID = ServerUrl.getUrlImage()+cadena+".jpg";
        img_Juego = getActivity().findViewById(R.id.img_Juego);

        Picasso.get().load(resID).placeholder(R.drawable.loading).into(img_Juego);
        //-------------------------------------------------

        opciones = NombreComun;

        btn_opcion1 = getActivity().findViewById(R.id.btn_opcion1);
        btn_opcion1.setText(opciones.get(0));
        btn_opcion1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //createCustomDialogOK().show();
                if(index == 0)
                {
                    //createCustomDialogOK().show();
                    ok();
                    //Toast.makeText(getContext(),"ok" , Toast.LENGTH_LONG).show();
                }
                else {
                    incorrect();
                }
            }
        });
        btn_opcion2 = getActivity().findViewById(R.id.btn_opcion2);
        btn_opcion2.setText(opciones.get(1));
        btn_opcion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getContext(),especie + " opcion: "+opciones.get(1) , Toast.LENGTH_LONG).show();

                if(index == 1)
                {
                    //Toast.makeText(getContext(),"ok" , Toast.LENGTH_LONG).show();
                    ok();
                    //Toast.makeText(getContext(),especie + " opcion: "+opciones.get(1) , Toast.LENGTH_LONG).show();
                }
                else {
                    incorrect();
                }
            }
        });

        btn_opcion3 = getActivity().findViewById(R.id.btn_opcion3);
        btn_opcion3.setText(opciones.get(2));
        btn_opcion3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getContext(),especie + " opcion: "+opciones.get(2) , Toast.LENGTH_LONG).show();
                if(index == 2)
                {
                    //Toast.makeText(getContext(),"ok" , Toast.LENGTH_LONG).show();
                    ok();
                    //Toast.makeText(getContext(),especie + " opcion: "+opciones.get(2) , Toast.LENGTH_LONG).show();
                }
                else {
                    incorrect();
                }

            }
        });

        btn_opcion4 = getActivity().findViewById(R.id.btn_opcion4);
        btn_opcion4.setText(opciones.get(3));
        btn_opcion4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //createCustomDialogOK().show();
                //
                //Toast.makeText(getContext(),especie + " opcion: "+opciones.get(3) , Toast.LENGTH_LONG).show();
                if(index == 3)
                {
                    //createCustomDialogOK().show();
                    ok();
                    //Toast.makeText(getContext(),"ok" , Toast.LENGTH_LONG).show();

                }
                else {
                    incorrect();
                }


            }
        });

        btn_opcion5 = getActivity().findViewById(R.id.btn_opcion5);
        btn_opcion5.setText(opciones.get(4));
        btn_opcion5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(index == 4)
                {
                    //Toast.makeText(getContext(),"ok" , Toast.LENGTH_LONG).show();
                    ok();
                }
                else {
                    incorrect();
                }

            }
        });

        tv_preguntas = getActivity().findViewById(R.id.tv_preguntas);
        tv_preguntas.setText(Integer.toString(pregunta) + " de 15");


    }//oncreate


    public void OnViewCreated2(){
        //---------formar la imagen aleatoria-------------


    }//end on OnViewCreated2



    public int getRandom(int min, int max){

        Random r = new Random();
        int result = r.nextInt(max - min + 1) + min;
        return result;
    }

    public void ok(){
        Fragment fragment = null;
        fragment = new DialogOK();
        String nombre = "nav_juego";
        //----------Enviar datos al fragment----------------------------
        Bundle datosAEnviar = new Bundle();
        datosAEnviar.putString("nivel", nivel);
        datosAEnviar.putInt("pregunta", pregunta);
        datosAEnviar.putInt("aciertos", aciertos);
        datosAEnviar.putStringArrayList("NombreCientifico", NombreCientifico);
        datosAEnviar.putStringArrayList("NombreComun", NombreComun);
        datosAEnviar.putStringArrayList("nImagenes", nImagenes);
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
        Fragment fragment = null;
        fragment = new DialogIncorrect();
        String nombre = "nav_juego";
        //----------Enviar datos al fragment----------------------------
        Bundle datosAEnviar = new Bundle();
        datosAEnviar.putString("nivel", nivel);
        datosAEnviar.putInt("pregunta", pregunta);
        datosAEnviar.putInt("aciertos", aciertos);
        datosAEnviar.putString("respuesta",opciones.get(index) );
        datosAEnviar.putStringArrayList("NombreCientifico", NombreCientifico);
        datosAEnviar.putStringArrayList("NombreComun", NombreComun);
        datosAEnviar.putStringArrayList("nImagenes", nImagenes);
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




    /*private int getNumeroRandom(int Low, int High) {
        Random r = new Random();
        int Result = r.nextInt(High-Low) + Low;
        return Result;
    }*/


    /*private void NextGame(boolean correcto) {


        if(correcto)
            aciertos = aciertos + 1;
        pregunta = pregunta +1;

        if(pregunta==16)//terminar el juego
        {
            Fragment fragment = null;
            fragment = new EndGameFragment();
            String nombre = "nav_juego";
            //----------Enviar datos al fragment----------------------------
            Bundle datosAEnviar = new Bundle();
            datosAEnviar.putString("nivel", nivel);
            datosAEnviar.putInt("pregunta", pregunta);
            datosAEnviar.putInt("aciertos", aciertos);
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
        else {

            Fragment fragment = null;
            fragment = new Juego2Fragment();
            String nombre = "nav_juego";
            //----------Enviar datos al fragment----------------------------
            Bundle datosAEnviar = new Bundle();
            datosAEnviar.putString("nivel", nivel);
            datosAEnviar.putInt("pregunta", pregunta);
            datosAEnviar.putInt("aciertos", aciertos);
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
    }
*/
    /*
    public AlertDialog createCustomDialogIncorrect() {
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
        respuesta.setText(opciones.get(index));
        //Button btnCancel = (Button)v.findViewById(R.id.btn_cancel);
        builder.setView(v);
        alertDialog = builder.create();
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
    }*/
}