package wbio.app.arbolado;

import android.app.ProgressDialog;
import android.content.ClipData;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.text.LineBreaker;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.denzcoskun.imageslider.constants.ScaleTypes; // important

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.interfaces.ItemClickListener;
import com.denzcoskun.imageslider.models.SlideModel;
import com.denzcoskun.imageslider.constants.ScaleTypes;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FichaFragment extends Fragment {

    TextView tv_ficha_nombre_comun;
    TextView tv_ficha_nombre_cientifico;
    TextView tv_origen;
    TextView contenido;
    TextView tv_riego;
    TextView tv_SE_Provision, tv_SE_Regulacion, tv_SE_Soporte, tv_SE_Cultura, tv_SE_Usos, tv_precauciones, tv_caracteristicas;
    TextView tv_otros_nombres;
    TextView tv_familia;

    ImageView img_escala_imagen, back_arrow, ficha_hoja, ficha_corteza, ficha_flor, img_caducidad;
    ImageView flor_ene,flor_feb,flor_mar,flor_abr,flor_may,flor_jun,flor_jul,flor_ago,flor_sep,flor_oct,flor_nov,flor_dic;
    ImageView fruit_ene,fruit_feb,fruit_mar,fruit_abr,fruit_may,fruit_jun,fruit_jul,fruit_ago,fruit_sep,fruit_oct,fruit_nov,fruit_dic;

    String NombreCientifico="";
    //BaseDatos base;
    ProgressDialog mydialog;
    int maps;

    RequestQueue queue;

    String NombreComun, OtrosNombres, Origen,Familia, Talla,Escala, Permanencia,TipoHoja, Corteza, Flor, Floracion, Fructificacion, Riego, Precauciones,Usos, Provision,Regulacion, Culturales, Descripcion, Caracteristicas;
    int NumeroImagenes = 0;

    public FichaFragment() {
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
        return inflater.inflate(R.layout.fragment_ficha, container, false);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //-------Recuperar los datos del fgrament anterior---------------


        Bundle datosRecuperados = getArguments();
        NombreCientifico = datosRecuperados.getString("NombreCientifico");

        //int position = datosRecuperados.getInt("position");
        maps = 0;
        try{
            maps = datosRecuperados.getInt("maps");
        }catch (Exception e)
        {

        }
        //---------------------------------------------------------------
        queue = Volley.newRequestQueue(getContext());
        getFicha();

    }//end of oncreate

    public void getFicha(){

        mydialog = ProgressDialog.show(getContext(), "", "Cargando datos...", true);
        StringRequest postRequest = new StringRequest(Request.Method.POST, ServerUrl.getUrlServer()+"/getFicha",
                new Response.Listener<String>()
                {
                    @Override
                    public void onResponse(String response) {
                        // response
                        try {
                            JSONObject datos =  new JSONObject(response);
                            NombreComun = datos.get("NOMBRE_COMUN").toString();
                            OtrosNombres = datos.get("OTROS_NOMBRES_COMUNES").toString();
                            Origen = datos.get("ORIGEN").toString();
                            Familia = datos.get("FAMILIA").toString();
                            Talla = datos.get("TALLA").toString();
                            Escala = datos.get("ESCALA").toString();
                            Permanencia = datos.get("PERMANENCIA_HOJAS").toString().toLowerCase().replace("-","_");
                            TipoHoja = datos.get("TIPO_DE_HOJA").toString();
                            Corteza = datos.get("CORTEZA").toString();
                            Flor = datos.get("FLOR").toString();
                            Floracion = datos.get("FLORACION").toString();
                            Fructificacion = datos.get("FRUCTIFICACION").toString();
                            Riego = datos.get("RIEGO").toString();
                            Precauciones = datos.get("PRECAUCIONES").toString();
                            Usos = datos.get("USOS_Y_SERVICIOS_ECOSISTEMICOS").toString();
                            Provision = datos.get("SE_PROVISION").toString();
                            Regulacion = datos.get("SE_REGULACION").toString();
                            Culturales = datos.get("SE_CULTURALES").toString();
                            Descripcion = datos.get("DESCRIPCION").toString();
                            Caracteristicas = datos.get("CARACTERISTICAS").toString();

                            NumeroImagenes =  Integer.parseInt(datos.get("CANTIDAD_IMAGENES").toString());

                            OnCreate2();
                            //Toast.makeText(getActivity(),NombreComun,Toast.LENGTH_SHORT).show();
                        } catch (JSONException e) {
                            e.printStackTrace();
                            Toast.makeText(getActivity(),e.toString(),Toast.LENGTH_SHORT).show();
                        }
                        mydialog.dismiss();

                    }
                },
                new Response.ErrorListener()
                {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // error
                        mydialog.dismiss();
                        Toast.makeText(getContext(),error.toString(),Toast.LENGTH_SHORT).show();

                    }
                }){
            @Override
            protected Map<String, String> getParams()
            {
                Map<String, String>  params = new HashMap<String, String>();
                params.put("NommbreCientifico", NombreCientifico);
                //params.put("email", input_email.getText().toString());
                //params.put("password", input_password.getText().toString());

                return params;
            }
        };
        queue.add(postRequest);
    }



    private void OnCreate2(){

        int position = 0;
        final ImageSlider imageSlider = getActivity().findViewById(R.id.slider);
        List<SlideModel> slideModels=new ArrayList<>();


        Resources res = getResources();
        //String  nombre_especie = base.getNOMBRE_COMUN(position);
        //String nombre_cientifico = base.getNOMBRE_CIENTIFICO(position);
        //String  descripcion = base.getDESCRIPCION(position);
        ArrayList<Integer> nombreImagenes = new ArrayList<>();


        try {
            String cadena="";
            cadena = NombreCientifico.toLowerCase().replace("-", "_");

            int n_imagenes = NumeroImagenes;

            for (int i = 1; i <= n_imagenes; i++) {
                cadena = NombreCientifico.toLowerCase().replace("-", "_") + "_" + i;
                cadena = cadena.replace("á", "a");
                cadena = cadena.replace("é", "e");
                cadena = cadena.replace("í", "i");
                cadena = cadena.replace("ó", "o");

                //int resID = res.getIdentifier(cadena, "drawable", getActivity().getPackageName());
                //nombreImagenes.add(resID);

                //-------------------------------------
                slideModels.add(new SlideModel(ServerUrl.getUrlGaleria()+cadena+".jpg", "", ScaleTypes.CENTER_CROP));
                //-------------------------------------
                //slideModels.add(new SlideModel(resID, "", ScaleTypes.CENTER_CROP));
            }
        }catch (Exception e){
            //Toast.makeText(getActivity(),e.toString() , Toast.LENGTH_LONG).show();
            slideModels.add(new SlideModel(R.drawable.logo_home, "", ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.logo_home, "", ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.logo_home, "", ScaleTypes.FIT));
        }

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);



        tv_ficha_nombre_comun = getActivity().findViewById(R.id.tv_ficha_nombre_comun);
        tv_ficha_nombre_cientifico = getActivity().findViewById(R.id.tv_ficha_nombre_cientifico);

        tv_ficha_nombre_comun.setText(NombreComun.toUpperCase().replace("-", " "));
        tv_ficha_nombre_cientifico.setText(NombreCientifico.replace("-", " "));

        contenido = getActivity().findViewById(R.id.contenido1);
        contenido.setText(Descripcion);

        tv_origen = getActivity().findViewById(R.id.tv_origen);
        tv_origen.setText(firstUpperCase(Origen.toLowerCase()));

        tv_familia = getActivity().findViewById(R.id.tv_familia);
        String familia = firstUpperCase(Familia.toLowerCase());
        tv_familia.setText(familia);

        tv_riego = getActivity().findViewById(R.id.tv_riego);
        tv_riego.setText(firstUpperCase(Riego.toLowerCase()));

        tv_otros_nombres = getActivity().findViewById(R.id.tv_otros_nombres);
        String otros = OtrosNombres;
        tv_otros_nombres.setText("");
        if(!otros.equals("NA"))
            tv_otros_nombres.setText(otros.replace("-"," "));


        tv_SE_Provision = getActivity().findViewById(R.id.tv_SE_Provision);
        tv_SE_Regulacion = getActivity().findViewById(R.id.tv_SE_Regulacion);
        tv_SE_Cultura = getActivity().findViewById(R.id.tv_SE_Cultura);
        tv_SE_Usos = getActivity().findViewById(R.id.tv_SE_Usos);
        tv_precauciones = getActivity().findViewById(R.id.tv_precauciones);
        tv_caracteristicas = getActivity().findViewById(R.id.tv_caracteristicas);

        String se_p[] = Provision.toLowerCase().split(",");
        String acum = "";
        for(int i=0;i<se_p.length;i++){
            acum = acum + firstUpperCase(se_p[i].trim())+"\n";
        }

        tv_SE_Provision.setText(acum);

        String se_p1[] = Regulacion.toLowerCase().split(",");
        acum = "";
        for(int i=0;i<se_p1.length;i++){
            acum = acum + firstUpperCase(se_p1[i].trim())+"\n";
        }

        tv_SE_Regulacion.setText(acum);

        String culturales = firstUpperCase(Culturales.toLowerCase().replace(",","\n"));
        if(culturales.equals("Na"))
            culturales = "Mejora la salud física y mental";
        tv_SE_Cultura.setText(culturales);

        tv_SE_Usos.setText(Usos.toUpperCase());

        String precauciones = Precauciones.toLowerCase();
        if(precauciones.equals("na"))
            precauciones = "Ninguna";
        tv_precauciones.setText(firstUpperCase(precauciones));


        tv_caracteristicas.setText(firstUpperCase(Caracteristicas.toLowerCase()));

        //tv_escala_imagen = getActivity().findViewById(R.id.tv_escala_imagen);
        img_escala_imagen = getActivity().findViewById(R.id.img_escala_imagen);

        //tv_escala_imagen.setText(Escala + "m\nTalla máxima promedio");
        String size = Talla.toLowerCase();
        int id_img_escala = res.getIdentifier(size, "drawable", getActivity().getPackageName());
        img_escala_imagen.setImageResource(id_img_escala);


        int caducidad = res.getIdentifier(Permanencia, "drawable", getActivity().getPackageName());
        img_caducidad = getActivity().findViewById(R.id.img_caducidad);
        img_caducidad.setImageResource(caducidad);

        /*imageSlider.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemSelected(int i) {
                i++;
                String cadena = NombreCientifico.toLowerCase().replace("-", "_") + "_" + i;
                String autor = base.getAUTOR(cadena);
                if(autor !="")
                    Toast.makeText(getActivity(),autor, Toast.LENGTH_LONG).show();

            }
        });*/


        ficha_hoja = getActivity().findViewById(R.id.ficha_hoja);
        ficha_corteza = getActivity().findViewById(R.id.ficha_corteza);
        ficha_flor = getActivity().findViewById(R.id.ficha_flor);

        String tipo_hoja = TipoHoja;
        setHoja(tipo_hoja);

        String tipo_corteza = Corteza;
        setCorteza(tipo_corteza);

        String color_flor = Flor;
        setFlor(color_flor);

        flor_ene = getActivity().findViewById(R.id.flor_ene);
        flor_feb = getActivity().findViewById(R.id.flor_feb);
        flor_mar = getActivity().findViewById(R.id.flor_mar);
        flor_abr = getActivity().findViewById(R.id.flor_abr);
        flor_may = getActivity().findViewById(R.id.flor_may);
        flor_jun = getActivity().findViewById(R.id.flor_jun);
        flor_jul = getActivity().findViewById(R.id.flor_jul);
        flor_ago = getActivity().findViewById(R.id.flor_ago);
        flor_sep = getActivity().findViewById(R.id.flor_sep);
        flor_oct = getActivity().findViewById(R.id.flor_oct);
        flor_nov = getActivity().findViewById(R.id.flor_nov);
        flor_dic = getActivity().findViewById(R.id.flor_dic);

        String floracion = Floracion;
        setFloracion(floracion);

        fruit_ene = getActivity().findViewById(R.id.fruit_ene);
        fruit_feb = getActivity().findViewById(R.id.fruit_feb);
        fruit_mar = getActivity().findViewById(R.id.fruit_mar);
        fruit_abr = getActivity().findViewById(R.id.fruit_abr);
        fruit_may = getActivity().findViewById(R.id.fruit_may);
        fruit_jun = getActivity().findViewById(R.id.fruit_jun);
        fruit_jul = getActivity().findViewById(R.id.fruit_jul);
        fruit_ago = getActivity().findViewById(R.id.fruit_ago);
        fruit_sep = getActivity().findViewById(R.id.fruit_sep);
        fruit_oct = getActivity().findViewById(R.id.fruit_oct);
        fruit_nov = getActivity().findViewById(R.id.fruit_nov);
        fruit_dic = getActivity().findViewById(R.id.fruit_dic);

        String fructificacion = Fructificacion;
        setFructificacion(fructificacion);


    }

    private void setFructificacion(String fructificacion) {
        int dps = 22;
        final float scale = getContext().getResources().getDisplayMetrics().density;
        int pixels = (int) (dps * scale + 0.5f);

        if(fructificacion.contains("ENERO")){
            fruit_ene.getLayoutParams().height = pixels;
            fruit_ene.getLayoutParams().width = pixels;
            fruit_ene.setImageResource(R.drawable.sene);
        }
        if(fructificacion.contains("FEBRERO")){
            fruit_feb.getLayoutParams().height = pixels;
            fruit_feb.getLayoutParams().width = pixels;
            fruit_feb.setImageResource(R.drawable.sfeb);
        }
        if(fructificacion.contains("MARZO")){
            fruit_mar.getLayoutParams().height = pixels;
            fruit_mar.getLayoutParams().width = pixels;
            fruit_mar.setImageResource(R.drawable.smar);
        }
        if(fructificacion.contains("ABRIL")){
            fruit_abr.getLayoutParams().height = pixels;
            fruit_abr.getLayoutParams().width = pixels;
            fruit_abr.setImageResource(R.drawable.sabr);
        }
        if(fructificacion.contains("MAYO")){
            fruit_may.getLayoutParams().height = pixels;
            fruit_may.getLayoutParams().width = pixels;
            fruit_may.setImageResource(R.drawable.smay);
        }
        if(fructificacion.contains("JUNIO")){
            fruit_jun.getLayoutParams().height = pixels;
            fruit_jun.getLayoutParams().width = pixels;
            fruit_jun.setImageResource(R.drawable.sjun);
        }
        if(fructificacion.contains("JULIO")){
            fruit_jul.getLayoutParams().height = pixels;
            fruit_jul.getLayoutParams().width = pixels;
            fruit_jul.setImageResource(R.drawable.sjul);
        }
        if(fructificacion.contains("AGOSTO")){
            fruit_ago.getLayoutParams().height = pixels;
            fruit_ago.getLayoutParams().width = pixels;
            fruit_ago.setImageResource(R.drawable.sago);
        }
        if(fructificacion.contains("SEPTIEMBRE")){
            fruit_sep.getLayoutParams().height = pixels;
            fruit_sep.getLayoutParams().width = pixels;
            fruit_sep.setImageResource(R.drawable.ssep);
        }
        if(fructificacion.contains("OCTUBRE")){
            fruit_oct.getLayoutParams().height = pixels;
            fruit_oct.getLayoutParams().width = pixels;
            fruit_oct.setImageResource(R.drawable.soct);
        }
        if(fructificacion.contains("NOVIEMBRE")){
            fruit_nov.getLayoutParams().height = pixels;
            fruit_nov.getLayoutParams().width = pixels;
            fruit_nov.setImageResource(R.drawable.snov);
        }
        if(fructificacion.contains("DICIEMBRE")){
            fruit_dic.getLayoutParams().height = pixels;
            fruit_dic.getLayoutParams().width = pixels;
            fruit_dic.setImageResource(R.drawable.sdic);
        }

    }

    private void setFloracion(String floracion) {
        int dps = 22;
        final float scale = getContext().getResources().getDisplayMetrics().density;
        int pixels = (int) (dps * scale + 0.5f);

        if(floracion.contains("ENERO")){
            flor_ene.getLayoutParams().height = pixels;
            flor_ene.getLayoutParams().width = pixels;
            flor_ene.setImageResource(R.drawable.sene);
        }
        if(floracion.contains("FEBRERO")){
            flor_feb.getLayoutParams().height = pixels;
            flor_feb.getLayoutParams().width = pixels;
            flor_feb.setImageResource(R.drawable.sfeb);
        }
        if(floracion.contains("MARZO")){
            flor_mar.getLayoutParams().height = pixels;
            flor_mar.getLayoutParams().width = pixels;
            flor_mar.setImageResource(R.drawable.smar);
        }
        if(floracion.contains("ABRIL")){
            flor_abr.getLayoutParams().height = pixels;
            flor_abr.getLayoutParams().width = pixels;
            flor_abr.setImageResource(R.drawable.sabr);
        }
        if(floracion.contains("MAYO")){
            flor_may.getLayoutParams().height = pixels;
            flor_may.getLayoutParams().width = pixels;
            flor_may.setImageResource(R.drawable.smay);
        }
        if(floracion.contains("JUNIO")){
            flor_jun.getLayoutParams().height = pixels;
            flor_jun.getLayoutParams().width = pixels;
            flor_jun.setImageResource(R.drawable.sjun);
        }
        if(floracion.contains("JULIO")){
            flor_jul.getLayoutParams().height = pixels;
            flor_jul.getLayoutParams().width = pixels;
            flor_jul.setImageResource(R.drawable.sjul);
        }
        if(floracion.contains("AGOSTO")){
            flor_ago.getLayoutParams().height = pixels;
            flor_ago.getLayoutParams().width = pixels;
            flor_ago.setImageResource(R.drawable.sago);
        }
        if(floracion.contains("SEPTIEMBRE")){
            flor_sep.getLayoutParams().height = pixels;
            flor_sep.getLayoutParams().width = pixels;
            flor_sep.setImageResource(R.drawable.ssep);
        }
        if(floracion.contains("OCTUBRE")){
            flor_oct.getLayoutParams().height = pixels;
            flor_oct.getLayoutParams().width = pixels;
            flor_oct.setImageResource(R.drawable.soct);
        }
        if(floracion.contains("NOVIEMBRE")){
            flor_nov.getLayoutParams().height = pixels;
            flor_nov.getLayoutParams().width = pixels;
            flor_nov.setImageResource(R.drawable.snov);
        }
        if(floracion.contains("DICIEMBRE")){
            flor_dic.getLayoutParams().height = pixels;
            flor_dic.getLayoutParams().width = pixels;
            flor_dic.setImageResource(R.drawable.sdic);
        }


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

    private void setFlor(String color_flor) {
        if(color_flor.contains("BLANCAS"))
            ficha_flor.setImageResource(R.drawable.blanco);
        else if(color_flor.contains("AMARILLAS"))
            ficha_flor.setImageResource(R.drawable.amarillo);
        else if(color_flor.contains("ROJAS"))
            ficha_flor.setImageResource(R.drawable.rojo);
        else if(color_flor.contains("NARANJAS"))
            ficha_flor.setImageResource(R.drawable.naranja);
        else if(color_flor.contains("AZUL"))
            ficha_flor.setImageResource(R.drawable.azul);
        else if(color_flor.contains("MORADAS"))
            ficha_flor.setImageResource(R.drawable.morado);
        else if(color_flor.contains("CREMA"))
            ficha_flor.setImageResource(R.drawable.crema);
        else if(color_flor.contains("ROSADAS"))
            ficha_flor.setImageResource(R.drawable.rosa);
        else if(color_flor.contains("VERDES"))
            ficha_flor.setImageResource(R.drawable.verde);
        else
            ficha_flor.setImageResource(R.drawable.noflor);


    }

    private void setCorteza(String tipo_corteza) {

        if(tipo_corteza.contains("FISURADA")){
            ficha_corteza.setImageResource(R.drawable.f_cfisurada);
        }
        if(tipo_corteza.contains("AGRIETADA")){
            ficha_corteza.setImageResource(R.drawable.f_cagrietada);
        }
        if(tipo_corteza.contains("ESCAMOSA")){
            ficha_corteza.setImageResource(R.drawable.f_cescamosa);
        }
        if(tipo_corteza.contains("EXFOLIADA")){
            ficha_corteza.setImageResource(R.drawable.f_cexfoliada);
        }
        if(tipo_corteza.contains("LISA")){
            ficha_corteza.setImageResource(R.drawable.f_clisa);
        }
        if(tipo_corteza.contains("SURCADA")){
            ficha_corteza.setImageResource(R.drawable.f_csurcada);
        }
        if(tipo_corteza.contains("ANILLADA")){
            ficha_corteza.setImageResource(R.drawable.f_canillada);
        }
        if(tipo_corteza.contains("GRANULOSA")){
            ficha_corteza.setImageResource(R.drawable.fc_granulosa);
        }
        if(tipo_corteza.contains("ESPINOSA")){
            ficha_corteza.setImageResource(R.drawable.f_cespinosa);
        }
        if(tipo_corteza.contains("RESTOS-DE-LOS-PECIOLOS")){
            ficha_corteza.setImageResource(R.drawable.f_cpesiolo);
        }
    }

    private void setHoja(String tipo_hoja) {

        if(tipo_hoja.equals("SIMPLES-ANCHAS")){
            ficha_hoja.setImageResource(R.drawable.f_anchas);
        }
        if(tipo_hoja.equals("SIMPLES-LANCEOLADAS")){
            ficha_hoja.setImageResource(R.drawable.f_lanceolada);
        }
        if(tipo_hoja.equals("SIMPLES-ESCAMOSAS")){
            ficha_hoja.setImageResource(R.drawable.f_escamosa);
        }
        if(tipo_hoja.equals("COMPUESTAS-PINNADAS")){
            ficha_hoja.setImageResource(R.drawable.f_pinada);
        }
        if(tipo_hoja.equals("SIMPLES-LOBULADAS")){
            ficha_hoja.setImageResource(R.drawable.f_anchas);
        }
        if(tipo_hoja.equals("SIMPLES-LINEARES")){
            ficha_hoja.setImageResource(R.drawable.f_linear);
        }
        if(tipo_hoja.equals("SIMPLES-PALMADAS")){
            ficha_hoja.setImageResource(R.drawable.f_palemeada);
        }
        if(tipo_hoja.equals("COMPUESTAS-MULTI-PINNADAS")){
            ficha_hoja.setImageResource(R.drawable.f_multi);
        }
        if(tipo_hoja.equals("COMPUESTAS-PALMEADAS")){
            ficha_hoja.setImageResource(R.drawable.f_cpalmeada);
        }

    }


}