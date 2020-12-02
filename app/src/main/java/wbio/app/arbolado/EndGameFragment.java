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
import android.widget.TextView;


public class EndGameFragment extends Fragment {

    Button btn_endGame,btn_gotoMedallas;
    String nivel;
    int pregunta,aciertos;
    ImageView medallaGanada;
    TextView tv_felicidades, tv_aciertos;

    public EndGameFragment() {
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
        return inflater.inflate(R.layout.fragment_end_game, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Bundle datosRecuperados = getArguments();
        nivel = datosRecuperados.getString("nivel");
        pregunta = datosRecuperados.getInt("pregunta");
        aciertos = datosRecuperados.getInt("aciertos");

        tv_felicidades = getActivity().findViewById(R.id.tv_felicidades);
        tv_aciertos = getActivity().findViewById(R.id.tv_aciertos);
        if(aciertos >=14){
            tv_felicidades.setText("Felicidades\nHas ganado una medalla");
            medallaGanada = getActivity().findViewById(R.id.medallaGanada);
            if(nivel.equals("1"))
                medallaGanada.setImageResource(R.drawable.m1);
            if(nivel.equals("2"))
                medallaGanada.setImageResource(R.drawable.m2);
            if(nivel.equals("3"))
                medallaGanada.setImageResource(R.drawable.m3);
            if(nivel.equals("4"))
                medallaGanada.setImageResource(R.drawable.m4);
            if(nivel.equals("5"))
                medallaGanada.setImageResource(R.drawable.m5);
            if(nivel.equals("6"))
                medallaGanada.setImageResource(R.drawable.m6);
            if(nivel.equals("7"))
                medallaGanada.setImageResource(R.drawable.m7);
            Archivo myFile = new Archivo();
            String contenido = myFile.readFile(getActivity().getFilesDir().toString()+"/conf/", "medallas.txt");
            String medalla = "m"+nivel;
            if(!contenido.contains(medalla)){//la medalla no existe
                String dir = getActivity().getFilesDir().toString() + "/conf/";
                myFile.writeToFile(dir, "medallas.txt", medalla + ",", true);
            }


        }
        tv_aciertos.setText(Integer.toString(aciertos) + " de 15");


        btn_endGame = getActivity().findViewById(R.id.btn_endGame);
        btn_endGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = null;
                fragment = new NivelesFragment();
                String nombre = "nav_niveles";

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

        btn_gotoMedallas = getActivity().findViewById(R.id.btn_gotoMedallas);
        btn_gotoMedallas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = null;
                fragment = new MedallasFragment();
                String nombre = "nav_medallas";

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