package wbio.app.arbolado;

import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
/*import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;*/
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

public class MapsActivity2 extends FragmentActivity implements OnMapReadyCallback {

    ImageView btn_alta;
    public static final int DEFAULT_UPDATE_INTERVAL = 10;
    public static final int FAST_UPDATE_INTERVAL = 10;
    public static final int PERMISSION_FINE_LOCATION = 99;
    Location currentLocation;
    //Location request is a config file for all settings related to FusedLocation ProviderCLient
    /*LocationRequest locationRequest;
    //Google location API services
    FusedLocationProviderClient fusedLocationClient;
    LocationCallback locationCallback;
*/
    private GoogleMap mMap;

    ProgressDialog mydialog;

    ImageView maps2_back_arrrow,mapsHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        mydialog = null;

        maps2_back_arrrow = this.findViewById(R.id.maps2_back_arrrow);
        maps2_back_arrrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MapsActivity2.this, Home.class);
                startActivity(i);
            }
        });
        /*mapsHome = this.findViewById(R.id.mapsHome);
        mapsHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MapsActivity2.this, Home.class);
                startActivity(i);
            }
        });*/

       /* btn_alta = this.findViewById(R.id.btn_alta);
        btn_alta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goto_arbolMap();
            }
        });*/

    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        try {
            // Customise the styling of the base map using a JSON object defined
            // in a raw resource file.
            boolean success = mMap.setMapStyle(
                    MapStyleOptions.loadRawResourceStyle(
                            this, R.raw.mapstyle));

            if (!success) {

            }
        } catch (Resources.NotFoundException e) {

        }


        mMap.getUiSettings().setAllGesturesEnabled(true);

        /*
        //set all properties of Location
        locationRequest = new LocationRequest();
        //how often does the default location check out ocurr?
        locationRequest.setInterval(1000 * DEFAULT_UPDATE_INTERVAL);
        //how often does the location check ocurr when set to the most frequent update?
        locationRequest.setFastestInterval(1000 * FAST_UPDATE_INTERVAL);
        //locationRequest.setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);
        //Activar localizacion por GPS
        locationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
        */

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
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
                //Toast.makeText(getActivity(),marker.getTitle(),Toast.LENGTH_SHORT).show();
                //----------Enviar datos al fragment----------------------------
                BaseDatos base = new BaseDatos();
                //int indice = base.getPosition(listView.getAdapter().getItem(position).toString());
                int indice = 0;//base.Buscar(marker.getTitle());
                if(indice!=-1){

                    Intent i = new Intent(MapsActivity2.this, Home.class);
                    String s = Integer.toString(indice);
                    i.putExtra("ficha",s);
                    startActivity(i);


                }

            }
        });

        setMarkers();
    }

    public void setMarkers(){
        mydialog = ProgressDialog.show(this, "", "Cargando datos...", true);

        RequestQueue queue = Volley.newRequestQueue(this);
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
                                BaseDatos base = new BaseDatos();
                                //int indice = base.getPosition(listView.getAdapter().getItem(position).toString());
                                int indice = 0;//base.Buscar(nombre);
                                if(indice!=-1) {
                                    marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.tree));
                                }
                                else{
                                    marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.tree_empty));
                                }
                                // adding marker


                                CustomInfoWindowAdapter myInfo = new CustomInfoWindowAdapter(LayoutInflater.from(MapsActivity2.this));
                                //myInfo.setImage(url);
                                mMap.setInfoWindowAdapter(myInfo);

                                mMap.addMarker(marker);


                            }

                            //Toast.makeText(getActivity(),nombre,Toast.LENGTH_SHORT).show();

                        }catch(Exception e){
                            Toast.makeText(MapsActivity2.this,"error json: ",Toast.LENGTH_SHORT).show();
                        }
                        mydialog.dismiss();
                        //respuesta.setText("Response is: "+ response);
                        //Toast.makeText(getActivity(),response,Toast.LENGTH_SHORT).show();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //respuesta.setText("That didn't work!");

                //if(contador < 3)
                {
                    mydialog.dismiss();
                    Toast.makeText(MapsActivity2.this,error.toString(),Toast.LENGTH_SHORT).show();

                    //contador = contador+1;
                    //setMarkers2();

                }

            }
        });
        // Add the request to the RequestQueue.
        stringRequest.setRetryPolicy(new DefaultRetryPolicy(
                20000,
                DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        queue.add(stringRequest);

        /*mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
                //Toast.makeText(getActivity(),marker.getTitle(),Toast.LENGTH_SHORT).show();
                //----------Enviar datos al fragment----------------------------


            }
        });*/

    }


    public void goto_arbolMap(){
        Intent i = new Intent(MapsActivity2.this, AltaArbolMaps.class);
        startActivity(i);

    }


}