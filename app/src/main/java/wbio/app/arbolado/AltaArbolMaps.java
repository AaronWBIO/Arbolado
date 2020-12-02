package wbio.app.arbolado;

import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class AltaArbolMaps extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    ImageView altaMapsHome, altaMap_back_arrrow;
    Button btn_arbol_map;
    boolean bandera = false;

    Marker markerArbol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alta_arbol_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        altaMapsHome = this.findViewById(R.id.altaMapsHome);
        altaMapsHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AltaArbolMaps.this, Home.class);
                startActivity(i);
            }
        });

        altaMap_back_arrrow = this.findViewById(R.id.altaMap_back_arrrow);
        altaMap_back_arrrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AltaArbolMaps.this, MapsActivity2.class);
                startActivity(i);
            }
        });

        btn_arbol_map = this.findViewById(R.id.btn_arbol_map);
        btn_arbol_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (markerArbol != null) {

                    bandera = false;



                    //enviar informacion a la sigueinte actividad
                    Intent i = new Intent(AltaArbolMaps.this, AltaArbol.class);
                    i.putExtra("lat", Double.toString(markerArbol.getPosition().latitude));
                    i.putExtra("lon", Double.toString(markerArbol.getPosition().longitude));

                    startActivity(i);

                    //eliminar el marcador
                    markerArbol.remove();

                } else {
                    Toast.makeText(AltaArbolMaps.this, "Debe dar click en el mapa para ubicar el árbol", Toast.LENGTH_LONG).show();
                }


            }
        });
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
            boolean success = googleMap.setMapStyle(
                    MapStyleOptions.loadRawResourceStyle(
                            this, R.raw.mapstyle));

            if (!success) {
                //Log.e(TAG, "Style parsing failed.");
            }
        } catch (Resources.NotFoundException e) {
            //Log.e(TAG, "Can't find style. Error: ", e);
        }

        mMap.getUiSettings().setAllGesturesEnabled(true);

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
        LatLng home = new LatLng(20.967083, -89.623732);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(home, 18));


        googleMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
            @Override
            public void onMapClick(LatLng arbolPosition) {

                if(!bandera)
                {
                    // create marker
                    markerArbol = mMap.addMarker(new MarkerOptions().position(arbolPosition).title("Nuevo Árbol").icon(BitmapDescriptorFactory.fromResource(R.drawable.tree)));
                    bandera = true;
                }
                else{
                    markerArbol.setPosition(arbolPosition);

                }


            }
        });




    }
}