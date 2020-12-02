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


public class SEFragment extends Fragment {

    Button btn_MedallaSE;
    ImageView MedallaGanadaSE, SE_back_arrrow;


    public SEFragment() {
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
        return inflater.inflate(R.layout.fragment_s_e, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        MedallaGanadaSE = getActivity().findViewById(R.id.medallaGanadaSE);
        SE_back_arrrow = getActivity().findViewById(R.id.SE_back_arrrow);

        SE_back_arrrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = null;
                fragment = new ConoceFragment();
                String nombre = "nav_conoce";

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

        btn_MedallaSE = getActivity().findViewById(R.id.btn_MedallaSE);
        btn_MedallaSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MedallaGanadaSE.setImageResource(R.drawable.m8);
                Archivo myFile = new Archivo();
                String contenido = myFile.readFile(getActivity().getFilesDir().toString()+"/conf/", "medallas.txt");
                String medalla = "m8";
                if(!contenido.contains(medalla)){//la medalla no existe
                    String dir = getActivity().getFilesDir().toString() + "/conf/";
                    myFile.writeToFile(dir, "medallas.txt", medalla + ",", true);
                }
                Toast.makeText(getContext(),"Felicidades, ha conseguido una nueva Medalla" , Toast.LENGTH_LONG).show();

            }
        });

    }
}