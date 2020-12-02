package wbio.app.arbolado;

import android.app.Activity;

import android.app.FragmentManager;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import android.widget.TextView;


import androidx.fragment.app.Fragment;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

import com.squareup.picasso.Picasso;


//-----------------



import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import androidx.fragment.app.FragmentTransaction;




public class CustomInfoWindowAdapter implements GoogleMap.InfoWindowAdapter  {

    private static final String TAG = "CustomInfoWindowAdapter";
    private LayoutInflater inflater;
    Button btn_ficha;
    ImageView img_ver_mas;
    TextView tv_nombre, tv_cientifico;
    Activity activity;

    public CustomInfoWindowAdapter(LayoutInflater inflater){
        this.inflater = inflater;

    }

    @Override
    public View getInfoContents(final Marker m) {
        //Carga layout personalizado.
        View v = inflater.inflate(R.layout.infowindow_layout, null);
        //String[] info = m.getTitle().split("&");
        //String url = m.getSnippet();


        ImageView imagen = v.findViewById(R.id.image_view);
        //Picasso.get().load(m.getSnippet()).into(imagen,new MarkerCallback(m,m.getSnippet(),imagen));

        //BaseDatos base = new BaseDatos();
        String title = m.getTitle();//nombre comun

        tv_nombre = ((TextView) v.findViewById(R.id.Custom_info_title));
        tv_cientifico = ((TextView) v.findViewById(R.id.tv_info_cientifico));
        img_ver_mas = ((ImageView) v.findViewById(R.id.img_ver_mas));

        if(title.equals("Posisicón actual")){
            tv_nombre.setText(title);
            tv_cientifico.setText("");
        }
        else {

            String ncientifico = m.getSnippet();
            if(ncientifico.isEmpty()){
                tv_nombre.setText(title.replace("-", " "));
            }
            else{
                tv_nombre.setText(title.replace("-", " "));
                tv_cientifico.setText(firstUpperCase(ncientifico).replace("-", " "));
                img_ver_mas.setImageResource(R.drawable.img_ver_mas);
            }

            /*int base.Buscar(title);

            if(pos == -1){
                tv_nombre.setText(title.replace("-", " "));
            }
            else{

                String nombre_comun = base.getNOMBRE_COMUN(pos);

                tv_nombre.setText(nombre_comun.replace("-", " "));
                tv_cientifico.setText(firstUpperCase(base.getNOMBRE_CIENTIFICO(pos)).replace("-", " "));
                img_ver_mas.setImageResource(R.drawable.img_ver_mas);
            }*/
        }
        //((TextView)v.findViewById(R.id.textView4)).setText("Obten más información aquí");
       /* btn_ficha = v.findViewById(R.id.btn_img_ficha);
        btn_ficha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //----------Enviar datos al fragment----------------------------

                /*BaseDatos base = new BaseDatos();
                //int indice = base.getPosition(listView.getAdapter().getItem(position).toString());
                String cadena = tv_nombre.getText().toString();
                int indice = base.Buscar(cadena);

                Bundle datosAEnviar = new Bundle();
                // Aquí pon todos los datos que quieras en formato clave, valor
                datosAEnviar.putInt("position", indice);

                Fragment fragment = null;
                fragment = new EspeciesFragment();
                String nombre = "nav_especies";
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
        });*/




        return v;
        //return null;
    }
    private String firstUpperCase(String cadena) {
        cadena = cadena.trim();
        String resultado = cadena;
        try {
            resultado = cadena.toUpperCase().charAt(0) + cadena.substring(1, cadena.length()).toLowerCase();

        }catch (Exception e){
            resultado = cadena;
        }
        return resultado;
    }



    @Override
    public View getInfoWindow(Marker m) {
        return null;
    }




    /*public void setImage(String url){

        View v = inflater.inflate(R.layout.infowindow_layout, null);
        ImageView imagen = v.findViewById(R.id.image_view);
        imagen.setImageResource(R.drawable.tree);

    }*/

}