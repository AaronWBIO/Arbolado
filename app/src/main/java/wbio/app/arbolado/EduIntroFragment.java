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
import android.widget.LinearLayout;
import android.widget.Toast;


public class EduIntroFragment extends Fragment {

    ImageView img_back_arrrow, eduintro,eduintro_title;
    Button btn_comenzar;
    String nivel;


    public EduIntroFragment() {
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
        return inflater.inflate(R.layout.fragment_edu_intro, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Bundle datosRecuperados = getArguments();
        nivel = datosRecuperados.getString("nivel");
        //Toast.makeText(getActivity(), nivel, Toast.LENGTH_LONG).show();

        eduintro = getActivity().findViewById(R.id.eduintro);
        eduintro_title = getActivity().findViewById(R.id.eduintro_title);


        if(nivel.equals("7")){

            float scale = getResources().getDisplayMetrics().density;
            int dpWidthInPx  = (int) (340 * scale);
            int dpHeightInPx = (int) (1795 * scale);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dpWidthInPx, dpHeightInPx);
            eduintro.setImageResource(R.drawable.eduintro_gp2);
            eduintro.setLayoutParams(layoutParams);


            eduintro_title.setImageResource(R.drawable.title_edu_gp2);
        }


        img_back_arrrow = getActivity().findViewById(R.id.eduintro_back_arrrow);
        img_back_arrrow.setOnClickListener(new View.OnClickListener() {
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

        btn_comenzar = getActivity().findViewById(R.id.btn_eduintro);
        btn_comenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment fragment = null;
                fragment = new JuegoIntroFragment();
                String nombre = "nav_juegointro";

                //----------Enviar datos al fragment----------------------------
                Bundle datosAEnviar = new Bundle();
                datosAEnviar.putString("nivel", nivel);
                fragment.setArguments(datosAEnviar);
                //----------------------------------------------------------------

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

    /*public static int dpToPx(int dp) {
        float density = Context.getResources()
                .getDisplayMetrics()
                .density;
        return Math.round((float) dp * density);
    }*/
}