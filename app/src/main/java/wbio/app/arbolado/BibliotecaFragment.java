package wbio.app.arbolado;


import android.app.ProgressDialog;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
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
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BibliotecaFragment extends Fragment {

    ImageView back_galeria;

    private SearchView searchView;
    private ListView listView;
    ArrayList<String> valores;
    ArrayAdapter<String> adapter;


    private RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    MyRecyclerViewAdapter recyclerViewAdapter;

    //int arr[] = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4,R.drawable.pic5,R.drawable.pic6,R.drawable.pic7,R.drawable.pic8,R.drawable.pic9,R.drawable.pic10,R.drawable.pic11,R.drawable.pic12};

    ArrayList<Integer> nombreImagenes;



    //BaseDatos base;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        return inflater.inflate(R.layout.fragment_biblioteca, container, false);
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("");


        getBiblioteca();

    }//onViewCreated

    public void OnViewCreated2(){
        //base = new BaseDatos();
        Resources res = getResources();

        //ArrayList<String> especies = base.getNOMBRE_COMUN();

        ArrayList<String> especies_cientifico = NombreCientifico;//new_order(especies, base.getNOMBRE_CIENTIFICO());
        nombreImagenes = new ArrayList<>();

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


        recyclerView = getActivity().findViewById(R.id.recyclerView);
        layoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter = new MyRecyclerViewAdapter(NombreCientifico, NombreComun, nombreImagenes);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setHasFixedSize(true);

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getActivity(), recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        // do whatever
                        //Toast.makeText(getActivity(), NombreCientifico.get(position), Toast.LENGTH_LONG).show();

                        Bundle datosAEnviar = new Bundle();
                        // Aquí pon todos los datos que quieras en formato clave, valor
                        datosAEnviar.putString("NombreCientifico", NombreCientifico.get(position));//el nombre cientifico esta en mayusculas

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

                        /*
                        //----------Enviar datos al fragment----------------------------
                        Bundle datosAEnviar = new Bundle();
                        // Aquí pon todos los datos que quieras en formato clave, valor
                        datosAEnviar.putInt("position", position);

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
                        */
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        // do whatever
                    }
                })
        );


        searchView = getActivity().findViewById(R.id.searchView);


        searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener()
        {
            @Override
            public void onFocusChange(final View v, final boolean hasFocus)
            {
                if (hasFocus)
                {

                    listView = getActivity().findViewById(R.id.listView);
                    listView.setBackgroundColor(Color.WHITE);
                    //base = new BaseDatos();

                    valores = NombreComun;
                    //ArrayList<String> nombre_cientifico = NombreCientifico;
                    //ArrayList<String> nombre_temp = base.getNOMBRE_COMUN_MAYA();
                    //ArrayList<String> nombre_maya = new ArrayList<String>();
                    //ArrayList<String> nombre_otros = new ArrayList<String>();

                    /*for(int i=0; i<nombre_cientifico.size();i++){
                        nombre_cientifico.set(i, nombre_cientifico.get(i).toUpperCase());
                    }*/

                    valores.addAll(NombreCientifico);
                    //valores.addAll(OtrosNombres);

                    adapter =new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, valores);
                    listView.setAdapter(adapter);

                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                            //----------Enviar datos al fragment----------------------------
                            //BaseDatos base = new BaseDatos();
                            //int indice = base.getPosition(listView.getAdapter().getItem(position).toString());
                            String Nombre = listView.getAdapter().getItem(position).toString();
                            String cientifico = BuscarNombreCientifico(Nombre);


                            //Enviar a la ficha
                            Bundle datosAEnviar = new Bundle();
                            // Aquí pon todos los datos que quieras en formato clave, valor
                            datosAEnviar.putString("NombreCientifico", cientifico);//el nombre cientifico esta en mayusculas

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



                            /*
                            int indice = base.Buscar(Nombre);


                            Bundle datosAEnviar = new Bundle();
                            // Aquí pon todos los datos que quieras en formato clave, valor
                            datosAEnviar.putInt("position", indice);
                            datosAEnviar.putInt("NombreCientifico", indice);

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
                            */


                        }
                    });

                }else{

                    listView = getActivity().findViewById(R.id.listView);
                    valores = new ArrayList<>();
                    adapter =new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, valores);
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


        back_galeria = getActivity().findViewById(R.id.back_galeria);
        back_galeria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = null;
                fragment = new MenuFragment();
                String nombre = "nav_home";

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

    private String BuscarNombreCientifico(String nombre) {
        //funcion que devuelve el nombre cientifico de la especie
        String cientifico = "";
        int indice = -1;
        indice = NombreCientifico.indexOf(nombre);
        if(indice==-1){
            indice = NombreComun.indexOf(nombre);
            if(indice == -1){
                indice = OtrosNombres.indexOf(nombre);
                if(indice==-1)
                {//caso imposible

                }
                else{//coincide con Otros nombres comunes
                    cientifico = NombreCientifico.get(indice);
                }
            }
            else{//coincide con nombre comun
                cientifico = NombreCientifico.get(indice);
            }

        }
        else{//coincide con nombre cientifico
            cientifico = NombreCientifico.get(indice);
        }


        return cientifico;
    }


    ProgressDialog mydialog;
    ArrayList<String> NombreComun, NombreCientifico, OtrosNombres;
    public void getBiblioteca(){
        mydialog = ProgressDialog.show(getContext(), "", "Cargando datos...", true);

        NombreComun = new ArrayList<>();
        NombreCientifico = new ArrayList<>();
        OtrosNombres = new ArrayList<>();
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
                                String  otros = oneObject.getString("OTROS_NOMBRES_COMUNES").trim();
                                if(!otros.equals("NA") || !otros.isEmpty()){
                                    OtrosNombres.add(otros);
                                }
                                NombreCientifico.add(oneObject.getString("NOMBRE_CIENTIFICO"));
                                NombreComun.add(oneObject.getString("NOMBRE_COMUN"));


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

    }





}
