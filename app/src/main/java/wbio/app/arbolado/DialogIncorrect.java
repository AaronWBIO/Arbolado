package wbio.app.arbolado;

import android.content.Context;
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
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DialogIncorrect extends Fragment {

    String respuesta,nivel;
    int pregunta, aciertos;
    String resID;
    Button btn_mydialog;
    TextView dialog_respuesta;
    ImageView dialog_image;

    ArrayList<String> NombreCientifico,NombreComun, nImagenes;

    public DialogIncorrect() {
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
        return inflater.inflate(R.layout.fragment_dialog_incorrect, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        NombreCientifico = new ArrayList<>();
        NombreComun=new ArrayList<>();
        nImagenes = new ArrayList<>();


        Bundle datosRecuperados = getArguments();
        nivel = datosRecuperados.getString("nivel");
        pregunta = datosRecuperados.getInt("pregunta");
        aciertos = datosRecuperados.getInt("aciertos");
        respuesta = datosRecuperados.getString("respuesta");
        NombreCientifico = datosRecuperados.getStringArrayList("NombreCientifico");
        NombreComun = datosRecuperados.getStringArrayList("NombreComun");
        nImagenes = datosRecuperados.getStringArrayList("nImagenes");



        String acum = "";
        for(int i=0;i<nImagenes.size();i++){
            acum+=NombreCientifico.get(i)+"-"+nImagenes.get(i)+"\n";
        }
        //Toast.makeText(getActivity(), "Datos:\n"+acum, Toast.LENGTH_LONG).show();




        dialog_respuesta = getActivity().findViewById(R.id.dialog_respuesta);
        dialog_respuesta.setText(respuesta);



        if(pregunta%2==0){
            resID = datosRecuperados.getString("resID");
            dialog_image = getActivity().findViewById(R.id.dialog_image);
            //dialog_image.setImageResource(resID);
            Picasso.get().load(resID).resize(200, 200).centerCrop().into(dialog_image);
        }
        else{
            dialog_image = getActivity().findViewById(R.id.dialog_image);
            LinearLayout.LayoutParams params = (LinearLayout.LayoutParams)dialog_image.getLayoutParams();
            params.width = dpToPx(1, getContext());
            params.height = dpToPx(1, getContext());
            dialog_image.setLayoutParams(params);
            Picasso.get().load(R.drawable.blank).resize(1, 1).centerCrop().into(dialog_image);
        }




        btn_mydialog = getActivity().findViewById(R.id.btn_dialog_incorrect);
        btn_mydialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NextGame(false);

            }
        });


    }

    public static int dpToPx(int dp, Context context) {
        float density = context.getResources().getDisplayMetrics().density;
        return Math.round((float) dp * density);
    }


    private void NextGame(boolean correcto) {

        if(correcto)
            aciertos = aciertos + 1;
        pregunta = pregunta + 1;

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

            if (pregunta % 2 == 0)//Juego2
            {
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

                /*String acum = "";
                for(int i=0;i<nImagenes.size();i++){
                    acum+=NombreCientifico.get(i)+"-"+nImagenes.get(i)+"\n";
                }
                Toast.makeText(getActivity(), "Datos:\n"+acum, Toast.LENGTH_LONG).show();
*/


                //replacing the fragment
                if (fragment != null) {
                    FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.content_frame, fragment);
                    ft.addToBackStack(nombre);
                    ft.commit();
                }

                DrawerLayout drawer = (DrawerLayout) getActivity().findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);

            } else {//juego1
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