package wbio.app.arbolado;

import android.app.ProgressDialog;
import android.media.Image;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;


public class JuegoIntroFragment extends Fragment {

    ImageView img_back_arrrow,juegoIntro;
    String nivel;
    Button btn_comenzar;


    public JuegoIntroFragment() {
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
        return inflater.inflate(R.layout.fragment_juego_intro, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Bundle datosRecuperados = getArguments();
        nivel = datosRecuperados.getString("nivel");
        //Toast.makeText(getActivity(), nivel, Toast.LENGTH_LONG).show();

        juegoIntro = getActivity().findViewById(R.id.juegoIntro);
        if(nivel.equals("1")){
            juegoIntro.setImageResource(R.drawable.img_n1);
        }
        if(nivel.equals("2")){
            juegoIntro.setImageResource(R.drawable.img_n2);
        }
        if(nivel.equals("3")){
            juegoIntro.setImageResource(R.drawable.img_n3);
        }
        if(nivel.equals("4")){
            juegoIntro.setImageResource(R.drawable.img_n4);
        }
        if(nivel.equals("5")){
            juegoIntro.setImageResource(R.drawable.img_n5);
        }
        if(nivel.equals("6")){
            juegoIntro.setImageResource(R.drawable.img_n6);
        }if(nivel.equals("7")){
            juegoIntro.setImageResource(R.drawable.img_n7);
        }



        img_back_arrrow = getActivity().findViewById(R.id.juegointro_back_arrrow);
        img_back_arrrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = null;
                fragment = new EduIntroFragment();
                String nombre = "nav_eduintro";

                //----------Enviar datos al fragment----------------------------
                Bundle datosAEnviar = new Bundle();
                datosAEnviar.putString("nivel", nivel);

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
        });
        btn_comenzar = getActivity().findViewById(R.id.btn_comenzar);

        getBiblioteca();

    }

    ProgressDialog mydialog;
    ArrayList<String> NombreComun, NombreCientifico, Nivel, nImagenes;
    public void getBiblioteca(){
        mydialog = ProgressDialog.show(getContext(), "", "Cargando datos...", true);

        NombreComun = new ArrayList<>();
        NombreCientifico = new ArrayList<>();
        Nivel = new ArrayList<>();
        nImagenes = new ArrayList<>();
        RequestQueue queue = Volley.newRequestQueue(getContext());
        ServerUrl url = new ServerUrl();

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url.getUrl()+"/getBiblioteca",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Respuesta del servidor

                        try {

                            JSONArray jsonArray = new JSONArray(response);
                            for (int i=0; i < jsonArray.length(); i++)
                            {
                                JSONObject oneObject = jsonArray.getJSONObject(i);
                                // Pulling items from the array

                                String temp = oneObject.getString("NIVEL");
                                if(nivel.equals(temp))
                                {
                                    NombreCientifico.add(oneObject.getString("NOMBRE_CIENTIFICO"));
                                    NombreComun.add(oneObject.getString("NOMBRE_COMUN"));
                                    nImagenes.add(oneObject.getString("IMAGENES_NIVEL").trim());
                                }

                            }
                            //String acum = "";
                            /*for(int i=0;i<NombreCientifico.size();i++)
                                acum+=NombreCientifico.get(i)+"\n";*/
                            //
                            //La información se cargo correctamente
                            //index = getRandom(0,5);
                            //Toast.makeText(getActivity(),Integer.toString(index),Toast.LENGTH_SHORT).show();
                            OnViewCreated2();


                        }catch(Exception e){
                            //Toast.makeText(getActivity(),"error json: ",Toast.LENGTH_SHORT).show();
                            Toast.makeText(getActivity(),e.toString(),Toast.LENGTH_SHORT).show();
                        }
                        mydialog.dismiss();

                    }//end of response
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //respuesta.setText("That didn't work!");

                mydialog.dismiss();
                //Toast.makeText(getContext(),error.toString(),Toast.LENGTH_SHORT).show();
                Toast.makeText(getContext(),"Error en la conexión del servidor",Toast.LENGTH_SHORT).show();


            }
        });
        // Add the request to the RequestQueue.
        stringRequest.setRetryPolicy(new DefaultRetryPolicy(
                20000,
                DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        queue.add(stringRequest);

    }//end of getBiblioteca


    public void OnViewCreated2(){

        btn_comenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = null;
                fragment = new JuegoFragment();
                String nombre = "nav_juego";

                //----------Enviar datos al fragment----------------------------
                Bundle datosAEnviar = new Bundle();
                datosAEnviar.putString("nivel", nivel);
                datosAEnviar.putInt("pregunta", 1);
                datosAEnviar.putInt("aciertos", 0);
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
        });

    }

}