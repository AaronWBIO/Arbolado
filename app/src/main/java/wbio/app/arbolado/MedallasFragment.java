package wbio.app.arbolado;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MedallasFragment extends Fragment {

    ImageView medalla1, medalla2, medalla3, medalla4, medalla5, medalla6, medalla7, medalla8, medalla9, medalla10, medalla11;

    public MedallasFragment() {
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
        return inflater.inflate(R.layout.fragment_medallas, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Archivo myFile = new Archivo();
        String contenido = myFile.readFile(getActivity().getFilesDir().toString()+"/conf/", "medallas.txt");

        medalla1 = getActivity().findViewById(R.id.medalla1);
        medalla2 = getActivity().findViewById(R.id.medalla2);
        medalla3 = getActivity().findViewById(R.id.medalla3);
        medalla4 = getActivity().findViewById(R.id.medalla4);
        medalla5 = getActivity().findViewById(R.id.medalla5);
        medalla6 = getActivity().findViewById(R.id.medalla6);
        medalla7 = getActivity().findViewById(R.id.medalla7);
        medalla8 = getActivity().findViewById(R.id.medalla8);
        medalla9 = getActivity().findViewById(R.id.medalla9);
        medalla10 = getActivity().findViewById(R.id.medalla10);
        medalla11 = getActivity().findViewById(R.id.medalla11);

        if(contenido.contains("m1")){
            medalla1.setImageResource(R.drawable.m1);
        }
        if(contenido.contains("m2")){
            medalla2.setImageResource(R.drawable.m2);
        }
        if(contenido.contains("m3")){
            medalla3.setImageResource(R.drawable.m3);
        }
        if(contenido.contains("m4")){
            medalla4.setImageResource(R.drawable.m4);
        }
        if(contenido.contains("m5")){
            medalla5.setImageResource(R.drawable.m5);
        }
        if(contenido.contains("m6")){
            medalla6.setImageResource(R.drawable.m6);
        }
        if(contenido.contains("m7")){
            medalla7.setImageResource(R.drawable.m7);
        }
        if(contenido.contains("m8")){
            medalla8.setImageResource(R.drawable.m8);
        }
        if(contenido.contains("m9")){
            medalla9.setImageResource(R.drawable.m9);
        }
        if(contenido.contains("m10")){
            medalla10.setImageResource(R.drawable.m10);
        }
        if(contenido.contains("m11")){
            medalla11.setImageResource(R.drawable.m11);
        }


    }
}