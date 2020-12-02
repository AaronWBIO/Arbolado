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

import java.util.ArrayList;

import wbio.app.arbolado.ui.home.HomeFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EspeciesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EspeciesFragment extends Fragment {

    String hoja;
    ImageView btn_identificacion_hoja, btn_atras;

    ImageView h_lanceolada, h_lobulada, h_linear, h_ancha, h_palmeada, h_escamosa, h_pinada, h_c_palmeada, h_multipinada;
    ImageView back_especies;
    //ArrayList<ImageView> hojas;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public EspeciesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment EspeciesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static EspeciesFragment newInstance(String param1, String param2) {
        EspeciesFragment fragment = new EspeciesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_especies, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("");

        //hoja_index = -1;
        //hojas = new ArrayList<>();
        hoja = "";

        h_lanceolada = getActivity().findViewById(R.id.img_hoja_lanceolada);
        h_lobulada = getActivity().findViewById(R.id.img_hoja_lobulada);
        h_linear = getActivity().findViewById(R.id.img_hoja_linear);
        h_ancha = getActivity().findViewById(R.id.img_hoja_ancha);
        h_palmeada = getActivity().findViewById(R.id.img_hoja_palmeada);
        h_escamosa = getActivity().findViewById(R.id.img_hoja_escamosa);
        h_pinada = getActivity().findViewById(R.id.img_hoja_c_pinnada);
        h_c_palmeada = getActivity().findViewById(R.id.img_hoja_c_palmeada);
        h_multipinada = getActivity().findViewById(R.id.img_hoja_multi);

        /*hojas.add(h_lanceolada);
        hojas.add(h_lobulada);
        hojas.add(h_linear);
        hojas.add(h_ancha);
        hojas.add(h_palmeada);
        hojas.add(h_escamosa);
        hojas.add(h_pinada);
        hojas.add(h_c_palmeada);
        hojas.add(h_multipinada);
        */

        h_lanceolada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                h_lanceolada.setImageResource(R.drawable.sh_lanceolada);
                h_lobulada.setImageResource(R.drawable.h_lobulada);
                h_linear.setImageResource(R.drawable.h_linear);
                h_ancha.setImageResource(R.drawable.h_ancha);
                h_palmeada.setImageResource(R.drawable.h_palmeada);
                h_escamosa.setImageResource(R.drawable.h_escamosa);
                h_pinada.setImageResource(R.drawable.hc_pinnada);
                h_c_palmeada.setImageResource(R.drawable.hc_palmeada);
                h_multipinada.setImageResource(R.drawable.h_multi);

                hoja = "SIMPLES-LANCEOLADAS";
            }
        });

        h_lobulada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                h_lanceolada.setImageResource(R.drawable.h_lanceolada);
                h_lobulada.setImageResource(R.drawable.sh_lobulada);
                h_linear.setImageResource(R.drawable.h_linear);
                h_ancha.setImageResource(R.drawable.h_ancha);
                h_palmeada.setImageResource(R.drawable.h_palmeada);
                h_escamosa.setImageResource(R.drawable.h_escamosa);
                h_pinada.setImageResource(R.drawable.hc_pinnada);
                h_c_palmeada.setImageResource(R.drawable.hc_palmeada);
                h_multipinada.setImageResource(R.drawable.h_multi);

                hoja = "SIMPLES-LOBULADAS";
            }
        });

        h_linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                h_lanceolada.setImageResource(R.drawable.h_lanceolada);
                h_lobulada.setImageResource(R.drawable.h_lobulada);
                h_linear.setImageResource(R.drawable.sh_linear);
                h_ancha.setImageResource(R.drawable.h_ancha);
                h_palmeada.setImageResource(R.drawable.h_palmeada);
                h_escamosa.setImageResource(R.drawable.h_escamosa);
                h_pinada.setImageResource(R.drawable.hc_pinnada);
                h_c_palmeada.setImageResource(R.drawable.hc_palmeada);
                h_multipinada.setImageResource(R.drawable.h_multi);

                hoja = "SIMPLES-LINEARES";

            }
        });

        h_ancha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                h_lanceolada.setImageResource(R.drawable.h_lanceolada);
                h_lobulada.setImageResource(R.drawable.h_lobulada);
                h_linear.setImageResource(R.drawable.h_linear);
                h_ancha.setImageResource(R.drawable.sh_ancha);
                h_palmeada.setImageResource(R.drawable.h_palmeada);
                h_escamosa.setImageResource(R.drawable.h_escamosa);
                h_pinada.setImageResource(R.drawable.hc_pinnada);
                h_c_palmeada.setImageResource(R.drawable.hc_palmeada);
                h_multipinada.setImageResource(R.drawable.h_multi);

                hoja = "SIMPLES-ANCHAS";

            }
        });
        h_palmeada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                h_lanceolada.setImageResource(R.drawable.h_lanceolada);
                h_lobulada.setImageResource(R.drawable.h_lobulada);
                h_linear.setImageResource(R.drawable.h_linear);
                h_ancha.setImageResource(R.drawable.h_ancha);
                h_palmeada.setImageResource(R.drawable.sh_palmeada);
                h_escamosa.setImageResource(R.drawable.h_escamosa);
                h_pinada.setImageResource(R.drawable.hc_pinnada);
                h_c_palmeada.setImageResource(R.drawable.hc_palmeada);
                h_multipinada.setImageResource(R.drawable.h_multi);

                hoja = "SIMPLES-PALMADAS";

            }
        });
        h_escamosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                h_lanceolada.setImageResource(R.drawable.h_lanceolada);
                h_lobulada.setImageResource(R.drawable.h_lobulada);
                h_linear.setImageResource(R.drawable.h_linear);
                h_ancha.setImageResource(R.drawable.h_ancha);
                h_palmeada.setImageResource(R.drawable.h_palmeada);
                h_escamosa.setImageResource(R.drawable.sh_escamosa);
                h_pinada.setImageResource(R.drawable.hc_pinnada);
                h_c_palmeada.setImageResource(R.drawable.hc_palmeada);
                h_multipinada.setImageResource(R.drawable.h_multi);

                hoja = "SIMPLES-ESCAMOSAS";

            }
        });
        h_pinada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                h_lanceolada.setImageResource(R.drawable.h_lanceolada);
                h_lobulada.setImageResource(R.drawable.h_lobulada);
                h_linear.setImageResource(R.drawable.h_linear);
                h_ancha.setImageResource(R.drawable.h_ancha);
                h_palmeada.setImageResource(R.drawable.h_palmeada);
                h_escamosa.setImageResource(R.drawable.h_escamosa);
                h_pinada.setImageResource(R.drawable.shc_pinnada);
                h_c_palmeada.setImageResource(R.drawable.hc_palmeada);
                h_multipinada.setImageResource(R.drawable.h_multi);

                hoja = "COMPUESTAS-PINNADAS";

            }
        });
        h_c_palmeada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                h_lanceolada.setImageResource(R.drawable.h_lanceolada);
                h_lobulada.setImageResource(R.drawable.h_lobulada);
                h_linear.setImageResource(R.drawable.h_linear);
                h_ancha.setImageResource(R.drawable.h_ancha);
                h_palmeada.setImageResource(R.drawable.h_palmeada);
                h_escamosa.setImageResource(R.drawable.h_escamosa);
                h_pinada.setImageResource(R.drawable.hc_pinnada);
                h_c_palmeada.setImageResource(R.drawable.shc_palmeada);
                h_multipinada.setImageResource(R.drawable.h_multi);

                hoja = "COMPUESTAS-PALMEADAS";

            }
        });
        h_multipinada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                h_lanceolada.setImageResource(R.drawable.h_lanceolada);
                h_lobulada.setImageResource(R.drawable.h_lobulada);
                h_linear.setImageResource(R.drawable.h_linear);
                h_ancha.setImageResource(R.drawable.h_ancha);
                h_palmeada.setImageResource(R.drawable.h_palmeada);
                h_escamosa.setImageResource(R.drawable.h_escamosa);
                h_pinada.setImageResource(R.drawable.hc_pinnada);
                h_c_palmeada.setImageResource(R.drawable.hc_palmeada);
                h_multipinada.setImageResource(R.drawable.sh_multi);

                hoja = "COMPUESTAS-MULTI-PINNADAS";

            }
        });


        btn_identificacion_hoja = getActivity().findViewById(R.id.btn_identificacion_hojas);
        btn_identificacion_hoja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!hoja.isEmpty()) {

                    //----------Enviar datos al fragment----------------------------
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
                else{
                    Toast.makeText(getActivity(), "Debe seleccionar un tipo de hoja", Toast.LENGTH_LONG).show();
                }
            }
        });

        btn_atras = getActivity().findViewById(R.id.btn_hojas_back);
        btn_atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = null;
                fragment = new MenuFragment();
                String nombre = "nav_home";

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

        back_especies = getActivity().findViewById(R.id.back_especies);
        back_especies.setOnClickListener(new View.OnClickListener() {
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
}