package wbio.app.arbolado;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.List;


public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    GridLayout gridLayout;

    Archivo myFile;

    TextView tv_user_name;
    TextView tv_email;
    TextView privacidad;
    View hview;

    ImageView img_verMedallas, codigo_abierto;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        hview = navigationView.getHeaderView(0);
        View hview2 = navigationView.getRootView();
        tv_user_name = hview.findViewById(R.id.tv_user_name);
        tv_email =  hview.findViewById(R.id.tv_email);
        img_verMedallas = hview.findViewById(R.id.img_verMedallas);
        img_verMedallas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = null;
                String nombre = "";
                //initializing the fragment object which is selected
                fragment = new MedallasFragment();

                nombre = "nav_medallas";

                //replacing the fragment
                if (fragment != null) {
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.content_frame, fragment);
                    ft.addToBackStack(nombre);
                    ft.commit();
                }
                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
            }
        });

        codigo_abierto = hview2.findViewById(R.id.codigo_abierto);
        codigo_abierto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://fabcityyucatan.org/cooperacionciudades.html";
                Uri uri = Uri.parse(url);
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i);
            }
        });

        privacidad = hview2.findViewById(R.id.privacidad);
        privacidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.merida.gob.mx/municipio/portal/politicasm.phpx";
                Uri uri = Uri.parse(url);
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i);
            }
        });


        myFile = new Archivo();
        try {
            String datos = myFile.readFile(Home.this.getFilesDir().toString() + "/conf/", "sesion.txt");
            String separados[] = datos.split(",");
            tv_user_name.setText(separados[2] + " " + separados[3]);
            tv_email.setText(separados[1]);
        }catch (Exception e){

        }

        navigationView.setNavigationItemSelectedListener(this);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment fragment = null;
                String nombre = "";
                //initializing the fragment object which is selected
                fragment = new MenuFragment();

                nombre = "nav_1";

                //replacing the fragment
                if (fragment != null) {
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.content_frame, fragment);
                    ft.addToBackStack(nombre);
                    ft.commit();
                }
                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
            }
        });



        //add this line to display menu1 when the activity is loaded
        displaySelectedScreen(R.id.nav_home);



        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            String value = extras.getString("ficha");

            //Toast.makeText(Home.this,value,Toast.LENGTH_SHORT).show();

            Bundle datosAEnviar = new Bundle();
            datosAEnviar.putInt("position", Integer.parseInt(value));
            datosAEnviar.putInt("maps", 1);

            Fragment fragment = null;
            fragment = new FichaFragment();
            String nombre = "nav_ficha";

            //enviar los datos
            fragment.setArguments(datosAEnviar);
            //---------------------------------------------------------------

            //replacing the fragment
            if (fragment != null) {
                FragmentTransaction ft = this.getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.content_frame, fragment);
                ft.addToBackStack(nombre);
                ft.commit();
            }

            DrawerLayout drawer2 = (DrawerLayout) this.findViewById(R.id.drawer_layout);
            drawer2.closeDrawer(GravityCompat.START);

        }else{
            goto_home();
        }
        //

    }//oncreate


    public void goto_home(){
        Fragment fragment = null;
        String nombre = "";
        //initializing the fragment object which is selected
        fragment = new MenuFragment();

        nombre = "nav_1";

        //replacing the fragment
        if (fragment != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragment);
            ft.addToBackStack(nombre);
            ft.commit();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }

    public Fragment getVisibleFragment(){
        FragmentManager fragmentManager = Home.this.getSupportFragmentManager();
        List<Fragment> fragments = fragmentManager.getFragments();
        if(fragments != null){
            for(Fragment fragment : fragments){
                if(fragment != null && fragment.isVisible())
                    return fragment;
            }
        }
        return null;
    }



    /*@Override
    public void onBackPressed(){
        //Fragment fragment = getVisibleFragment();
        //String tag = fragment.getTag();
        //Toast.makeText(this, tag, Toast.LENGTH_LONG).show();

    }*/



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

    public void displaySelectedScreen(int itemId) {

        //creating fragment object
        Fragment fragment = null;
        String nombre = "";
        //initializing the fragment object which is selected
        switch (itemId) {

            case R.id.nav_home:
                fragment = new MenuFragment();


                nombre = "nav_1";
                break;
            case R.id.nav_library:
                fragment = new BibliotecaFragment();


                nombre = "nav_2";
                break;
            case R.id.nav_identifier:
                fragment = new EspeciesFragment();


                nombre = "nav_3";
                break;

            case R.id.nav_maps:
                //Intent i = new Intent(this, MapsActivity2.class);
                //startActivity(i);

                fragment = new MapsFragment();

                nombre = "nav_maps";
                break;

            case R.id.nav_education:
                fragment = new NivelesFragment();

                nombre = "nav_educativo";
                break;

            case R.id.nav_incentivos:
                fragment = new ConoceFragment();


                nombre = "nav_incentivos";
                break;
            case R.id.nav_uds:
                fragment = new UDSFragment();


                nombre = "nav_uds";
                break;


        }

        //replacing the fragment
        if (fragment != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragment);
            ft.addToBackStack(nombre);
            ft.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        //calling the method displayselectedscreen and passing the id of selected menu
        displaySelectedScreen(item.getItemId());
        //make this method blank
        return true;
    }

    public void ConfirmarCerrar(String mensaje, String positivo, String negativo)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(Home.this);
        builder.setMessage(mensaje);

        builder.setPositiveButton(positivo, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                //do things
                myFile.writeToFile(Home.this.getFilesDir().toString()+"/conf/", "sesion.txt", "vacio", false);
                Intent i = new Intent(Home.this, MainActivity.class);
                startActivity(i);
            }
        });

        builder.setNegativeButton(negativo, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                //do things
                return;
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

}






