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
import android.widget.Toast;

import java.util.ArrayList;

public class DialogOK extends Fragment {

    String nivel;
    int aciertos,pregunta;
    Button btn_mydialog_success;

    ArrayList<String> NombreCientifico,NombreComun, nImagenes;
    public DialogOK() {
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
        return inflater.inflate(R.layout.fragment_my_dialog_o_k, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Bundle datosRecuperados = getArguments();
        nivel = datosRecuperados.getString("nivel");
        pregunta = datosRecuperados.getInt("pregunta");
        aciertos = datosRecuperados.getInt("aciertos");

        NombreCientifico = new ArrayList<>();
        NombreComun= new ArrayList<>();
        nImagenes = new ArrayList<>();

        NombreCientifico = datosRecuperados.getStringArrayList("NombreCientifico");
        NombreComun = datosRecuperados.getStringArrayList("NombreComun");
        nImagenes = datosRecuperados.getStringArrayList("nImagenes");

        String acum = "";
        for(int i=0;i<nImagenes.size();i++){
            acum+=NombreCientifico.get(i)+"-"+nImagenes.get(i)+"\n";
        }
        //Toast.makeText(getActivity(), "Datos:\n"+acum, Toast.LENGTH_LONG).show();



        btn_mydialog_success = getActivity().findViewById(R.id.btn_mydialog_success);
        btn_mydialog_success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NextGame(true);

            }
        });

    }

    private void NextGame(boolean correcto) {


        if(correcto)
            aciertos = aciertos + 1;
        pregunta = pregunta +1;

        if(pregunta==16)//terminar el juego
        {
            Fragment fragment = null;
            fragment = new EndGameFragment();
            String nombre = "nav_juego";
            //----------Enviar datos al fragment----------------------------
            Bundle datosAEnviar = new Bundle();
            datosAEnviar.putString("nivel", nivel);
            datosAEnviar.putInt("pregunta", pregunta);
            datosAEnviar.putInt("aciertos", aciertos);
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
        else {

            if(pregunta % 2 ==0){
                Fragment fragment = null;
                fragment = new Juego2Fragment();
                String nombre = "nav_juego";
                //----------Enviar datos al fragment----------------------------
                Bundle datosAEnviar = new Bundle();
                datosAEnviar.putString("nivel", nivel);
                datosAEnviar.putInt("pregunta", pregunta);
                datosAEnviar.putInt("aciertos", aciertos);
                datosAEnviar.putStringArrayList("NombreCientifico", NombreCientifico);
                datosAEnviar.putStringArrayList("NombreComun", NombreComun);
                datosAEnviar.putStringArrayList("nImagenes", nImagenes);
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
            else {
                Fragment fragment = null;
                fragment = new JuegoFragment();
                String nombre = "nav_juego";
                //----------Enviar datos al fragment----------------------------
                Bundle datosAEnviar = new Bundle();
                datosAEnviar.putString("nivel", nivel);
                datosAEnviar.putInt("pregunta", pregunta);
                datosAEnviar.putInt("aciertos", aciertos);
                datosAEnviar.putStringArrayList("NombreCientifico", NombreCientifico);
                datosAEnviar.putStringArrayList("NombreComun", NombreComun);
                datosAEnviar.putStringArrayList("nImagenes", nImagenes);
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
        }
    }

}