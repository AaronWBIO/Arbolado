package wbio.app.arbolado;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import org.json.JSONArray;
import org.json.JSONObject;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class MapsFragment extends Fragment {

    private GoogleMap mMap;
    ProgressDialog mydialog;

    ArrayList<String> NombreComun, NombreCientifico;


    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        @Override
        public void onMapReady(GoogleMap googleMap) {

            mMap = googleMap;

            try {
                // Customise the styling of the base map using a JSON object defined
                // in a raw resource file.
                boolean success = mMap.setMapStyle(
                        MapStyleOptions.loadRawResourceStyle(
                                getContext(), R.raw.mapstyle));

                if (!success) {

                }
            } catch (Resources.NotFoundException e) {

            }


            mMap.getUiSettings().setAllGesturesEnabled(true);
            mMap.getUiSettings().setZoomControlsEnabled(true);
            if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return;
            }
            mMap.setMyLocationEnabled(true);

            LatLng sydney = new LatLng(20.967083, -89.623732);
            //mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
            //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 18));
            //updateGPS();
            mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
                @Override
                public void onInfoWindowClick(Marker marker) {

                    String nombreCientifico = BuscarNombre(marker.getTitle());
                    if(!nombreCientifico.isEmpty()){

                        //Enviar a la ficha
                        Bundle datosAEnviar = new Bundle();
                        // Aquí pon todos los datos que quieras en formato clave, valor
                        datosAEnviar.putString("NombreCientifico", nombreCientifico);//el nombre cientifico esta en mayusculas

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

                    }//end of if indice


                    //Toast.makeText(getActivity(),marker.getTitle(),Toast.LENGTH_SHORT).show();
                    //----------Enviar datos al fragment----------------------------
                    /*BaseDatos base = new BaseDatos();
                    //int indice = base.getPosition(listView.getAdapter().getItem(position).toString());
                    int indice = base.Buscar(marker.getTitle());
                    if(indice!=-1){

                        Intent i = new Intent(getContext(), Home.class);
                        String s = Integer.toString(indice);
                        i.putExtra("ficha",s);
                        startActivity(i);


                    }*/

                }
            });

            getNombresBiblioteca();

        }
    };

    public void getNombresBiblioteca()
    {
        NombreComun = new ArrayList<>();
        NombreCientifico = new ArrayList<>();
        mydialog = null;

        //mydialog = ProgressDialog.show(getContext(), "", "Cargando datos de la biblioteca...", true);
        RequestQueue queue = Volley.newRequestQueue(getContext());
        ServerUrl url = new ServerUrl();

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url.getUrl()+"/getNombres",
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
                                NombreComun.add(oneObject.getString("NOMBRE_COMUN"));
                                NombreCientifico.add(oneObject.getString("NOMBRE_CIENTIFICO"));

                            }

                            //Toast.makeText(getContext(),NombreComun.get(0),Toast.LENGTH_SHORT).show();
                            //mydialog.dismiss();
                            setMarkers();
                        }catch(Exception e){
                            Toast.makeText(getContext(),"error json: ",Toast.LENGTH_SHORT).show();
                        }
                        //mydialog.dismiss();

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //respuesta.setText("That didn't work!");

                //mydialog.dismiss();
                //Toast.makeText(getContext(),error.toString(),Toast.LENGTH_SHORT).show();
                Toast.makeText(getContext(),"Error, verifique su conexión a internet",Toast.LENGTH_SHORT).show();


            }
        });
        // Add the request to the RequestQueue.
        stringRequest.setRetryPolicy(new DefaultRetryPolicy(
                20000,
                DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        queue.add(stringRequest);

    }


    public void setMarkers(){
        mydialog = ProgressDialog.show(getContext(), "", "Cargando datos...", true);
        RequestQueue queue = Volley.newRequestQueue(getContext());
        ServerUrl url = new ServerUrl();

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url.getUrl()+"/getMarkers",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Respuesta del servidor

                        try {

                            JSONArray jsonArray = new JSONArray(response);
                            //String nombre = "";
                            for (int i=0; i < jsonArray.length(); i++)
                            {

                                JSONObject oneObject = jsonArray.getJSONObject(i);
                                // Pulling items from the array
                                String nombre = oneObject.getString("name");
                                Double lat = Double.parseDouble(oneObject.getString("lat"));
                                Double lon = Double.parseDouble(oneObject.getString("lon"));
                                String url = oneObject.getString("url");
                                LatLng arbol = new LatLng(lat, lon);

                                // create marker
                                MarkerOptions marker = new MarkerOptions().position(arbol).title(nombre).snippet(url);
                                // Changing marker icon

                                String nombreCientifico = BuscarNombre(nombre);

                                if(!nombreCientifico.isEmpty()) {
                                    int indice = NombreCientifico.indexOf(nombreCientifico);
                                    String nombreComun = "";
                                    nombreComun = NombreComun.get(indice);

                                    marker.title(nombreComun);
                                    marker.snippet(nombreCientifico);
                                    marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.tree));
                                }
                                else{
                                    marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.tree_empty));
                                }
                                // adding marker
                                CustomInfoWindowAdapter myInfo = new CustomInfoWindowAdapter(LayoutInflater.from(getActivity()));
                                //myInfo.setImage(url);
                                mMap.setInfoWindowAdapter(myInfo);
                                mMap.addMarker(marker);
                            }

                        }catch(Exception e){
                            Toast.makeText(getContext(),"error json: ",Toast.LENGTH_SHORT).show();
                        }
                        mydialog.dismiss();
                        //respuesta.setText("Response is: "+ response);
                        //Toast.makeText(getActivity(),response,Toast.LENGTH_SHORT).show();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                    mydialog.dismiss();
                    Toast.makeText(getContext(),"Verifique su conexión a internet",Toast.LENGTH_SHORT).show();

            }
        });
        // Add the request to the RequestQueue.
        stringRequest.setRetryPolicy(new DefaultRetryPolicy(
                20000,
                DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        queue.add(stringRequest);
    }

    private String BuscarNombre(String nombre) {
        String cientifico = "";
        int indice = -1;
        indice = NombreCientifico.indexOf(nombre);
        if(indice == -1){
            indice = NombreComun.indexOf(nombre);
            if(indice!=-1){
                cientifico = NombreCientifico.get(indice);
            }
        }
        else{
            cientifico = NombreCientifico.get(indice);
        }

        return cientifico;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_maps, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }

        mydialog = null;

    }
}