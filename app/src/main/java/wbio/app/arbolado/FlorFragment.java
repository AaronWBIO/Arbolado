package wbio.app.arbolado;

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


public class FlorFragment extends Fragment {

    ImageView btn_atras, btn_siguiente;
    ImageView blanco, amarillo, rojo, naranja, azul, morado, crema, rosado, verde, noflor,flor_back_arrrow;

    String hoja, corteza, flor;




    public FlorFragment() {
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
        return inflater.inflate(R.layout.fragment_flor, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("");

        hoja = "";
        corteza = "";
        flor = "";

        Bundle datosRecuperados = getArguments();
        hoja = datosRecuperados.getString("hoja");
        corteza = datosRecuperados.getString("corteza");
        //Toast.makeText(getActivity(), corteza + hoja, Toast.LENGTH_LONG).show();

        blanco = getActivity().findViewById(R.id.c_blanco);
        amarillo = getActivity().findViewById(R.id.c_amarillo);
        rojo = getActivity().findViewById(R.id.c_rojo);
        naranja = getActivity().findViewById(R.id.c_naranja);
        azul = getActivity().findViewById(R.id.c_azul);
        morado = getActivity().findViewById(R.id.c_morado);
        rosado = getActivity().findViewById(R.id.c_rosa);
        crema = getActivity().findViewById(R.id.c_crema);
        verde = getActivity().findViewById(R.id.c_verde);
        noflor = getActivity().findViewById(R.id.no_flor);

        flor_back_arrrow = getActivity().findViewById(R.id.flor_back_arrrow);
        flor_back_arrrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hoja!=null) {
                    Bundle datosAEnviar = new Bundle();
                    // Aquí pon todos los datos que quieras en formato clave, valor
                    datosAEnviar.putString("hoja", hoja);

                    Fragment fragment = null;
                    fragment = new CortezaFragment();
                    String nombre = "nav_corteza";

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
            }
        });

        blanco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blanco.setImageResource(R.drawable.sblanco);
                amarillo.setImageResource(R.drawable.amarillo);
                rojo.setImageResource(R.drawable.rojo);
                naranja.setImageResource(R.drawable.naranja);
                azul.setImageResource(R.drawable.azul);
                morado.setImageResource(R.drawable.morado);
                crema.setImageResource(R.drawable.crema);
                rosado.setImageResource(R.drawable.rosa);
                verde.setImageResource(R.drawable.verde);
                noflor.setImageResource(R.drawable.noflor);

                flor = "BLANCAS";
            }
        });
        amarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blanco.setImageResource(R.drawable.blanco);
                amarillo.setImageResource(R.drawable.samarillo);
                rojo.setImageResource(R.drawable.rojo);
                naranja.setImageResource(R.drawable.naranja);
                azul.setImageResource(R.drawable.azul);
                morado.setImageResource(R.drawable.morado);
                crema.setImageResource(R.drawable.crema);
                rosado.setImageResource(R.drawable.rosa);
                verde.setImageResource(R.drawable.verde);
                noflor.setImageResource(R.drawable.noflor);

                flor = "AMARILLAS";
            }
        });
        rojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blanco.setImageResource(R.drawable.blanco);
                amarillo.setImageResource(R.drawable.amarillo);
                rojo.setImageResource(R.drawable.srojo);
                naranja.setImageResource(R.drawable.naranja);
                azul.setImageResource(R.drawable.azul);
                morado.setImageResource(R.drawable.morado);
                crema.setImageResource(R.drawable.crema);
                rosado.setImageResource(R.drawable.rosa);
                verde.setImageResource(R.drawable.verde);
                noflor.setImageResource(R.drawable.noflor);

                flor = "ROJAS";
            }
        });
        naranja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blanco.setImageResource(R.drawable.blanco);
                amarillo.setImageResource(R.drawable.amarillo);
                rojo.setImageResource(R.drawable.rojo);
                naranja.setImageResource(R.drawable.snaranja);
                azul.setImageResource(R.drawable.azul);
                morado.setImageResource(R.drawable.morado);
                crema.setImageResource(R.drawable.crema);
                rosado.setImageResource(R.drawable.rosa);
                verde.setImageResource(R.drawable.verde);
                noflor.setImageResource(R.drawable.noflor);

                flor = "ANARANJADAS";
            }
        });
        azul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blanco.setImageResource(R.drawable.blanco);
                amarillo.setImageResource(R.drawable.amarillo);
                rojo.setImageResource(R.drawable.rojo);
                naranja.setImageResource(R.drawable.naranja);
                azul.setImageResource(R.drawable.sazul);
                morado.setImageResource(R.drawable.morado);
                crema.setImageResource(R.drawable.crema);
                rosado.setImageResource(R.drawable.rosa);
                verde.setImageResource(R.drawable.verde);
                noflor.setImageResource(R.drawable.noflor);

                flor = "AZUL";
            }
        });
        morado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blanco.setImageResource(R.drawable.blanco);
                amarillo.setImageResource(R.drawable.amarillo);
                rojo.setImageResource(R.drawable.rojo);
                naranja.setImageResource(R.drawable.naranja);
                azul.setImageResource(R.drawable.azul);
                morado.setImageResource(R.drawable.smorado);
                crema.setImageResource(R.drawable.crema);
                rosado.setImageResource(R.drawable.rosa);
                verde.setImageResource(R.drawable.verde);
                noflor.setImageResource(R.drawable.noflor);

                flor = "MORADAS";
            }
        });
        crema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blanco.setImageResource(R.drawable.blanco);
                amarillo.setImageResource(R.drawable.amarillo);
                rojo.setImageResource(R.drawable.rojo);
                naranja.setImageResource(R.drawable.naranja);
                azul.setImageResource(R.drawable.azul);
                morado.setImageResource(R.drawable.morado);
                crema.setImageResource(R.drawable.screma);
                rosado.setImageResource(R.drawable.rosa);
                verde.setImageResource(R.drawable.verde);
                noflor.setImageResource(R.drawable.noflor);

                flor = "CREMA";
            }
        });
        rosado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blanco.setImageResource(R.drawable.blanco);
                amarillo.setImageResource(R.drawable.amarillo);
                rojo.setImageResource(R.drawable.rojo);
                naranja.setImageResource(R.drawable.naranja);
                azul.setImageResource(R.drawable.azul);
                morado.setImageResource(R.drawable.morado);
                crema.setImageResource(R.drawable.crema);
                rosado.setImageResource(R.drawable.srosa);
                verde.setImageResource(R.drawable.verde);
                noflor.setImageResource(R.drawable.noflor);

                flor = "ROSADAS";
            }
        });
        verde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blanco.setImageResource(R.drawable.blanco);
                amarillo.setImageResource(R.drawable.amarillo);
                rojo.setImageResource(R.drawable.rojo);
                naranja.setImageResource(R.drawable.naranja);
                azul.setImageResource(R.drawable.azul);
                morado.setImageResource(R.drawable.morado);
                crema.setImageResource(R.drawable.crema);
                rosado.setImageResource(R.drawable.rosa);
                verde.setImageResource(R.drawable.sverde);
                noflor.setImageResource(R.drawable.noflor);

                flor = "VERDES";
            }
        });
        noflor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blanco.setImageResource(R.drawable.blanco);
                amarillo.setImageResource(R.drawable.amarillo);
                rojo.setImageResource(R.drawable.rojo);
                naranja.setImageResource(R.drawable.naranja);
                azul.setImageResource(R.drawable.azul);
                morado.setImageResource(R.drawable.morado);
                crema.setImageResource(R.drawable.crema);
                rosado.setImageResource(R.drawable.rosa);
                verde.setImageResource(R.drawable.verde);
                noflor.setImageResource(R.drawable.snoflor);

                flor = "NA";
            }
        });


        btn_siguiente = getActivity().findViewById(R.id.btn_flor_sigueinte);
        btn_atras = getActivity().findViewById(R.id.btn_flor_back);

        btn_siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!flor.isEmpty()){
                    //----------Enviar datos al fragment----------------------------
                    Bundle datosAEnviar = new Bundle();
                    // Aquí pon todos los datos que quieras en formato clave, valor
                    datosAEnviar.putString("hoja", hoja);
                    datosAEnviar.putString("corteza", corteza);
                    datosAEnviar.putString("flor", flor);

                    Fragment fragment = null;
                    fragment = new FiltroFragment();
                    String nombre = "nav_filtro";

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
                else {
                    Toast.makeText(getActivity(), "Debe seleccionar una opción para la flor", Toast.LENGTH_LONG).show();
                }


            }
        });

        btn_atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(hoja!=null)
                {
                    Bundle datosAEnviar = new Bundle();
                    // Aquí pon todos los datos que quieras en formato clave, valor
                    datosAEnviar.putString("hoja", hoja);

                    Fragment fragment = null;
                    fragment = new CortezaFragment();
                    String nombre = "nav_corteza";

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

            }
        });


    }
}