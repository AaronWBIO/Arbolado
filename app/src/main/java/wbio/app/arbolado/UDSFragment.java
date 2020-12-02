package wbio.app.arbolado;

import android.content.Intent;
import android.net.Uri;
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
import android.widget.ImageView;


public class UDSFragment extends Fragment {

    ImageView uds_back_arrrow, btn_r1,btn_c1,btn_r_inven,btn_inv,btn_diagnostico,btn_adopta,btn_guia,btn_reglamento,btn_ley;


    public UDSFragment() {
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
        return inflater.inflate(R.layout.fragment_u_d_s, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        uds_back_arrrow = getActivity().findViewById(R.id.uds_back_arrrow);
        uds_back_arrrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = null;
                fragment = new MenuFragment();
                String nombre = "nav_educativo";

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

        btn_r1 = getActivity().findViewById(R.id.btn_r1);
        btn_r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.merida.gob.mx/sustentable/contenidos/doc/plan_infraestructura_resumido.pdf";
                Uri uri = Uri.parse(url);
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i);
            }
        });

        btn_c1 = getActivity().findViewById(R.id.btn_c1);
        btn_c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.merida.gob.mx/sustentable/contenidos/doc/PlanInfraestructuraVerde.pdf";
                Uri uri = Uri.parse(url);
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i);
            }
        });

        btn_r_inven = getActivity().findViewById(R.id.btn_r_inven);
        btn_r_inven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.merida.gob.mx/sustentable/contenidos/doc/ConoceLosArboles.pdf";
                Uri uri = Uri.parse(url);
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i);
            }
        });
        btn_inv = getActivity().findViewById(R.id.btn_inv);
        btn_inv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.merida.gob.mx/sustentable/contenidos/doc/inventario_arbolado_merida.pdf";
                Uri uri = Uri.parse(url);
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i);
            }
        });
        btn_diagnostico = getActivity().findViewById(R.id.btn_diagnostico);
        btn_diagnostico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.merida.gob.mx/sustentable/contenidos/doc/ArboladoUrbano_Parques.pdf";
                Uri uri = Uri.parse(url);
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i);
            }
        });

        btn_adopta = getActivity().findViewById(R.id.btn_adopta);
        btn_adopta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.merida.gob.mx/sustentable/contacto/adopta-un-arbol.phpx";
                Uri uri = Uri.parse(url);
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i);
            }
        });

        btn_guia = getActivity().findViewById(R.id.btn_guia);
        btn_guia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.merida.gob.mx/sustentable/contenidos/doc/guia-de-plantacion-de-arboles.pdf";
                Uri uri = Uri.parse(url);
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i);
            }
        });
        btn_reglamento = getActivity().findViewById(R.id.btn_reglamento);
        btn_reglamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://isla.merida.gob.mx/serviciosinternet/normatividad/files/Reglamentos/ARBOLADO_URBANO-20191010-061659.pdf";
                Uri uri = Uri.parse(url);
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i);
            }
        });
        btn_ley = getActivity().findViewById(R.id.btn_ley);
        btn_ley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.poderjudicialyucatan.gob.mx/digestum/marcoLegal/02/2017/DIGESTUM02350.pdf";
                Uri uri = Uri.parse(url);
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i);
            }
        });

    }
}