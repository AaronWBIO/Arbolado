package wbio.app.arbolado;


import android.app.ProgressDialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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

public class FiltroFragment extends Fragment {


    ArrayList<String> valores;
    ArrayAdapter<String> adapter;

    ArrayList<String> especies_cientifico;

    String hoja,corteza,flor;
    TextView tv_resultado;

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    MyRecyclerViewAdapter recyclerViewAdapter;

    //int arr[] = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4,R.drawable.pic5,R.drawable.pic6,R.drawable.pic7,R.drawable.pic8,R.drawable.pic9,R.drawable.pic10,R.drawable.pic11,R.drawable.pic12};

    ArrayList<Integer> nombreImagenes;

    ProgressDialog mydialog;
    ArrayList<String> NombreComun, NombreCientifico, TipoHoja, Corteza, Flor;

    //BaseDatos base;

    Button btn_atras;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        return inflater.inflate(R.layout.fragment_filtro, container, false);
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        //getActivity().setTitle("Identificación Guiada");


        //retomar los valores de hoja y corteza
        Bundle datosRecuperados = getArguments();
        //
        corteza = "";
        hoja = "";
        flor ="";
        hoja = datosRecuperados.getString("hoja");
        corteza = datosRecuperados.getString("corteza");
        flor = datosRecuperados.getString("flor");


        getBiblioteca();

    }//onViewCreated



    public void getBiblioteca(){
        mydialog = ProgressDialog.show(getContext(), "", "Cargando datos...", true);

        NombreComun = new ArrayList<>();
        NombreCientifico = new ArrayList<>();
        TipoHoja = new ArrayList<>();
        Corteza = new ArrayList<>();
        Flor = new ArrayList<>();
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
                                NombreCientifico.add(oneObject.getString("NOMBRE_CIENTIFICO"));
                                NombreComun.add(oneObject.getString("NOMBRE_COMUN"));
                                TipoHoja.add(oneObject.getString("TIPO_DE_HOJA"));
                                Corteza.add(oneObject.getString("CORTEZA"));
                                Flor.add(oneObject.getString("FLOR"));

                            }

                            //Toast.makeText(getActivity(),NombreComun.get(1),Toast.LENGTH_SHORT).show();
                            //La información se cargo correctamente
                            OnViewCreated2();


                        }catch(Exception e){
                            Toast.makeText(getActivity(),"error json: ",Toast.LENGTH_SHORT).show();
                        }
                        mydialog.dismiss();

                    }//end of response
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //respuesta.setText("That didn't work!");

                mydialog.dismiss();
                Toast.makeText(getContext(),error.toString(),Toast.LENGTH_SHORT).show();

            }
        });
        // Add the request to the RequestQueue.
        stringRequest.setRetryPolicy(new DefaultRetryPolicy(
                20000,
                DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        queue.add(stringRequest);

    }


    public void OnViewCreated2(){
        especies_cientifico = Filtrar(hoja, corteza, flor);
        nombreImagenes = new ArrayList<>();
        ArrayList<String> nombresComun = new ArrayList<>();
        nombresComun = getNombreComun(especies_cientifico);

        Resources res = getResources();
        for(int i=0; i<especies_cientifico.size();i++)
        {
            String cadena = especies_cientifico.get(i).toLowerCase().replace("-","_")+"_1";
            cadena = cadena.replace("á", "a");
            cadena = cadena.replace("é", "e");
            cadena = cadena.replace("í", "i");
            cadena = cadena.replace("ó", "o");
            int resID = res.getIdentifier(cadena , "drawable", getActivity().getPackageName());
            nombreImagenes.add(resID);

        }

        tv_resultado = getActivity().findViewById(R.id.tv_resultado_filtro);
        tv_resultado.setText("Se encontraron " + Integer.toString(especies_cientifico.size()) + " especies:");

        recyclerView = getActivity().findViewById(R.id.recyclerViewFilter);
        layoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter = new MyRecyclerViewAdapter(especies_cientifico,nombresComun ,nombreImagenes);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setHasFixedSize(true);

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getActivity(), recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        // do whatever
                        Bundle datosAEnviar = new Bundle();
                        // Aquí pon todos los datos que quieras en formato clave, valor
                        datosAEnviar.putString("NombreCientifico", especies_cientifico.get(position));//el nombre cientifico esta en mayusculas

                        Fragment fragment = null;
                        fragment = new FichaFragment();
                        String nombre = "nav_ficha";

                        //enviar los datos
                        fragment.setArguments(datosAEnviar);
                        //---------------------------------------------------------------

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

                    @Override public void onLongItemClick(View view, int position) {
                        // do whatever
                    }
                })
        );

        btn_atras = getActivity().findViewById(R.id.btn_filtro_back);
        btn_atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle datosAEnviar = new Bundle();
                // Aquí pon todos los datos que quieras en formato clave, valor
                datosAEnviar.putString("hoja", hoja);
                datosAEnviar.putString("corteza", corteza);

                Fragment fragment = null;
                fragment = new FlorFragment();
                String nombre = "nav_flor";

                fragment.setArguments(datosAEnviar);
                //---------------------------------------------------------------
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

    public ArrayList<String> Filtrar(String hoja, String corteza, String flor) {

        ArrayList<String> arboles = new ArrayList<>();
        ArrayList<Integer> indices = new ArrayList<>();
        //filtrar por tipo de hoja
        if(corteza.equals("NA")){
            if(flor.equals("NA"))
            {
                for (int i = 0; i < TipoHoja.size(); i++) {
                    if (TipoHoja.get(i).equals(hoja)) {
                        indices.add(i);
                        arboles.add(NombreCientifico.get(i));
                    }
                }
            }
            else{
                for (int i = 0; i < TipoHoja.size(); i++) {
                    if (TipoHoja.get(i).equals(hoja) && Flor.get(i).contains(flor)) {
                        indices.add(i);
                        arboles.add(NombreCientifico.get(i));
                    }
                }

            }
        }
        else {
            if(flor.equals("NA"))
            {
                for (int i = 0; i < TipoHoja.size(); i++) {
                    if (TipoHoja.get(i).equals(hoja) && Corteza.get(i).equals(corteza)) {
                        indices.add(i);
                        arboles.add(NombreCientifico.get(i));
                    }
                }
            }
            else{
                for (int i = 0; i < TipoHoja.size(); i++) {
                    if (TipoHoja.get(i).equals(hoja) && Corteza.get(i).equals(corteza) && Flor.get(i).contains(flor)) {
                        indices.add(i);
                        arboles.add(NombreCientifico.get(i));
                    }
                }

            }

        }

        return arboles;
    }


    public ArrayList<String> getNombreComun(ArrayList<String> cientificos){

        ArrayList<String> nombre = new ArrayList<>();
        for(int i=0;i<NombreCientifico.size();i++)
        {
            for(int j=0;j<cientificos.size();j++){
                if(NombreCientifico.get(i).equals(cientificos.get(j))){
                    nombre.add(NombreComun.get(i));
                }
            }
        }
        return nombre;
    }

}//end of activity
