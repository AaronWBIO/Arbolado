package wbio.app.arbolado;

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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CortezaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CortezaFragment extends Fragment {


    ImageView fisurada, agrietada, escamosa,exfoliada, espinosa, lisa, surcada, anillada, granulosa, pesiolo, ncorteza,corteza_back_arrrow;
    String corteza, hoja;
    ImageView btn_atras, btn_siguiente;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CortezaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CortezaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CortezaFragment newInstance(String param1, String param2) {
        CortezaFragment fragment = new CortezaFragment();
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
        return inflater.inflate(R.layout.fragment_corteza, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //getActivity().setTitle("Guía de Identificación de Árboles");

        corteza = "";
        hoja = "";

        Bundle datosRecuperados = getArguments();
        hoja = datosRecuperados.getString("hoja");
        //Toast.makeText(getActivity(), hoja, Toast.LENGTH_LONG).show();

        fisurada = getActivity().findViewById(R.id.img_corteza_fizurada);
        agrietada = getActivity().findViewById(R.id.img_corteza_agrietada);
        escamosa = getActivity().findViewById(R.id.img_corteza_escamosa);
        exfoliada= getActivity().findViewById(R.id.img_corteza_exfoliada);
        espinosa =getActivity().findViewById(R.id.img_corteza_espinosa);
        lisa = getActivity().findViewById(R.id.img_corteza_lisa);
        surcada = getActivity().findViewById(R.id.img_corteza_surcada);
        anillada = getActivity().findViewById(R.id.img_corteza_anillada);
        granulosa = getActivity().findViewById(R.id.img_corteza_granulosa);
        pesiolo  = getActivity().findViewById(R.id.img_corteza_pesiolo);
        ncorteza  = getActivity().findViewById(R.id.img_ncorteze);

        corteza_back_arrrow = getActivity().findViewById(R.id.corteza_back_arrrow);
        corteza_back_arrrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = null;
                fragment = new EspeciesFragment();
                String nombre = "nav_hojas";

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

        fisurada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fisurada.setImageResource(R.drawable.scfisurada);
                agrietada.setImageResource(R.drawable.cagrietada);
                escamosa.setImageResource(R.drawable.cescamosa);
                exfoliada.setImageResource(R.drawable.cexfoliada);
                espinosa.setImageResource(R.drawable.cespinosa);
                lisa.setImageResource(R.drawable.clisa);
                surcada.setImageResource(R.drawable.csurcada);
                anillada.setImageResource(R.drawable.canillada);
                granulosa.setImageResource(R.drawable.cgranulosa);
                pesiolo.setImageResource(R.drawable.cpesiolo);
                ncorteza.setImageResource(R.drawable.ncorteza);
                corteza = "FISURADA";
            }
        });
        agrietada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fisurada.setImageResource(R.drawable.cfisurada);
                agrietada.setImageResource(R.drawable.scagrietada);
                escamosa.setImageResource(R.drawable.cescamosa);
                exfoliada.setImageResource(R.drawable.cexfoliada);
                espinosa.setImageResource(R.drawable.cespinosa);
                lisa.setImageResource(R.drawable.clisa);
                surcada.setImageResource(R.drawable.csurcada);
                anillada.setImageResource(R.drawable.canillada);
                granulosa.setImageResource(R.drawable.cgranulosa);
                pesiolo.setImageResource(R.drawable.cpesiolo);
                ncorteza.setImageResource(R.drawable.ncorteza);
                corteza = "AGRIETADA";
            }
        });
        escamosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fisurada.setImageResource(R.drawable.cfisurada);
                agrietada.setImageResource(R.drawable.cagrietada);
                escamosa.setImageResource(R.drawable.scescamosa);
                exfoliada.setImageResource(R.drawable.cexfoliada);
                espinosa.setImageResource(R.drawable.cespinosa);
                lisa.setImageResource(R.drawable.clisa);
                surcada.setImageResource(R.drawable.csurcada);
                anillada.setImageResource(R.drawable.canillada);
                granulosa.setImageResource(R.drawable.cgranulosa);
                pesiolo.setImageResource(R.drawable.cpesiolo);
                ncorteza.setImageResource(R.drawable.ncorteza);
                corteza = "ESCAMOSA";
            }
        });
        exfoliada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fisurada.setImageResource(R.drawable.cfisurada);
                agrietada.setImageResource(R.drawable.cagrietada);
                escamosa.setImageResource(R.drawable.cescamosa);
                exfoliada.setImageResource(R.drawable.scexfoliada);
                espinosa.setImageResource(R.drawable.cespinosa);
                lisa.setImageResource(R.drawable.clisa);
                surcada.setImageResource(R.drawable.csurcada);
                anillada.setImageResource(R.drawable.canillada);
                granulosa.setImageResource(R.drawable.cgranulosa);
                pesiolo.setImageResource(R.drawable.cpesiolo);
                ncorteza.setImageResource(R.drawable.ncorteza);
                corteza = "EXFOLIADA";
            }
        });
        espinosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fisurada.setImageResource(R.drawable.cfisurada);
                agrietada.setImageResource(R.drawable.cagrietada);
                escamosa.setImageResource(R.drawable.cescamosa);
                exfoliada.setImageResource(R.drawable.cexfoliada);
                espinosa.setImageResource(R.drawable.scespinosa);
                lisa.setImageResource(R.drawable.clisa);
                surcada.setImageResource(R.drawable.csurcada);
                anillada.setImageResource(R.drawable.canillada);
                granulosa.setImageResource(R.drawable.cgranulosa);
                pesiolo.setImageResource(R.drawable.cpesiolo);
                ncorteza.setImageResource(R.drawable.ncorteza);
                corteza = "ESPINOSA";
            }
        });
        lisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fisurada.setImageResource(R.drawable.cfisurada);
                agrietada.setImageResource(R.drawable.cagrietada);
                escamosa.setImageResource(R.drawable.cescamosa);
                exfoliada.setImageResource(R.drawable.cexfoliada);
                espinosa.setImageResource(R.drawable.cespinosa);
                lisa.setImageResource(R.drawable.sclisa);
                surcada.setImageResource(R.drawable.csurcada);
                anillada.setImageResource(R.drawable.canillada);
                granulosa.setImageResource(R.drawable.cgranulosa);
                pesiolo.setImageResource(R.drawable.cpesiolo);
                ncorteza.setImageResource(R.drawable.ncorteza);
                corteza = "LISA";
            }
        });
        surcada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fisurada.setImageResource(R.drawable.cfisurada);
                agrietada.setImageResource(R.drawable.cagrietada);
                escamosa.setImageResource(R.drawable.cescamosa);
                exfoliada.setImageResource(R.drawable.cexfoliada);
                espinosa.setImageResource(R.drawable.cespinosa);
                lisa.setImageResource(R.drawable.clisa);
                surcada.setImageResource(R.drawable.scsurcada);
                anillada.setImageResource(R.drawable.canillada);
                granulosa.setImageResource(R.drawable.cgranulosa);
                pesiolo.setImageResource(R.drawable.cpesiolo);
                ncorteza.setImageResource(R.drawable.ncorteza);
                corteza = "SURCADA";
            }
        });
        anillada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fisurada.setImageResource(R.drawable.cfisurada);
                agrietada.setImageResource(R.drawable.cagrietada);
                escamosa.setImageResource(R.drawable.cescamosa);
                exfoliada.setImageResource(R.drawable.cexfoliada);
                espinosa.setImageResource(R.drawable.cespinosa);
                lisa.setImageResource(R.drawable.clisa);
                surcada.setImageResource(R.drawable.csurcada);
                anillada.setImageResource(R.drawable.scanillada);
                granulosa.setImageResource(R.drawable.cgranulosa);
                pesiolo.setImageResource(R.drawable.cpesiolo);
                ncorteza.setImageResource(R.drawable.ncorteza);
                corteza = "ANILLADA";
            }
        });
        granulosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fisurada.setImageResource(R.drawable.cfisurada);
                agrietada.setImageResource(R.drawable.cagrietada);
                escamosa.setImageResource(R.drawable.cescamosa);
                exfoliada.setImageResource(R.drawable.cexfoliada);
                espinosa.setImageResource(R.drawable.cespinosa);
                lisa.setImageResource(R.drawable.clisa);
                surcada.setImageResource(R.drawable.csurcada);
                anillada.setImageResource(R.drawable.canillada);
                granulosa.setImageResource(R.drawable.scgranulosa);
                pesiolo.setImageResource(R.drawable.cpesiolo);
                ncorteza.setImageResource(R.drawable.ncorteza);
                corteza = "GRANULOSA";
            }
        });
        pesiolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fisurada.setImageResource(R.drawable.cfisurada);
                agrietada.setImageResource(R.drawable.cagrietada);
                escamosa.setImageResource(R.drawable.cescamosa);
                exfoliada.setImageResource(R.drawable.cexfoliada);
                espinosa.setImageResource(R.drawable.cespinosa);
                lisa.setImageResource(R.drawable.clisa);
                surcada.setImageResource(R.drawable.csurcada);
                anillada.setImageResource(R.drawable.canillada);
                granulosa.setImageResource(R.drawable.cgranulosa);
                pesiolo.setImageResource(R.drawable.scpesiolo);
                ncorteza.setImageResource(R.drawable.ncorteza);

                corteza = "RESTOS-DE-LOS-PECIOLOS";
            }
        });
        ncorteza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fisurada.setImageResource(R.drawable.cfisurada);
                agrietada.setImageResource(R.drawable.cagrietada);
                escamosa.setImageResource(R.drawable.cescamosa);
                exfoliada.setImageResource(R.drawable.cexfoliada);
                espinosa.setImageResource(R.drawable.cespinosa);
                lisa.setImageResource(R.drawable.clisa);
                surcada.setImageResource(R.drawable.csurcada);
                anillada.setImageResource(R.drawable.canillada);
                granulosa.setImageResource(R.drawable.cgranulosa);
                pesiolo.setImageResource(R.drawable.cpesiolo);
                ncorteza.setImageResource(R.drawable.sncorteza);

                corteza = "NA";
            }
        });


        btn_atras = getActivity().findViewById(R.id.btn_corteza_back);
        btn_atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = null;
                fragment = new EspeciesFragment();
                String nombre = "nav_hojas";

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

        btn_siguiente = getActivity().findViewById(R.id.btn_corteza);
        btn_siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!corteza.isEmpty())
                {
                    //Toast.makeText(getActivity(), corteza +" : "+ hoja, Toast.LENGTH_LONG).show();
                    //recuperamos el valor enviado por seleccion de hoja
                    Bundle datosRecuperados = getArguments();
                    hoja = datosRecuperados.getString("hoja");



                    //----------Enviar datos al fragment----------------------------
                    Bundle datosAEnviar = new Bundle();
                    // Aquí pon todos los datos que quieras en formato clave, valor
                    datosAEnviar.putString("hoja", hoja);
                    datosAEnviar.putString("corteza", corteza);

                    Fragment fragment = null;
                    fragment = new FlorFragment();
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
                else{
                    Toast.makeText(getActivity(), "Debe seleccionar un tipo de corteza", Toast.LENGTH_LONG).show();
                }

            }
        });



    }


}