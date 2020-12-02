package wbio.app.arbolado;

import java.util.ArrayList;
import java.util.Random;

public class BaseDatos {

   /* ArrayList<String> NOMBRE_CIENTIFICO;
    ArrayList<String> NOMBRE_COMUN_MAYA;
    ArrayList<String> NOMBRE_COMUN;
    ArrayList<String> OTROS_NOMBRES_COMUNES;
    ArrayList<String> FAMILIA;
    ArrayList<String> ORIGEN;
    ArrayList<String> NOM;
    ArrayList<String> TALLA_P_IMAGEN;
    ArrayList<String> PERMANENCIA_DE_LAS_HOJAS;
    ArrayList<String> TIPO_DE_HOJA;
    ArrayList<String> CORTEZA_ADULTA;
    ArrayList<String> FLOR_COLOR;
    ArrayList<String> FLORACION;
    ArrayList<String> FRUCTIFICACION;
    ArrayList<String> RIEGO;
    ArrayList<String> PRECAUCIONES;
    ArrayList<String> USOS_SERVICIOS_ECOSISTEMICOS;
    ArrayList<String> SE_PROVISION;
    ArrayList<String> ICONOS_PROVISION;
    ArrayList<String> SE_REGULACION;
    ArrayList<String> SE_CULTURALES;
    ArrayList<String> CULTURA_MAYA;
    ArrayList<String> DESCRIPCION;
    ArrayList<String> CARACTERISTICAS;
    ArrayList<String> ESCALA_IMAGEN;

    ArrayList<String> NOMBRE_IMAGEN;
    ArrayList<Integer> CANTIDAD_IMAGEN;
    ArrayList<String> AUTOR;
    ArrayList<String> IMAGENES;

    ArrayList<String> Nivel1,Nivel2,Nivel3,Nivel4,Nivel5,Nivel6,Nivel7,Nivel1_,Nivel2_,Nivel3_,Nivel4_,Nivel5_,Nivel6_,Nivel7_;


    public BaseDatos() {

    }

    public BaseDatos(int valor){

        setNombreCientifico();
        setNombreComunMaya();
        setNombreComun();
        setOtrosNombresComunes();
        setFamilia();
        setOrigen();
        setNOM();
        setTallaImagen();
        setPermanenciaHojas();
        setTipoHoja();
        setCorteza();
        setColorFlor();
        setFloracion();
        setFructificacion();
        setRiego();
        setPrecauciones();
        setUsosServiciosEcosistemicos();
        setProvision();
        setIconosProvision();
        setRegulacion();
        setSECulturales();
        setCulturaMaya();
        setDescripcion();
        setCaracteristicas();
        setEscalaImagen();

        setNiveles();

    }

    private void setNiveles() {

        Nivel1 = new ArrayList<>();//arboles frutales
        Nivel1.add("annona_squamosa");//
        Nivel1.add("cordia_dodecandra");//
        Nivel1.add("diospyros_digyna");//
        Nivel1.add("mangifera_indica");//
        Nivel1.add("persea_americana");//

        Nivel2 = new ArrayList<>();//arboles frutales 2
        Nivel2.add("averrhoa_carambola");//
        Nivel2.add("citrus_aurantium");//
        Nivel2.add("melicoccus_oliviformis");//
        Nivel2.add("pithecellobium_dulce");//
        Nivel2.add("tamarindus_indica");//

        Nivel3 = new ArrayList<>();//
        Nivel3.add("bourreria_pulchra"); //solo hay 23 imagenes
        Nivel3.add("crescentia_cujete");//
        Nivel3.add("plumeria_rubra");//
        Nivel3.add("tabebuia_chrysantha");//
        Nivel3.add("tecoma_stans");//

        Nivel4 = new ArrayList<>();//chicos y medianos 2
        Nivel4.add("bursera_simaruba");//
        Nivel4.add("coccoloba_uvifera");//
        Nivel4.add("gymnopodium_floribundum");//
        Nivel4.add("leucaena_leucocephala");//
        Nivel4.add("sapindus_saponaria");//

        Nivel5 = new ArrayList<>();//palmas
        Nivel5.add("beaucarnea_pliabilis");//
        Nivel5.add("pseudophoenix_sargentii");//
        Nivel5.add("roystonea_regia");//
        Nivel5.add("sabal_mexicana");//
        Nivel5.add("thrinax_radiata");//

        Nivel6 = new ArrayList<>();//
        Nivel6.add("brosimum_alicastrum");//
        Nivel6.add("ceiba_pentandra");//
        Nivel6.add("ehretia_tinifolia");//
        Nivel6.add("manilkara_zapota");//
        Nivel6.add("pouteria_campechiana");//

        Nivel7 = new ArrayList<>();
        Nivel7.add("enterolobium_cyclocarpum");//
        Nivel7.add("lysiloma_latisiliquum");//
        Nivel7.add("peltophorum_pterocarpum");
        Nivel7.add("samanea_saman");
        Nivel7.add("havardia_albicans");


        //-------------------------------------
        Nivel1_ = new ArrayList<>();//arboles frutales
        Nivel1_.add("SARAMUYO");
        Nivel1_.add("SIRICOTE");
        Nivel1_.add("ZAPOTE NEGRO");
        Nivel1_.add("MANGO");
        Nivel1_.add("AGUACATE");

        Nivel2_ = new ArrayList<>();//arboles frutales
        Nivel2_.add("CARAMBOLA");
        Nivel2_.add("NARANJA AGRIA");
        Nivel2_.add("HUAYA");
        Nivel2_.add("GUAMÚCHIL");
        Nivel2_.add("TAMARINDO");

        Nivel3_ = new ArrayList<>();//
        Nivel3_.add("BAKAL-CHE'");
        Nivel3_.add("JÍCARA");
        Nivel3_.add("FLOR DE MAYO");
        Nivel3_.add("GUAYACÁN");
        Nivel3_.add("TRONADOR");

        Nivel4_ = new ArrayList<>();//chicos y medianos 2
        Nivel4_.add("PALO MULATO");
        Nivel4_.add("UVA DE MAR");
        Nivel4_.add("DZIDZILCHÉ");
        Nivel4_.add("TUMBAPELO o GUAJE");
        Nivel4_.add("JABONCILLO");

        Nivel5_ = new ArrayList<>();//Palmas
        Nivel5_.add("DESPEINADA");
        Nivel5_.add("PALMA-KUKÁ");
        Nivel5_.add("PALMA REAL DE CUBA");
        Nivel5_.add("GUANO BON");
        Nivel5_.add("GUANO DE COSTA");

        Nivel6_ = new ArrayList<>();//gran porte 1
        Nivel6_.add("RAMÓN");
        Nivel6_.add("CEIBA");
        Nivel6_.add("ROBLE");
        Nivel6_.add("CHICOZAPOTE");
        Nivel6_.add("KANISTÉ");

        Nivel7_ = new ArrayList<>();//gran porte 2
        Nivel7_.add("GUANACASTE o  PIICH");
        Nivel7_.add("TSALAM");
        Nivel7_.add("FLAMBOYÁN AMARILLO");
        Nivel7_.add("ALGARROBO NEGRO");
        Nivel7_.add("CHUKUM");



    }
    public int getGameIndex(String nivel, String especie){
        int indice = 0;
        if(nivel.equals("1")){
            indice = Nivel1.indexOf(especie);
        }
        if(nivel.equals("2")){
            indice = Nivel2.indexOf(especie);
        }
        if(nivel.equals("3")){
            indice = Nivel3.indexOf(especie);
        }
        if(nivel.equals("4")){
            indice = Nivel4.indexOf(especie);
        }
        if(nivel.equals("5")){
            indice = Nivel5.indexOf(especie);
        }
        if(nivel.equals("6")){
            indice = Nivel6.indexOf(especie);
        }
        if(nivel.equals("7")){
            indice = Nivel7.indexOf(especie);
        }

        return indice;

    }
    public ArrayList<String> getEspeciesGame(String nivel){
        setNiveles();
        if(nivel.equals("1")){
            return Nivel1;
        }
        if(nivel.equals("2")){
            return Nivel2;
        }
        if(nivel.equals("3")){
            return Nivel3;
        }
        if(nivel.equals("4")){
            return Nivel4;
        }
        if(nivel.equals("5")){
            return Nivel5;
        }
        if(nivel.equals("6")){
            return Nivel6;
        }
        if(nivel.equals("7")){
            return Nivel7;
        }
        else
            return Nivel1;
    }
    public String getEspecie(String nivel){
        setNiveles();
        String especie = "";
        Random r = new Random();
        int Low = 1;
        int High = 6;
        int Result = r.nextInt(High-Low) + Low-1;

        if(nivel.equals("1")){
            return Nivel1.get(Result);
        }
        if(nivel.equals("2")){
            return Nivel2.get(Result);
        }
        if(nivel.equals("3")){
            return Nivel3.get(Result);
        }
        if(nivel.equals("4")){
            return Nivel4.get(Result);
        }
        if(nivel.equals("5")){
            return Nivel5.get(Result);
        }
        if(nivel.equals("6")){
            return Nivel6.get(Result);
        }
        if(nivel.equals("7")){
            return Nivel7.get(Result);
        }
        else
            return especie;
    }
    public String getGameNombre(String nivel, String especie) {
        String nombre ="";
        if(nivel.equals("1")){
            for(int i=0;i<Nivel1.size();i++){
                if(Nivel1.get(i).equals(especie))
                    nombre = Nivel1_.get(i);
            }
        }
        if(nivel.equals("2")){
            for(int i=0;i<Nivel2.size();i++){
                if(Nivel2.get(i).equals(especie))
                    nombre = Nivel2_.get(i);
            }

        }
        if(nivel.equals("3")){
            for(int i=0;i<Nivel3.size();i++){
                if(Nivel3.get(i).equals(especie))
                    nombre = Nivel3_.get(i);
            }

        }
        if(nivel.equals("4")){
            for(int i=0;i<Nivel4.size();i++){
                if(Nivel4.get(i).equals(especie))
                    nombre = Nivel4_.get(i);
            }

        }
        if(nivel.equals("5")){
            for(int i=0;i<Nivel5.size();i++){
                if(Nivel5.get(i).equals(especie))
                    nombre = Nivel5_.get(i);
            }

        }
        if(nivel.equals("6")){
            for(int i=0;i<Nivel6.size();i++){
                if(Nivel6.get(i).equals(especie))
                    nombre = Nivel6_.get(i);
            }

        }
        if(nivel.equals("7")){
            for(int i=0;i<Nivel7.size();i++){
                if(Nivel7.get(i).equals(especie))
                    nombre = Nivel7_.get(i);
            }

        }
        return nombre;
    }
    public ArrayList<String> getOpcion(String nivel){
        setNiveles();

        if(nivel.equals("1"))
        {
            //arboles frutales
            return Nivel1_;
        }
        if(nivel.equals("2"))
        {
            return Nivel2_;
        }
        if(nivel.equals("3"))
        {
            return Nivel3_;
        }
        if(nivel.equals("4"))
        {
            return Nivel4_;
        }
        if(nivel.equals("5"))
        {
            return Nivel5_;
        }
        if(nivel.equals("6"))
        {
            return Nivel6_;
        }
        if(nivel.equals("7"))
        {
            return Nivel7_;
        }

        return Nivel1_;
    }

    private void setEscalaImagen() {
        ESCALA_IMAGEN= new ArrayList<String>();
        ESCALA_IMAGEN.add("12");
        ESCALA_IMAGEN.add("15");
        ESCALA_IMAGEN.add("12");
        ESCALA_IMAGEN.add("6");
        ESCALA_IMAGEN.add("15");
        ESCALA_IMAGEN.add("20");
        ESCALA_IMAGEN.add("10");
        ESCALA_IMAGEN.add("25");
        ESCALA_IMAGEN.add("8");
        ESCALA_IMAGEN.add("12");
        ESCALA_IMAGEN.add("60");
        ESCALA_IMAGEN.add("8");
        ESCALA_IMAGEN.add("9");
        ESCALA_IMAGEN.add("8");
        ESCALA_IMAGEN.add("10");
        ESCALA_IMAGEN.add("15");
        ESCALA_IMAGEN.add("5");
        ESCALA_IMAGEN.add("30");
        ESCALA_IMAGEN.add("8");
        ESCALA_IMAGEN.add("5");
        ESCALA_IMAGEN.add("15");
        ESCALA_IMAGEN.add("30");
        ESCALA_IMAGEN.add("35");
        ESCALA_IMAGEN.add("25");
        ESCALA_IMAGEN.add("15");
        ESCALA_IMAGEN.add("5");
        ESCALA_IMAGEN.add("25");
        ESCALA_IMAGEN.add("10");
        ESCALA_IMAGEN.add("15");
        ESCALA_IMAGEN.add("5");
        ESCALA_IMAGEN.add("6");
        ESCALA_IMAGEN.add("5");
        ESCALA_IMAGEN.add("8");
        ESCALA_IMAGEN.add("15");
        ESCALA_IMAGEN.add("8");
        ESCALA_IMAGEN.add("8");
        ESCALA_IMAGEN.add("15");
        ESCALA_IMAGEN.add("15");
        ESCALA_IMAGEN.add("5");
        ESCALA_IMAGEN.add("20");
        ESCALA_IMAGEN.add("20");
        ESCALA_IMAGEN.add("15");
        ESCALA_IMAGEN.add("12");
        ESCALA_IMAGEN.add("12");
        ESCALA_IMAGEN.add("8");
        ESCALA_IMAGEN.add("10");
        ESCALA_IMAGEN.add("25");
        ESCALA_IMAGEN.add("20");
        ESCALA_IMAGEN.add("25");
        ESCALA_IMAGEN.add("12");
        ESCALA_IMAGEN.add("10");
        ESCALA_IMAGEN.add("20");
        ESCALA_IMAGEN.add("20");
        ESCALA_IMAGEN.add("10");
        ESCALA_IMAGEN.add("8");
        ESCALA_IMAGEN.add("12");
        ESCALA_IMAGEN.add("7");
        ESCALA_IMAGEN.add("10");
        ESCALA_IMAGEN.add("8");
        ESCALA_IMAGEN.add("12");
        ESCALA_IMAGEN.add("12");
        ESCALA_IMAGEN.add("20");
        ESCALA_IMAGEN.add("20");
        ESCALA_IMAGEN.add("6");
        ESCALA_IMAGEN.add("6");
        ESCALA_IMAGEN.add("12");
        ESCALA_IMAGEN.add("20");
        ESCALA_IMAGEN.add("7");
        ESCALA_IMAGEN.add("25");
        ESCALA_IMAGEN.add("6");
        ESCALA_IMAGEN.add("20");
        ESCALA_IMAGEN.add("10");
        ESCALA_IMAGEN.add("20");
        ESCALA_IMAGEN.add("10");
        ESCALA_IMAGEN.add("5");
        ESCALA_IMAGEN.add("7");
        ESCALA_IMAGEN.add("6");
        ESCALA_IMAGEN.add("6");
        ESCALA_IMAGEN.add("20");
        ESCALA_IMAGEN.add("8");
        ESCALA_IMAGEN.add("25");
        ESCALA_IMAGEN.add("20");
        ESCALA_IMAGEN.add("20");
        ESCALA_IMAGEN.add("12");
        ESCALA_IMAGEN.add("15");
        ESCALA_IMAGEN.add("15");
        ESCALA_IMAGEN.add("25");
        ESCALA_IMAGEN.add("20");
        ESCALA_IMAGEN.add("12");
        ESCALA_IMAGEN.add("5");
        ESCALA_IMAGEN.add("10");
        ESCALA_IMAGEN.add("20");
        ESCALA_IMAGEN.add("5");
        ESCALA_IMAGEN.add("20");
        ESCALA_IMAGEN.add("10");
        ESCALA_IMAGEN.add("12");
        ESCALA_IMAGEN.add("15");
        ESCALA_IMAGEN.add("10");
        ESCALA_IMAGEN.add("15");
    }

    public String getEscalaImagen(int position){
        setEscalaImagen();
        return ESCALA_IMAGEN.get(position);
    }

    public String getAUTOR(String nombre_imagen){
        String autor = "";
        setAUTOR();
        setNOMBRE_IMAGEN();
        int indice = -1;
        indice = IMAGENES.indexOf(nombre_imagen);
        if(indice != -1)
            autor = AUTOR.get(indice);

        return autor;
    }


    public void setNOMBRE_IMAGEN(){
        IMAGENES = new ArrayList<String>();

        IMAGENES.add("persea_americana_1");
        IMAGENES.add("persea_americana_2");
        IMAGENES.add("persea_americana_3");
        IMAGENES.add("persea_americana_4");
        IMAGENES.add("persea_americana_5");
        IMAGENES.add("samanea_saman_1");
        IMAGENES.add("samanea_saman_2");
        IMAGENES.add("samanea_saman_3");
        IMAGENES.add("samanea_saman_4");
        IMAGENES.add("samanea_saman_5");
        IMAGENES.add("samanea_saman_6");
        IMAGENES.add("samanea_saman_7");
        IMAGENES.add("bourreria_pulchra_1");
        IMAGENES.add("bourreria_pulchra_2");
        IMAGENES.add("bourreria_pulchra_3");
        IMAGENES.add("bourreria_pulchra_4");
        IMAGENES.add("bourreria_pulchra_5");
        IMAGENES.add("averrhoa_carambola_1");
        IMAGENES.add("averrhoa_carambola_2");
        IMAGENES.add("averrhoa_carambola_3");
        IMAGENES.add("averrhoa_carambola_4");
        IMAGENES.add("averrhoa_carambola_5");
        IMAGENES.add("averrhoa_carambola_6");
        IMAGENES.add("ceiba_pentandra_1");
        IMAGENES.add("ceiba_pentandra_2");
        IMAGENES.add("ceiba_pentandra_3");
        IMAGENES.add("ceiba_pentandra_4");
        IMAGENES.add("ceiba_pentandra_5");
        IMAGENES.add("manilkara_zapota_1");
        IMAGENES.add("manilkara_zapota_2");
        IMAGENES.add("manilkara_zapota_3");
        IMAGENES.add("manilkara_zapota_4");
        IMAGENES.add("manilkara_zapota_5");
        IMAGENES.add("manilkara_zapota_6");
        IMAGENES.add("havardia_albicans_1");
        IMAGENES.add("havardia_albicans_2");
        IMAGENES.add("havardia_albicans_3");
        IMAGENES.add("havardia_albicans_4");
        IMAGENES.add("beaucarnea_pliabilis_1");
        IMAGENES.add("beaucarnea_pliabilis_2");
        IMAGENES.add("beaucarnea_pliabilis_3");
        IMAGENES.add("beaucarnea_pliabilis_4");
        IMAGENES.add("beaucarnea_pliabilis_5");
        IMAGENES.add("gymnopodium_floribundum_1");
        IMAGENES.add("gymnopodium_floribundum_2");
        IMAGENES.add("gymnopodium_floribundum_3");
        IMAGENES.add("gymnopodium_floribundum_4");
        IMAGENES.add("gymnopodium_floribundum_5");
        IMAGENES.add("peltophorum_pterocarpum_1");
        IMAGENES.add("peltophorum_pterocarpum_2");
        IMAGENES.add("peltophorum_pterocarpum_3");
        IMAGENES.add("peltophorum_pterocarpum_4");
        IMAGENES.add("peltophorum_pterocarpum_5");
        IMAGENES.add("peltophorum_pterocarpum_6");
        IMAGENES.add("peltophorum_pterocarpum_7");
        IMAGENES.add("plumeria_rubra_1");
        IMAGENES.add("plumeria_rubra_2");
        IMAGENES.add("plumeria_rubra_3");
        IMAGENES.add("plumeria_rubra_4");
        IMAGENES.add("plumeria_rubra_5");
        IMAGENES.add("plumeria_rubra_6");
        IMAGENES.add("pithecellobium_dulce_1");
        IMAGENES.add("pithecellobium_dulce_2");
        IMAGENES.add("pithecellobium_dulce_3");
        IMAGENES.add("pithecellobium_dulce_4");
        IMAGENES.add("pithecellobium_dulce_5");
        IMAGENES.add("pithecellobium_dulce_6");
        IMAGENES.add("enterolobium_cyclocarpum_1");
        IMAGENES.add("enterolobium_cyclocarpum_2");
        IMAGENES.add("enterolobium_cyclocarpum_3");
        IMAGENES.add("enterolobium_cyclocarpum_4");
        IMAGENES.add("enterolobium_cyclocarpum_5");
        IMAGENES.add("enterolobium_cyclocarpum_6");
        IMAGENES.add("enterolobium_cyclocarpum_7");
        IMAGENES.add("sabal_mexicana_1");
        IMAGENES.add("sabal_mexicana_2");
        IMAGENES.add("sabal_mexicana_3");
        IMAGENES.add("sabal_mexicana_4");
        IMAGENES.add("sabal_mexicana_5");
        IMAGENES.add("thrinax_radiata_1");
        IMAGENES.add("thrinax_radiata_2");
        IMAGENES.add("thrinax_radiata_3");
        IMAGENES.add("thrinax_radiata_4");
        IMAGENES.add("thrinax_radiata_5");
        IMAGENES.add("thrinax_radiata_6");
        IMAGENES.add("thrinax_radiata_7");
        IMAGENES.add("tabebuia_chrysantha_1");
        IMAGENES.add("tabebuia_chrysantha_2");
        IMAGENES.add("tabebuia_chrysantha_3");
        IMAGENES.add("tabebuia_chrysantha_4");
        IMAGENES.add("tabebuia_chrysantha_5");
        IMAGENES.add("melicoccus_oliviformis_1");
        IMAGENES.add("melicoccus_oliviformis_2");
        IMAGENES.add("melicoccus_oliviformis_3");
        IMAGENES.add("melicoccus_oliviformis_4");
        IMAGENES.add("melicoccus_oliviformis_5");
        IMAGENES.add("melicoccus_oliviformis_6");
        IMAGENES.add("melicoccus_oliviformis_7");
        IMAGENES.add("sapindus_saponaria_1");
        IMAGENES.add("sapindus_saponaria_2");
        IMAGENES.add("sapindus_saponaria_3");
        IMAGENES.add("sapindus_saponaria_4");
        IMAGENES.add("sapindus_saponaria_5");
        IMAGENES.add("crescentia_cujete_6");
        IMAGENES.add("crescentia_cujete_7");
        IMAGENES.add("crescentia_cujete_8");
        IMAGENES.add("crescentia_cujete_9");
        IMAGENES.add("crescentia_cujete_10");
        IMAGENES.add("pouteria_campechiana_1");
        IMAGENES.add("pouteria_campechiana_2");
        IMAGENES.add("pouteria_campechiana_3");
        IMAGENES.add("pouteria_campechiana_4");
        IMAGENES.add("pouteria_campechiana_5");
        IMAGENES.add("mangifera_indica_1");
        IMAGENES.add("mangifera_indica_2");
        IMAGENES.add("mangifera_indica_3");
        IMAGENES.add("mangifera_indica_4");
        IMAGENES.add("citrus_aurantium_1");
        IMAGENES.add("citrus_aurantium_2");
        IMAGENES.add("citrus_aurantium_3");
        IMAGENES.add("citrus_aurantium_4");
        IMAGENES.add("citrus_aurantium_5");
        IMAGENES.add("citrus_aurantium_6");
        IMAGENES.add("pseudophoenix_sargentii_1");
        IMAGENES.add("pseudophoenix_sargentii_2");
        IMAGENES.add("pseudophoenix_sargentii_3");
        IMAGENES.add("pseudophoenix_sargentii_4");
        IMAGENES.add("pseudophoenix_sargentii_5");
        IMAGENES.add("pseudophoenix_sargentii_6");
        IMAGENES.add("roystonea_regia_1");
        IMAGENES.add("roystonea_regia_2");
        IMAGENES.add("roystonea_regia_3");
        IMAGENES.add("roystonea_regia_4");
        IMAGENES.add("roystonea_regia_5");
        IMAGENES.add("roystonea_regia_6");
        IMAGENES.add("roystonea_regia_7");
        IMAGENES.add("bursera_simaruba_1");
        IMAGENES.add("bursera_simaruba_2");
        IMAGENES.add("bursera_simaruba_3");
        IMAGENES.add("bursera_simaruba_4");
        IMAGENES.add("bursera_simaruba_5");
        IMAGENES.add("brosimum_alicastrum_1");
        IMAGENES.add("brosimum_alicastrum_2");
        IMAGENES.add("brosimum_alicastrum_3");
        IMAGENES.add("brosimum_alicastrum_4");
        IMAGENES.add("brosimum_alicastrum_5");
        IMAGENES.add("brosimum_alicastrum_6");
        IMAGENES.add("ehretia_tinifolia_1");
        IMAGENES.add("ehretia_tinifolia_2");
        IMAGENES.add("ehretia_tinifolia_3");
        IMAGENES.add("ehretia_tinifolia_4");
        IMAGENES.add("ehretia_tinifolia_5");
        IMAGENES.add("annona_squamosa_1");
        IMAGENES.add("annona_squamosa_2");
        IMAGENES.add("annona_squamosa_3");
        IMAGENES.add("annona_squamosa_4");
        IMAGENES.add("annona_squamosa_5");
        IMAGENES.add("cordia_dodecandra_1");
        IMAGENES.add("cordia_dodecandra_2");
        IMAGENES.add("cordia_dodecandra_3");
        IMAGENES.add("cordia_dodecandra_4");
        IMAGENES.add("cordia_dodecandra_5");
        IMAGENES.add("cordia_dodecandra_6");
        IMAGENES.add("tamarindus_indica_1");
        IMAGENES.add("tamarindus_indica_2");
        IMAGENES.add("tamarindus_indica_3");
        IMAGENES.add("tamarindus_indica_4");
        IMAGENES.add("tamarindus_indica_5");
        IMAGENES.add("tamarindus_indica_6");
        IMAGENES.add("tecoma_stans_1");
        IMAGENES.add("tecoma_stans_2");
        IMAGENES.add("tecoma_stans_3");
        IMAGENES.add("tecoma_stans_4");
        IMAGENES.add("tecoma_stans_5");
        IMAGENES.add("lysiloma_latisiliquum_1");
        IMAGENES.add("lysiloma_latisiliquum_2");
        IMAGENES.add("lysiloma_latisiliquum_3");
        IMAGENES.add("lysiloma_latisiliquum_4");
        IMAGENES.add("lysiloma_latisiliquum_5");
        IMAGENES.add("lysiloma_latisiliquum_6");
        IMAGENES.add("leucaena_leucocephala_1");
        IMAGENES.add("leucaena_leucocephala_2");
        IMAGENES.add("leucaena_leucocephala_3");
        IMAGENES.add("leucaena_leucocephala_4");
        IMAGENES.add("leucaena_leucocephala_5");
        IMAGENES.add("coccoloba_uvifera_1");
        IMAGENES.add("coccoloba_uvifera_2");
        IMAGENES.add("coccoloba_uvifera_3");
        IMAGENES.add("coccoloba_uvifera_4");
        IMAGENES.add("coccoloba_uvifera_5");

        //segundo banco de imagenes
        IMAGENES.add("acrocomia_aculeata_1");
        IMAGENES.add("acrocomia_aculeata_2");
        IMAGENES.add("acrocomia_aculeata_3");
        IMAGENES.add("albizia_lebbeck_1");
        IMAGENES.add("albizia_lebbeck_2");
        IMAGENES.add("albizia_lebbeck_3");
        IMAGENES.add("albizia_lebbeck_4");
        IMAGENES.add("albizia_lebbeck_5");
        IMAGENES.add("amphitecna_latifolia_1");
        IMAGENES.add("amphitecna_latifolia_2");
        IMAGENES.add("amphitecna_latifolia_3");
        IMAGENES.add("amphitecna_latifolia_4");
        IMAGENES.add("annona_glabra_1");
        IMAGENES.add("annona_glabra_2");
        IMAGENES.add("annona_glabra_3");
        IMAGENES.add("annona_glabra_4");
        IMAGENES.add("annona_muricata_1");
        IMAGENES.add("annona_muricata_2");
        IMAGENES.add("annona_reticulata_1");
        IMAGENES.add("annona_reticulata_2");
        IMAGENES.add("annona_reticulata_3");
        IMAGENES.add("annona_squamosa_1");
        IMAGENES.add("annona_squamosa_2");
        IMAGENES.add("azadirachta_indica_1");
        IMAGENES.add("azadirachta_indica_2");
        IMAGENES.add("azadirachta_indica_3");
        IMAGENES.add("bauhinia_variegata_1");
        IMAGENES.add("bauhinia_variegata_2");
        IMAGENES.add("bauhinia_variegata_3");
        IMAGENES.add("byrsonima_crassifolia_1");
        IMAGENES.add("byrsonima_crassifolia_2");
        IMAGENES.add("byrsonima_crassifolia_3");
        IMAGENES.add("byrsonima_crassifolia_4");
        IMAGENES.add("caesalpinia_gaumeri_1");
        IMAGENES.add("caesalpinia_gaumeri_2");
        IMAGENES.add("caesalpinia_gaumeri_3");
        IMAGENES.add("caesalpinia_gaumeri_4");
        IMAGENES.add("caesalpinia_mollis_1");
        IMAGENES.add("caesalpinia_mollis_2");
        IMAGENES.add("caesalpinia_mollis_3");
        IMAGENES.add("caesalpinia_mollis_4");
        IMAGENES.add("caesalpinia_yucatanensis_1");
        IMAGENES.add("caesalpinia_yucatanensis_2");
        IMAGENES.add("caesalpinia_yucatanensis_3");
        IMAGENES.add("caesalpinia_yucatanensis_4");
        IMAGENES.add("cascabela_gaumeri_1");
        IMAGENES.add("cascabela_gaumeri_2");
        IMAGENES.add("cascabela_gaumeri_3");
        IMAGENES.add("cascabela_gaumeri_4");
        IMAGENES.add("cassia_fistula_1");
        IMAGENES.add("cassia_fistula_2");
        IMAGENES.add("cassia_fistula_3");
        IMAGENES.add("cecropia_peltata_1");
        IMAGENES.add("cecropia_peltata_2");
        IMAGENES.add("cecropia_peltata_3");
        IMAGENES.add("cecropia_peltata_4");
        IMAGENES.add("cecropia_peltata_5");
        IMAGENES.add("ceiba_aesculifolia_1");
        IMAGENES.add("ceiba_aesculifolia_2");
        IMAGENES.add("chrysophyllum_cainito_1");
        IMAGENES.add("chrysophyllum_cainito_2");
        IMAGENES.add("chrysophyllum_cainito_3");
        IMAGENES.add("chrysophyllum_cainito_4");
        IMAGENES.add("chrysophyllum_cainito_5");
        IMAGENES.add("citrus_aurantiaca_1");
        IMAGENES.add("coccothrinax_readii_1");
        IMAGENES.add("coccothrinax_readii_2");
        IMAGENES.add("coccothrinax_readii_3");
        IMAGENES.add("cocos_nucifera_1");
        IMAGENES.add("cocos_nucifera_2");
        IMAGENES.add("cocos_nucifera_3");
        IMAGENES.add("cocos_nucifera_4");
        IMAGENES.add("crateva_tapia_1");
        IMAGENES.add("crateva_tapia_2");
        IMAGENES.add("crateva_tapia_3");
        IMAGENES.add("delonix_regia_1");
        IMAGENES.add("delonix_regia_2");
        IMAGENES.add("delonix_regia_3");
        IMAGENES.add("delonix_regia_4");
        IMAGENES.add("diospyros_anisandra_1");
        IMAGENES.add("diospyros_anisandra_2");
        IMAGENES.add("diospyros_anisandra_3");
        IMAGENES.add("diospyros_anisandra_4");
        IMAGENES.add("ficus_benjamina_1");
        IMAGENES.add("ficus_benjamina_2");
        IMAGENES.add("ficus_benjamina_3");
        IMAGENES.add("ficus_cotinifolia_1");
        IMAGENES.add("ficus_cotinifolia_2");
        IMAGENES.add("ficus_elastica_1");
        IMAGENES.add("ficus_elastica_2");
        IMAGENES.add("ficus_maxima_1");
        IMAGENES.add("guazuma_ulmifolia_1");
        IMAGENES.add("guazuma_ulmifolia_2");
        IMAGENES.add("guazuma_ulmifolia_3");
        IMAGENES.add("guazuma_ulmifolia_4");
        IMAGENES.add("heliocarpus_donnellsmithii_1");
        IMAGENES.add("heliocarpus_donnellsmithii_2");
        IMAGENES.add("heliocarpus_donnellsmithii_3");
        IMAGENES.add("lonchocarpus_punctatus_1");
        IMAGENES.add("lonchocarpus_punctatus_2");
        IMAGENES.add("lonchocarpus_punctatus_3");
        IMAGENES.add("lonchocarpus_punctatus_4");
        IMAGENES.add("lonchocarpus_punctatus_5");
        IMAGENES.add("maclura_tinctorea_1");
        IMAGENES.add("maclura_tinctorea_2");
        IMAGENES.add("maclura_tinctorea_3");
        IMAGENES.add("maclura_tinctoria_1");
        IMAGENES.add("maclura_tinctoria_2");
        IMAGENES.add("melicoccus_bijugatus_1");
        IMAGENES.add("melicoccus_bijugatus_2");
        IMAGENES.add("melicoccus_bijugatus_3");
        IMAGENES.add("moringa_oleifera_1");
        IMAGENES.add("moringa_oleifera_2");
        IMAGENES.add("moringa_oleifera_3");
        IMAGENES.add("moringa_oleifera_4");
        IMAGENES.add("muntingia_calabura_1");
        IMAGENES.add("muntingia_calabura_2");
        IMAGENES.add("muntingia_calabura_3");
        IMAGENES.add("muntingia_calabura_4");
        IMAGENES.add("phyllanthus_acidus_1");
        IMAGENES.add("phyllanthus_acidus_2");
        IMAGENES.add("phyllanthus_acidus_3");
        IMAGENES.add("phyllanthus_acidus_4");
        IMAGENES.add("piscidia_piscipula_1");
        IMAGENES.add("piscidia_piscipula_2");
        IMAGENES.add("piscidia_piscipula_3");
        IMAGENES.add("piscidia_piscipula_4");
        IMAGENES.add("pouteria_sapota_1");
        IMAGENES.add("pouteria_sapota_2");
        IMAGENES.add("pouteria_sapota_3");
        IMAGENES.add("pseudobombax_ellipticum_1");
        IMAGENES.add("pseudobombax_ellipticum_2");
        IMAGENES.add("pseudobombax_ellipticum_3");
        IMAGENES.add("pseudobombax_ellipticum_4");
        IMAGENES.add("psidium_guajava_1");
        IMAGENES.add("psidium_guajava_2");
        IMAGENES.add("psidium_guajava_3");
        IMAGENES.add("psidium_guajava_4");
        IMAGENES.add("psidium_guajava_5");
        IMAGENES.add("randia_aculeata_1");
        IMAGENES.add("randia_aculeata_2");
        IMAGENES.add("randia_aculeata_3");
        IMAGENES.add("randia_aculeata_4");
        IMAGENES.add("sabal_yapa_1");
        IMAGENES.add("sabal_yapa_2");
        IMAGENES.add("sabal_yapa_3");
        IMAGENES.add("senegalia_gaumeri_1");
        IMAGENES.add("senegalia_gaumeri_2");
        IMAGENES.add("senegalia_gaumeri_3");
        IMAGENES.add("senegalia_gaumeri_4");
        IMAGENES.add("senegalia_gaumeri_5");
        IMAGENES.add("senna_racemosa_1");
        IMAGENES.add("senna_racemosa_2");
        IMAGENES.add("senna_racemosa_3");
        IMAGENES.add("simarouba_amara_1");
        IMAGENES.add("simarouba_amara_2");
        IMAGENES.add("simarouba_amara_3");
        IMAGENES.add("simarouba_amara_4");
        IMAGENES.add("spondias_purpurea_1");
        IMAGENES.add("spondias_purpurea_2");
        IMAGENES.add("spondias_purpurea_3");
        IMAGENES.add("spondias_purpurea_4");
        IMAGENES.add("spondias_purpurea_5");
        IMAGENES.add("swietenia_macrophylla_1");
        IMAGENES.add("swietenia_macrophylla_2");
        IMAGENES.add("swietenia_macrophylla_3");
        IMAGENES.add("swietenia_macrophylla_4");
        IMAGENES.add("tabebuia_rosea_1");
        IMAGENES.add("tabebuia_rosea_2");
        IMAGENES.add("tabebuia_rosea_3");
        IMAGENES.add("tabebuia_rosea_4");
        IMAGENES.add("terminalia_catappa_1");
        IMAGENES.add("terminalia_catappa_2");
        IMAGENES.add("terminalia_catappa_3");
        IMAGENES.add("terminalia_catappa_4");
        IMAGENES.add("yucca_elephantipes_1");
        IMAGENES.add("yucca_elephantipes_2");


    }

    public void setAUTOR(){
        AUTOR = new ArrayList<String>();

        AUTOR.add("© Paul Barker (CC BY-NC)");
        AUTOR.add(" ARS00333 Persea americana");
        AUTOR.add(" © Lawrence Cram (CC BY-NC)");
        AUTOR.add(" © haiti_hunter  (CC BY)");
        AUTOR.add("© Bodo  (CC BY-NC)");
        AUTOR.add("© Karens (CC BY-NC-SA)");
        AUTOR.add(" © Susan J. Hewitt (CC BY-NC)");
        AUTOR.add(" por Al Kordesch  (CC0)");
        AUTOR.add("© Pat Deacon (CC BY-NC)");
        AUTOR.add("© Katerine Rodríguez  (CC BY-NC)");
        AUTOR.add(" © Katerine Rodríguez  (CC BY-NC)");
        AUTOR.add("© Carlos Venegas-Elizondo (CC BY-NC)");
        AUTOR.add("Ayuntamiento Mérida.PNG");
        AUTOR.add("Bakalche.png");
        AUTOR.add("© victornc – (CC BY-NC)");
        AUTOR.add("© mdelapuente – (CC BY-NC)");
        AUTOR.add("© victornc (CC BY-NC)");
        AUTOR.add("© Andres Hernandez S. – (CC BY-NC-SA)");
        AUTOR.add("© Hua Wan – (CC BY-NC-SA)");
        AUTOR.add("© Kyhl Austin – (CC BY-NC)");
        AUTOR.add("© chauyl – (CC BY-NC)");
        AUTOR.add("© biobank-lantauhk (CC BY-NC)");
        AUTOR.add("© biobank-lantauhk (CC BY-NC)");
        AUTOR.add("© jenna_te_los_ojos – (CC BY-NC)");
        AUTOR.add("JAdNV0049 Ceiba pentandra");
        AUTOR.add("© Francisco Dubón – (CC BY-NC)");
        AUTOR.add("© AJ Wacaser – (CC BY)");
        AUTOR.add("© Abubakar S. Ringim – (CC BY-NC)");
        AUTOR.add("© Leticia Soriano Flores – (CC BY-NC)");
        AUTOR.add("© yongcheegoh – (CC BY-NC) ");
        AUTOR.add("1764 Manilkara zapota");
        AUTOR.add("ARS00264 Manilkara zapota");
        AUTOR.add("ARS00569 Manilkara zapota_ ");
        AUTOR.add("© Ong Jyh Seng – (CC BY-NC) ");
        AUTOR.add("© guarwicko (CC BY-NC)");
        AUTOR.add("© kino (CC BY-NC)");
        AUTOR.add("FJRS0140 Havardia albicans");
        AUTOR.add("FJRS0141 Havardia albicans");
        AUTOR.add("© Ben Hutchins – (CC BY-NC)");
        AUTOR.add("CD0066 Beaucarnea pliabilis");
        AUTOR.add("VWS&YRA0024 Beaucarnea pliabilis");
        AUTOR.add("VWS&YRA0025 Beaucarnea pliabilis");
        AUTOR.add("VWS&YRA0029 Beaucarnea pliabilis");
        AUTOR.add("© victornc (CC BY-NC) ");
        AUTOR.add("Bandala et al.014. A-B-Bosque-de-Gymnopodium-floribundum-C - HOJA");
        AUTOR.add("Bandala et al. 2014. A-B-Bosque-de-Gymnopodium-floribundum-C -fruto");
        AUTOR.add("© Donají Graham (CC BY-NC)");
        AUTOR.add("© Donají Graham  (CC BY-NC)");
        AUTOR.add("© elawrey  (CC BY)");
        AUTOR.add("© lenisutcliffe (CC BY-NC)");
        AUTOR.add("© 陳陪泛 (CC BY-NC)");
        AUTOR.add("© 陳陪泛 (CC BY-NC)");
        AUTOR.add("© harshithjv  (CC BY-NC)");
        AUTOR.add("© Hareesha A S (CC BY-NC)");
        AUTOR.add("© chelina batista (CC BY-NC)");
        AUTOR.add("© Carlos Domínguez-Rodríguez (CC BY-NC) ");
        AUTOR.add("© Ricardo Arredondo T.(CC BY-NC) ");
        AUTOR.add("CGL1826 Plumeria rubra");
        AUTOR.add("JHC0167 Plumeria rubra");
        AUTOR.add("MDLLPG0108 Plumeria rubra");
        AUTOR.add("© ericlam238 (CC BY-NC)");
        AUTOR.add("CGL1799 Pithecellobium dulce");
        AUTOR.add("MRG-2017-443 Pithecellobium dulce (MRG-23ago17-c)");
        AUTOR.add("MRG-2018-1019 Pithecellobium dulce (MEGA-14mar18-h)");
        AUTOR.add("OTVHK040-801 Pithecellobium dulce");
        AUTOR.add("© didierbpn (CC BY-NC)");
        AUTOR.add("© didierbpn (CC BY-NC)");
        AUTOR.add("© bendanavargas – (CC BY-NC)");
        AUTOR.add("© BJ Stacey – (CC BY-NC)");
        AUTOR.add("© FRANCISCO MIGUEL FARRIOLS ESTRADA – (CC BY-NC)");
        AUTOR.add("© FRANCISCO MIGUEL FARRIOLS ESTRADA – (CC BY-NC)");
        AUTOR.add("© FRANCISCO MIGUEL FARRIOLS ESTRADA – (CC BY-NC)");
        AUTOR.add("2898 Enterolobium cyclocarpum");
        AUTOR.add("por Chris – Ningún derecho reservado (CC0)");
        AUTOR.add("© Whitney Cranshaw – (CC BY)");
        AUTOR.add("3771 Sabal mexicana");
        AUTOR.add("CGVM0224 Sabal mexicana");
        AUTOR.add("CGVM0225 Sabal mexicana");
        AUTOR.add("© James Coquat (CC BY-NC)");
        AUTOR.add("© Alina (CC BY-NC)");
        AUTOR.add("© Drew Avery – (CC BY)");
        AUTOR.add("© wilmalingle (CC BY-NC)");
        AUTOR.add("CD0418 Thrinax radiata");
        AUTOR.add("© Victoria Cervantes – (CC BY-NC-ND)");
        AUTOR.add("© tatianavelasco (CC BY-NC)");
        AUTOR.add("© karlibg – (CC BY-NC)");
        AUTOR.add("© Linda (CC BY-NC) ");
        AUTOR.add("© junipernight (CC BY-NC) ");
        AUTOR.add("© Diogo Luiz (CC BY-SA)");
        AUTOR.add("© desertnaturalist (CC BY-NC)");
        AUTOR.add("© tatianavelasco  (CC BY-NC)");
        AUTOR.add("© Carlos Domínguez-Rodríguez – (CC BY-NC)");
        AUTOR.add("© Generacion Verde INSETAP (CC BY-NC-SA)");
        AUTOR.add("© Generacion Verde INSETAP (CC BY-NC-SA)");
        AUTOR.add("© tatianavelasco (CC BY-NC)");
        AUTOR.add("© tatianavelasco (CC BY-NC)");
        AUTOR.add("Daderot -29px-Melicoccus_oliviformis_(Talisia_oliviformis)_-_Fruit_and_Spice_Park_-_Homestead,_Florida_-_DSC08977");
        AUTOR.add("© Smithsonian Institution – (CC BY-NC-SA)");
        AUTOR.add("CGL2033 Sapindus saponaria");
        AUTOR.add("© Joe (CC BY)");
        AUTOR.add("© Carlos A S Correia (CC BY-NC)");
        AUTOR.add("© Carlos A S Correia (CC BY-NC)");
        AUTOR.add("© Alma Narvaez");
        AUTOR.add("© Bio Benjaministas INSEBEHE (CC BY-NC-SA)");
        AUTOR.add("elopio (CC0) ");
        AUTOR.add("© sunnetchan (CC BY-NC-SA)");
        AUTOR.add("© Mateo Hernandez Schmidt (CC BY-NC-SA) ");
        AUTOR.add("© Mateo Hernandez Schmidt (CC BY-NC-SA)");
        AUTOR.add("© bsullend – (CC BY-NC)");
        AUTOR.add("© bsullend – (CC BY-NC)0");
        AUTOR.add("Judgefloro  BY NC");
        AUTOR.add("© Jean Laffitte C. – (CC BY-NC)");
        AUTOR.add("© Fr Bolmax Pereira – (CC BY-NC) ");
        AUTOR.add("© bendanavargas – (CC BY-NC)");
        AUTOR.add("© Mauricio Mercadante – (CC BY-NC-SA)");
        AUTOR.add("CGL3394 Mangifera indica");
        AUTOR.add("CGL3396 Mangifera indica");
        AUTOR.add("© betosoto  (CC BY-NC)");
        AUTOR.add("© Roberto R. Calderón – (CC BY-NC)");
        AUTOR.add("© Roberto R. Calderón – (CC BY-NC)");
        AUTOR.add("© rdz – (CC BY-NC)");
        AUTOR.add("© Katherine  (CC BY-NC)");
        AUTOR.add("© agnieszkab – (CC BY-NC)");
        AUTOR.add("© Jan Meerman – (CC BY-NC)");
        AUTOR.add("© Tracey Allen – (CC BY-NC)");
        AUTOR.add("© Tracey Allen – (CC BY-NC)");
        AUTOR.add("© mikeakresh – (CC BY-NC)");
        AUTOR.add("© mikeakresh – (CC BY-NC)");
        AUTOR.add("© mikeakresh – (CC BY-NC)");
        AUTOR.add("© Jennifer Rycenga (CC BY-NC)");
        AUTOR.add("IMDOC1303 Roystonea regia");
        AUTOR.add("© Mary Spilman – (CC BY-NC)");
        AUTOR.add("© Bruce Holst  (CC BY-NC)");
        AUTOR.add("© Bruce Holst  (CC BY-NC)");
        AUTOR.add("© Bruce Holst  (CC BY-NC)");
        AUTOR.add("© Bruce Holst  (CC BY-NC)");
        AUTOR.add("© Juan Cruzado Cortés (CC BY-SA)");
        AUTOR.add("© Reinaldo Aguilar (CC BY-NC-SA)");
        AUTOR.add("© Reinaldo Aguilar – (CC BY-NC-SA)");
        AUTOR.add("© Ma. Eugenia Mendiola González  (CC BY-NC)");
        AUTOR.add("© Carlos Galindo-Leal  (CC BY-NC)");
        AUTOR.add("FJRS0041 Brosimum alicastrum");
        AUTOR.add("© siddarthmachado – (CC BY-NC)");
        AUTOR.add("© siddarthmachado – (CC BY-NC)");
        AUTOR.add("© patriciasamperio – (CC BY-NC)");
        AUTOR.add("© Arturo Castro Castro – (CC BY-NC)");
        AUTOR.add("© Ana Josefa López Sandoval – (CC BY-NC-SA)_");
        AUTOR.add("© Zabdiel Peralta – (CC BY-NC)");
        AUTOR.add("CGL4194 Ehretia tinifolia");
        AUTOR.add("ROBLE_CORTEZA_CGL4407 Ehretia tinifolia");
        AUTOR.add("ROBLE_HOJA_FRUTO_CICY");
        AUTOR.add("ROBLE_FRUTO_© oscarreyna");
        AUTOR.add("© Andres Hernandez S. (CC BY-NC-SA)");
        AUTOR.add("FJRS0028 Annona squamosa");
        AUTOR.add("Ton Rulkens15px-Annona_squamosa_(5270605485)");
        AUTOR.add("© didolanvijustin  (CC BY-NC)");
        AUTOR.add("© apapachoa  (CC BY-NC)");
        AUTOR.add("© Neptalí Ramírez Marcial  (CC BY-NC)");
        AUTOR.add("FJRS0100 Cordia dodecandra");
        AUTOR.add("FJRS0101 Cordia dodecandra");
        AUTOR.add("FJRS0102 Cordia dodecandra");
        AUTOR.add("© Rodrigo Carral Domínguez");
        AUTOR.add("© Ana Josefa López Sandoval (CC BY-NC-SA)");
        AUTOR.add("© Dinesh Valke – (CC BY-NC-SA)");
        AUTOR.add("© Graeme White – (CC BY-NC)");
        AUTOR.add("© greensxm (CC BY-NC)");
        AUTOR.add("© milletman – (CC BY-NC-ND)");
        AUTOR.add("© Susan J. Hewitt – (CC BY-NC)");
        AUTOR.add("CGL2184 Tamarindus indica");
        AUTOR.add("© Onildo João Marini Filho  (CC BY-NC)");
        AUTOR.add("TRONADOR");
        AUTOR.add("© sergioniebla (CC BY-NC-SA)");
        AUTOR.add("© María Isabel Ignacio Sánchez  (CC BY-NC)");
        AUTOR.add("© Carlos Galindo-Leal (CC BY-NC)");
        AUTOR.add("© tonkabean (CC BY-NC)");
        AUTOR.add("© tonkabean (CC BY-NC)");
        AUTOR.add("© tonkabean (CC BY-NC)");
        AUTOR.add("© tonkabean (CC BY-NC)");
        AUTOR.add("© Ryne Rutherford (CC BY-NC)");
        AUTOR.add("© Jay Horn (CC BY)");
        AUTOR.add("© Generacion Verde INSETAP (CC BY-NC-SA)");
        AUTOR.add("© Generacion Verde INSETAP (CC BY-NC-SA)");
        AUTOR.add("Jesse Rorabaugh (CC0)");
        AUTOR.add("Peter de Lange (CC0)");
        AUTOR.add("© 葉子  (CC BY-NC-ND)");
        AUTOR.add("© greensxm  (CC BY-NC)");
        AUTOR.add("© Jean Philippe BASUYAUX (CC BY-NC)");
        AUTOR.add("© Pam Borso (CC BY-NC)");
        AUTOR.add("© Susan J. Hewitt (CC BY-NC)");
        AUTOR.add("CD0108 Coccoloba uvifera");

        //imagenes gaspar
        AUTOR.add("Mauro Guanandi");
        AUTOR.add("Dick Culbert ");
        AUTOR.add("Danielrengelm ");
        AUTOR.add("Biswarup Ganguly ");
        AUTOR.add("J.M. Garg ");
        AUTOR.add("Forest & Kimtarr ");
        AUTOR.add("Forestowlet ");
        AUTOR.add("J.M. Garg ");
        AUTOR.add("CICY ");
        AUTOR.add("CICY ");
        AUTOR.add("CICY ");
        AUTOR.add("Gaspar M. Puerto Graniel ");
        AUTOR.add("Filo gèn' ");
        AUTOR.add("Bob Peterson ");
        AUTOR.add("Filo gèn' ");
        AUTOR.add("Daniel Di Palma ");
        AUTOR.add("Forest and Kimtarr ");
        AUTOR.add("Fpalli ");
        AUTOR.add("Vengolis ");
        AUTOR.add("Ks.mini ");
        AUTOR.add("Ks.mini ");
        AUTOR.add("J.M.Garg ");
        AUTOR.add("Filo gèn' ");
        AUTOR.add("Kevinsooryan ");
        AUTOR.add("Mokkie ");
        AUTOR.add("http://www.greensouq.ae/pdt/azadirachta-indica/");
        AUTOR.add("H. Zell ");
        AUTOR.add("Delince ");
        AUTOR.add("Daniel Capilla ");
        AUTOR.add("Franz Xaver ");
        AUTOR.add("Hermann Luyken ");
        AUTOR.add("Consultaplantas ");
        AUTOR.add("Tyrrhium ");
        AUTOR.add("CICY ");
        AUTOR.add("CICY ");
        AUTOR.add("CICY ");
        AUTOR.add("Gaspar M. Puerto Graniel ");
        AUTOR.add("Jim Conrad ");
        AUTOR.add("Refugio Ramón Rivera Leiva ");
        AUTOR.add("Jim Conrad ");
        AUTOR.add("Jim Conrad ");
        AUTOR.add("CICY ");
        AUTOR.add("CICY ");
        AUTOR.add("CICY ");
        AUTOR.add("CICY ");
        AUTOR.add("J.C. Trejo-Torres ");
        AUTOR.add("Jim Conrad ");
        AUTOR.add("Jim Conrad ");
        AUTOR.add("Jim Conrad ");
        AUTOR.add("Basile Morin ");
        AUTOR.add("http://www.museobolivariano.org.co/lluvia-de-oro-cassia-fistula/lluvia-de-oro-cassia-fistula-2/");
        AUTOR.add("Marykev ");
        AUTOR.add("Daderot ");
        AUTOR.add("Cmales ");
        AUTOR.add("Wibowo Djatmiko ");
        AUTOR.add("Krzysztof ZiarnekKenraiz ");
        AUTOR.add("Jim Conrad ");
        AUTOR.add("CICY ");
        AUTOR.add("CICY ");
        AUTOR.add("David J.tang ");
        AUTOR.add("Forest and Kimtarr ");
        AUTOR.add("Rison Thumboor ");
        AUTOR.add("Forest and Kimtarr ");
        AUTOR.add("Daderot ");
        AUTOR.add("Robbin Moran ");
        AUTOR.add("David J.tang ");
        AUTOR.add("CICY ");
        AUTOR.add("David J.tang ");
        AUTOR.add("David J.tang ");
        AUTOR.add("Filo gèn' ");
        AUTOR.add("P Jeganathan ");
        AUTOR.add("Shizhao ");
        AUTOR.add("CICY ");
        AUTOR.add("CICY ");
        AUTOR.add("Marcela Ruiz Guerrero ");
        AUTOR.add("https://www.pxfuel.com/es/free-photo-ohyoz");
        AUTOR.add("https://www.pxfuel.com/es/free-photo-oycfq");
        AUTOR.add("Carla Antonini ");
        AUTOR.add("https://www.pxfuel.com/es/free-photo-oyzxy");
        AUTOR.add("Jim Conrad ");
        AUTOR.add("CICY ");
        AUTOR.add("CICY ");
        AUTOR.add("CICY ");
        AUTOR.add("Sten ");
        AUTOR.add("Forest & Kimtarr ");
        AUTOR.add("http://commons.wikimedia.org/wiki/File");
        AUTOR.add("CICY ");
        AUTOR.add("Dick Culbert ");
        AUTOR.add("B.navez ");
        AUTOR.add("PseudoscienceFTL ");
        AUTOR.add("CICY ");
        AUTOR.add("João Medeiros ");
        AUTOR.add("Oldcrookedjaw ");
        AUTOR.add("Franz Xaver ");
        AUTOR.add("J.M.Garg ");
        AUTOR.add("CICY ");
        AUTOR.add("CICY ");
        AUTOR.add("CICY ");
        AUTOR.add("CICY ");
        AUTOR.add("CICY ");
        AUTOR.add("Gaspar M. Puerto Graniel ");
        AUTOR.add("Gaspar M. Puerto Graniel ");
        AUTOR.add("Gaspar M. Puerto Graniel ");
        AUTOR.add("CICY ");
        AUTOR.add("CICY ");
        AUTOR.add("CICY ");
        AUTOR.add("CICY ");
        AUTOR.add("CICY ");
        AUTOR.add("W.H. Hayden ");
        AUTOR.add("http://commons.wikimedia.org/wiki/File");
        AUTOR.add("W.H. Hayden ");
        AUTOR.add("Prenn ");
        AUTOR.add("http://www.floresyplantas.net/moringa-oleifera/");
        AUTOR.add("Obsidianoul ");
        AUTOR.add("http://www.etsy.com/mx/listing/599342027/ben-aceite-de-semillas-de-arbol-moringa");
        AUTOR.add("Vinayaraj ");
        AUTOR.add("Judgeo ");
        AUTOR.add("Renjusplace ");
        AUTOR.add("Sarangib ");
        AUTOR.add("Tatters ");
        AUTOR.add("http://www.pikist.com/free-photo-vtxet");
        AUTOR.add("Pjeganathan ");
        AUTOR.add("Yosri ");
        AUTOR.add("");
        AUTOR.add("");
        AUTOR.add("");
        AUTOR.add("");
        AUTOR.add("Daniel Di Palma ");
        AUTOR.add("Michel Chauvet ");
        AUTOR.add("Krzysztof ZiarnekKenraiz ");
        AUTOR.add("Tatiana Gerus ");
        AUTOR.add("Gaspar M. Puerto Graniel ");
        AUTOR.add("Nadiatalent ");
        AUTOR.add("Gaspar M. Puerto Graniel ");
        AUTOR.add("David J.tang ");
        AUTOR.add("Hans Hillewaert ");
        AUTOR.add("Vinayaraj ");
        AUTOR.add("PumpkinSky ");
        AUTOR.add("David J.tang ");
        AUTOR.add("CICY ");
        AUTOR.add("CICY ");
        AUTOR.add("W.J. Hayden ");
        AUTOR.add("Jenny Evans ");
        AUTOR.add("CICY ");
        AUTOR.add("http://www.wikiwand.com/en/Sabal_yapa");
        AUTOR.add("Alex Nesanelis ");
        AUTOR.add("Francisco Javier Rendónandoval ");
        AUTOR.add("CICY ");
        AUTOR.add("Francisco Javier Rendónandoval ");
        AUTOR.add("Jim Conrad ");
        AUTOR.add("CICY ");
        AUTOR.add("CICY ");
        AUTOR.add("CICY ");
        AUTOR.add("Jim Conrad ");
        AUTOR.add("Tarciso Leão ");
        AUTOR.add("Paco Garin ");
        AUTOR.add("Tarciso Leão ");
        AUTOR.add("Gaspar M. Puerto Graniel ");
        AUTOR.add("David J.tang ");
        AUTOR.add("Daderot ");
        AUTOR.add("Fabio Barrios ");
        AUTOR.add("David J.tang ");
        AUTOR.add("David J.tang ");
        AUTOR.add("Vinayaraj ");
        AUTOR.add("Fred Almeida ");
        AUTOR.add("Monalperoth ");
        AUTOR.add("Alejandro Bayer Tamayo ");
        AUTOR.add("Gaspar M. Puerto Graniel ");
        AUTOR.add("Gaspar M. Puerto Graniel ");
        AUTOR.add("Gaspar M. Puerto Graniel ");
        AUTOR.add("Gaspar M. Puerto Graniel ");
        AUTOR.add("J.M. Garg");
        AUTOR.add("H. Zell ");
        AUTOR.add("Dick Culbert ");
        AUTOR.add("Gaspar M. Puerto Graniel ");
        AUTOR.add("http://sites.google.com/site/izotepower/flordeizote ");
        AUTOR.add("http://www.gardenia.net/plant/yucca-elephantipes");

        //agregadas por mi


    }

    public int getNumeroImagenes(String nombre_cientifico) {
        setNOMBE_IMAGEN();
        int indice = -1;
        indice = NOMBRE_IMAGEN.indexOf(nombre_cientifico);

        return getCANTIDAD_IMAGEN(indice);
    }

    public int getNumeroImagenes2(String nombre_cientifico) {
        setNOMBE_IMAGEN();
        int indice = -1;
        indice = NOMBRE_IMAGEN.indexOf(nombre_cientifico);

        return getCANTIDAD_IMAGEN2(indice);
    }


    public void setNOMBE_IMAGEN(){
        NOMBRE_IMAGEN = new ArrayList<>();

        NOMBRE_IMAGEN.add("annona_squamosa");
        NOMBRE_IMAGEN.add("averrhoa_carambola");
        NOMBRE_IMAGEN.add("beaucarnea_pliabilis");
        NOMBRE_IMAGEN.add("bourreria_pulchra");
        NOMBRE_IMAGEN.add("brosimum_alicastrum");
        NOMBRE_IMAGEN.add("bursera_simaruba");
        NOMBRE_IMAGEN.add("ceiba_pentandra");
        NOMBRE_IMAGEN.add("citrus_aurantium");
        NOMBRE_IMAGEN.add("coccoloba_uvifera");
        NOMBRE_IMAGEN.add("cordia_dodecandra");//10
        NOMBRE_IMAGEN.add("crescentia_cujete");
        NOMBRE_IMAGEN.add("ehretia_tinifolia");
        NOMBRE_IMAGEN.add("enterolobium_cyclocarpum");
        NOMBRE_IMAGEN.add("gymnopodium_floribundum");
        NOMBRE_IMAGEN.add("havardia_albicans");//15
        NOMBRE_IMAGEN.add("leucaena_leucocephala");
        NOMBRE_IMAGEN.add("lysiloma_latisiliquum");
        NOMBRE_IMAGEN.add("mangifera_indica");
        NOMBRE_IMAGEN.add("manilkara_zapota");
        NOMBRE_IMAGEN.add("melicoccus_oliviformis");//20
        NOMBRE_IMAGEN.add("peltophorum_pterocarpum");
        NOMBRE_IMAGEN.add("persea_americana");
        NOMBRE_IMAGEN.add("pithecellobium_dulce");
        NOMBRE_IMAGEN.add("plumeria_rubra");
        NOMBRE_IMAGEN.add("pouteria_campechiana");//25
        NOMBRE_IMAGEN.add("pseudophoenix_sargentii");
        NOMBRE_IMAGEN.add("roystonea_regia");
        NOMBRE_IMAGEN.add("sabal_mexicana");
        NOMBRE_IMAGEN.add("samanea_saman");
        NOMBRE_IMAGEN.add("sapindus_saponaria");//30
        NOMBRE_IMAGEN.add("tabebuia_chrysantha");
        NOMBRE_IMAGEN.add("tamarindus_indica");
        NOMBRE_IMAGEN.add("tecoma_stans");
        NOMBRE_IMAGEN.add("thrinax_radiata");
        NOMBRE_IMAGEN.add("lonchocarpus_punctatus");
        NOMBRE_IMAGEN.add("gymnopodium_floribundum");

        //segunda parte del banco de imagenes
        NOMBRE_IMAGEN.add("albizia_lebbeck");
        NOMBRE_IMAGEN.add("heliocarpus_donnellsmithii");
        NOMBRE_IMAGEN.add("cascabela_gaumeri");
        NOMBRE_IMAGEN.add("ficus_cotinifolia");
        NOMBRE_IMAGEN.add("terminalia_catappa");
        NOMBRE_IMAGEN.add("pseudobombax_ellipticum");
        NOMBRE_IMAGEN.add("annona_reticulata");
        NOMBRE_IMAGEN.add("bauhinia_variegata");
        NOMBRE_IMAGEN.add("lonchocarpus_punctatus");
        NOMBRE_IMAGEN.add("chrysophyllum_cainito");
        NOMBRE_IMAGEN.add("swietenia_macrophylla");
        NOMBRE_IMAGEN.add("muntingia_calabura");
        NOMBRE_IMAGEN.add("senegalia_gaumeri");
        NOMBRE_IMAGEN.add("spondias_purpurea");
        NOMBRE_IMAGEN.add("cocos_nucifera");
        NOMBRE_IMAGEN.add("annona_glabra");
        NOMBRE_IMAGEN.add("acrocomia_aculeata");
        NOMBRE_IMAGEN.add("randia_aculeata");
        NOMBRE_IMAGEN.add("delonix_regia");
        NOMBRE_IMAGEN.add("phyllantus_acidus");
        NOMBRE_IMAGEN.add("guazuma_ulmifolia");
        NOMBRE_IMAGEN.add("annona_muricata");
        NOMBRE_IMAGEN.add("sabal_yapa");
        NOMBRE_IMAGEN.add("cecropia_peltata");
        NOMBRE_IMAGEN.add("psidium_guajava");
        NOMBRE_IMAGEN.add("melicoccus_bijugatus");
        NOMBRE_IMAGEN.add("ficus_maxima");
        NOMBRE_IMAGEN.add("ficus_elastica");
        NOMBRE_IMAGEN.add("piscidia_piscipula");
        NOMBRE_IMAGEN.add("amphitecna_latifolia");
        NOMBRE_IMAGEN.add("ficus_benjamina");
        NOMBRE_IMAGEN.add("citrus_aurantiaca");
        NOMBRE_IMAGEN.add("cassia_fistula");
        NOMBRE_IMAGEN.add("tabebuia_rosea");
        NOMBRE_IMAGEN.add("pouteria_sapota");
        NOMBRE_IMAGEN.add("crateva_tapia");
        NOMBRE_IMAGEN.add("maclura_tinctoria");
        NOMBRE_IMAGEN.add("moringa_oleifera");
        NOMBRE_IMAGEN.add("senna_racemosa");
        NOMBRE_IMAGEN.add("diospyros_anisandra");
        NOMBRE_IMAGEN.add("caesalpinia_gaumeri");
        NOMBRE_IMAGEN.add("caesalpinia_yucatanensis");
        NOMBRE_IMAGEN.add("coccothrinax_readii");
        NOMBRE_IMAGEN.add("byrsonima_crassifolia");
        NOMBRE_IMAGEN.add("azadirachta_indica");
        NOMBRE_IMAGEN.add("simarouba_amara");
        NOMBRE_IMAGEN.add("ceiba_aesculifolia");
        NOMBRE_IMAGEN.add("annona_squamosa");
        NOMBRE_IMAGEN.add("caesalpinia_mollis");
        NOMBRE_IMAGEN.add("yucca_elephantipes");

        //agregadas por mi
        NOMBRE_IMAGEN.add("cascabela_thevetia");
        NOMBRE_IMAGEN.add("cordia_sebestena");
        NOMBRE_IMAGEN.add("araucaria_heterophylla");
        NOMBRE_IMAGEN.add("dypsis_lutescens");
        NOMBRE_IMAGEN.add("cedrela_odorata");
        NOMBRE_IMAGEN.add("tabebuia_guayacan");
        NOMBRE_IMAGEN.add("guaiacum_sanctum");
        NOMBRE_IMAGEN.add("adonidia_merilli");
        NOMBRE_IMAGEN.add("ficus_microcarpa");
        NOMBRE_IMAGEN.add("citrus_latifolia");
        NOMBRE_IMAGEN.add("cochlospermum_vitifolium");
        NOMBRE_IMAGEN.add("citrus_reticulata");
        NOMBRE_IMAGEN.add("ourreria_pulchra");
        NOMBRE_IMAGEN.add("citrus_sinensis");
        NOMBRE_IMAGEN.add("washingtonia_robusta");
        NOMBRE_IMAGEN.add("phoenix_dactylifera");
        NOMBRE_IMAGEN.add("diospyros_digyna");

    }



    public void setCANTIDAD_IMAGEN(){
        CANTIDAD_IMAGEN = new ArrayList<Integer>();
        CANTIDAD_IMAGEN.add(5); //annona_scamosa
        CANTIDAD_IMAGEN.add(5);//averrhoa_carambola
        CANTIDAD_IMAGEN.add(5);//beaucarnea_pliabilis
        CANTIDAD_IMAGEN.add(5);//bourreria_pulchra
        CANTIDAD_IMAGEN.add(6);//brosimum_alicastrum
        CANTIDAD_IMAGEN.add(6);//bursera_simaruba
        CANTIDAD_IMAGEN.add(5);//ceiba_petandra
        CANTIDAD_IMAGEN.add(6);//citrus_aurantium
        CANTIDAD_IMAGEN.add(5);//coccoloba_uvifera
        CANTIDAD_IMAGEN.add(5);//cordia_dodecandra --- 10
        CANTIDAD_IMAGEN.add(5);//crescentia_cujete
        CANTIDAD_IMAGEN.add(5);//ehretia_tinifolia
        CANTIDAD_IMAGEN.add(7);//enterolobium_cyclocarpum
        CANTIDAD_IMAGEN.add(5);//gymnopodium_floribundum
        CANTIDAD_IMAGEN.add(4);//havardia_albicans            --15
        CANTIDAD_IMAGEN.add(5);//leucaena_leucocephala
        CANTIDAD_IMAGEN.add(6);//lysiloma_latisiliquum
        CANTIDAD_IMAGEN.add(5);//mangifera_indica
        CANTIDAD_IMAGEN.add(6);//manilkara_zapota
        CANTIDAD_IMAGEN.add(7);//melicoccus_oliviformis --20
        CANTIDAD_IMAGEN.add(7);//peltophorum_pterocarpum
        CANTIDAD_IMAGEN.add(5);//persea_americana
        CANTIDAD_IMAGEN.add(6);//pithecellobium_dulce
        CANTIDAD_IMAGEN.add(6);//plumeria_rubra
        CANTIDAD_IMAGEN.add(5);//pouteria_campechiana   --25
        CANTIDAD_IMAGEN.add(6);//pseudophoenix_sargentii
        CANTIDAD_IMAGEN.add(7);//roystonea_regia
        CANTIDAD_IMAGEN.add(5);//sabal_mexicana
        CANTIDAD_IMAGEN.add(7);//samanea_saman
        CANTIDAD_IMAGEN.add(5);//sapindus_saponaria --30
        CANTIDAD_IMAGEN.add(5);//tabebuia_chrysantha
        CANTIDAD_IMAGEN.add(6);//tamarindus_indica
        CANTIDAD_IMAGEN.add(6);//tecoma_stans
        CANTIDAD_IMAGEN.add(7);//thrinax_radiata
        CANTIDAD_IMAGEN.add(5);
        CANTIDAD_IMAGEN.add(5);

        //segunda parte del banco de imagenes

        CANTIDAD_IMAGEN.add(5);
        CANTIDAD_IMAGEN.add(3);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(2);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(3);
        CANTIDAD_IMAGEN.add(3);
        CANTIDAD_IMAGEN.add(5);
        CANTIDAD_IMAGEN.add(5);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(5);
        CANTIDAD_IMAGEN.add(5);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(3);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(2);
        CANTIDAD_IMAGEN.add(3);
        CANTIDAD_IMAGEN.add(5);
        CANTIDAD_IMAGEN.add(5);
        CANTIDAD_IMAGEN.add(3);
        CANTIDAD_IMAGEN.add(1);
        CANTIDAD_IMAGEN.add(2);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(3);
        CANTIDAD_IMAGEN.add(1);
        CANTIDAD_IMAGEN.add(3);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(3);
        CANTIDAD_IMAGEN.add(3);
        CANTIDAD_IMAGEN.add(5);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(3);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(3);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(3);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(2);
        CANTIDAD_IMAGEN.add(2);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(2);

        //agregadas por mi
        CANTIDAD_IMAGEN.add(3);
        CANTIDAD_IMAGEN.add(3);
        CANTIDAD_IMAGEN.add(2);
        CANTIDAD_IMAGEN.add(2);
        CANTIDAD_IMAGEN.add(2);
        CANTIDAD_IMAGEN.add(1);
        CANTIDAD_IMAGEN.add(2);
        CANTIDAD_IMAGEN.add(1);
        CANTIDAD_IMAGEN.add(1);
        CANTIDAD_IMAGEN.add(1);
        CANTIDAD_IMAGEN.add(1);
        CANTIDAD_IMAGEN.add(1);
        CANTIDAD_IMAGEN.add(1);
        CANTIDAD_IMAGEN.add(1);
        CANTIDAD_IMAGEN.add(1);
        CANTIDAD_IMAGEN.add(1);
        CANTIDAD_IMAGEN.add(50);//diospyros_digyna

        //setCANTIDAD_IMAGEN2();
    }

    public void setCANTIDAD_IMAGEN2(){
        CANTIDAD_IMAGEN = new ArrayList<Integer>();
        CANTIDAD_IMAGEN.add(50); //annona_scamosa
        CANTIDAD_IMAGEN.add(50);//averrhoa_carambola
        CANTIDAD_IMAGEN.add(50);//beaucarnea_pliabilis
        CANTIDAD_IMAGEN.add(23);//bourreria_pulchra
        CANTIDAD_IMAGEN.add(50);//brosimum_alicastrum
        CANTIDAD_IMAGEN.add(50);//bursera_simaruba
        CANTIDAD_IMAGEN.add(50);//ceiba_petandra
        CANTIDAD_IMAGEN.add(50);//citrus_aurantium
        CANTIDAD_IMAGEN.add(50);//coccoloba_uvifera
        CANTIDAD_IMAGEN.add(50);//cordia_dodecandra --- 10
        CANTIDAD_IMAGEN.add(50);//crescentia_cujete
        CANTIDAD_IMAGEN.add(50);//ehretia_tinifolia
        CANTIDAD_IMAGEN.add(50);//enterolobium_cyclocarpum
        CANTIDAD_IMAGEN.add(50);//gymnopodium_floribundum
        CANTIDAD_IMAGEN.add(4);//havardia_albicans            --15
        CANTIDAD_IMAGEN.add(50);//leucaena_leucocephala
        CANTIDAD_IMAGEN.add(50);//lysiloma_latisiliquum
        CANTIDAD_IMAGEN.add(50);//mangifera_indica
        CANTIDAD_IMAGEN.add(50);//manilkara_zapota
        CANTIDAD_IMAGEN.add(50);//melicoccus_oliviformis --20
        CANTIDAD_IMAGEN.add(50);//peltophorum_pterocarpum
        CANTIDAD_IMAGEN.add(50);//persea_americana
        CANTIDAD_IMAGEN.add(50);//pithecellobium_dulce
        CANTIDAD_IMAGEN.add(6);//plumeria_rubra
        CANTIDAD_IMAGEN.add(50);//pouteria_campechiana   --25
        CANTIDAD_IMAGEN.add(50);//pseudophoenix_sargentii
        CANTIDAD_IMAGEN.add(50);//roystonea_regia
        CANTIDAD_IMAGEN.add(50);//sabal_mexicana
        CANTIDAD_IMAGEN.add(50);//samanea_saman
        CANTIDAD_IMAGEN.add(50);//sapindus_saponaria --30
        CANTIDAD_IMAGEN.add(50);//tabebuia_chrysantha
        CANTIDAD_IMAGEN.add(50);//tamarindus_indica
        CANTIDAD_IMAGEN.add(50);//tecoma_stans
        CANTIDAD_IMAGEN.add(50);//thrinax_radiata
        CANTIDAD_IMAGEN.add(5);
        CANTIDAD_IMAGEN.add(5);

        //segunda parte del banco de imagenes

        CANTIDAD_IMAGEN.add(5);
        CANTIDAD_IMAGEN.add(3);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(2);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(3);
        CANTIDAD_IMAGEN.add(3);
        CANTIDAD_IMAGEN.add(5);
        CANTIDAD_IMAGEN.add(5);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(5);
        CANTIDAD_IMAGEN.add(5);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(3);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(2);
        CANTIDAD_IMAGEN.add(3);
        CANTIDAD_IMAGEN.add(5);
        CANTIDAD_IMAGEN.add(5);
        CANTIDAD_IMAGEN.add(3);
        CANTIDAD_IMAGEN.add(1);
        CANTIDAD_IMAGEN.add(2);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(3);
        CANTIDAD_IMAGEN.add(1);
        CANTIDAD_IMAGEN.add(3);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(3);
        CANTIDAD_IMAGEN.add(3);
        CANTIDAD_IMAGEN.add(5);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(3);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(3);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(3);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(2);
        CANTIDAD_IMAGEN.add(2);
        CANTIDAD_IMAGEN.add(4);
        CANTIDAD_IMAGEN.add(2);

        //agregadas por mi
        CANTIDAD_IMAGEN.add(3);
        CANTIDAD_IMAGEN.add(3);
        CANTIDAD_IMAGEN.add(2);
        CANTIDAD_IMAGEN.add(2);
        CANTIDAD_IMAGEN.add(2);
        CANTIDAD_IMAGEN.add(1);
        CANTIDAD_IMAGEN.add(2);
        CANTIDAD_IMAGEN.add(1);
        CANTIDAD_IMAGEN.add(1);
        CANTIDAD_IMAGEN.add(1);
        CANTIDAD_IMAGEN.add(1);
        CANTIDAD_IMAGEN.add(1);
        CANTIDAD_IMAGEN.add(1);
        CANTIDAD_IMAGEN.add(1);
        CANTIDAD_IMAGEN.add(1);
        CANTIDAD_IMAGEN.add(1);
        CANTIDAD_IMAGEN.add(50);//diospyros_digyna


    }



    public int getCANTIDAD_IMAGEN(int pos){
        setCANTIDAD_IMAGEN();
        return CANTIDAD_IMAGEN.get(pos);
    }
    public int getCANTIDAD_IMAGEN2(int pos){
        setCANTIDAD_IMAGEN2();
        return CANTIDAD_IMAGEN.get(pos);
    }

    //public int getNOMBRE_IMAGEN()

    public String getNOMBRE_COMUN(int position) {
        setNombreComun();
        return NOMBRE_COMUN.get(position);
    }
    public String getNOMBRE_CIENTIFICO(int position) {
        setNombreCientifico();
        return NOMBRE_CIENTIFICO.get(position);
    }

    public String getDESCRIPCION(int position) {
        setDescripcion();
        return DESCRIPCION.get(position);
    }

    public String getORIGEN(int position) {
        setOrigen();
        return ORIGEN.get(position);
    }
    public String getRIEGO(int position) {
        setRiego();
        return RIEGO.get(position);
    }
    public String getUSOS_SERVICIOS_ECOSISTEMICOS(int position) {
        setUsosServiciosEcosistemicos();
        return USOS_SERVICIOS_ECOSISTEMICOS.get(position);
    }
    public String getSE_PROVISION(int position) {
        setProvision();
        return SE_PROVISION.get(position);
    }
    public String getSE_REGULACION(int position) {
        setRegulacion();
        return SE_REGULACION.get(position);
    }
    public String getSE_USOS(int position) {
        setUsosServiciosEcosistemicos();
        return USOS_SERVICIOS_ECOSISTEMICOS.get(position);
    }
    public String getSE_CULTURALES(int position) {
        setSECulturales();
        return SE_CULTURALES.get(position);
    }
    public String getPRECAUCIONES(int position){
        setPrecauciones();
        return PRECAUCIONES.get(position);
    }
    public String getCARACTERISTICAS(int position){
        setCaracteristicas();
        return CARACTERISTICAS.get(position);
    }

    public int getPosition(String nombre){
        setNombreComun();
        int indice = 0;
        for(int i=0;i<NOMBRE_COMUN.size();i++)
        {
            if(NOMBRE_COMUN.get(i).equals(nombre))
                indice = i;
        }

        return indice;
    }


    //--------------------------------------------

    public ArrayList<String> getNOMBRE_CIENTIFICO() {
        setNombreCientifico();
        return NOMBRE_CIENTIFICO;
    }
    public ArrayList<String> getNOMBRE_COMUN_MAYA() {
        setNombreComunMaya();
        return NOMBRE_COMUN_MAYA;
    }

    public String getNOMBRE_COMUN_MAYA(int position) {
        setNombreComunMaya();
        return NOMBRE_COMUN_MAYA.get(position);
    }

    public ArrayList<String> getNOMBRE_COMUN() {
        setNombreComun();
        return NOMBRE_COMUN;
    }

    public ArrayList<String> getOTROS_NOMBRES_COMUNES() {
        setOtrosNombresComunes();
        return OTROS_NOMBRES_COMUNES;
    }
    public String getOTROS_NOMBRES_COMUNES(int position) {
        setOtrosNombresComunes();
        return OTROS_NOMBRES_COMUNES.get(position);
    }

    public ArrayList<String> getFAMILIA() {
        setFamilia();
        return FAMILIA;
    }
    public String getFAMILIA(int position){
        setFamilia();
        String familia = "";
        familia = FAMILIA.get(position);
        return familia;

    }

    public ArrayList<String> getORIGEN() {
        setOrigen();
        return ORIGEN;
    }

    public ArrayList<String> getNOM() {
        setNOM();
        return NOM;
    }

    public ArrayList<String> getTALLA_P_IMAGEN() {
        setTallaImagen();
        return TALLA_P_IMAGEN;
    }

    public String getTALLA_P_IMAGEN(int position) {
        setTallaImagen();
        return TALLA_P_IMAGEN.get(position).toLowerCase();
    }

    public ArrayList<String> getPERMANENCIA_DE_LAS_HOJAS() {
        setPermanenciaHojas();
        return PERMANENCIA_DE_LAS_HOJAS;
    }
    public String getPERMANENCIA_DE_LAS_HOJAS(int index) {
        setPermanenciaHojas();
        String permanencia = "";
        permanencia = PERMANENCIA_DE_LAS_HOJAS.get(index);
        return permanencia;
    }

    public ArrayList<String> getTIPO_DE_HOJA() {
        setTipoHoja();
        return TIPO_DE_HOJA;
    }


    public String getTIPO_DE_HOJA(String nombre) {
        setTipoHoja();
        setNombreCientifico();
        int indice = NOMBRE_CIENTIFICO.indexOf(nombre);
        String tipo_hoja = TIPO_DE_HOJA.get(indice);
        return tipo_hoja;
    }

    public ArrayList<String> getCORTEZA_ADULTA() {
        setCorteza();
        return CORTEZA_ADULTA;
    }
    public String getCORTEZA_ADULTA(String nombre) {
        setCorteza();
        setNombreCientifico();
        int indice = NOMBRE_CIENTIFICO.indexOf(nombre);
        String corteza = CORTEZA_ADULTA.get(indice);
        return corteza;
    }

    public ArrayList<String> getFLOR_COLOR() {
        setColorFlor();
        return FLOR_COLOR;
    }

    public String getCOLOR_FLOR(String nombre) {
        setColorFlor();
        setNombreCientifico();
        int indice = NOMBRE_CIENTIFICO.indexOf(nombre);
        String corteza = FLOR_COLOR.get(indice);
        return corteza;
    }

    public ArrayList<String> getFLORACION() {
        setFloracion();
        return FLORACION;
    }

    public ArrayList<String> getFRUCTIFICACION() {
        setFructificacion();
        return FRUCTIFICACION;
    }

    public ArrayList<String> getRIEGO() {
        setRiego();
        return RIEGO;
    }

    public ArrayList<String> getPRECAUCIONES() {
        setPrecauciones();
        return PRECAUCIONES;
    }

    public ArrayList<String> getUSOS_SERVICIOS_ECOSISTEMICOS() {
        setUsosServiciosEcosistemicos();
        return USOS_SERVICIOS_ECOSISTEMICOS;
    }

    public ArrayList<String> getSE_PROVISION() {
        setProvision();
        return SE_PROVISION;
    }

    public ArrayList<String> getICONOS_PROVISION() {
        setIconosProvision();
        return ICONOS_PROVISION;
    }

    public ArrayList<String> getSE_REGULACION() {
        setPrecauciones();
        return SE_REGULACION;
    }

    public ArrayList<String> getSE_CULTURALES() {
        setSECulturales();
        return SE_CULTURALES;
    }

    public ArrayList<String> getCULTURA_MAYA() {
        setCulturaMaya();
        return CULTURA_MAYA;
    }

    public ArrayList<String> getDESCRIPCION() {
        setDescripcion();
        return DESCRIPCION;
    }

    public ArrayList<String> getCARACTERISTICAS() {
        setCaracteristicas();
        return CARACTERISTICAS;
    }

    private void setCaracteristicas() {
        CARACTERISTICAS = new ArrayList<>();

        CARACTERISTICAS.add("Flores color crema, dispuestas en cabezuelas . Corteza fisurada clara. Vainas aplanadas, con la hilera de semillas abultadas, que suenan con el viento");
        CARACTERISTICAS.add("Frutos rodeados de estructuras como agujas, que le dan una apariencia de sol");
        CARACTERISTICAS.add("Fruto");
        CARACTERISTICAS.add("Flores con forma de campana, verdosas. Látex lechoso al romper ramas u hojas");
        CARACTERISTICAS.add("Ninguna en particular");
        CARACTERISTICAS.add("Flores rosadas dispuestas en cabezuelas. Corteza escamosa oscura");
        CARACTERISTICAS.add("Hojas ovoides que se tornan rojizas al envejecer. Fruto con forma de almendra");
        CARACTERISTICAS.add("Hojas compuestas palmeadas, rojizas cuando jóvenes. Flor con numerosos estambres");
        CARACTERISTICAS.add("Flores naranjas con cinco o seis lóbulos");
        CARACTERISTICAS.add("Frutos rojizos al madurar, con forma de corazón. Las hojas de este género despiden un olor característico al triturarse.");
        CARACTERISTICAS.add("Apariencia de pino");
        CARACTERISTICAS.add("Flores moradas de cinco pétalos");
        CARACTERISTICAS.add("Palmera mediana colonial, tronco liso anillado color amarillo verdoso");
        CARACTERISTICAS.add("Ramas colgantes. Hojas imparipinnadas. Inflorescencias interfoliares con flores moradas.");
        CARACTERISTICAS.add("Hojas compuestas bipinnadas con foliolos ovalados verde claros Flores amarillas en racimos.");
        CARACTERISTICAS.add("Hojas con el reverso café dorado con pubescencia densa");
        CARACTERISTICAS.add("Flor con forma de campana, amarilla o durazno. Fruto verde romboide.");
        CARACTERISTICAS.add("Fruto, cápsula leñosa, ovoide, pardo-rojiza");
        CARACTERISTICAS.add("Hojas simples de borde aserrado. El fruto es una baya rojiza");
        CARACTERISTICAS.add("Fruto cuyo corte transversal tiene forma de estrella");
        CARACTERISTICAS.add("Ninguna en particular");
        CARACTERISTICAS.add("Fruto seco");
        CARACTERISTICAS.add("Corteza verde cubierta de espinas cónicas. Flores rosadas o blancas, pequeñas");
        CARACTERISTICAS.add("Fruto con forma de balón de fútbol americano");
        CARACTERISTICAS.add("Corteza espinosa");
        CARACTERISTICAS.add("Fruto rojo purpúreo o amarillo");
        CARACTERISTICAS.add("Fruto");
        CARACTERISTICAS.add("Fruto esférico liso. Las hojas de este género despiden un olor característico al triturarse.");
        CARACTERISTICAS.add("Palmera grande con espinas en el tronco");
        CARACTERISTICAS.add("Las ramas crecen con forma de cruz. Hojas agrupadas");
        CARACTERISTICAS.add("Hojas lineares dispuestas en forma de roseta");
        CARACTERISTICAS.add("Corteza que se desprende en tiras");
        CARACTERISTICAS.add("Flores características con cinco pétalos. El fruto es una vaina aplanada de 40 a 90 cm de largo, muy dura y leñosa.");
        CARACTERISTICAS.add("Inflorescencias largas, de flores amarillas, con el pedúnculo, raquis, pedicelos y sépalos recubiertos de pubescencia marrón");
        CARACTERISTICAS.add("Flores de cinco pétalos características. Fruto con forma de V.");
        CARACTERISTICAS.add("Frutos presentan 6 a 8 prominencias longitudinales");
        CARACTERISTICAS.add("Hojas simples de borde aserrado. Inflorescencias en panículas axilares. El fruto es una cápsula con protuberancias cónicas en la superficie.");
        CARACTERISTICAS.add("Vainas rojizas en espiral, dehiscentes, con semillas negras rodeadas con arilo blanquecino dulce");
        CARACTERISTICAS.add("Frutos de aspecto espinoso. Las hojas de este género despiden un olor característico al triturarse.");
        CARACTERISTICAS.add("Vaina circular aplanada, oscura");
        CARACTERISTICAS.add("Palmera grande, hojas palmeadas cuyos pecíolos permanecen en el tronco al caer la hoja");
        CARACTERISTICAS.add("Palmera mediana, hojas palmadas, frutos blancos");
        CARACTERISTICAS.add("Palmera mediana, hojas palmeadas, tronco liso anillado");
        CARACTERISTICAS.add("Hojas multilobuladas");
        CARACTERISTICAS.add("Corteza que se desprende en escamas lisas");
        CARACTERISTICAS.add("Flores azuladas");
        CARACTERISTICAS.add("Hojas. Flores amarillas en racimos terminales cortos");
        CARACTERISTICAS.add("Hojas compuestas, con 5 folíolos, pecíolo y raquis rojizos. Flores amarillas");
        CARACTERISTICAS.add("Hojas con dos pares de folíolos elípticos a ovado-elípticos y con margen entero");
        CARACTERISTICAS.add("Hojas grandes, con la nervadura marcada, con estípulas");
        CARACTERISTICAS.add("Hojas compuestas, 4 folíolos.");
        CARACTERISTICAS.add("Hojas grandes lustrosas, con estípulas");
        CARACTERISTICAS.add("Frutos verde pálido con 4 alas");
        CARACTERISTICAS.add("Frutos globosos cafés, con pulpa pegajosa y una semilla redonde y negra");
        CARACTERISTICAS.add("Hojas agrupadas. Su fruto es la jícara ");
        CARACTERISTICAS.add("Hojas coriáceas color verde oscuro. El fruto es una jícara pequeña");
        CARACTERISTICAS.add("Hojas simples brillantes agrupadas. Frutos pequeños, globosos, rojos con sépalos persistentes.");
        CARACTERISTICAS.add("Frutos amarillos");
        CARACTERISTICAS.add("Hojas compuestas paripinnadas. Flores amarillas de 5 pétalos");
        CARACTERISTICAS.add("Palmera mediana solitaria, hojas con pecíolos que envuelven el tronco");
        CARACTERISTICAS.add("Hojas compuestas bipinnadas con foliolos romboides, verde oscuro. Flores amarillas en racimos.");
        CARACTERISTICAS.add("Hojas simples, verde brillantes, con estíúlas y látex lechoso al romperse");
        CARACTERISTICAS.add("Hojas simples, verde brillantes, ápice redondeado acabado en una punta caudada, con estíúlas y látex lechoso al romperse");
        CARACTERISTICAS.add("Ninguna en particular");
        CARACTERISTICAS.add("Ninguna en particular");
        CARACTERISTICAS.add("Fruto legumbre cilíndrica");
        CARACTERISTICAS.add("Hojas compuestas, con 5 folíolos. Flores rosadas");
        CARACTERISTICAS.add("Hojas multilobuladas. Flores amarillas");
        CARACTERISTICAS.add("Flores sésiles (sin pecíolo) a lo largo del tallo");
        CARACTERISTICAS.add("Ninguna en particular");
        CARACTERISTICAS.add("Frutos");
        CARACTERISTICAS.add("Hojas trifoliadas. Flores verdosas con múltiples estambles largos");
        CARACTERISTICAS.add(" Las flores masculinas aparecen en amentos (cordoncitos colgantes) y las femeninas en cabezuelas solitarias de 4-5 mm de diámetro.");
        CARACTERISTICAS.add("Hojas tripinnadas. Flores blancas");
        CARACTERISTICAS.add("Envés de la hoja ligeramente plateado. Frutos morados oscuros");
        CARACTERISTICAS.add("Hojas simples casi glabras en el anverso. Su fruto es el nance");
        CARACTERISTICAS.add("Ninguna en particular");
        CARACTERISTICAS.add("Ninguna en particular");
        CARACTERISTICAS.add("Hojas imparipinnadas con foliolos de bordes aserrados");
        CARACTERISTICAS.add("Tronco puede estar ensanchado. Corteza anillada con entrenudos lisos de color verde grisáceo. Hojas coriáceas verde azulosas.");
        CARACTERISTICAS.add("Palmera grande sin espinas, hojas pinnadas");
        CARACTERISTICAS.add("Palmera grande con espinas en los pecíolos");
        CARACTERISTICAS.add("Palmera grande, hojas con espinas");
        CARACTERISTICAS.add("Corteza lisa, rojiza y se despega en jirones");
        CARACTERISTICAS.add("El pecíolo y el raquis de las hojas es amarillento o rojizo. Las hojas jóvenes son rojizas. Frutos frescos con aspecto de aceituna o pistache.");
        CARACTERISTICAS.add("Corteza grisácea cubierta de numerosas espinas cónicas. Flores blancas, grandes, pecioladas");
        CARACTERISTICAS.add("Hojas simples, verde brillantes, con látex lechoso al romperse");
        CARACTERISTICAS.add("Frutos pequeños amarillos");
        CARACTERISTICAS.add("Hojas simples, nervadura marcada. Flores blancas. Frutos con apariencia de pirámide invertida");
        CARACTERISTICAS.add("Fruto escamoso. Las hojas de este género despiden un olor característico al triturarse.");
        CARACTERISTICAS.add("Flores naranjas con múltiples lóbulos");
        CARACTERISTICAS.add("Hojas paripinnadas. Su fruto es el tamarindo");
        CARACTERISTICAS.add("Hojas compuestas imparipinnadas con foliolos de borde aserrado. Flores amarillas");
        CARACTERISTICAS.add("Presenta estípulas grandes. Vainas cafés torcidas");
        CARACTERISTICAS.add("Hojas con glándulas ovaladas en forma de cráter entre las primeras dos pinnas. Flores blancas en cabezuelas. Vaina aplanada.");
        CARACTERISTICAS.add("Frutos morados en racimos, semejantes a los de las uvas.");
        CARACTERISTICAS.add("Ninguna en particular");
        CARACTERISTICAS.add("Hojas lanceoladas dispuestas en forma de roseta, rígidas y con una punta");
        CARACTERISTICAS.add("Frutos grandes, verdes, interior negro, con sépalos persistentes");


    }

    private void setDescripcion() {

        DESCRIPCION = new ArrayList<>();

        DESCRIPCION.add("Árbol de 6 a 12 m o hasta 30 m,  copa con forma de paraguas, con tronco corto y corteza gris más o menos lisa. Hojas compuestas grandes, de 15 a 40 cm, con 2 a 4 pares de segmentos y cada uno con 4 a 9 hojitas ovaladas, envés verde claro. Flores blancas, bisexuales tubulares de 3 a 4 cm de largo. Crecen en racimos con muchas flores extendidas y fragantes. Estambres muy largos que forman una mata abundante de fibras blanco verdosas en cada flor. Fruto aplanado y ancho, de color pajizo, de 10 a 20 cm de largo con una hilera de varias semillas café claro, planas y redondas. ");
        DESCRIPCION.add("Es un árbol que alcanza un tamaño de 15 m de altura.  Tienen el tronco frecuentemente bifurcado o trifurcado, la copa es redondeada y abierta, compuesta de ramas delgadas y ascendentes.  Las hojas tienen forma ovada y son muy largas de color verde brillante y lisas en el anverso y de color verde pálido y escasos vellos, en el reverso. Las flores son de color crema verdoso. Los frutos son núculas globosas ligeramente comprimidas que están rodeadas de numerosas agujas (NATURALISTA).");
        DESCRIPCION.add("En estado silvestre, el árbol puede alcanzar alturas de alrededor de 20 m, más comúnmente entre 8 y 12 m, y un diámetro a la altura del pecho de 30-60 cm, con tronco erecto o torcido. Copa extendida. Corteza áspera, gris verdosa, a veces surcada longitudinalmente. Hojas compuestas alternas de 8 a 20 cm por 5 a 12 cm, coríaceos de color verde, en el envés marrón amarillento y resalta el nervio central. Inflorescencias en panículas de 8 a 14 cm. Flores verde de 0.5 cm. El fruto es el aguacate.  ");
        DESCRIPCION.add("Árbol pequeño de 3 a 5 m de altura, posee abundante exudado blanco lechoso que se observa al cortar las hojas o ramas.  Hojas verdes, delgadas y alargadas. Tienen vistosas flores de color amarillo en forma de campana (Ayuntamiento de Mérida 2018-2021)");
        DESCRIPCION.add("Son árboles, que alcanza un tamaño de 20 m de alto, iniciándose como epífitos y tornándose estranguladores; ramas jóvenes acostilladas, flocosas, gris claras. Hojas obovadas, ovadas a elípticas, 5.5–13 cm de largo y 3.5–6.5 cm de ancho, redondeadas a obtusamente obtusas en el ápice, redondeadas a levemente cordadas en la base, verdes a cafés. Higos 2 por nudo, globosos, 0.5–1 cm de diámetro, glabros, cremas, verdes con manchas moradas o café.");
        DESCRIPCION.add("Árbol de 20 a 30 metros de alto. Copa redondeada. Tronco con la corteza exterior gris o negra, fisurada y exfoliante en placas irregulares. Hojas bipinnadas y alternas. Folíolos de 2 a 4 cm de largo y de 1.5 a 2cm de acho, oblongos. Flores con filamentos de los estambres rosados o ligeramente purpuras. Frutos en legumbres, de 10 a 20 cm de largo, verdes, tornándose negros al madurar. Semillas rodeadas de una pupa sabor dulce (Smithsonian Institution).");
        DESCRIPCION.add("Árbol de hasta 15 S 20 m de alto, copa con forma de paraguas, ramas extendidas y horizontales en capas, con tronco recto y corteza gris a café grisáceo, superficialmente fisurada. Hojas ovaladas como espátulas cóncavas, de 8 x 5 hasta 38 x 19 cm. Flores masculinas y bisexuales blancas, diminutas, crecen en espigas de hasta 25 cm. Polinizado por insectos. Fruto carnoso pero fibroso, comprimido lateralmente enrojece al madurar con una sola semilla dura de cubierta dura y acanalada.  (CONABIO 2014; CONAFOR)");
        DESCRIPCION.add("Árbol de hasta 30 m de alto, con tronco recto de hasta 1.5 m de diámetro. Corteza gris clara lisa con estrías longitudinales verdes sobre fondo rojizo. Copa globosa y follaje durante algunos meses. Hojas compuestas radiales de hasta 45 cm, con 3 a 6 hojuelas ovaladas de 4.5 x 4 hasta 25 x 15.5 cm. Flores rosadas a rojo púrpura o blancas bisexuales, pétalos largos y enrollados con numerosos estambres sobresalientes unidos en la base, crecen solitarias o en pares. Fruto es una cápsula oblonga o elipsoide de hasta 25 cm de largo. Semillas inmersas en abundante fibra sedosa blanquecina. (CONABIO 2014).");
        DESCRIPCION.add("Árbol pequeño de hasta 8 m y diámetro de hasta 30 cm. Hojas verde intenso, simples ovaladas o elípticas, largas de 10 a 20 cm y anchas de 5 a 10 cm con margen y dentado irregular hacia el ápice. Con textura rugosa por la presencia de pelos rígidos. Inflorescencias cimosas, subterminales, con numerosas flores hermafroditas, imbutiformes, con corola de 3 a 4cm (diámetro), 5 a 6 lóbulos irregulares, crespos de color naranja intenso. Frutos, blancas drupas ovoides, largas de 2-4 cm, con 1 a 4 semillas dentro.");
        DESCRIPCION.add("Árbol de 5 a 15 m de alto. Tronco con la corteza exterior gris o negra, desprendiéndose en tiras largas al romperse las ramas. Hojas simples y alternas, aromáticas, de 6 a 25 cm de largo y de 2 a 9 cm de ancho, elípticas, con ápice acuminado, bordes enteros y base cuneada a obtusa. Flores verdes, aparecen en los extremos de las ramas jóvenes en grupos de 3 a 5. Están compuestas por 6 pétalos de 15 mm de largos externos y 3 internos de color verde pálido. Frutos globosos a ovoides, de 5 a 7 cm de diámetro, verdes, tornándose rojizos al madurares, de superficie lisa a comparación con las demás frutas pertenecientes a la familia Annonaceae. Semillas rodeadas por un arilo blanco.");
        DESCRIPCION.add("Árbol de porte cónico que puede llegar hasta los 70 m de altura, aunque en cultivo no suele alcanzar estas tallas, con la corteza escamosa. Ramificaciones primarias horizontales, dispuestas en verticilos, por pisos, mientras que las secundarias pueden ser colgantes en los ejemplares jóvenes y levantadas en los adultos. Hojas juveniles de 8-12 mm de longitud, puntiagudas, blandas, curvadas, decurrentes, de color verde brillante. Hojas adultas imbricadas, de forma ovado-triangular, curvadas, de unos 6 mm de longitud y 3-6 mm de anchura, con la punta dura. Conos masculinos de 3.5-5 cm de longitud. Conos femeninos subglobosos, más anchos en la base, de 7.5-12.5 cm de longitud y 9-15 cm de grosor. Escamas terminadas en punta curvada. Semillas de 3-6 mm de longitud, aladas.");
        DESCRIPCION.add("Árbol de hasta 8 m de alto, con tronco pequeño de corteza café, ligeramente agrietada. Copa globosa y follaje durante algunos meses. Hojas redondeadas y hendidas, con forma de pezuña, de 10 x 20 cm. Flores bisexuales, blancas, rosa brillante o violeta, grandes (8 a 13 cm) con forma de orquídea, tres pétalos grandes arriba y dos abajo, crecen en racimos con pocas flores. Flores producen mucho néctar y son visitadas por gran variedad de insectos y colibríes. Fruto es una vaina de hasta 30 cm de largo con varias semillas rojizas, planas y redondas.");
        DESCRIPCION.add("Palmera dioica con varios troncos anillados de hasta 8-9 m. de altura y 6-10 cm. de grosor. Hojas pinnadas, de 1.5-2.5 m. de longitud, con 40-60 pares de folíolos, de color verde amarillento, erectos, que se insertan en V en el raquis. La hoja se arquea mucho más que en la especie anterior. Pecíolos y raquis amarillentos. Inflorescencias muy ramificadas, con flores aromáticas, blanquecinas. Frutos ovoides, de 18 mm. de longitud, de color negro-violáceo en la madurez.");
        DESCRIPCION.add("Árbol de 10 y hasta 18 m de altura. El tronco es recto y corto, la copa es grande, extendida y se compone de ramas finas, ascendentes con follaje denso. Hojas compuestas, imparipinnadas y tienen 15 folíolos de 3 a 8 cm de largo, oblongos u ovados, de ápice acuminado a subcaudado. Flores papilionáceas, púrpuras-violeta, y dispuestas en racimos. Los frutos son vainas oblongas y aplanadas, indehiscentes y de color marrón claro cuando están maduros. Cada fruto contiene de una a dos semillas. Las semillas son reniformes, aplanadas lateralmente, de 12.0 a 14.5 mm de largo, de 6.8 a 7.0 mm de ancho y 4.5 a 6.0 mm de diámetro. La cubierta de la semilla es rojiza oscura marrón a marrón oscura, lisa, opaca y coriácea.");
        DESCRIPCION.add("Árbol pequeño o arbusto, deciduo copa angosta, corteza café claro verdoso, pelándose en pequeñas escamas longitudinales al tallo, con lenticelas distribuidas al azar Hojas  compuestas, alternas, paripinnadas folíolos elípticos con el ápice redondeado Flores amarillas, con un pétalo central diferente punteado de rojo en el interior Fruto en forma de vaina subglobosa, color café claro, con pequeños puntos negros en la superficie, ápice puntiagudo.");
        DESCRIPCION.add("Árbol de hasta 15 m de alto, con copa en forma de paraguas y follaje lustroso. El tronco, las hojas y las ramillas desprenden un exudado lechoso. Hojas simples ovaladas, verde lustroso en el haz y castaño rojizo en el envés, miden hasta 14 cm por 5 cm de ancho. Las flores son amarillas, diminutas y crecen en grupos en las axilas de las hojas. Sus frutos son bayas globosas de 5 a 10 cm de diámetro, con cáscara lisa morada o verde, pulpa carnosa y dulce y con 7 a 10 semillas dispuestas en forma de estrella.");
        DESCRIPCION.add("Árbol pequeño de hasta 6 m de altura con tallo verde tendiente a grisáceo con los años. Hojas verde brillante, lineares, largas de 15-18 cm y de menos de un centimetro. Inflorescencias terminales con flores inbutiformes amarillas, a veces blanco o melocotón de 5 a 7 cm.  El fruto es una drupa leñosa romboide de 4 cm de color verde a negro en su madurez.  ");
        DESCRIPCION.add("Árbol de 20 a 40 m de alto. Tronco con raíces tabulares pequeñas en la base. Corteza exterior gris o marrón, con fisuras verticales, a veces exfoliante en láminas. Hojas paripinnadas y alternas. Folíolos de 5 a 18 cm de largo y de 3 a 6 cm de ancho, oblongos o lanceolados, con ápice agudo, bordes enteros y base desigual. Flores verdes o amarillentas. Frutos en cápsulas erectas y leñosas, de 10 a 16 cm de largo, marrón y lenticelados en el exterior, dehiscentes en 4 ó 5 valvas al madurar. Semillas aladas (Smithsonian Institution) .");
        DESCRIPCION.add("Árbol o arbusto de 3 hasta 8 m de altura con copa estratificada y ancha. Hojas ovaladas con margen aserrado, de 6 a 14 cm de largo, con la base oblicua, con 3 a 5 nervios prominentes desde la base de la hoja. Flores blancas, de hasta 2 cm de diámetro, solitarias o en grupos de 2 o 3 flores. Hay tres clases de flores: con pistilo y pocos estambres, con muchos estambres y con pistilo reducido y muchos estambres. Sépalos llenos de pelitos. El fruto es una baya carnosa, elipsoide, jugosa y dulce, de color rojizo oscuro.");
        DESCRIPCION.add("Árbol perennifolio de 3 a 5 m. de altura. Hojas alternas, compuestas imparipinnadas, de 8-18 cm de longitud. Tiene inflorescencias cortas, axilares o en el lugar que ocupaban las hojas anteriores, sobre pedúnculos de 1 cm de largo. Su fruto (carambola) se presenta en racimos en las ramas y en el tronco: bayas gruesas, ovoides o elipsoides, de 8-12 x 5-6 cm, de color amarillo-anaranjado en la madurez, estrellados con 5 ángulos. Su corte transversal es el de una estrella de cinco puntas. Su pulpa es jugosa, un poco fibrosa y ácida.");
        DESCRIPCION.add("Árbol o arbusto hasta de 20 m de alto; DAP hasta 30 cm, la madera es dura. Corteza rugosa en etapa juvenil y laminada en etapa adulta, muchas veces se separa en tiras longitudinales cuyos bordes  se  enrollan  hacia  adentro,  café-oscura,  presenta  espinas  en  las  ramillas,  tiene  ramas  trepadoras,  la  madera  es  dura.  Hojas  caducifolias,  compuestas,  alternas,  bipinnadas;  con  4-6  pares de foliolos primarios; de 8 a 15 pares de foliolulos, base algo asimétrica, ápice obtuso, 3 mm  de  ancho.  Inflorescencias  amarillentas  o  crema,  en  espigas-paniculadas.  Frutos  vainas  anchas, planas, delgadas, pardo-rojizas al madurar ");
        DESCRIPCION.add("Arbol caducifolio, de 20 a 35 m (hasta 45 m) de altura, con un diámetro a la altura del pecho de hasta 1.7 m. Copa grande, redondeada, robusta y extendida o copa achatada. Hojas alternas,paripinnadas o imparipinnadas, de 15 a 50 cm, incluyendo el pecíolo, compuestas por 10 a 22 folíolos opuestos o alternos, de 4.5 a 14 cm de largo por 2 a 4.5 cm de ancho, lanceolados u oblongos. Corteza ampliamente fisurada con las costillas escamosas, pardo grisácea a moreno rojiza. Flores en panículas terminales largas y sueltas, de 15 a 30 cm de largo; muchas flores angostas aparentemente tubulares pero con 5 pétalos, suavemente perfumadas, actinomórficas; cáliz en forma de copa, corola crema verdosa. Frutos en infrutescencias hasta de 30 cm de largo, péndulas. Cápsulas leñosas dehiscentes (parecidas a nueces), de 2.5 a 5 cm de largo, 4 a 5 valvadas, elipsoides a oblongas, pardo verdosas a morenas, conun fuerte olor a ajo y produciendo un exudado blanquecino y acuoso cuando están inmaduras. El fruto contiene alrededor de 20 a 40 semillas y permanece adherido al árbol por algún tiempo. Semillas aladas de 2 a 3 cm de largo. ");
        DESCRIPCION.add("Árbol de hasta 70 m de alto, con tronco recto 3 m de diámetro, desarrolla raíces engrosadas en la base del tronco. Corteza gris lisa con estrías verde claro, cubierta de aguijones. Copa globosa y follaje durante algunos meses. Hojas compuestas radiales de 11 a 40 cm con 5 a 9 hojuelas ovaladas de 1.5 x 4 hasta 5 x 15 cm. Flores blancas o rosas bisexuales, perfumadas, de 6 cm, tienen pétalos largos y separados. Fruto es una cápsula que produce muchas semillas pequeñas negras cubiertas de abundantes fibras lanosas.  Árbol sagrado de los Mayas y Taínos y en África Occidental. Habita selvas húmedas (CONABIO 2014).");
        DESCRIPCION.add("Árbol de hasta 30 m con copa amplia, densa. Corteza profundamente fisurada. Hojas simples elípticas de 5 a 18 cm de largo por 2 a 7 cm de ancho, dispuestas en espiral, verde oscuro en el haz, pálidas en el envés. Flores solitarias, crecen en las axilas de las hojas o aglomeradas en las puntas de las ramas, blancas, perfumadas, de 1 cm de largo y tubulares. Frutos de 5 a 10 cm de diámetro, bayas con cáscara morena, carnosos, jugosos y muy dulces. Cada fruto con cinco semillas aplastadas, negras, brillantes.");
        DESCRIPCION.add("Árbol de hasta 15 m de alto y 20 cm de diámetro,  tronco recto, madera dura con pares de espinas en las ramas viejas. Corteza liza y rugosa, grisácea con líneas rojizas longitudinales a los largo y espinas en el fuste. Hojas compuestas y alternas en disposición helicoidal, bipinnadas, oblongas, margen entero verde en el haz. Inflorescencias cabezuelas en panículas. Flores blancas. Frutos linear-oblongos, cafés a pardos (MENDEZ ET AL 2012). ");
        DESCRIPCION.add("Árbol de 3 a 8 m de altura. Tronco irregular y a veces con proyecciones espinosas. Corteza exterior grisácea. Hojas imparipinnadas y alternas. Folíolos de 3 a 6 cm de largo y de 1 a 3 de ancho.  elípticos a oblanceolados, con ápice obtuso o agudo, bordes enteros o ligeramente dentados y base cuneada. Flores rojas o rosadas. Frutos en drupas globosas, de 1.8 a 3 cm de largo, verdes, tornándose rojos, anaranjados o amarillos al madurar.");
        DESCRIPCION.add("Palma de hasta 30 m de alto, con tronco delgado, ensanchado en la base.Corteza café grisácea o parda, ligeramente agrietada. Copa en penacho de hojas con forma de paraguas. Hojas enormes, permanente, de 6 metros de largo, plumosas. Flores amarillas unisexuales y diminutas, las masculinas diminutas de 3 a 6 mm y crecen en las ramas laterales, las femeninas más grandes, de 30 a 35 mm escasas y crecen en la base de las ramillas. Ambos sexos se producen en la misma planta. Fruto, coco, de 20 a 30 cm de largo; cáscara gruesa y fibrosa de color verde a pardo rojizo, encierra nutrientes sólidos y líquidos abundantes.  (CONABIO 2014).");
        DESCRIPCION.add("Árbol de 4 a 10 y hasta 15 m  de altura y diámetros hasta de 50 cm. Tronco generalmente torcido, con contrafuertes estrechos y raíces adventicias en la base; la copa es amplia y dispersa, compuesta de ramas gruesas y ascendentes (revivemx.org). Flores solitarias, blanco-cremosas. Tres pétalos externos de 2.5 a 4 cm. El fruto es oblongo y esférico, generalmente de un tamaño similar a una manzana o más grande, 7-15 cm de largo y de hasta 9 cm de diámetro, verde en estado de inmadurez y amarilla ya maduro. Comestible dada su pulpa perfumada y agradable de sabor, sin embargo su consumo, generalmente local, no ha alcanzado la popularidad de otras frutas emparentadas, como son la guanábana (Annona muricata) y la chirimoya (Annona cherimola). Resiste aguas salinas.");
        DESCRIPCION.add("Palmera de entre 13 y 20 m de altura y de 3 a 4,5 m de diámetro de copa, con uno o más raramente varios estípites de unos 2 a 3 dm de diámetro, cubierto de una corteza lisa y oscura, dotada de espinas fuertes y rectas de hasta 15 cm de largo. Hojas persistentes, pinnadas, con numerosos folíolos que nacen en planos diferentes, color verde claro, muy glabros, con el raquis duro y espinoso, de 1,5 a 3,5 m de largo. La espata también es muy espinosa. Las flores forman inflorescencias en espádices de color amarillo pálido o pardo, que aparecen a comienzos del verano. El fruto es una drupa globosa, de la cual aparecen desde 4 hasta incluso 14 racimos por ejemplar; tiene de 3-4 cm de diámetro (NATURALISTA)");
        DESCRIPCION.add("Árbol o arbusto de 2 a 5 m de alto. Tronco irregular y ramificado a baja altura, Ramas con espinas opuestas y ramificadas. Hojas simples y opuestas, de 1 a 6 cm, largo, y 0.5 a 3 cm, ancho, elípticas a oblanceoladas, ápice obtuso, bordes enteros y base cuneada. Las hojas se pueden agregar en los ápices de las ramas. Flores blancas y aromáticas. Frutos en bayas globosas y oblongas, de 1 a 2 cm de largo, verdes y con entícelas blancas, amarillos al madurar.");
        DESCRIPCION.add("Arbusto o pequeño árbol de hasta 6 mts de altura, con el tallo notablemente engrosado en la base y en gran contraste de las ramas superiores; con la corteza escamosa a fisurada; las flores son pequeñas de color crema, dispuestas en largas inflorescencias muy ramificadas los frutos son cápsulas trígonas y aladas.");
        DESCRIPCION.add("Árbol de 2 a 7 m de altura se reconoce por su singular corteza que parece que se resquebraja, y precisamente de ahí viene su nombre en lengua maya (árbol que se pela). Hojas alternas arrosetadas, simples, enteras, crenadas o lobuladas. Precíolo a menudo dilatado en la base. Flores: pequeñas, perfectas o por aborto imperfectas o polígamas, actinomorfas, solitarias, en fascículos, cimas o racimos. Vaina u ócrea membranácea, papirácea o escamosa, persistente o caduca, a veces poco notable. Semilla: con endosperma farináceo abundante.");
        DESCRIPCION.add("Árbol de hasta 8 m de alto, con tronco grueso algo torcido, y con raíces engrosadas en la base. Copa globosa y follaje durante algunos meses. Hojas compuestas plumosas grandes, de 30 a 50 cm, con numerosas hojitas. Flores rojo naranja brillante, bisexuales, grandes (12 cm), con cinco pétalos desiguales. Polinizado por insectos. Fruto es una vaina café alargada, gruesa, hasta 50 cm de largo con más de 30 semillas gruesas y alargadas café con bandas claras, alojadas en compartimientos separados de la vaina (CONABIO 2014).");
        DESCRIPCION.add("Árbol de rápido crecimiento, alcanza los 15 m de altura, es de amplia difusión y de ramificación libre. Hojas de color verde intenso, compuestas de 8 a 20 pares de hojas oblongas elípticas. En verano, produce racimos ascendentes de fragantes flores amarillas brillantes de 2,5-4 cm de diámetro, en grandes racimos compuestos, de 2 dm de largo. Fruto vainas de 5-10 cm de largo y 2,5 cm de ancho, rojas al principio, maduras negras, y con 1-4 semillas. Los árboles comienzan a florecer después de cerca de cuatro años.");
        DESCRIPCION.add("Árbol de 5 a 10 m de alto, con tronco delgado y bifurcado, con jugo lechoso y corteza café. Copa globosa y follaje durante algunos meses. Hojas ovaladas grandes de 21 x 9 cm. Flores bisexuales blancas, rosas o amarillas, y perfumadas, de hasta 35 cm de largo, crecen en racimos. Fruto, vaina alargada, con forma de V. Semillas numerosas, pequeñas, planas y con un ala papirácea alargada). ");
        DESCRIPCION.add("Árbol pequeño de hasta 8 m de altura. Corteza gris verduzca, fisurada. Hojas alternas elípticas con ápice en punta, pecíolo corto, dispuestas en dos filas dando la impresión de una única hoja compuesta. Flores en racimos  en la parte terminal de las ramas sin hojas. Frutos numerosos y compactos, de color verde o amarillo pálido en su madurez.");
        DESCRIPCION.add("Árbol de 2 a 15 m de altura. Corteza un poco corchosa grisácea y fisurada que se desprende en pedazos alargados. Copa es muy densa . Hojas delgadas, lanceoladas aserradas como de 3 a 13 cm de largo, las que se pueden perder durante la época seca. Inflorescencias en panículas axilares. Sus flores son blancas perfumadas vistosas pero pequeñas; sus frutos son cápsulas valvadas con numerosos picos, negruzcas y muy dulces. Las raíces son extendidas y poco profundas.");
        DESCRIPCION.add("Árbol o arbusto de 8 m de altura, con tronco robusto y espinoso.  Copa ancha, extendida y follaje permanente. Hojas compuestas por dos pares de hojuelas, crecen en espiral, aglomeradas cerca de las ramas. Flores blanco cremosas o verdes, bisexuales, pequeñas, perfumadas, crecen en cabezuelas de hasta 1.5 cm. Fruto vainas enroscadas de hasta 20 cm de largo con semillas negras irregulares, con cubierta gruesa blanco o verde que se torna rojiza al madurar.Corteza gris con numerosas cicatrices horizontales y espinas (CONABIO 2014).");
        DESCRIPCION.add("Árbol pequeño, de 3-8 m de altura y ramificado desde la base, despide mal olor cuando se le tritura. Las ramas son de color rojizo y sin vello, cilíndricas, arrugadas, ásperas y con numerosas lenticelas. La copa crece extendida, con follaje compacto. Las hojas son simples, oblongo-elípticas a oblongo-obovadas enteras, duras, lisas, de color verde oscuro y 5-15 cm de longitud.  Las flores son las más grandes en su género, tienen un aroma penetrante y crecen sobre las ramas o tronco, son solitarias a lo largo del tallo, tiene 6 pétalos que son verdes y luego amarillentos, los 3 exteriores gruesos, ampliamente triangulares, de 2,5–5 por 2–4 cm, con el interior finamente pubescente y el ápice agudo a obtuso mientras los 3 internos son ovado-elípticos, de 2–4 por 1,5–3,5 cm, algo delgado, imbricados, pubescentes y con ápice obtuso. El fruto es carnoso agregado, es el más grande de las anonáceas, mide de 14 a 40 cm de largo y 10 a 12cm de diámetro, está recubierto de espinas suaves volteadas hacia el ápice. La cáscara es delgada, dura y verde oscura brillante. La pulpa es blanca, relativamente fibrosa y muy aromática. Pesa en promedio 2,9 kg de, los cuales 75,6% corresponden a la pulpa, el 4,8% es semilla; 12,7% corresponde a la cáscara y el 6,9 al raquis; en la etapa de maduración sus frutos son dulces 17,2 grados Brix y posee en promedio 171 semillas por fruto.");
        DESCRIPCION.add("Árbol  de hasta 45 m de alto, con tronco grueso, a veces muy ramificado de corteza café grisácea. Copa globosa y follaje durante algunos meses. Hojas compuestas plumosas de 15 a 40 cm con numerosas hojitas. Flores bisexuales blancas verdosas, diminutas miden 0.6 cm, crecen en cabezuelas globosas. Fruto es una vaina circular aplanada y enroscada. Semillas negras y brillosas con anillo café claro  (CONABIO 2014).");
        DESCRIPCION.add("Palmera solitaria, de crecimiento lento que alcanza más de 10 m de altura y 30-50 cm de diámetro, con tallo recto, coronado al final por la copa que puede tener 4 m de cobertura. Hojas grandes, costapalmadas, con una nervadura central en cada segmento; pecíolo largo cuando jóvenes y corto cuando adultas. Las bases de los pecíolos se conservan en el tallo después de muertas, lo que le da el aspecto de escalera. De flores pequeñas, agrupadas en inflorescencias aromáticas. Da frutos negros muy dulces, con una semilla semiesférica de 1 a 1.5 cm de diámetro. Las raíces de esta planta son fibrosas y profundas.");
        DESCRIPCION.add("Palma hasta de 15 m de altura, pero generalmente de menor tamaño. Tronco recto y delgado. Hojas en forma de abanico (palmeadas), de aproximadamente 1 m de diámetro. Inflorescencias cortas con gran cantidad de pequeñas flores de color crema. Fruto globoso de aproximadamente 6 mm, de color verde cuando inmaduro y blanco al madurar.");
        DESCRIPCION.add("Palma  de  hasta  de  12  m de  altura,  de  tronco  recto  y corteza  lisa  con  marcas  en  los pecíolos desprendidos, de copa pequeña y redonda; las hojas son simples, con forma de abanico, de hasta 2 mide diámetro, de color verde en toda su extensión, dispuestas en forma  radial; las flores son pequeñas  de  6 mm de  diámetro, con pétalos de  color blanco-crema, se agrupan en panículas de  hasta 1 m de largo; los frutos son nueces globosas de 1 cm de color verde intenso, cuando madura queda de color negro y caen de la palma.");
        DESCRIPCION.add("Árbol de 4 a 15 m de altura, 35 cm de diámetro, tronco recto, corteza con cicatrices de antiguas hojas, pardo cenizo. Raíces a veces zancudas. Copa regular, frondosa, pero muy localizadas hacia la parte distal. Hojas simples peltadas y profundamente palmadas blanquecinas y pubescentes en el envés y formadas por 8 segmentos. Ésta es una especie dioica, con inflorescencias espigadas en racimos; sus flores son muy pequeñas. Sus frutos son aquenios agregados con agradable sabor a higo.");
        DESCRIPCION.add("Árbol de 2.5 a 10 m de altura. Tiene copa irregular. Hojas simples ovaladas de 3 a 13.5 cm de largo por 1.5 a 6 cm de ancho, verde brillante con muchos puntos transparentes que se ven a contraluz, fragantes al estrujar. Flores blancas solitarias. Frutos globosos y carnosos de hasta 8 cm de diámetro, desde verdes a crema amarillento o rosado (CONABIO 2014; NATURALISTA). ");
        DESCRIPCION.add("Árbol perennifolio de hasta 25 m de altura. Corteza con fisuras verticales. Las hojas son opuestas, paripinnadas, con 2-5 pares de hojitas sésiles (sin pecíolos) coriáceas, oblongas, color verde oscuro. Inflorescencias fasciculadas terminales, con 4-8 flores de color azul con 5 sépalos y 5 pétalos. El fruto es una cápsula ovoide, de color amarillo naranja con 2-5 lóbulos prominentes que se abren para descubrir las semillas elipsoidales color negruzco encerradas en un arilo rojo.");
        DESCRIPCION.add("Árbol de 20 a 40 m de altura y de 50 a 100 cm de diámetro. Copa redondeada. Tronco recto y cilíndrico, con raíces tablares pequeñas en la base. Corteza exterior grisácea y con fisuras verticales poco profundas. Ramitas terminales con lenticelas blancas. Hojas digitadas y opuestas, con 5 a 7 folíolos, de 5 a 30 cm de largo y de 3 a 15 cm de ancho, ovados o lanceolados, con ápice acuminado, bordes ondulados y base redondeada. En plantas juveniles los folíolos pueden tener bordes dentados. Pecíolos de 7 a 20 cm de largo. Flores amarillas y en forma de campana. Frutos en cápsulas tubulares y cilíndricas de 25 a 60 cm de largo, verdes y con la superficie exterior ondulada, tornándose negros y dehiscentes al madurar. Semillas aladas.");
        DESCRIPCION.add("Árbol de hasta 20 m de alto, con tronco ramificado desde los 3 metros, corteza gris amarillenta. Copa globosa y follaje durante algunos meses. Hojas compuestas radiales de 15 a 25 cm, con 5 hojuelas radiales de hasta 12 x 4.5 cm. Flores amarillas bisexuales, tubulares, crecen en racimos en la punta de las ramas. Fruto es una cápsula larga de hasta 35 cm con semillas pequeñas aplanadas y con alas.");
        DESCRIPCION.add("Árbol de buen porte, alcanzando los 30 m de altura. Sus hojas presentan alternancia helicoidal, de 8 a 12 cm de longitud los superiores y 3 a 6 cm las inferiores, pinnadas, con 4 a 6 folíolos opuestos de unos 5 a 10 cm de longitud cada uno. A comienzos de la estación húmeda produce panículas de pequeñas florecillas blancas o verdes, muy fragantes. Flores masculinas y femeninas, a veces ambas al mismo tiempo. El fruto es una drupa redonda de 2-4 cm de diámetro de cáscara verde delgada y quebradiza principalmente en su temporada de maduración y se agrupan en grandes ramos de hasta 50 cm de longitud y hasta 12 cm de espesor. Contienen una semilla blancuzca que ocupa la mayor parte del fruto y son rodeadas de una pulpa salmón gelatinosa, jugosa y comestible (NATURALISTA). ");
        DESCRIPCION.add("Árbol de 5 a 20m. Corteza lisa, pardo grisácea a gris oscura; exudado blanco, abundante en las ramas jóvenes. Las hojas varían en forma desde largas y angostas a elípticas, las dimensiones son 6–24 (cm) de largo por 2.5-12 cm de ancho. Especie monoica; cada árbol tiene flores masculinas y femeninas. Produce higos de entre 1 a 2cm y suelen ser muy dulces dependiendo de las horas de luz que tenga.  Es polinizado por una especie de avispa (Tetrapus americanus)  que solamente se reproduce en sus flores (NATURALISTA; GONZALEZ CASTAÑEDA 2010)");
        DESCRIPCION.add("Árbol de hasta 20 m, con pequeños contrafuertes en la base, copa piramidal y ramas ascendentes. Hojas de 5 a 15 cm de largo, compuestas por uno a dos pares de hojuelas elípticas, con olor a pescado al estrujarse. Flores verde amarillentas, pequeñas, llenas de pequeños pelos, las femeninas tienen estambres pero no producen polen, las masculinas solo tienen estambres. Las flores masculinas y femeninas se producen en diferentes árboles y crecen agrupadas en ramillas de hasta 5 cm de largo. Los frutos son bayas globosas de 1 a 2 cm de largo, verde amarillentos carnosos, dulces y con 1 sola semilla.");
        DESCRIPCION.add("Árbol de hasta 20 m de alto, con tronco grueso, desarrolla raíces engrosadas en la base del tronco, corteza gris lisa con abundante jugo lechoso. Copa globosa y follaje permanente de rápido crecimiento. Hojas ovaladas, de 11 x 5 hasta 40 x 22 cm, verde brillante, muy lustrosas, duras y gruesas. Hojas nuevas recubiertas por vaina roja. Flores diminutas, unisexuales ocultas dentro de sus higos verdes carnosos de hasta 1 cm. Los frutos aparecen cuando alcanza la edad de 20 años (CONABIO 2014).");
        DESCRIPCION.add("Árbol de hasta 20m de altura y diámetro de 80 cm. Tronco derecho, corteza lisa, juvenil, escamosa cuando es maduro, pardo grisácea a moreno obscura. Ramas escasas ascendentes y copa densa. Hojas compuestas y alternas, dispuestas en espiral, imparipinnadas. Inflorescencias en panículas en las axilas de las hojas caídas, pétalos rosados a morados y blancas. Floress amariposada. Frutos en vainas, pardo amarillentas brillantes cuando maduran, tiene de 1 a 10 semillas. Habita las selva baja caducifolia, la baja inundable y la mediana subperennifolia. (Pennington y Sarukhán 2005)");
        DESCRIPCION.add("Árbol pequeño a mediano, siempre verde, que alcanza los 16 m de altura, rara vez mas, con copa redonda. Hojas compuestas como pluma, de hasta 40 cm de largo con 3 a 8 pares de hojitas ovaladas más o menos asimétricas. Numerosas flores blancas diminutas, perfumadas. Las flores crecen en racimos terminales de hasta 20 cm de largo muy ramificados. Frutos globosos, solitarios o en grupos, de 1 cm de diámetro, verde a amarillo o café al madurar, con cáscara dura y lisa (CONABIO 2014: NATURALISTA).");
        DESCRIPCION.add("Árbol de 5 a 10 m de altura. Tronco con la corteza exterior crema o amarillenta. Ramitas terminales angulares. Hojas simples y alternas, ovaladas, de 3 a 20 cm de largo y de 2 a 6 cm de ancho, ápice antiguo o redondeado, bordes enteros y base cuneada. Las hojas están en las ramas agrupadas en fascículos. Flores verdes o verde pálido. Frutos globosos o elpsoides, de 20 a 30 cm de largo. Verdes inmaduros, negros maduros. Semillas en pupa blanca.");
        DESCRIPCION.add("Árboles hermafroditas, perennifolios, con la copa densa, subglobosa o subreniforme. Troncos cilíndricos o algo angulados en sección transversal, sin contrafuertes prominentes; corteza externa grisácea, rugosa, fisurada. Hojas alternas, simples, subsésiles, coríaceas, con los márgenes enteros y los ápices redondeados. Inflorescencias fascículos paucifloros o las flores solitarias. Flores de blanco verdosas a blanco amarillentas ,ocasionalmente caulinares. Frutos globosos a elipsoidales, indehiscentes, con el exocarpo frágil, leñoso y semillas embebidas en la pulpa.");
        DESCRIPCION.add("Árbol pequeño; ramas dimórficas, hojas y flores en racimos en forma de mechón sobre brotes cortos. Hojas alternas, simples, oblongas, brillantes, glabras, base atenuada, bordes enteros, ápice recortado (retusa). Flores que nacen en pedicelos cortos en las axilas de las hojas de brotes cortos; pétalos 4 (raramente 5), de color blanco cremoso o amarillo pálido, senescentes a marrón; sépalos 4 (raramente 5), que persisten en el fruto y se vuelven lineales con los ápices agudos. Fruto globoso, de aproximadamente 1 cm de diámetro, verdes a rojos de inmaduros a maduros.  ");
        DESCRIPCION.add("Árbol que frecuentemente no crece más de 8 m de altura, pero puede alcanzar hasta 15 m. Tronco derecho, corteza escamosa, morena grisácea a morena pardusca. Copa irregular. Hojas glabras, láminas oblanceoladas, de 9 a 20 cm de largo. Flores blancas, axiliares, fasciculadas, aromáticas. Frutos amarillos al madurar, baja elipsoide a subglobosa de 1.5 a 5 cm.");
        DESCRIPCION.add("Árbol o arbusto de hasta 10 m y 30 cm de diámetro. Copa irregular, con ramas quebradizas y pelos finos o algo rasposos, pueden ser dorados. Corteza lisa, grisácea con lenticelas a lo largo del tallo. Hojas compuestas, alternas, paripinnadas (4-12 pares), foliolos ovalado, haz verde claro, envés verde pálido. Inflorescencias en racimos axiliares en panícula terminal. Flores amarillas, con 5 pétalos desiguales. Frutos en vainas, comprimidas, negras al madurar, hasta 28 semillas (RZEDOWSKI Y CALDERÓN 1997; OCHOA-GAONA ET AL 2018)");
        DESCRIPCION.add("Palmera monoica con tronco solitario de 5-6 m. de altura y 20-25 cm. de grosor, liso, grisáceo, con anillos muy juntos. Hojas pinnadas de 1.7-2 m. de longitud, arqueadas, con 50 pares de folíolos de 70-80 cm. de longitud, con el ápice cortado oblicuamente y dentado. Forman varios planos respecto al raquis. Inflorescencias naciendo de debajo del capitel, muy ramificadas, con flores amarillo-verdosas y blancas. Frutos oblongos de unos 2 cm. de diámetro, rojizos.");
        DESCRIPCION.add("Árbol que crece hasta 10 m de altura, subcaducifolio, copa irregular, corteza escamosa, madera de color crema amarillenta, hojas compuestas imparipinnadas, flores amarillas vistosas perfumadas en racimos, florea de marzo a abril, los frutos son vainas aplanadas de color pardo amarillento brillante con varias semillas amarillo verdoso.");
        DESCRIPCION.add("Árbol siempreverde, corpulento, de hasta 15-20 m de altura, con una copa globosa, amplia y muy frondosa, y un tronco grueso de corteza lisa y grisácea, a menudo con numerosas raíces superficiales abarcando una zona amplia; ramillas glabras o pubérulas, de color castaño. Estípulas lanceoladas, normalmente glabras, pronto caedizas. Hojas dispuestas en espiral o subdísticas, con la lámina de ovado-elíptica a casi lanceolada o rómbica, con la base de ancha a estrechamente cuneada, el margen entero y el ápice de obtuso a subagudo, a veces brusca y cortamente acuminado. Su textura es algo coriácea y la superficie es glabra, de color verde fuerte brillante, algo más pálidas por el envés. Frutos siconos axilares, sésiles, dispuestos en pares, con flores masculinas y femeninas diferenciadas en su interior; receptáculos más o menos deprimido-globosos, de 0,9-1,2 cm de diámetro, glabros, de verdosos a amarillentos o rosados, tornándose jugosos y de color púrpura oscuro en la madurez si han sido fertilizados.");
        DESCRIPCION.add("Árbol de 15 m puede en excepciones a los 30 m de alto mas por lo regular son más pequeños en las ciudades. De corteza gris claro lisa puede producir raíces aéreas colgantes. Ramas con látex blanco. Copa globosa y densa y follaje permanente. Hojas ovaladas de 10 cm, verde oscuro brillante en el haz, verde pálido en el envés. Flores diminutas de un solo sexo o bisexuales ocultas dentro de higos amarillo verdosos, pequeños, de hasta 1 cm de largo. Polinizado por las avispas de los higos.");
        DESCRIPCION.add("Los géneros Citrus poseen hojas persistentes y simples son unifoliadas, enteras, pecioladas y alternas. Las flores (azahares), son blancas unifoliadas, enteras, pecioladas y alternas . El fruto tiene unos 6 cm de diámetro, a menudo con extremos ligeramente puntiagudos, normalmente se vende con color verde, aunque cuando alcanza la madurez total es amarillo. Es mayor, con una piel más gruesa y menos aromática que la lima ácida (Citrus × aurantifolia), que es la lima más cultivada en todo el mundo. Las ventajas de esta lima respecto a la ácida es que es de mayor tamaño, no tiene semillas, mayor resistencia a enfermedades, ausencia de espinas en los árboles, y mayor duración de la fruta una vez recolectada (NATURALISTA). ");
        DESCRIPCION.add("Los géneros Citrus poseen hojas persistentes y simples son unifoliadas, enteras, pecioladas y alternas. Las flores (azahares), son blancas unifoliadas, enteras, pecioladas y alternas . El fruto tiene unos 6 cm de diámetro, a menudo con extremos ligeramente puntiagudos, normalmente se vende con color verde, aunque cuando alcanza la madurez total es amarillo. Es mayor, con una piel más gruesa y menos aromática que la lima ácida (Citrus × aurantifolia), que es la lima más cultivada en todo el mundo. Las ventajas de esta lima respecto a la ácida es que es de mayor tamaño, no tiene semillas, mayor resistencia a enfermedades, ausencia de espinas en los árboles, y mayor duración de la fruta una vez recolectada (NATURALISTA). ");
        DESCRIPCION.add("Árbol de 10 a 12 metros de altura, con tronco corto, corteza gris verdosa y lisa. Copa ovalada, follaje durante algunos meses. Hojas compuestas plumosas de hasta 40 cm de largo con 4 a 8 pares de hojuelas. Flores amarillas bisexuales pétalos amplios, estambres sobresalientes, se producen en racimos colgantes con numerosas hileras de flores. Fruto en vaina alargada y cilíndrica de 30 a 60 cm de largo, liso y café oscuro, con varias semillas redondeadas elípticas de 9 mm, marrón brillante y con un surco longitudinal, alojadas en compartimientos separados de la vaina (CONABIO 2014). ");
        DESCRIPCION.add("Árbol de 6 a 25 m de altura, copa estratificada. Tronco recto, corteza gris oscura. Hojas compuestas radiales de hasta 35 x 18 cm con 5 hojuelas ovaladas. Flores rosas bisexuales, de hasta 10 cm, tubulares y crecen en racimos en la punta de las ramas. Fruto es una cápsula alargada con abundantes semillas delgadas y con alas.");
        DESCRIPCION.add("Árbol caducifolio. Hojas alternas, simples, palmadas, con 5 a 7 lóbulos, con la base cordada de 7 a 30 cm de ancho. La inflorescencia es cimosa terminal. Flores amarillas de 7.5 a 15 cm de diámetro al estar totalmente abiertas. El fruto es una cápsula gris suberecta o péndula, en general una por cada ramificación, de forma ovoide-oval, de 7 a 10 cm de longitud y de 5 a 7 cm de diámetro. La corteza del tronco y ramas viejas es plateada y amarilla por dentro. En ramas jóvenes es plateada a pardo-rojiza.");
        DESCRIPCION.add("El árbol de zapote puede alcanzar hasta 20-25 m de altura; por lo común es de copa simétrica o irregular, de ramas gruesas y follaje denso. Las hojas son de formas ovadas o lanceoladas y se concentran en el ápice de las ramas. Las flores son pequeñas y casi sésiles, crecen en grandes cantidades debajo de las ramas nuevas y a lo largo de las ramas sin hojas. Cada flor consta de cinco estambres verdaderos y cinco falsos; el pistilo posee un solo estigma y el ovario tiene cinco carpelos. ");
        DESCRIPCION.add("Árbol pequeño de 2-6 m de altura, con tronco con frecuencia torcido, generalmente sin espinas. Ramillas angulosas. Hojas oblongo-ovales, elípticas o lanceoladas, de 3.5-8 cm de longitud y 1.5-4 cm de anchura, con la base y el ápice obtusos. Margen aserrado por encima de la base. Son de color verde oscuro brillante en el haz y verde amarillento en el envés, fragantes cuando se las tritura. Inflorescencias axilares o terminales con 1-4 flores pentámeras, de color blanco, olorosas, de 1.5-2.5 cm de diámetro. 18-23 estambres, casi libres. Frutos de 4-7 cm de longitud y 5-8 cm de diámetro, globoso-deprimidos. Su color varía de amarillo verdoso al naranja y rojo anaranjado. La superficie es brillante y está llena de glándulas oleosas hundidas. La cáscara es delgada, muy fragante, separándose fácilmente de la pulpa. Pulpa jugosa y dulce, refrescante. Semillas oblongo-ovoides. Su pulpa está formada por un considerable número de gajos llenos de jugo que contienen gran cantidad de vitamina C, flavonoides y aceites esenciales.(ARBOLESORNAMENTALES. ES)");
        DESCRIPCION.add("Árbol perennifolio de hasta 20 m de altura con una copa de 30 m de diámetro. Hojas alternas, simples, coriáceas, de lanceoladas a oblongas, de 15-30 cm de longitud, de color verde oscuro. Inflorescencias en panículas axilares o terminales. Flores con cinco pequeños sépalos verdes y peludos con cinco pétalos separados que son rojos, amarillos, anaranjados, rosados o verdes. En la base de los pétalos se encuentra un disco segmentado en cinco partes,  el cual es carnoso y lleno de néctar. El fruto es una drupa que destaca entre sus principales características su buen sabor. Dicha pulpa puede ser o no fibrosa, inmaduro color verde, maduro amarillo, naranja a rojo.");
        DESCRIPCION.add("Árbol de copa redondeada de 5 a 10, hasta 15 m de altura y 1.5 m de diámetro a la altura del pecho, glabro. Tronco de corteza grisácea. Hojas trifoliadas y alternas. Folíolos de 4 a 15 cm de largo y de 2 a 9 cm de ancho, ovados a elípticos, con ápice acumnado o redondeado, bordes enteros y base obtusa o cuneada. Flores blancas-verdosas de estambres largos. Frutos en bayas globosas, de 4 a 9 cm de largo, verdes, amarillos al madurar, estos cuelgan en pedúnculos largos.");
        DESCRIPCION.add("Árbol de 5 a 20 m de altura, de copa abierta e irregular. Los  mayores suelen tener contrafuertes en la base. La corteza es pardo grisácea con numerosas lenticelas amarillentas, agrietada y escamosa, desprendiéndose en piezas irregulares. Los tallos jóvenes producen un látex blanquecino, las ramas jóvenes y ramillas están a menudo armadas con espinas cortas y rígidas. Las hojas miden 5-15 cm de largo y de 2 a 6 cm de ancho, son simples, alternas, dispuestas en dos hileras y tienen un peciolo corto. Su forma es oval, acabadas en punta y con la base plana o cordada. Pueden ser enteras, aserradas, dentadas o hasta lobuladas. Las flores masculinas y femeninas ocurren en árboles diferentes (especie dioica). Las masculinas aparecen en amentos (cordoncitos colgantes) y las femeninas en cabezuelas solitarias de 4-5 mm de diámetro. Los frutos sincarpos, son pequeños, comestibles y dispuestos en cabezuelas de 1-2 cm de diámetro. Contienen una pulpa carnosa y comestible. Son verdes cuando jóvenes y rojos cuando maduran. En el exterior tienen pequeños pelitos. Contienen gran número de semillas planas color café, de 2-3 mm de largo (NATURALISTA)");
        DESCRIPCION.add("Presenta rápido crecimiento, unos 3 m en su primer año pudiendo llegar a 5 m en condiciones ideales; adulto llega a los 10 o 12 m de altura máxima. Tiene ramas colgantes quebradizas, con corteza suberosa, hojas color verde claro, compuestas, tripinnadas, de 30 a 60 cm de largo, con muchos folíolos pequeños de 1,3 a 2 cm de largo por 0,6 a 0,3 cm de ancho. Florece a los siete meses de su plantación. Las flores son fragantes, de color blanco o blanco crema, de 2,5 cm de diámetro. Produce vainas colgantes color marrón, triangulares, de 30 a 120 cm de largo por 1,8 cm de ancho, divididas longitudinalmente en 3 partes cuando se secan; cada una contiene aproximadamente veinte semillas incrustadas en la médula. Semillas de color marrón oscuro, con tres alas (NATURALISTA).");
        DESCRIPCION.add("Palmera solitaria pequeña que alcanza los 1 - 4 m de altura, con un tronco muy delgado de color marrón o grisáceo de 5 cm de diámetro. que lleva una corona pequeña y abierta de 9-16 hojas palmeadas. La lámina de la hoja tiene 40-110 cm de diámetro., es de color verde oscuro por encima y plateado en la superficie abaxial, con 39-54 segmentos connados. Las inflorescencias son interfoliares, de 40-84 cm de largo. Las flores son fragantes, de color blanco cremoso. El fruto subgloboso, de color púrpura y negro en la madurez; las semillas de color marrón, subglobosas, cerebriformes, de 3.5-10 mm de diámetro.");
        DESCRIPCION.add("Árbol pequeño y torcido o arbusto de hasta 15 m de alto, con copa amplia abierta e irregular. Hojas simples ovaladas de 5 a 15 cm de largo por 2 a 7.5 de ancho, sedosas en el envés. Flores amarillas a rojas de 1.5 cm de diámetro con glándulas en la base de los pétalos. Crecen en racimos erguidos en la punta de las ramas. Frutos redondos verdes a amarillos, carnosos, con un solo hueso duro y grande. el fruto es pulposo, con fuerte aroma, un poco más pequeño que una aceituna, con un hueso duro y redondo.");
        DESCRIPCION.add("Árbol de 6 a 10m de altura y diámetro de 30 cm como máximo en el tronco. Corteza lisa de color pardo y madera de dureza regular, amarillenta. La copa es de 6 m de diámetro, compuesta por un follaje perenne de hojas simples lanceoladas, duras, frecuentemente con espinas axilares en su base, abundantes glándulas que se traslucen y olorosas cuando se estrujan. Sus flores son solitarias, blancas y aromáticas (azahares). El fruto es carnoso, grande de 7 a 8 cm de diámetro, color anaranjado a amarillento (ORELLANA ...).");
        DESCRIPCION.add("Son árboles pequeños, hojas unifoliadas, pecíolos con pequeñas alas y articulados con la vaina de la hoja; las flores son de color blanca, simples y ubicadas en las axilas de las hojas, ovario generalmente de 10 a 14 partes; el fruto es un tipo especial de baya (hesperidio), las semillas pueden ser monoembriónicas y poliembriónicas; la raíz pivotante con muchas raíces secundarias. El fruto es verde inmaduro y naranja maduro, su sabor es dulce, rico en vitamina C. ");
        DESCRIPCION.add("Árbol de rápido crecimiento que puede alcanzar 15 a  20 metros de altura. El ramaje es amplio, y puede alcanzar de 15 a 20 m de diámetro ya desarrollado. El tronco es corto, recto y puede alcanzar 120 cm de diámetro. La corteza es dura, agrietada y desde color gris claro hasta castaño rojizo. La savia es blanca grisácea y el corazón del tronco es rojo; cuando se expone al aire se torna de castaño rojizo. El tallo de hojas mide de 20 a 40 cm de longitud, con 20 a 31 hojas verde oscuras de 3 a 8 cm de longitud. Hojas muy jóvenes son de color rojo o púrpura. La forma de las hojas maduras es menos asimétrico y sus márgenes están dentados. Las flores, blancas y fragantes, dispuestas axialmente, normalmente como panículas colgantes que miden más de 25 cm de longitud. Las inflorescencias, que se ramifican en tercer grado tiene 150 a 250 flores, cada una mide 5 a 6 milímetros de longitud y de 8-11 de ancho. Se caracterizan por su dicogamia, es decir, puede haber flores femeninas y masculinas en el mismo árbol pero en periodos diferentes. Su fruto es una drupa parecida a la aceituna en forma que varía desde un ovalo elongado hasta uno ligeramente redondo, y cuando madura mide 14 a 28 mm de longitud y 10 a 15 mm de ancho. Su epicarpio es delgado, el mesocarpio es blanco amarillento, fibroso y sabe dulce, pero es desagradable al gusto. El endocarpio es blanco, duro y almacena una semilla, en raras ocasiones dos o tres semillas elongadas con una corteza de color castaño.");
        DESCRIPCION.add("Palmera solitaria de 4 a 8 m de altura, el tronco es recto de color pardo grisácea y sin ramificaciones. hojas pinnadas, coriáceas, agrupadas al final del tronco, de hasta 2 m de largo, verde azulosas (glaucas). Flores pequeñas verdosas. Frutos son pequeñas drupas globosas, de color rojo en la madurez. La NOM-059-SEMARNAT-2001 la registra con categoría de AMENAZADA debido a la destrucción de su hábitat y por el saqueo y venta clandestina de ejemplares adultos muy cotizados en las zonas turísticas y urbanas para jardines y áreas verdes.");
        DESCRIPCION.add("Palma de hasta 30 m de alto, con tronco recto de 60 cm de diámetro de corteza gris. Copa en penacho de hojas sustentado por un capitel liso verde brillante y follaje permanente. Hojas enormes de 4 a 8 m de largo, plumosas. Flores blancas unisexuales, diminutas, perfumadas y crecen intercaladas sobre racimos de tiras largas que brotan de la unión del tronco y el capitel. Las flores femeninas y masculinas se producen en la misma planta. Polinizada por insectos, como abejas, escarabajos y moscas. Fruto de hasta 1.2 cm de diámetro, carnoso, rojizo purpúreo con semilla única.");
        DESCRIPCION.add("Palmera hermafrodita de tronco estrecho de unos 25 cm. de diámetro y una altura de hasta 25 m. , con restos de las bases de las hojas viejas o si éstos han caído, ligeramente rugoso, de color marrón grisiento. Hojas costapalmadas, de 1 m. de diámetro, divididas hasta su mitad en segmentos puntiagudos, con el ápice bífido. Pecíolo de 1 m. de longitud con dientes recurvados en los márgenes. Inflorescencias de 2-3 m. de longitud naciendo de entre la base de las hojas, colgantes, con flores de color crema. Fruto ovoide, negruzco, de 0.8 mm. de diámetro.");
        DESCRIPCION.add("Palmera dioica de tronco único o ramificado en su base, de 20 m. de altura y 30-40 cm. de anchura, cubierto con los restos de las hojas viejas. Hojas pinnadas, de 6-7 m. de longitud, con folíolos de unos 45 cm. de longitud, de color glauco. Inflorescencia muy ramificada naciendo de entre las hojas. Flores masculinas de color crema, y femeninas amarillas. Frutos oblongo-ovoides, de 3-9 cm. de longitud, de color naranja, con pulpa carnosa y dulce.");
        DESCRIPCION.add("Árbol de copa irregular disperas, de hasta 20 m de alto,  Hojas compuestas grandes, de 30 a 40 cm, con 3 a 13 hojuelas ovaladas de 2 x 4 cm hasta 3 x 9 cm. Flores blancas pequeñas crecen en racimos de hasta 28 cm con flores masculinas y femeninas verdosas o amarillentas. Las flores masculinas y femeninas se producen en la misma planta. Fruto es una cápsula ovoide con tres valvas crece en grupos. Su tronco es completamente rojo y la corteza se descascara en tiras rojizas delgadas dejando el tronco color verde, generalmente con una ligera y característica torcedura en forma de S en su parte media o superior.");
        DESCRIPCION.add("Árbol  de copa irregular, de hasta  20  m  de  altura y DAP hasta  de  60  cm. Hojas compuestas, pinnadas, alternas; foliolos alternos, oblongos u oblanceoladas, con el margen entero, ápice redondeado o truncado, base cuneada, verde oscuro brillante en el haz, glaucos o grisáceos en el envés, borde enrollado al envés. Inflorescencia en panículas axilares y terminales laxas y amplias, de 20 a 30 cm de largo, crema o verde-amarillenta. Frutos drupas ovoides, agregadas en grupos de 2 a 5, ligeramente angulosos, en forma de pistache, negro al madurar;  contiene  una  sola  semilla tronco  derecho,  ramas  ascendentes,  copa  irregular.  Corteza  externa  rugosa  o  fisurada,  pardo-amarillenta  a  gris  oscuro. De madera  blanda (Pennington  y  Sarukhán,  2005).");
        DESCRIPCION.add("Son árboles que alcanzan un tamaño de 10–15 y hasta 30 m de alto, el tronco densamente cubierto de espinas, en estado juvenil. . Hojas 5–7-folioladas, los folíolos obovados a oblongo-elípticos, 3–10 cm de largo y 1–4 cm de ancho, ápice acuminado, base cuneada, serrados al menos hacia el ápice, glabros o densamente pubescentes. Flores solitarias naciendo en las axilas de las hojas caídas o algo agrupadas hacia los ápices de las ramas, blanquecinas tornándose cafés en el interior; cáliz irregular y ligeramente lobado, 1.5–3 cm de largo; pétalos 8–16 cm de largo, con densa pubescencia café-amarillenta en el exterior; filamentos formando una columna angosta y pubescente de ca 1.5–2 cm de largo. Fruto de 12–15 cm de largo y hasta 8 cm de ancho (NATURALISTA).");
        DESCRIPCION.add("Árbol de hasta 20 a 30 m de alto, con contrafuertes y copa piramidal, densa, abierta e irregular. Hojas simples ovaladas de 4 a 18 cm de largo por 2 a 7.5 cm de ancho, secretan un jugo lechoso al desprenderse. Flores verdosas diminutas agrupadas en cabezuelas esféricas con una flor femenina y muchas masculinas. Fruto carnoso y globoso verde amarillento, de 2 a 3 cm, cubierto por numerosas escamas blancas y rojizo al madurar. Puede contener un solo sexo o los dos en el mismo árbol. Cambia de sexo del femenino al masculino en alguna etapa de su ciclo de vida (CONABIO 2014).");
        DESCRIPCION.add("Árbol que puede alcanzar 20 m de altura y diámetro de 50 cm,  frondosa copa perenne. Hojas de 10 a 15 cm de longitud, muy verdes y delgadas. Flores pequeñas, de color blanco y se agrupan en racimos. Frutos maduros son de color amarillento a un poco crema anaranjados.  Raíces muy profundas de tipo pivotantes.");
        DESCRIPCION.add("Árboles, 1  a 10 (15) m alto, ramas glabras a puberulentas. Hojas caducas, membranosas, ovadas a elípticas, 3.6-13.5 cm largo, 2.1-6.6 cm ancho, ápice agudo, base atenuada, reticulada. Inflorescencia terminal, cimoso-paniculada, multiflora. Flores blancas de 1  a 2 cm. Fruto ovoide, puntiagudo, amarillo verdoso de 0.6 a 1.6 cm de largo y 1 a 1.5 cm ancho.");
        DESCRIPCION.add("Árbol pequeño de 6 a 8 m de altura. Hojas alternas y simples, oblongo-lanceoladas, de 5-17 cm de largo y de 2-5 cm de ancho.  Flores de color amarillo-verdoso, con manchas púrpura en la base, se producen en racimos de 3-4 y cada flor es de 1,5-3 cm de ancho, con seis pétalos. Fruto generalmente redondo u ovalado y posee unos 6-10 cm de diámetro, con un peso de 100-230 gramos; está cubierto de escamas verdes muy pronunciadas, a semejanza de un cono de pino, y suele ser confundido con la chirimoya. Su interior es una pulpa blanca, la cual es la parte comestible, dulce y muy nutritiva repleta de semillas marrones (casi negras), muy lisas (NATURALISTA).");
        DESCRIPCION.add("Árbol caducifolio mediano, de hasta 12 m de altura, tronco recto. Copa redondeada o piramidal, muy densa y redondeada en árboles jóvenes, menos densa en árboles maduros (mayores de 15 años). Hojas simples verde oscuro en el haz y pálidas en el envés, muy ásperas y rasposas en el envés. Flores anaranjadas o rojizas, de hasta 6 cm de largo por 4 de ancho. Los frutos son cónicos a redondeados, carnosos y se vuelven amarillos al madurar y tienen un solo hueso.");
        DESCRIPCION.add("Árbol de 10 a 25 m de alto. Corteza gris con tonos café. Hojas compuestas plumosas de 5 a 15 cm, con 10 a 20 pares de hojitas de 0.3 x 0.2 hasta 2.5 x 0.8 cm. Flores amarillas bisexuales con tintes rojizos, miden 1 cm, crecen en racimos cortos en las axilas de las hojas o en las puntas de las ramas. Fruto es una vaina alargada comprimida y curva, muy carnosa, contiene una o varias semillas redondeadas pero irregulares, café lustroso.");
        DESCRIPCION.add("Árbol de hasta 7 m de altura, con copa globosa y densa. Hojas compuestas por 5 a 13 hojuelas. Flores amarillas tubulares, de hasta 5 cm de largo, muy vistosas con líneas rojas en la base de la corola. Crecen en racimos en la punta de las ramas. El fruto es alargado y cilíndrico, de hasta 21 cm de largo, se abre a lo largo para liberar semillas finas. Semillas pequeñas aplanadas y con alas. (CONABIO 2014).");
        DESCRIPCION.add("Árbol der hasta 20 m de altura y 70 cm de diámetro. La corteza es de color gris, y con delgadas fisuras verticales. Las ramas juveniles son glabras. Hojas compuestas, bipinnadas con 4 (5) pares de pinnas opuestas. Tiene estípulas grandes (1.5 cm) lanceoladas y folíolos (18 a 35 pares) de 7 a 13 mm de largo y 2 a 3 de ancho. Sobre el raquis hay, frecuentemente, una glándula. Las inflorescencias son globosas, agrupadas en las axilas de las hojas; su cáliz es verde y la corola rojiza, pequeña, casi imperceptible, lo cual hace que resalte más el color blanco de los estambres. Los frutos son vainas (9 a 15 cm de largo y 2 a 4 cm de ancho) aplanadas, de color oscuro, que se abren para expulsar entre 6 y 12 semillas alargadas y negras.");
        DESCRIPCION.add("Árbol de 3 a 10 m con tronco usualmente retorcido y bifurcado a diferentes alturas, corteza gris ligeramente fisurada. Copa redondeada ligeramente abierta, puede perder su follaje durante algunos meses. Hojas compuestas plumosas de 9 a 25 cm de largo, con 11 a 24 pares de hojuelas de 8 a 15 cm de largo. Flores blancas bisexuales, diminutas de 4 a 5 mm, se producen en cabezuelas esféricas con hasta 180 flores blancas. Fruto vaina alargada y aplanada con 15 a 30 semillas lustrosas, piriformes aplanadas, enrojecen al madurar. Es polinizado por insectos y sus raíces se asocian con bacterias que atrapan nitrógeno para el suelo.");
        DESCRIPCION.add("Árbol de 9 a 15 m de alto, con tronco grueso, a veces se ramifica cerca de la base. Corteza lisa y gris que en troncos grandes se desprende en escamas. Hojas duras verde azuloso con envés verde pálido, redondeadas, de 7 x 10 hasta 15 x 20 cm. Flores blancas unisexuales, perfumadas, las femeninas miden hasta 0.5 cm de largo, y las masculinas 0.15 cm crecen en racimos alargados. Las flores femeninas y masculinas se producen en plantas diferentes. Frutos color verde a púrpura elíptico con cubierta carnosa fina y con una semilla, están agrupados en racimos semejantes a los de uvas.");
        DESCRIPCION.add("Árbol con una altura de hasta 15 m y diámetros hasta de 55 cm. Hojas bipinnadas de entre 20 y 30 cm, con 2 a 3 pinnas ovadas de 12 a 16 folíolos por cada una; éstos miden entre 3 y 4.5 cm largo, y 1.5 a 2 cm de ancho. Inflorescencias de 10 a 15 cm de largo; las flores son amarillas y de entre 0.8 y 1 cm largo. El fruto, samara, mide entre unos 10 y 13 cm de largo por 2.5 a 3 cm de ancho; es de color café, delgado, glabro y contiene entre 2 y 5 semillas de aproximadamente 1 cm (FICHAS ECOLOGICAS).");
        DESCRIPCION.add("Planta de hasta 10 m de alto, con tronco ensanchado en la base, corteza gris ligeramente agrietada. Copa con uno o varios penachos de hojas y follaje permanente. Hojas enormes de 1 metro, alargadas, crecen en las puntas de las ramas y las viejas permanecen colgando del tronco. Flores blancas bisexuales, de hasta 5 cm, crecen en racimos erguidos de hasta 2 m en el centro de las hojas. Fruto es una cápsula con semillas negras.");
        DESCRIPCION.add("Árbol perennifolio de hasta 25 m de altura. Tronco acanalado, puede tener pequeños contrafuertes. Hojas simples elípticas, de 7.2 a 20 cm de largo, con el margen entero. Corteza fisurada a escamosa, con una coloración moreno oscura a negra en los individuos maduros.  Ramas ascendentes y luego colgantes. Hojas simples y alternas. La lámina tiene forma oblonga a estrechamente elíptica, de 8.5 a 20 cm de largo por 3.5 a 8 cm de ancho con todo y peciolo  con coloración verde oscura y brillante en el haz, y verde amarillento en el envés con el nervio medio prominente. Flores amarillas que nacen en grupos o solitarias. El fruto son bayas globosas de 7 a 12 cm de diámetro, con coloración verde brillante. Contienen una pulpa pastosa, jugosa, dulce y morena, dentro de la que van inmersas hasta 10 semillas envueltas por una membrana transparente.");


    }


    private void setCulturaMaya() {

        CULTURA_MAYA = new ArrayList<>();

        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("SI");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("SI");
        CULTURA_MAYA.add("SI");
        CULTURA_MAYA.add("SI");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("SI");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("SI");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("SI");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("SI");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("SI");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");
        CULTURA_MAYA.add("NA");



    }

    private void setSECulturales() {
        SE_CULTURALES = new ArrayList<>();

        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL-RITUAL");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL, MÁGICO-RELIGIOSO");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("ORNAMENTAL-RITUAL-IDENTIDAD");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("ORNAMENTAL-PAISAJISMO");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("ORNAMENTAL-INSTRUMENTO");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL, RITUAL");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL, MÁGICO-RELIGIOSO");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("RITUAL");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL, MÁGICO-RELIGIOSO");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL, MÁGICO-RELIGIOSO");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("ORNAMENTAL-IDENTIDAD");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL, MÁGICO-RELIGIOSO");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("NA");
        SE_CULTURALES.add("ORNAMENTAL");
        SE_CULTURALES.add("ORNAMENTAL");

    }

    private void setRegulacion() {
        SE_REGULACION = new ArrayList<>();

        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS, POLINIZACIÓN");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS, POLINIZACIÓN");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS, POLINIZACIÓN");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS, POLINIZACIÓN");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS, POLINIZACIÓN");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add(" AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add(" AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add(" AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS, POLINIZACIÓN");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS, POLINIZACIÓN");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS, POLINIZACIÓN");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add(" AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add(" AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add(" AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS, POLINIZACIÓN");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS, POLINIZACIÓN");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS, POLINIZACIÓN");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS, POLINIZACIÓN");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS, POLINIZACIÓN");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS, POLINIZACIÓN");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS, POLINIZACIÓN");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS, POLINIZACIÓN");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS, POLINIZACIÓN");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS, POLINIZACIÓN");
        SE_REGULACION.add(" AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS, POLINIZACIÓN");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add(" AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add(" AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS, POLINIZACIÓN");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS, POLINIZACIÓN");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS, POLINIZACIÓN");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS, POLINIZACIÓN");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS, POLINIZACIÓN");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS, POLINIZACIÓN");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS, POLINIZACIÓN");
        SE_REGULACION.add(" AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");
        SE_REGULACION.add("CALIDAD DEL AIRE, AGUA, REGULA CLIMA, REGULA EROSIÓN, MODERACIÓN DE EVENTOS EXTREMOS");


    }

    private void setIconosProvision() {

        ICONOS_PROVISION = new ArrayList<>();

        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINALES, GANADO");
        ICONOS_PROVISION.add("MATERIAS PRIMAS");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINAL");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("MATERIAS PRIMAS");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("ALIMENTOS, MEDICINALES");
        ICONOS_PROVISION.add("NA");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES, GANADO");
        ICONOS_PROVISION.add("NA");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("MEDICINALES");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES, FORRAJERA");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINAL");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINALES, INDUSTRIAL");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINALES, INDUSTRIAL");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("ALIMENTOS, MEDICINALES");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINALES, INDUSTRIAL");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINALES, GANADO");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("NA");
        ICONOS_PROVISION.add("MATERIAS PRIMAS");
        ICONOS_PROVISION.add("MEDICINALES");
        ICONOS_PROVISION.add("MATERIAS PRIMAS");
        ICONOS_PROVISION.add("ALIMENTOS,  MEDICINAL");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINALES, GANADO");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINAL");
        ICONOS_PROVISION.add("ALIMENTOS, MEDICINALES");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINALES, INDUSTRIAL");
        ICONOS_PROVISION.add("MATERIAS PRIMAS");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("MATERIAS PRIMAS");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINAL");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("MEDICINALES");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINALES, GANADO");
        ICONOS_PROVISION.add("MATERIAS PRIMAS");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINAL");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIA PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("MATERIAS PRIMAS");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("NA");
        ICONOS_PROVISION.add("NA");
        ICONOS_PROVISION.add("NA");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("ALIMENTO, INDUSTRIAL");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("MEDICINALES");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("ALIMENTOS, INDISTRIAL");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("MATERIAS PRIMAS");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("ALIMENTOS, INDUSTRIAL");
        ICONOS_PROVISION.add("ALIMENTOS, INDISTRIAL");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("NA");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("NA");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES, GANADO, INDUSTRIAL");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES, GANADO");
        ICONOS_PROVISION.add("ALLIMENTO, MATERIAS PRIMAS, MEDICINALES, GANADO");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINALES, INDUSTRIAL");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINALES, GANADO");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINALES, GANADO");
        ICONOS_PROVISION.add("ALIMENTOS, MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES");
        ICONOS_PROVISION.add("ALIMENTOS, MEDICINALES");
        ICONOS_PROVISION.add("MATERIAS PRIMAS, MEDICINALES");



    }

    private void setProvision() {

        SE_PROVISION = new ArrayList<>();

        SE_PROVISION.add("FORRAJERA, ADHESIVO, MADERABLE, MEDICINAL, ARTESANAL, OLEAGINOSA");
        SE_PROVISION.add("TEXTIL, MELIFERA, MEDICINAL");
        SE_PROVISION.add("COMESTIBLE, MADERABLE, MEDICINAL");
        SE_PROVISION.add("MEDICINAL, MADEABLE");
        SE_PROVISION.add("MEDICINAL, FORRAJERA, COMESTIBLE");
        SE_PROVISION.add(" MADERABLE");
        SE_PROVISION.add(" COMESTIBLE, MADERABLE, OLEAGINOSA, MEDICINAL");
        SE_PROVISION.add("MADERABLE, MEDICINAL,  COMBUSTIBLE, ARTESANAL");
        SE_PROVISION.add("COMESTIBLE, MADERABLE, MEDICINAL, ORANAMENTAL, TINTÓRES, MELIFERA");
        SE_PROVISION.add("COMESTIBLE, MEDICINAL, MADERABLE");
        SE_PROVISION.add("NA");
        SE_PROVISION.add("COMESTIBLE, FORRAJERA, MADERABLE, MEDICINAL");
        SE_PROVISION.add("NA");
        SE_PROVISION.add("MEDICINAL, COMESTIBLE");
        SE_PROVISION.add("MEDICINAL, COMESTIBLE, MADERABLE, CONSTRUCCION");
        SE_PROVISION.add("MEDICINAL, ARTESANAL");
        SE_PROVISION.add("MADERABLE, MEDICINAL, ARTESANAL");
        SE_PROVISION.add("COMESTIBLE, TEXTIL, ARTESANAL, MEDICINAL, COMBUSTIBLE");
        SE_PROVISION.add("COMESTIBLE, MEDICINAL");
        SE_PROVISION.add("FORRAJERA, MELIFERA, COMBUSTIBLE, MEDICINAL, ");
        SE_PROVISION.add("MADERABLE, MEDICINAL, ARTESANAL, CONSTRUCCIÓN, COMBUSTIBLE");
        SE_PROVISION.add("MADERABLE, COMESTIBLE, MEDICINAL, INDUSTRIAL, OLEAGINOSA, MELIFERA");
        SE_PROVISION.add("COMESTIBLE, MEDICINAL,MADERABLE, CHICLÍFERA, INDUSTRIAL");
        SE_PROVISION.add("CURTIENTE, MEDICINAL, MADERABLE, TINTOREA, MELIFERA, CERCA VIVA");
        SE_PROVISION.add("COMESTIBLE, MEDICINAL, MELIFERA");
        SE_PROVISION.add("COMESTIBLE, OLEAGINOSA, MEDICINAL, ARTESANAL,TEXTIL, CONSTRUCCIÓN, INDUSTRIAL");
        SE_PROVISION.add("MEDICINAL,COMESTIBLE,  AGRONOMIA, MADERABLE");
        SE_PROVISION.add("COMESTIBLE, MEDICINAL,ARTESANAL, JABÓN");
        SE_PROVISION.add("TINTOREA, MEDICINAL");
        SE_PROVISION.add("NA");
        SE_PROVISION.add("MELIFERA, MADERABLE, COMBUSTIBLE");
        SE_PROVISION.add("MEDICINAL");
        SE_PROVISION.add("MADERABLE, FORRAJERA, TINTÓREA");
        SE_PROVISION.add("MEDICINAL, AROMATIZANTE, COMESTIBLE");
        SE_PROVISION.add("COMESTIBLE, MEDICINAL");
        SE_PROVISION.add("FORRAJERA, MEDICINAL, CURTIENTE, COMBUSTIBLE");
        SE_PROVISION.add("MEDICINAL, MADERABLE, MELIFERA, COMESTIBLE, CONSTRUCCION, COMBUSTIBLE, TINTOREA");
        SE_PROVISION.add("COMESTIBLE, MEDICINAL");
        SE_PROVISION.add("MADERABLE, ADHESIVO, COMBUSTIBLE, COMESTIBLE, CONSTRUCCIÓN, FORRAJERO, MEDICINAL, FORRAJERA, INDUSTRIAL");
        SE_PROVISION.add(" CONSTRUCCION, ARTESANAL, MELÍFERA");
        SE_PROVISION.add(" CONSTRUCCION, ARTESANAL, MEDICINAL, COMESTIBLE");
        SE_PROVISION.add(" ARTESANAL, CONSTRUCCION, MEDICINAL, COMESTIBLE");
        SE_PROVISION.add("MEDICINAL, FORRAJERA, CONSTRUCCIÓN, COMESTIBLE");
        SE_PROVISION.add("MEDICINAL, COMESTIBLE, CONSTRUCCION, COMBUSTIBLE");
        SE_PROVISION.add("MADERABLE, CONSTRUCCION");
        SE_PROVISION.add("MEDICINAL, MADERABLE");
        SE_PROVISION.add("MADERABLE, MEDICINAL,  CONSTRUCCION ");
        SE_PROVISION.add("COMESTIBLE,MEDICINAL, MADERABLE, MELIFERA");
        SE_PROVISION.add("MEDICINAL");
        SE_PROVISION.add("COMESTIBLE, MADERABLE, MEDICINAL, CONSTRUCCION, FORRAJE, MELÍFERA");
        SE_PROVISION.add("GOMA");
        SE_PROVISION.add("MADERABLE, MEDICINAL, COMBUSTIBLE, ARTESANAL, CONSTRUCCION, CULINARIO");
        SE_PROVISION.add("JABON, MADERABLE, ARTESANAL, MEDICINAL");
        SE_PROVISION.add("ARTESANAL, MADERABLE, MEDICINAL, MELIFERA, UTENSILIO, COMESTIBLE, OLEAGINOSA, CERCA VIVA");
        SE_PROVISION.add("ARTESANAL, MEDICINAL");
        SE_PROVISION.add("COMESTIBLE, MADERABLE, CONSTRUCCION");
        SE_PROVISION.add("NA");
        SE_PROVISION.add("NA");
        SE_PROVISION.add("NA");
        SE_PROVISION.add("COMESTIBLE, MEDICINAL");
        SE_PROVISION.add("COMESTIBLE, INDUSTRIAL");
        SE_PROVISION.add("MEDICINAL, MELIFERA");
        SE_PROVISION.add("MADERABLE,  MEDICINAL, MELIFERA");
        SE_PROVISION.add("MEDICINAL, ARTESANAL");
        SE_PROVISION.add("COMESTIBLE, MEDICINAL, MADERABLE, MELIFERA");
        SE_PROVISION.add("COMESTIBLE, INDUSTRIAL");
        SE_PROVISION.add("COMESTIBLE, MEDICINAL, MADERABLE");
        SE_PROVISION.add("MEDICINAL, CONSTRUCCIÓN, COMESTIBLE, MELÍFERA ");
        SE_PROVISION.add("MADERABLE, TINTOREA, MEDICINAL");
        SE_PROVISION.add("MEDICINAL, COMESTIBLE, OLEAGINOSA, FORRAJERA");
        SE_PROVISION.add("MADERABLE, MEDICINAL,MELIFERA,COMBUSTIBLE");
        SE_PROVISION.add("MELÍFERA, CONSTRUCCIÓN, MEDICINAL, ORNAMENTAL, COMBUSTIBLE, MADERABLE");
        SE_PROVISION.add("MEDICINAL, MADERABLE, COMBUSTIBLE, COMESTIBLE");
        SE_PROVISION.add("MADERABLE, MELIFERA, CONSTRUCCION, MEDICINAL, COMBUSTIBLE");
        SE_PROVISION.add("MELIFERA, CONSTRUCCION, MADERABLE");
        SE_PROVISION.add("CONSTRUCCION, MEDICINAL, UTENSILIO");
        SE_PROVISION.add("COMESTIBLE, MEDICINAL, MADERABLE, MELIFERA, COMBUSTIBLE, FORRAJERA");
        SE_PROVISION.add("COMESTIBLE, INDUSTRIAL");
        SE_PROVISION.add("COMESTIBLE, INDUSTRIAL");
        SE_PROVISION.add("MEDICINAL, OLEAGINOSA, INSECTICIDA");
        SE_PROVISION.add("ORNAMENTAL");
        SE_PROVISION.add("MELIFERA, COMESTIBLE, MEDICINAL, OLEAGINOSA");
        SE_PROVISION.add("NA");
        SE_PROVISION.add("COMESTIBLE, MEDICINAL, CONSTRUCCIÓN");
        SE_PROVISION.add("MADERABLE, MELIFERA, AGRONOMIA, MEDICINAL, CERCO VIVO, ADHERENTE, INDUSTRIAL, AROMATIZANTE");
        SE_PROVISION.add("MADERABLE, COMESTIBLE, MEDICINAL, OLEAGINOSA");
        SE_PROVISION.add("COMESTIBLE, TEXTIL, MEDICINAL ");
        SE_PROVISION.add("COMESTIBLE, FORRAJERA, MEDICINAL, MADERABLE");
        SE_PROVISION.add("MEDICINAL, COMBUSTIBLE, FORRAJERA, MADERABLE, ARTESANAL, CONSTRUCCIÓN");
        SE_PROVISION.add("COMESTIBLE, MEDICINAL, INSECTICIDA");
        SE_PROVISION.add("MADERABLE, ARTESANAL, COMESTIBLE,  MEDICINAL, MELIFERA, COMBUSTIBLE, CONSTRUCCION, INDUSTRIAL ");
        SE_PROVISION.add("COMESTIBLE, MADERABLE, MEDICINAL, FORRAJERA, COSNTRUCCIÓN");
        SE_PROVISION.add("MEDICINAL,  MELIFERA, INSECTICIDA, COMBUSTUBLE, CONSTRUCCION");
        SE_PROVISION.add("MADERABLE, MEDICINAL, MELIFERA, CONSTRUCCION, FORRAJERA, CURTIENTE");
        SE_PROVISION.add("MADERABLE, MEDICINAL, COMESTIBLE, CONSTRUCCION, COMBUSTIBLE, FORAJERA, ");
        SE_PROVISION.add("COMESTIBLE, MEDICINAL, MELIFERA, COMBUSTIBLE");
        SE_PROVISION.add("MADERABLE, MEDICINAL, MELIFERA");
        SE_PROVISION.add(" COMESTIBLE, CERCAS VIVAS, MEDICINAL");
        SE_PROVISION.add("COMESTIBLE, MADERABLE, MEDICINAL");


    }

    private void setUsosServiciosEcosistemicos() {
        USOS_SERVICIOS_ECOSISTEMICOS = new ArrayList<>();

        USOS_SERVICIOS_ECOSISTEMICOS.add("SE UTILIZA PARA FABRICAR ADHESIVO, COLORANTE, COMBUSTIBLE, ARTESANÍA, ACEITES Y EXUDADOS COMESTIBLES, CURTIENTES, FIBRAS, FORRAJE, IMPLEMENTOS AGRÍCOLAS, SAPONINAS, TUTORES, MADERA Y COMO MEDICINAL (CONABIO 2014).");
        USOS_SERVICIOS_ECOSISTEMICOS.add("CON LA MADERA SE FABRICA TEJAMANIL. CON LA CORTEZA BLANDA Y FIBROSA SE ELABORAN CUERDAS PARA AMARRAR DIVERSOS OBJETOS. PRODUCTORA DE NÉCTAR. ES UTILIZADO COMO CICATRIZANTE DE HERIDAS REVIVEMX");
        USOS_SERVICIOS_ECOSISTEMICOS.add("COMESTIBLE: FRUTO DE ALTO VALOR ALIMENTICIO, CON DIVERSAS VARIEDADES HORTÍCOLAS. MADERABLE. MEDICINAL: LA DECOCCIÓN DE LAS HOJAS SE CONSUME ORALMENTE PARA TRATAR EL ASMA, BORNQUITIS, TOS, AMENORREA, FLATULENCIAS E INFECCIONES URINARIAS (USO TRAMIL).");
        USOS_SERVICIOS_ECOSISTEMICOS.add("COMO CICATRIZANTE YA QUE LA RESINA ( DE ESTA PLANTA SE APLICA SOBRE LA HERIDA.");
        USOS_SERVICIOS_ECOSISTEMICOS.add("MEDICINAL: EL LÁTEX COMBINADO CON LA CORTEZA PULVERIZADA SE APLICA A HERIDAS. FORRAJERA. FRUTO COMESTIBLE. EL LÁTEX SE UTILIZA PARA ADULTERAR EL CHICLE.");
        USOS_SERVICIOS_ECOSISTEMICOS.add("MADERA EMPLEADA PARA LEÑA Y CONSTRUCCIÓN. ORNAMENTAL Y SOMBRA. EL GANADO SE PUEDE ALIMENTAR DEL FRUTO MADURO. ");
        USOS_SERVICIOS_ECOSISTEMICOS.add("ÁRBOL ORNAMENTAL EN LOS TRÓPICOS DEL MUNDO. FRUTO COMESTIBLE AUNQUE POCO ÁCIDO. UTILIZADO COMO REMEDIO PARA LA DISENTERÍA Y LA DIARREA. POR SUS PROPIEDADES DE ANTIBIÓTICO NATURAL ES UTILIZADO COMO INFUSIÓN EN LOS ACUARIOS PARA PREVENIR ENFERMEDADES Y PARÁSITOS DE PECES BETTA (CONABIO 2014). ");
        USOS_SERVICIOS_ECOSISTEMICOS.add("LA MADERA ES UTILIZADA COMO LEÑA Y PARA FABRICAR ARTESANÍAS. SE USA PARA CURAR ENFERMEDADES RESPIRATORIAS, ÚLCERAS Y DOLORES EN GENERAL (CONABIO 2014). LA FIBRA DE LOS FRUTOS SE EMPLEA COMO RELLENO. DE LA SEMILLAS SE EXTRAE ACEITE PARA DIFERENTES USOS INDUSTRIALES.");
        USOS_SERVICIOS_ECOSISTEMICOS.add("FRUTOS COMESTIBLES MAS NO AGRADABLES, EL TRONCO ES UN LEÑO APRECIADO POR SU DUREZA. DISTINTAS PARTES DE LA PLANTA TIENEN APTITUDES MEDICINALES. LA HOJA SE USA COMO ESTROPAJO PARA TRASTES. ");
        USOS_SERVICIOS_ECOSISTEMICOS.add("FRUTA IMPORTANTE PARA LA GASTRONOMIA. RAÍCES, HOJAS Y SEMILAS TIENEN USO MEDICINAL PARA TRATAR DIARREA Y DISENTERÍA, MAS TAMBIÉN PUEDEN SER TOXICAS . MADERA EMPLEADA PARA POSTES DE CERCAS");
        USOS_SERVICIOS_ECOSISTEMICOS.add("ORNAMENTAL");
        USOS_SERVICIOS_ECOSISTEMICOS.add("LAS HOJAS TIERNAS Y LOS CAPULLOS SE CONSUMEN EN ENSALADAS. PARA LOS BUDISTAS ES UN ÁRBOL SAGRADO Y APARECE EN SUS IMÁGENES DEVOTAS. TAMBIÉN SE UTILIZA COMO REMEDIO CONTRA EL ASMA, LAS ÚLCERAS Y ANTIBACTERIAL. SUS YEMAS Y RAÍCES SE UTILIZAN PARA PROBLEMAS DIGESTIVOS (CONABIO 2014)");
        USOS_SERVICIOS_ECOSISTEMICOS.add("ORNAMENTAL");
        USOS_SERVICIOS_ECOSISTEMICOS.add("FUE UTILIZADA DESDE TIEMPOS PREHISPÁNICOS PARA LA ELABORACIÓN DE UNA BEBIDA EMBRIAGANTE CONOCIDA COMO BAALCHE’, QUE ES AÚN UTILIZADA EN CEREMONIAS RELIGIOSAS. LA INFUSIÓN DE LAS HOJAS SE UTILIZA PARA TRATAR LA TOS");
        USOS_SERVICIOS_ECOSISTEMICOS.add("SE UTILIZA PARA CONSTRUCCIÓN Y CARPINTERÍA Y FABRICACIÓN DE MUEBLES DE LUJO. EL FRUTO ES EXQUISITO Y SE CONSUME COMO FRUTA FRESCA. EN LA MEDICINA TRADICIONAL LA CORTEZA SE USA CONTRA LA DISENTERÍA");
        USOS_SERVICIOS_ECOSISTEMICOS.add("ORNAMENTAL POR SU EXUBERANTE FOLLAJE Y SUS FLORES. LAS SEMILLAS SE EMPLEAN EN ARTESANÍAS, PERO SON VENENOSAS AL IGUAL QUE TODAS LAS DEMÁS PARTES DE LA PLANTA.");
        USOS_SERVICIOS_ECOSISTEMICOS.add("MADERA DE EXCELENTE CALIDAD, EMPLEADA EN LA FABRICACIÓN DE MUEBLES DE LUJO, EBANISTERÍA, INSTRUMENTOS MUSICALES Y EN CARPINTERÍA DE INTERIORES Y EXTERIORES. CON LOS FRUTOS SE HACEN ARREGLOS ARTESANALES, PRINCIPALMENTE FLORES (SMITHSONIAN INSTITUTION).");
        USOS_SERVICIOS_ECOSISTEMICOS.add("SE UTILIZA PARA MADERA, COMBUSTIBLE, OBTENCIÓN DE FIBRAS Y COMO MEDICINA. FRUTO COMESTIBLE.");
        USOS_SERVICIOS_ECOSISTEMICOS.add("COMESTIBLE: FRUTO CONSUMIDO FRESCO. MEDICINAL: EL JUGO DEL FRUTO SE EMPLEA PARA LA FIEBRE, DIARREA Y ESCORBUTO.");
        USOS_SERVICIOS_ECOSISTEMICOS.add("IMPORTANTE COMO ESPECIE MELIFERA Y COMBUSTIBLE. TIENE PROPIEDADES MEDICINALES");
        USOS_SERVICIOS_ECOSISTEMICOS.add("ARTESANAL (FRUTO SECO). LEÑA. CONSTRUCCIÓN RURAL. MADERABLE. MEDICINAL. MELÍFERA.");
        USOS_SERVICIOS_ECOSISTEMICOS.add("ESTA FIBRA SE HA UTILIZADO PARA RELLENAR COLCHONES. SE ELABORAN ATRACTIVAS ARTESANÍAS CON LA CORTEZA Y LAS ESPINAS. TIENE PROPIEDADES MEDICINALES. ES EL ÁRBOL SAGRADO DE LOS MAYAS (NATURALISTA).");
        USOS_SERVICIOS_ECOSISTEMICOS.add("SE EXTRAE LÁTEX DE SU CORTEZA PARA LA ELABORACIÓN DE CHICLE, PERO TIENE GRAN VARIEDAD DE USOS, DESDE MADERABLE, ARTESANAL, COMESTIBLE, FORRAJE Y MEDICINAL CONABIO 2014).");
        USOS_SERVICIOS_ECOSISTEMICOS.add("CURTIENTE, MEDICINAL, MADERABLE, TINTOREA, MELIFERA, CERCA VIVA. LOS MAYAS LO USABAN PARA LA FABRICACIÓN DE ESTUCOS PARA CONSTRUCCIÓN Y ACABADOS DE SUS EDIFICIOS. ACTUALMENTE ES USADO EN EL RAMO DE LA CONSTRUCCIÓN, PARA ACABADOS RÚSTICOS EN MUROS, PLAFONES, PISOS Y BAÑOS.");
        USOS_SERVICIOS_ECOSISTEMICOS.add("EL FRUTO SE COME CRUDO O COCIDO, JUGOS, VINOS Y LICORES. LA MADERA SE PUEDE EMPLEAR EN CERCAS Y EL FOLLAJE SIRVE PARA GANADO. MELÍFERA");
        USOS_SERVICIOS_ECOSISTEMICOS.add("SU MADERA SE USA PARA LA CONSTRUCCIÓN DE CASAS, PUENTES Y GRANJAS. LA CORTEZA PARA LA FABRICACIÓN DE MUEBLES. LAS RAÍCES TIENEN PROPIEDADES ANTI DIARREICAS, LAS PALMAS SON USADAS PARA TECHOS, CANASTAS, SOMBREROS, ALFOMBRAS, ETC. EL AGUA DE COCO, BEBIDA RE HIDRATANTE CON UN ALTO VALOR NUTRITIVO (CONABIO 2014).");
        USOS_SERVICIOS_ECOSISTEMICOS.add("ÁRBOL FRUTAL. SUS HOJAS SE UTILIZAN EN LA MEDICINA TRADICIONAL. LAS FLORES PUEDEN SER USADAS COMO DESPARASITANTES. LOS FRUTOS SON COMESTIBLES Y CONTIENEN SUSTANCIAS BIOACTIVAS QUE INHIBEN EL DESARROLLO DE CÉLULAS CANCEROSAS, POR LO QUE TIENEN POTENCIAL FARMACÉUTICO. CONTRIBUYE A LA CONSERVACIÓN DE HUMEDALES (VIVEROSDEBIODIVERSIDAD.ORG)");
        USOS_SERVICIOS_ECOSISTEMICOS.add("ACEITES DE LA SEMILLA Y PUPA ES USADA PARA JABÓN,  LA PULPA ES COMESTIBLE Y HECHA LICOR, SE HACE HARINA CON EL TRONCO, USADA COMO FORRAJE Y SU FIBRA COMO HILOS PARA ARTESANIAS (NATURISTA).");
        USOS_SERVICIOS_ECOSISTEMICOS.add("MADERA ES USADA PARA LEÑA Y POSTES DE CERCA, TIENE CUAIDADES MEDICINALES Y ES TINTOREA");
        USOS_SERVICIOS_ECOSISTEMICOS.add("COMO ORNAMENTAL, MUY APRECIADA PARA JARDINES Y ÁREAS VERDES.");
        USOS_SERVICIOS_ECOSISTEMICOS.add("LA MIEL DEL DZIDZILCHÉ ES INCONFUNDIBLE POR SU SABOR Y TONO, CON OLOR FLORAL Y ACARAMELADO.  DESTACA SU APROVECHAMIENTO COMO LEÑA, OCUPANDO EL CUARTO LUGAR DE LAS ESPECIES DE PLANTAS USADAS COMO COMBUSTIBLE. TAMBIÉN DEBIDO A LA DUREZA DE SU MADERA Y ABUNDANCIA SE RECOLECTA PARA LA CONSTRUCCIÓN DE VIVIENDAS.");
        USOS_SERVICIOS_ECOSISTEMICOS.add("UTILIZADO COMO CERCA, EN APICULTURA, COMO FORRAJE DE GALLINAS Y COMO MEDICINAL. SUS RAÍCES ALBERGAN BACTERIAS FIJADORAS DE NITRÓGENO POR LO QUE PUEDE MEJORAR LAS PROPIEDADES DE LOS SUELOS DONDE CRECE (CONABIO 2014). LOS NATURALES CARIBEÑOS USAN LAS VAINAS MADURAS CON TODO Y SEMILLAS COMO INSTRUMENTOS DE PERCUSIÓN CONOCIDOS COMO SHAK-SHAK O MARACAS (NATURALISTA).");
        USOS_SERVICIOS_ECOSISTEMICOS.add("ORNAMENTAL DEBIDO A SU FLORACIÓN. MADERABLE. SU FOLLAJE SE USA COMO CULTIVO FORRAJERO. DE LA CORTEZA, RICA EN TANINOS, SE OBTIENE UN COLORANTE MARRÓN AMARILLENTO UTILIZADO EN JAVA");
        USOS_SERVICIOS_ECOSISTEMICOS.add("SUS FLORES SE UTILIZAN PARA ADORNAR ALTARES Y CORONAS, FABRICAR ROSARIOS, AROMATIZANTES Y COSMÉTICOS, O CONSUMIDAS EN SOPAS Y POSTRES. AUN CUANDO SU LÁTEX ES VENENOSO, SE UTILIZA COMO MEDICINAL. ");
        USOS_SERVICIOS_ECOSISTEMICOS.add("SE  CONSUME  COMO  FRUTA  FRESCA  Y  DEBIDO  A  SU  SABOR ÁCIDO ES PREFERIDO POR LOS NIÑOS, EN LAS ISLAS DEL PACÍFICO SUR SE ELABORA EL “CHUTNEY” QUE ES UNA ESPECIE DE JALEA AGRIDULCE QUE ACOMPAÑA A COMIDAS SALADAS, TAMBIÉN SE ELABORA VINO Y DE LAS RAÍCES SE REALIZAN EXTRACTOS MEDICINALES");
        USOS_SERVICIOS_ECOSISTEMICOS.add("UTILIZADO COMO PLANTA FORRAJERA EL GANADO. LOS FRUTOS SE LE DAN A COMER A LOS CERDOS Y SE HA DEMOSTRADO SU VALOR ALIMENTICIO. ES UN ÁRBOL MUY COMÚN CON VALOR ORNAMENTAL. MEDICINAL (BAÑOS Y PARTO). PARA CURTIR PIELES. LEÑA");
        USOS_SERVICIOS_ECOSISTEMICOS.add("TIENE MÚLTIPLES USOS DESDE ALIMENTICIO, FORRAJERO, ADHESIVO, AROMÁTICO, TINTE, MEDICINAL, MELÍFERO, PARA CONSTRUCCIÓN Y COMO LEÑA Y CARBÓN. EN MÉXICO SE HACEN BEBIDAS FRESCAS, ATOLES Y SALSAS, TAMBIÉN SE CONSUME DIRECTAMENTE CON SAL, CHILE Y LIMÓN (CONABIO 2014).");
        USOS_SERVICIOS_ECOSISTEMICOS.add("COMESTIBLE, LA FRUTA SE CONSUME FRESCA O PARA BEBIDAS, HELADOS, CONSERVAS, JALEAS Y MERMELADAS. MEDICINAL: EL FRUTO SE UTILIZA PARA LA DISENTERÍA, LAVADOS INTESTINALES, DIARREA, FIEBRE Y CONGESTIÓN; LA SEMILLA ES VERMÍFUGA Y ANTIHELMÍNTICA; LA CORTEZA Y LA RAÍZ SON ANTIESPASMÓDICAS, HIPOTENSIVAS Y SEDATIVAS; LA HOJA Y EL TALLO SON ANTICANCERÍGENOS. MELÍFERA. INSECTICIDA: LAS HOJAS Y SEMILLAS CONTIENEN LOS ALCALOIDES MURICINA Y MURICININA.");
        USOS_SERVICIOS_ECOSISTEMICOS.add("ES FIJADOR DE NITRÓGENO. UTILIZADO COMO ORNATO, BARRERA, SOMBRA, CERCA VIVA Y EN POTREROS, PRODUCCIÓN DE MIEL Y VARIOS USOS DOMÉSTICOS Y MADERABLES (CONABIO 2014).");
        USOS_SERVICIOS_ECOSISTEMICOS.add("CON LAS HOJAS DE ESTA ESPECIE SE HACEN TECHOS DE CASAS RÚSTICAS, CANASTOS, SOMBREROS Y JUGUETES ARTESANALES. LA PRODUCCIÓN ACTUAL DE HOJAS DE HUANO ES INSUFICIENTE PARA SURTIR LA DEMANDA, POR LO QUE DEBE FOMENTARSE SU CULTIVO. MELÍFERA");
        USOS_SERVICIOS_ECOSISTEMICOS.add("SUS HOJAS SON EMPLEADAS EN LA CONSTRUCCIÓN DE CASAS RÚSTICAS Y MÁS RECIENTEMENTE EN PALAPAS DE CENTROS TURÍSTICOS. TAMBIÉN PARA LA ELABORACIÓN DE ESCOBAS Y TRAMPAS PARA LANGOSTAS.");
        USOS_SERVICIOS_ECOSISTEMICOS.add("AUNQUE  SU TRONCO  SE  PUEDE  USAR  PARA  CONSTRUCCIONES  RURALES,  SON  LAS  HOJAS,  POR  SU GRAN TAMAÑO Y RESISTENCIA LAS MÁS APRECIADAS PARA EL TECHADO DE PALAPAS Y CASAS. ES UNA PLANTA MELÍFERA.");
        USOS_SERVICIOS_ECOSISTEMICOS.add("SUS HOJAS HAN SIDO UTILIZADAS EN LA MEDICINA TRADICIONAL PARA CURAR PROBLEMAS CARDÍACOS Y PARA LA DIABETES. HOJAS COMO FORRAJE PARA EL GANADO. EL TRONCO SE UTILIZA EN LA CONSTRUCCIÓN DE CHOZAS, PALAPAS Y SUSTITUTO DE TUBERÍAS. LA INFRUTESCENCIA ES COMESTIBLE");
        USOS_SERVICIOS_ECOSISTEMICOS.add("SE UTILIZA COMO ALIMENTO, MADERABLE, COMBUSTIBLE, CURTIENTE, FORRAJE, INSECTICIDA Y MEDICINAL (CONABIO 2014). ");
        USOS_SERVICIOS_ECOSISTEMICOS.add("MADERA PESADA Y DE ALTA DURABILIDAD, EMPLEADA EN CONSTRUCCIONES NAVALES, PUENTES, CARROCERÍAS, MANGOS DE HERRAMIENTAS, DURMIENTES DE FERROCARRIL Y OBRAS HIDRÁULICAS DE AGUA DULCE. EL GUAYACÁN SE UTILIZA COMO PLANTA ORNAMENTAL EN PARQUES Y AVENIDAS POR EL HERMOSO COLOR AMARILLO DE SUS FLORES. (CTFS.SI.EDU)");
        USOS_SERVICIOS_ECOSISTEMICOS.add("MEDICINAL, MADERABLE, ORNAMENTAL");
        USOS_SERVICIOS_ECOSISTEMICOS.add("SU MADERA ES CONSIDERADA UNA DE LAS MÁS DURAS Y PESADAS DEL TRÓPICO Y SE UTILIZA PARA CONSTRUIR MUEBLES, PISOS, DURMIENTES, ARTESANÍAS FINAS Y HERRAMIENTAS (CONABIO 2014).");
        USOS_SERVICIOS_ECOSISTEMICOS.add("SE USA PRINCIPALMENTE POR SU FRUTO, TENIENDO DIVERSIDAD DE DERIVADOS, MADERABLE EN INTERIORES Y TIENE PROPIEDADES MEDICINALES. ");
        USOS_SERVICIOS_ECOSISTEMICOS.add("CONTRIBUYE A LA CONSERVACIÓN Y PROTECCIÓN DE SUELOS Y MANTOS ACUÍFEROS. DE LA CORTEZA SE EXTRAEN FIBRAS QUE SE USAN PARA ELABORAR ESTERAS Y TELAS. PROPIEDADES MEDICINALES. SUS HOJAS Y SUS FLORES SON GRANDES RECURSOS ALIMENTICIOS PARA UNA GRAN CANTIDAD DE ANIMALES Y PÁJARO");
        USOS_SERVICIOS_ECOSISTEMICOS.add("EL FRUTO ES COMESTIBLE Y NO TIENE USOS INDUSTRIALES. PROBABLEMENTE FUE UTILIZADA POR LOS MAYAS AL IGUAL QUE EL RAMÓN (BROSIMUM ALICASTRUM) YA QUE SE ENCUENTRA EN SITIOS ARQUEOLÓGICOS. PAPEL IMPORTANTE EN LA SUBSISTENCIA DE LOS PUEBLOS ORIGINARIOS DE LAS REGIONES TROPICALES, APORTÁNDOLES ALIMENTOS, MEDICINAS Y MATERIAL DE CONSTRUCCIÓN PARA SUS REFUGIOS Y HERRAMIENTAS DE TRABAJO. MELÍFERA. MADERABLE. FORRAJERA.");
        USOS_SERVICIOS_ECOSISTEMICOS.add("ERA FUENTE DE GOMA LÁTEX EN CHINA. LA MAYORÍA DE LAS PLANTAS CULTIVADAS SE REPRODUCEN POR ESQUEJES O ACODOS. EN LA INDIA SE CONSTRUYEN IMPRESIONANTES PUENTES VIVOS CON ESTA ESPECIE (CONABIO 2014). EL LÁTEX DEL ÁRBOL SE USÓ PARA HACER CAUCHO, ANTES DE USARSE HEVEA BRASILIENSIS. ESTA SAVIA ES MUY IRRITANTE PARA OJOS Y PIEL, Y TÓXICA SI SE INGIERE (INFOJARDÍN 2020).");
        USOS_SERVICIOS_ECOSISTEMICOS.add("LA CORTEZA ES USADA COMO VENENO PARA PECES. LA CORTEZA ES ANALGÉSICA, ANTIESPASMÓDICA Y SEDANTE. MADERABLE, COMBUSTIBLE, ARTESANAL, CONSTRUCCION, CULINARIO.");
        USOS_SERVICIOS_ECOSISTEMICOS.add("EL FRUTO SE UTILIZABA COMO JABÓN PARA LAVAR ROPA (LA PULPA DE LOS FRUTOS CONTIENE SAPONINAS), ESTUPEFACIENTE DE PECES Y PARA COMBATIR ENFERMEDADES. MADERA EMPLEADA COMO LEÑA Y PARA CARPINTERÍA.");
        USOS_SERVICIOS_ECOSISTEMICOS.add("ES UN ÁRBOL DE FOLLAJE Y PORTE ORNAMENTAL UTILIZADO EN PROYECTOS PAISAJÍSTICOS. LAS PARTES MÁS UTILIZADAS SON LAS FRUTAS Y SEMILLAS. DE LOS FRUTOS SE ELABORAN DIVERSOS OBJETOS UTILIZANDO LA CÁSCARA BASTANTE LIVIANA Y RESISTENTE. TRADICIONALMENTE SE HA UTILIZADO ESTE FRUTO COMO RECIPIENTE PARA TOMAR EL POZOL QUE ES LA BEBIDA TÍPICA DE ESA REGIÓN, TAMBIÉN SE USA COMO ARTESANÍA AL LABRAR LAS JÍCARAS. MEDICINAL: EL ZUMO DE LA HOJA CALENTADA SE APLICA EN EL OÍDO EN INSTILACIÓN (USO TRAMIL)");
        USOS_SERVICIOS_ECOSISTEMICOS.add("ARTESANAL. MEDICINAL (TOS). COMO ÁRBOLES AISLADOS EN POTREROS, CERCAS VIVAS, DELIMITACIÓN DE LINDEROS Y HUERTOS CASEROS, ESTABILIZACIÓN DE DUNAS, PROTECCIÓN DE ECOSISTEMAS ESTUARINOS Y RECUPERACIÓN DE YERMOS COSTEROS SE CREE QUE SU MADERA ES DURA Y RESISTENTE A LA PUDRICIÓN");
        USOS_SERVICIOS_ECOSISTEMICOS.add("LA MADERA SE UTILIZA PARA LA CONSTRUCCIÓN DE CASAS. LOS FRUTOS SON COMESTIBLES, TAMBIÉN PARA LA FAUNA. LA DECCIÓN DE LA CORTEZA ES USADA COMO FEBRÍFUGO Y ES APLICADA SOBRE ERUPCIONES DE LA PIEL. UNA PREPARACIÓN DE LAS SEMILLAS SE EMPLEA COMO REMEDIO PARA LAS ÚLCERAS. EL LÁTEX ES EXTRAÍDO PARA ADULTERAR EL CHICLE.");
        USOS_SERVICIOS_ECOSISTEMICOS.add("ORNAMENTAL");
        USOS_SERVICIOS_ECOSISTEMICOS.add("USADO COMO ÁRBOL URBANO, DE ALINEACIÓN O AISLADO");
        USOS_SERVICIOS_ECOSISTEMICOS.add("DA SOMBRA Y ES AMPLIAMENTE UTILIZADO EN EL ARBOLADO URBANO. SUS FRUTOS SON ALIMENTO PARA LA FAUNA URBANA");
        USOS_SERVICIOS_ECOSISTEMICOS.add("SU FRUTO ES AMPLIAMENTE UTILIZADO, LA ESPECIE TAMBIÉN TIENE PROPIEDADES MEDICINALES ");
        USOS_SERVICIOS_ECOSISTEMICOS.add("FRUTO COMESTIBLE");
        USOS_SERVICIOS_ECOSISTEMICOS.add("ES UNO DE LOS FAVORITOS EN LOS PUEBLOS MAYAS Y VÍAS SUBURBANAS DE YUCATÁN O EN PARQUES. SE HA UTILIZADO AMPLIAMENTE COMO ORNAMENTAL Y COMO REMEDIO LAXANTE. IMPORTANTE EN CUANTO A SU CONTRIBUCIÓN DE NÉCTAR Y POLEN");
        USOS_SERVICIOS_ECOSISTEMICOS.add("MADERA UTILIZADA PARA FABRICAR MUEBLES, INSTRUMENTOS MUSICALES Y CONSTRUCCIÓN RURAL. COMO REMEDIO PARA LA FIEBRE, DISENTERÍA Y OTRAS ENFERMEDADES. FUENTE DE NÉCTAR PARA ABEJAS (CONABIO 2014).");
        USOS_SERVICIOS_ECOSISTEMICOS.add("LA FIBRA DE LA CORTEZA SE USA LOCALMENTE PARA CORDELERÍA. MEDICINAL: DE LA MADERA Y HOJAS SE ELABORA UN REMEDIO PARA LA ICTERICIA. ARTESANÍA: LA FIBRA DEL FRUTO SIRVE PARA RELLENAR ALMOHADAS.");
        USOS_SERVICIOS_ECOSISTEMICOS.add("ESTE ÁRBOL PRODUCE LÁTEX, QUE ES EMPLEADO COMO CAUSTICO PARA ELIMINAR HONGOS DE LA PIEL. CON LA MADERA DEL ZAPOTE, RESISTENTE Y SÓLIDA, SE PUEDEN CONSTRUIR MUEBLES U OTROS OBJETOS QUE REQUIERAN MADERAS FUERTES.  TIENE PROPIEDADES MEDICINALES");
        USOS_SERVICIOS_ECOSISTEMICOS.add("IMPORTANTE POR SU FRUTO COMESTIBLE Y ACEITES ESENCIALES.  ");
        USOS_SERVICIOS_ECOSISTEMICOS.add("EL MANGO, CONOCIDO ESENCIALMENTE POR SU FRUTO, ES TAMBIÉN MADERABLE CUANDO ACABA SU FASE PRODUCTIVA DE FRUTOS (NATURALISTA). MEDICINAL: LAS HOJAS Y FLORES SE EMPLEAN PARA PROBLEMAS RESPIRATORIOS, LAS SEMILLAS SECAS Y PULVERIZADAS EN INFUSIÓN SE EMPLEAN COMO ANTIPARASITARIO Y ANTIDIARREICO.");
        USOS_SERVICIOS_ECOSISTEMICOS.add("MADERA EMPLEADA EN CONSTRUCCIONES RURALES Y PARA POSTES DE CERCAS. LA PULPA ARENOSA DE LOS FRUTOS ES COMESTIBLE. FLORES MELÍFERAS. UTILIZADO COMO ÁRBOL DE ORNATO EN PARQUES Y JARDINES. MEDICINA TRADICIONAL (PARA EL DOLOR DE MUELAS, INFLAMACIÓN DE ENCÍAS, ANTIESPASMÓDICO Y ANTIPIRÉTICO). FRUTO COMESTIBLE");
        USOS_SERVICIOS_ECOSISTEMICOS.add("ES UNA ESPECIE CON DIFERENTES USOS, YA QUE ES COMESTIBLE SU FRUTO, SE EXTRAEN COLORANTES PARA LA INDUSTRIA TEXTIL Y SU MADERA ES DE BUENA CALIDAD, UTILIZADA EN GRAN MEDIDA A NIVEL LOCAL (NATURALISTA). EL EXUDADO LECHOSO DE ESTA ESPECIE SE UTILIZA PARA EL DOLOR DE MUELAS Y EN LA EXTRACCIÓN DE DIENTES.");
        USOS_SERVICIOS_ECOSISTEMICOS.add("LA MORINGA ES UN ÁRBOL QUE PUEDE MEJORAR LA ALIMENTACIÓN DE LAS PERSONAS Y OFRECERLES NUMEROSOS BENEFICIOS NUTRITIVOS. ALGUNOS ESTUDIOS DE SUS HOJAS HAN ARROJADO QUE CONTIENE SUSTANCIAS ANTICANCERÍGENAS, HIPOTENSORAS, HIPOGLUCEMIANTES Y ANTIBIÓTICAS. DE SUS SEMILLAS SE PUEDE EXTRAER ACEITE. LAS SEMILLAS SE UTILIZAN PARA PURIFICAR AGUA. FORRAJERA.");
        USOS_SERVICIOS_ECOSISTEMICOS.add("MADERABLE, MEDICINAL,MELIFERA, COMBUSTIBLE (LEÑA)");
        USOS_SERVICIOS_ECOSISTEMICOS.add("MELÍFERA, CONSTRUCCIÓN, MEDICINAL, ORNAMENTAL, COMBUSTIBLE, MADERABLE");
        USOS_SERVICIOS_ECOSISTEMICOS.add("USADA COMO LEÑA, MADERA, PARA EL TRATAMIENTO DE DESORDENES CUTÁNEOS Y SU FRUTO ES COMESTIBLE. SE LE ATRIBUYEN PROPIEDADES ANTIBIÓTICAS, ANTIFÚNGICAS, ANTIMICOBACTERIANAS E IXODICIDAS. (ROSADO-AGUILAR ET AL 2008)");
        USOS_SERVICIOS_ECOSISTEMICOS.add("APRECIADA EN LA APICULTURA POR SER PRODUCTORA DE POLEN, SUS TRONCOS Y RAMAS SE UTILIZAN PARA CONSTRUCCIONES RURALES Y CERCAS DE POTREROS");
        USOS_SERVICIOS_ECOSISTEMICOS.add("MELÍFERA, CONSTRUCCIÓN Y MADERABLE");
        USOS_SERVICIOS_ECOSISTEMICOS.add("LOS TALLOS SE EMPLEAN EN CONSTRUCCIONES Y VALLAS, LA HOJA SE USA DE MANERA ARTESANAL, ASÍ COMO TRAMPAS PARA LANGOSTAS ");
        USOS_SERVICIOS_ECOSISTEMICOS.add("SE UTILIZA COMO COLORANTE, COMBUSTIBLE, COMESTIBLE, PARA CONSTRUCCIÓN, CURTIENTE, FORRAJERA, MADERABLE, MEDICINAL Y PARA LA PRODUCCIÓN DE MIEL");
        USOS_SERVICIOS_ECOSISTEMICOS.add("LA NARANJA AGRIA, ES MUY UTILIZADA EN LA COCINA TRADICIONAL YUCATECA. ADEMÁS, SE PUEDEN ELABORAR ALGUNOS DULCES Y MERMELADAS");
        USOS_SERVICIOS_ECOSISTEMICOS.add("IMPORTANTE POR SU FRUTO COMESTIBLE Y ACEITES ESENCIALES.  ");
        USOS_SERVICIOS_ECOSISTEMICOS.add("LA CORTEZA ES TÓNICO AMARGO, ESTIMULANTE, ASTRINGENTE, FEBRÍFUGO EL FRUTO ES PURGANTE, TÓXICO LAS HOJAS Y EL ACEITE DE LAS SEMILLAS SON ANTISÉPTICO, ANTIPARASITARIO SE USAN LA CORTEZA, LAS HOJAS Y LOS FRUTOS. LOS EXTRACTOS DE NIM ACTÚAN, EN LOS INSECTOS, COMO ANTINUTRIENTES E INHIBIDORES HORMONALES DE LA METAMORFOSIS, FUNCIONA COMO INSECTICIDA. ");
        USOS_SERVICIOS_ECOSISTEMICOS.add("MUY APRECIADO COMO PLANTA ORNAMENTAL.");
        USOS_SERVICIOS_ECOSISTEMICOS.add("SE LE UTILIZA EN CONSTRUCCIÓN DE TECHOS, LAS FLORES SON MELÍFERAS, LOS FRUTOS SE UTILIZAN PARA ALIMENTAR CERDOS, COMO ALIMENTO, MEDICINA Y FABRICAR ACEITE.");
        USOS_SERVICIOS_ECOSISTEMICOS.add("ORNAMENTAL, EN ALINEACIONES");
        USOS_SERVICIOS_ECOSISTEMICOS.add("FRUTOS COMESTIBLES (DÁTILES). ORNAMENTAL. MEDICINAL. HOJAS PARA CONSTRUIR TECHOS Y VALLAS");
        USOS_SERVICIOS_ECOSISTEMICOS.add("SE UTILIZA COMO MADERABLE Y PARA FABRICAR ADHESIVOS, AROMATIZANTES, ARTESANÍAS, INSECTICIDAS, FORRAJES, PRODUCCIÓN DE MIEL Y MEDICAMENTOS (CONABIO 2014). ESPECIE MUY USADA COMO CERCA VIVA, LAS HOJAS COMO MEDICINA TRADICIONAL PARA DAR BAÑOS CURATIVOS Y DEL TRONCO SE HACEN ARTESANÍAS, COMO ORNAMENTAL EN PARQUES Y JARDINES.");
        USOS_SERVICIOS_ECOSISTEMICOS.add("ARTESANAL: MADERA PARA FABRICAR ARTESANÍAS, JUGUETES E INSTRUMENTOS MUSICALES. COMBUSTIBLE (LEÑA). COMESTIBLE: EL FRUTO ES COMESTIBLE AUNQUE NO DE BUENA CALIDAD Y CONTIENE UN GLUCÓSIDO CRISTALINO TÓXICO. CONSTRUCCIÓN. MADERABLE. MEDICINAL: AMEBICIDA, ANALGÉSICO, ANTIHELMÍNTICO, ANTIBACTERIAL, ANTIMICROBIAL, VERMÍFUGO, FERBÍFUGO, ESTOMÁQUICO, SUDORÍFICO, TÓNICO, CITOTÓXICO.");
        USOS_SERVICIOS_ECOSISTEMICOS.add("ESTA FIBRA SE HA UTILIZADO PARA RELLENAR COLCHONES. SE ELABORAN ATRACTIVAS ARTESANÍAS CON LA CORTEZA Y LAS ESPINAS. TIENE PROPIEDADES MEDICINALES. ES EL ÁRBOL SAGRADO DE LOS MAYAS (NATURALISTA).");
        USOS_SERVICIOS_ECOSISTEMICOS.add("SE UTILIZA PARA ELABORAR MUEBLES, ARTESANÍAS, COMO FORRAJE Y CON FINES TERAPÉUTICOS. FUE UN SUSTITUTO DEL MAÍZ PARA LOS MAYAS POR SU RESISTENCIA A LA SEQUÍA E INUNDACIONES. SU FOLLAJE ES MUCHO MÁS NUTRITIVO QUE EL DEL GUAJE ( LEUCAENA LEUCOCEPHALA ) POR LO QUE TAMBIÉN ES MUY APRECIADO PARA EL GANADO, DE AHÍ SU NOMBRE DE “RAMÓN” DE RAMONEAR (CONABIO 2014). MEDICINAL:LÁTEX DILUIDO PARA EL ASMA Y LA BRONQUITIS.");
        USOS_SERVICIOS_ECOSISTEMICOS.add("UTILIZADA COMO PLANTA DE SOMBRA EN LA REGIÓN. MEDICINAL, COMBUSTIBLE, FORRAJERA, MADERABLE, MÁGICO-RELIGIOSO, ARTESANAL, CONSTRUCCIÓN");
        USOS_SERVICIOS_ECOSISTEMICOS.add("SE CONSUME COMO FRUTA FRESCA, SUS RAÍCES Y HOJAS TIENEN PROPIEDADES MEDICINALES");
        USOS_SERVICIOS_ECOSISTEMICOS.add("SE UTILIZA COMO ÁRBOL DE ORNATO, SUS FRUTOS SON COMESTIBLES EN ALMÍBAR, SUS HOJAS RASPOSAS SE UTILIZAN PARA LAVAR TRASTOS. MADERABLE. MEDICINAL. COMBUSTIBLE. CONSTRUCCIÓN. INDUSTRIAL. MELÍFERA");
        USOS_SERVICIOS_ECOSISTEMICOS.add("GRAN DIVERSIDAD DE USOS, COMO CONDIMENTO, ADHESIVO, COLORANTE, COMBUSTIBLE, COMESTIBLE, MEDICINAL, FORRAJE, PARA CONSTRUCCIÓN E INSECTICIDA. EN MÉXICO LO CONSUMIMOS COMO DULCE MEZCLADO CON AZÚCAR, SAL O CHILE, EN AGUA FRESCA Y COMO SALSA.");
        USOS_SERVICIOS_ECOSISTEMICOS.add("SE UTILIZA COMO FORRAJE, AROMATIZANTE, COMBUSTIBLE, PARA CONSTRUCCIÓN, MEDICINAL Y PARA PRODUCCIÓN DE MIEL (CONABIO 2014).");
        USOS_SERVICIOS_ECOSISTEMICOS.add("ES UN ÁRBOL MADERABLE, CUMPLE CON LA FUNCIÓN DE ENRIQUECER LA TIERRA CON NITRÓGENO . TIENE TAMBIÉN UN VALOR RITUAL MÁGICO ENTRE LOS MAYAS, PORQUE SE USA COMO PARA LA PREPARACIÓN DE LOS GUISOS ENTERRADOS EN UN PROCESO DE COCCIÓN DENOMINADO, TAMBIÉN EN LENGUA MAYA, “PIB”");
        USOS_SERVICIOS_ECOSISTEMICOS.add("TIENE ALTO POTENCIAL PARA RESTAURAR SUELOS DEGRADADOS. SE UTILIZA COMO ALIMENTO O FORRAJE, PARA MADERA Y ORNAMENTAL (CONABIO 2014).");
        USOS_SERVICIOS_ECOSISTEMICOS.add("UTILIZADO COMO COMESTIBLE, CURTIENTE, MADERABLE, MEDICINAL Y MELÍFERO. FRUTO COMESTIBLE Y SE USA PARA HACER MERMELADAS (CONABIO 2014). LOS FRUTOS TIENEN UN EFECTO MUY ASTRINGENTE, REFRESCANTE Y FEBRÍFUGO. LA INFUSIÓN DEL TALLO O LAS RAÍCES RESUELVE LOS PROBLEMAS INTESTINALES. LA CORTEZA CONTIENE UN JUGO ROJO OSCURO, DE SABOR UN POCO AMARGO, QUE SE USÓ COMO PODEROSO HEMOSTÁTICO, ASTRINGENTE Y ANTIDIARREICO (CORREA ET AL 2004).");
        USOS_SERVICIOS_ECOSISTEMICOS.add("MEDICINAL, MELÍFERA Y MADERABLE");
        USOS_SERVICIOS_ECOSISTEMICOS.add("SUS FLORES SE CONSUMEN EN SOPAS, TAMALES, CON HUEVO, GUISADAS Y COMO RELLENO DE CHILES. SU FRUTO Y SU RAÍZ TAMBIÉN SON COMESTIBLES. CON SUS FIBRAS SE HACÍAN MORRALES, ONDAS Y COSTALES. SUS HOJAS SE UTILIZAN PARA CURAR EL DOLOR DE OÍDO.");
        USOS_SERVICIOS_ECOSISTEMICOS.add("MADERA DE EXCELENTE CALIDAD, SEMEJANTE AL ÉBANO, ÚTIL PARA MUEBLES Y GABINETES. FRUTOS COMESTIBLES, USADOS PARA PREPARAR REFRESCOS, HELADOS, LICORES Y CONSERVAS. POR SU CONTENIDO DE TANINOS, SE UTILIZA PARA CURTIR PIELES Y TRATAR LA DIARREA. PLANTA DE SOMBRA Y ORNATO EN PARQUES Y JARDINES.");

    }

    private void setPrecauciones() {

        PRECAUCIONES = new ArrayList<>();

        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("FRUTOS PESADOS Y CARNOSOS, PUEDEN LIMITAR EL TRÁFICO PEATONAL O VEHICULAR");
        PRECAUCIONES.add("TÓXICA");
        PRECAUCIONES.add("SUS RAÍCES PUEDEN DAÑAR INMUEBLES");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("TÓXICA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("TÓXICA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("EL CONSUMO DE SU FRUTA DEBE SER MODERADO YA QUE CONTIENE UNA NEUROTOXINA. PACIENTES CON INSUFICIENCIA RENAL NO DEBEN CONSUMIR ESTA FRUTA");
        PRECAUCIONES.add("ESPINAS");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("ESPINAS");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("ESPINAS");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("FRUTO-PESADO");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("ESPINAS");
        PRECAUCIONES.add("ESPINAS");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("VAINAS GRANDES QUE PUEDEN AFECTAR LA MOVILIDAD DE PEATONES Y VEHÍCULOS. RAÍCES SUPERFICIALES AGRESIVSA QUE PUEDEN AFECTAR CONSTRUCCIONES");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("TÓXICA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("ESPINAS");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("FRUTOS CARNOSOS QUE PUEDEN LIMITAR EL TRANSITO PEATONAL. RIESGO DE SOFOCACIÓN AL CONSUMIR LA PULPA RESBALADIZA DEBIDO AL TAMÑO DE LA SEMILLA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("TÓXICA");
        PRECAUCIONES.add("CONTIENE SUSTANCIAS NARCÓTICAS (PISCIDINA)");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("FRUTOS PESADOS, PUEDEN LIMITAR EL TRÁFICO PEATONAL O VEHICULAR");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("RAÍCES SUPERFICIALES QUE PUEDEN LIMITAR EL TRÁFICO PEATONAL Y VEHICULAR");
        PRECAUCIONES.add("RAÍCES SUPERFICIALES QUE PUEDEN LIMITAR EL TRÁFICO PEATONAL Y VEHICULAR");
        PRECAUCIONES.add("ESPINAS");
        PRECAUCIONES.add("ESPINAS");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("ESPINAS");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("ESPINAS");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("ESPINAS");
        PRECAUCIONES.add("ESPINAS");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("LAS HOJAS GRANDES REPRESENTAN UN RIESGO PARA PEATONES Y VEHÍCULOS AL CAER DESDE LAS ALTURAS");
        PRECAUCIONES.add("ESPINAS EN LOS PECÍOLO");
        PRECAUCIONES.add("ESPINAS EN LAS HOJAS");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("TÓXICA");
        PRECAUCIONES.add("ESPINAS");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");
        PRECAUCIONES.add("NA");


    }

    private void setRiego() {

        RIEGO = new ArrayList<>();

        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("POCO");
        RIEGO.add("POCO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("POCO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("POCO");
        RIEGO.add("POCO");
        RIEGO.add("POCO");
        RIEGO.add("MEDIO");
        RIEGO.add("POCO");
        RIEGO.add("POCO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("POCO");
        RIEGO.add("POCO");
        RIEGO.add("POCO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("POCO");
        RIEGO.add("MEDIO");
        RIEGO.add("POCO");
        RIEGO.add("POCO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("POCO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("POCO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("POCO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("POCO");
        RIEGO.add("POCO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("POCO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("POCO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("POCO");
        RIEGO.add("POCO");
        RIEGO.add("MEDIO");
        RIEGO.add("POCO");
        RIEGO.add("POCO");
        RIEGO.add("POCO");
        RIEGO.add("POCO");
        RIEGO.add("POCO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("POCO");
        RIEGO.add("POCO");
        RIEGO.add("MEDIO");
        RIEGO.add("POCO");
        RIEGO.add("POCO");
        RIEGO.add("POCO");
        RIEGO.add("MEDIO");
        RIEGO.add("POCO");
        RIEGO.add("MEDIO");
        RIEGO.add("POCO");
        RIEGO.add("MEDIO");
        RIEGO.add("POCO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");
        RIEGO.add("POCO");
        RIEGO.add("POCO");
        RIEGO.add("BAJO");
        RIEGO.add("POCO");
        RIEGO.add("MEDIO");
        RIEGO.add("MEDIO");


    }

    private void setFructificacion() {
        FRUCTIFICACION = new ArrayList<>();

        FRUCTIFICACION.add("AGOSTO,SEPTIEMBRE");
        FRUCTIFICACION.add("DICIEMBRE, ENERO,FEBRERO, MARZO");
        FRUCTIFICACION.add("NA");
        FRUCTIFICACION.add("ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FRUCTIFICACION.add("FEBRERO, MARZO,ABRIL,JUNIO,AGOSTO,SEPTIEMBRE,NOVIEMBRE");
        FRUCTIFICACION.add("FEBRERO,MARZO,ABRIL,MAYO,JUNIO");
        FRUCTIFICACION.add("ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FRUCTIFICACION.add("MARZO,ABRIL,MAYO");
        FRUCTIFICACION.add("ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FRUCTIFICACION.add("MAYO,JUNIO,AGOSTO,SEPTIEMBRE");
        FRUCTIFICACION.add("NA");
        FRUCTIFICACION.add("NA");
        FRUCTIFICACION.add("NA");
        FRUCTIFICACION.add("ENERO,MARZO,JUNIO,NOVIEMBRE,OCTUBRE,DICIEMBRE");
        FRUCTIFICACION.add("ENERO,FEBRERO,MARZO,ABRIL");
        FRUCTIFICACION.add("FEBRERO,MARZO,ABRIL");
        FRUCTIFICACION.add("ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FRUCTIFICACION.add("ENERO,NOVIEMBRE,DICIEMBRE");
        FRUCTIFICACION.add("ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FRUCTIFICACION.add("NA");
        FRUCTIFICACION.add("ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FRUCTIFICACION.add("MARZO,SEPTIEMBRE,OCTUBRE");
        FRUCTIFICACION.add("ABRIL,MAYO");
        FRUCTIFICACION.add("ENERO,MARZO,ABRIL,DICIEMBRE");
        FRUCTIFICACION.add("ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FRUCTIFICACION.add("MARZO,ABRIL,MAYO");
        FRUCTIFICACION.add("ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FRUCTIFICACION.add("ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE");
        FRUCTIFICACION.add("ENERO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FRUCTIFICACION.add("ENERO,FEBRERO,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FRUCTIFICACION.add("MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE");
        FRUCTIFICACION.add("ENERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,NOVIEMBRE,DICIEMBRE");
        FRUCTIFICACION.add("MAYO,JUNIO");
        FRUCTIFICACION.add("NA");
        FRUCTIFICACION.add("JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE");
        FRUCTIFICACION.add("ENERO,FEBRERO,MARZO,ABRIL");
        FRUCTIFICACION.add("ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FRUCTIFICACION.add("ABRIL,MAYO,JUNIO");
        FRUCTIFICACION.add("ENERO,FEBRERO,MARZO,ABRIL,DICIEMBRE");
        FRUCTIFICACION.add("ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO");
        FRUCTIFICACION.add("ABRIL,MAYO,JUNIO,JULIO");
        FRUCTIFICACION.add("ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FRUCTIFICACION.add("JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE");
        FRUCTIFICACION.add("ENERO, ABRIL,MAYO,JUNIO,JULIO,AGOSTO,OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FRUCTIFICACION.add("FEBRERO,MARZO,ABRIL,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,DICIEMBRE");
        FRUCTIFICACION.add("ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FRUCTIFICACION.add("ABRIL,MAYO");
        FRUCTIFICACION.add("MAYO,NOVIEMBRE");
        FRUCTIFICACION.add("MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO");
        FRUCTIFICACION.add("ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE");
        FRUCTIFICACION.add("MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO");
        FRUCTIFICACION.add("NA");
        FRUCTIFICACION.add("FEBRERO,MARZO.ABRIL,MAYO,JUNIO");
        FRUCTIFICACION.add("MARZO,ABRIL,MAYO,JUNIO,SEPTIEMBRE");
        FRUCTIFICACION.add("ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FRUCTIFICACION.add("FEBRERO,MARZO,ABRIL,MAYO,JUNIO,SEPTIEMBRE,OCTUBRE,DICIEMBRE");
        FRUCTIFICACION.add("ENERO,FEBRERO,MARZO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FRUCTIFICACION.add("MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE");
        FRUCTIFICACION.add("FEBRERO,MARZO,ABRIL,JULIO,AGOSTO,NOVIEMBRE");
        FRUCTIFICACION.add("NA");
        FRUCTIFICACION.add("ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FRUCTIFICACION.add("NA");
        FRUCTIFICACION.add("NA");
        FRUCTIFICACION.add("NA");
        FRUCTIFICACION.add("NA");
        FRUCTIFICACION.add("NA");
        FRUCTIFICACION.add("FEBRERO,MARZO,JUNIO");
        FRUCTIFICACION.add("FEBRERO,MARZO,ABRIL,MAYO");
        FRUCTIFICACION.add("ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO");
        FRUCTIFICACION.add("NA");
        FRUCTIFICACION.add("NA");
        FRUCTIFICACION.add("ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FRUCTIFICACION.add("MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE");
        FRUCTIFICACION.add("NA");
        FRUCTIFICACION.add("ENERO,FEBRERO,MARZO,ABRIL,OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FRUCTIFICACION.add("JUNIO,AGOSTO,SEPTIEMBRE");
        FRUCTIFICACION.add("JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMRBRE");
        FRUCTIFICACION.add("NA");
        FRUCTIFICACION.add("NA");
        FRUCTIFICACION.add("ENERO,FEBRERO,MARZO,ABRIL,OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FRUCTIFICACION.add("ENERO,FEBRERO,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FRUCTIFICACION.add("NA");
        FRUCTIFICACION.add("NA");
        FRUCTIFICACION.add("ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FRUCTIFICACION.add("ENERO,FEBRERO,MARZO,ABRIL");
        FRUCTIFICACION.add("ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,NOVIEMBRE,DICIEMBRE");
        FRUCTIFICACION.add("MARZO,ABRIL,MAYO,AGOSTO,SEPTIEMBRE,OCTUBRE");
        FRUCTIFICACION.add("FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FRUCTIFICACION.add("FEBRERO,MARZO,ABRIL,MAYO,JUNIO");
        FRUCTIFICACION.add("MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE");
        FRUCTIFICACION.add("ABRIL,MAYO,JUNIO,JULIO,AGOSTO");
        FRUCTIFICACION.add("ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FRUCTIFICACION.add("ENERO,FEBRERO,MARZO,ABRIL,DICIEMBRE");
        FRUCTIFICACION.add("JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE");
        FRUCTIFICACION.add("ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FRUCTIFICACION.add("ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE");
        FRUCTIFICACION.add("ENERO,FEBRERO,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FRUCTIFICACION.add("NA");
        FRUCTIFICACION.add("JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE");

    }

    private void setFloracion() {
        FLORACION = new ArrayList<>();

        FLORACION.add("ABRIL");
        FLORACION.add("FEBRERO,MARZO, ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE");
        FLORACION.add("NA");
        FLORACION.add("ENERO,FEBRERO,MARZO, ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE, NOVIEMBRE,DICIEMBRE");
        FLORACION.add("FEBRERO,MARZO, ABRIL,JUNIO,AGOSTO,SEPTIEMBRE,NOVIEMBRE");
        FLORACION.add("FEBRERO,MARZO, ABRIL,MAYO,JUNIO");
        FLORACION.add("MARZO,ABRIL,SEPTIEMBRE,OCTUBRE");
        FLORACION.add("ENERO,FEBRERO,MARZO, ABRIL");
        FLORACION.add("ENERO,FEBRERO,MARZO, ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE, NOVIEMBRE,DICIEMBRE");
        FLORACION.add("MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE");
        FLORACION.add("NA");
        FLORACION.add("NA");
        FLORACION.add("NA");
        FLORACION.add("OCTUBRE,NOVIEMBRE");
        FLORACION.add("NOVIEMBRE, DICIEMBRE,ENERO,FEBRERO,MARZO");
        FLORACION.add("DICIEMBRE,ENERO,FEBRERO");
        FLORACION.add("ENERO,FEBRERO,MARZO, ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE, NOVIEMBRE,DICIEMBRE");
        FLORACION.add("ABRIL,MAYO,JUNIO");
        FLORACION.add("ENERO,FEBRERO,MARZO, ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE, NOVIEMBRE,DICIEMBRE");
        FLORACION.add("MARZO,ABRIL,MAYO,JUNIO");
        FLORACION.add("ABRIL,MAYO,JUNIO,JULIO,AGOSTO,NOVIEMBRE,DICIEMBRE");
        FLORACION.add("MAYO,JUNIO,JULIO,AGOSTO,OCTUBRE");
        FLORACION.add("DICIEMBRE,ENERO,FEBRERO");
        FLORACION.add("JUNIO,JULIO,OCTUBRE,NOVIEMBRE");
        FLORACION.add("MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,NOVIEMBRE");
        FLORACION.add("FEBRERO,MARZO,ABRIL,MAYO");
        FLORACION.add("ENERO,FEBRERO,MARZO, ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE, NOVIEMBRE,DICIEMBRE");
        FLORACION.add("ABRIL,MAYO,JULIO,OCTUBRE");
        FLORACION.add("JUNIO,JULIO,AGOSTO");
        FLORACION.add("MARZO,JUNIO,JULIO");
        FLORACION.add("ENERO,FEBRERO,MARZO,ABRIL");
        FLORACION.add("OCTUBRE,NOVIEMBRE,ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO");
        FLORACION.add("ABRIL,MAYO,JUNIO");
        FLORACION.add("MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE");
        FLORACION.add("MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE");
        FLORACION.add("ENERO,FEBRERO,MARZO, ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE, NOVIEMBRE,DICIEMBRE");
        FLORACION.add("ENERO,FEBRERO,MARZO, ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE, NOVIEMBRE,DICIEMBRE");
        FLORACION.add("FEBRERO,MARZO,ABRIL,MAYO,JUNIO");
        FLORACION.add("ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE");
        FLORACION.add("FEBRERO,MARZO,ABRIL,MAYO,JUNIO");
        FLORACION.add("ENERO,FEBRERO,MARZO,ABRIL");
        FLORACION.add("ENERO,FEBRERO,MARZO, ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE, NOVIEMBRE,DICIEMBRE");
        FLORACION.add("MAYO,JUNIO,JULIO");
        FLORACION.add("ENERO,ABRIL,MAYO,JUNIO,AGOSTO,NOVIEMBRE");
        FLORACION.add("FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,NOVIEMBRE,DICIEMBRE");
        FLORACION.add("ENERO,FEBRERO,MARZO, ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE, NOVIEMBRE,DICIEMBRE");
        FLORACION.add("MARZO,ABRIL");
        FLORACION.add("MARZO,ABRIL,MAYO,JUNIO,NOVIEMBRE");
        FLORACION.add("NA");
        FLORACION.add("ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE");
        FLORACION.add("MARZO,ABRIL,MAYO");
        FLORACION.add("NA");
        FLORACION.add("ENERO,FEBRERO,MARZO,ABRIL");
        FLORACION.add("MARZO,NOVIEMBRE,DICIEMBRE");
        FLORACION.add("ENERO,FEBRERO,MARZO, ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE, NOVIEMBRE,DICIEMBRE");
        FLORACION.add("ENERO,FEBRERO,MARZO, OCTUBRE,DICIEMBRE");
        FLORACION.add("FEBRERO,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE");
        FLORACION.add("AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FLORACION.add("ENERO,FEBRERO,MARZO,ABRIL,JUNIO, OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FLORACION.add("NA");
        FLORACION.add("ENERO,FEBRERO,MARZO, ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE, NOVIEMBRE,DICIEMBRE");
        FLORACION.add("NA");
        FLORACION.add("NA");
        FLORACION.add("ABRIL,MAYO,JUNIO");
        FLORACION.add("ABRIL,MAYO,JUNIO");
        FLORACION.add("MARZO,ABRIL,MAYO,JUNIO,JULIO");
        FLORACION.add("ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO");
        FLORACION.add("ENERO,FEBRERO,MARZO,ABRIL,OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FLORACION.add("ENERO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FLORACION.add("NA");
        FLORACION.add("ENERO,FEBRERO,MARZO,ABRIL");
        FLORACION.add("FEBRERO,MARZO,ABRIL,OCTUBRE");
        FLORACION.add("MARZO,ABRIL,MAYO,JUNIO,JULIO,SEPTIEMBRE,AGOSTO");
        FLORACION.add("NA");
        FLORACION.add("ENERO,FEBRERO,MARZO,AGOSTO,SEPTIEMBRE,OCTUBRE, NOVIEMBRE,DICIEMBRE");
        FLORACION.add("ABRIL,MAYO,JUNIO,JULIO,OCTUBRE,NOVIEMBRE");
        FLORACION.add("ABRIL,MAYO,JUNIO");
        FLORACION.add("NA");
        FLORACION.add("NA");
        FLORACION.add("MAYO.JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE");
        FLORACION.add("ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FLORACION.add("NA");
        FLORACION.add("NA");
        FLORACION.add("ABRIL,MAYO");
        FLORACION.add("ENERO,FEBRERO,DICIEMBRE");
        FLORACION.add("ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE");
        FLORACION.add("ENERO,FEBRERO,NOVIEMBRE,DICIEMBRE");
        FLORACION.add("ENERO,MARZO,ABRIL,MAYO,JUNIO,OCTUBRE");
        FLORACION.add("ENERO,FEBRERO,MARZO");
        FLORACION.add("MAYO,JUNIO,JULIO,SEPTIEMBRE");
        FLORACION.add("FEBRERO,MARZO,ABRIL,JUNIO");
        FLORACION.add("ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE");
        FLORACION.add("ENERO,FEBRERO,MARZO, ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE, NOVIEMBRE,DICIEMBRE");
        FLORACION.add("MARZO,ABRIL,MAYO");
        FLORACION.add("ENERO,FEBRERO,MARZO, ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE, NOVIEMBRE,DICIEMBRE");
        FLORACION.add("ENERO,FEBRERO,MARZO, ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE, NOVIEMBRE,DICIEMBRE");
        FLORACION.add("MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO");
        FLORACION.add("NA");
        FLORACION.add("MARZO,ABRIL,MAYO,JUNIO");


    }

    private void setColorFlor() {

        FLOR_COLOR = new ArrayList<>();
        FLOR_COLOR.add("CREMA");
        FLOR_COLOR.add("BLANCAS , VERDES");
        FLOR_COLOR.add("VERDES");
        FLOR_COLOR.add("AMARILLAS");
        FLOR_COLOR.add("INCONSPICUAS");
        FLOR_COLOR.add("ROSADAS");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("ROSADAS,  BLANCAS");
        FLOR_COLOR.add("NARANJAS");
        FLOR_COLOR.add("BLANCAS, VERDES");
        FLOR_COLOR.add("INCONSPICUAS");
        FLOR_COLOR.add("BLANCAS, MORADAS, ROSADAS");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("MORADAS");
        FLOR_COLOR.add("AMARILLAS");
        FLOR_COLOR.add("AMARILLAS");
        FLOR_COLOR.add("AMARILLAS");
        FLOR_COLOR.add("VERDES , AMARILLAS");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("ROSADAS");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("CREMA");
        FLOR_COLOR.add("BLANCAS , ROSADAS");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("ROJAS, ROSADAS");
        FLOR_COLOR.add("AMARILLAS");
        FLOR_COLOR.add("BLANCAS , CREMA");
        FLOR_COLOR.add("AMARILLAS");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("VERDES");
        FLOR_COLOR.add("NARANJAS. ROJAS");
        FLOR_COLOR.add("AMARILLAS");
        FLOR_COLOR.add("BLANCAS, ROSADAS, AMARILLAS");
        FLOR_COLOR.add("ROJAS");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("BLANCAS , VERDES");
        FLOR_COLOR.add("AMARILLAS");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("CREMA");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("BLANCAS, AMARILLAS");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("MORADAS, AZUL");
        FLOR_COLOR.add("AMARILLAS");
        FLOR_COLOR.add("AMARILLAS");
        FLOR_COLOR.add("VERDES");
        FLOR_COLOR.add("INCONSPICUAS");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("INCONSPICUAS");
        FLOR_COLOR.add("ROSADAS, BLANCAS");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("VERDES");
        FLOR_COLOR.add("VERDES");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("AMARILLAS");
        FLOR_COLOR.add("BLANCAS ,CREMA");
        FLOR_COLOR.add("AMARILLAS  ");
        FLOR_COLOR.add("INCONSPICUAS");
        FLOR_COLOR.add("INCONSPICUAS");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("AMARILLAS");
        FLOR_COLOR.add("ROSADAS");
        FLOR_COLOR.add("AMARILLAS");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("AMARILLAS, NARANJAS, ROJAS, ROSADAS, VERDES ");
        FLOR_COLOR.add("BLANCAS , VERDES");
        FLOR_COLOR.add("AMARILLAS");
        FLOR_COLOR.add("BLANCAS ");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("AMARILLAS, ROJAS");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("VERDES");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("AMARILLAS");
        FLOR_COLOR.add("CREMA");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("VERDES  , AMARILLAS");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("VERDES , AMARILLAS");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("VERDES , AMARILLAS");
        FLOR_COLOR.add("NARANJAS");
        FLOR_COLOR.add("AMARILLAS");
        FLOR_COLOR.add("AMARILLAS");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("AMARILLAS");
        FLOR_COLOR.add("BLANCAS");
        FLOR_COLOR.add("AMARILLAS");


    }

    private void setCorteza() {

        CORTEZA_ADULTA = new ArrayList<>();

        CORTEZA_ADULTA.add("FISURADA");
        CORTEZA_ADULTA.add("GRANULOSA");
        CORTEZA_ADULTA.add("FISURADA");
        CORTEZA_ADULTA.add("SURCADA");
        CORTEZA_ADULTA.add("LISA");
        CORTEZA_ADULTA.add("ESCAMOSA");
        CORTEZA_ADULTA.add("ESCAMOSA");
        CORTEZA_ADULTA.add("SURCADA");
        CORTEZA_ADULTA.add("FISURADA");
        CORTEZA_ADULTA.add("LISA");
        CORTEZA_ADULTA.add("ESCAMOSA");
        CORTEZA_ADULTA.add("LISA");
        CORTEZA_ADULTA.add("LISA-ANILLADA");
        CORTEZA_ADULTA.add("ESCAMOSA");
        CORTEZA_ADULTA.add("GRANULOSA");
        CORTEZA_ADULTA.add("FISURADA");
        CORTEZA_ADULTA.add("GRANULOSA");
        CORTEZA_ADULTA.add("FISURADA");
        CORTEZA_ADULTA.add("LISA");
        CORTEZA_ADULTA.add("LISA");
        CORTEZA_ADULTA.add("ESCAMOSA");
        CORTEZA_ADULTA.add("FISURADA");
        CORTEZA_ADULTA.add("LISA-ESPINOSA");
        CORTEZA_ADULTA.add("FISURADA");
        CORTEZA_ADULTA.add("LISA-ESPINOSA");
        CORTEZA_ADULTA.add("GRANULOSA");
        CORTEZA_ADULTA.add("ANILLADA");
        CORTEZA_ADULTA.add("LISA");
        CORTEZA_ADULTA.add("ANILLADA-ESPINOSA");
        CORTEZA_ADULTA.add("LISA");
        CORTEZA_ADULTA.add("GRANULOSA");
        CORTEZA_ADULTA.add("FISURADA");
        CORTEZA_ADULTA.add("LISA");
        CORTEZA_ADULTA.add("FISURADA");
        CORTEZA_ADULTA.add("LISA");
        CORTEZA_ADULTA.add("FISURADA");
        CORTEZA_ADULTA.add("FISURADA");
        CORTEZA_ADULTA.add("LISA-ESPINOSA");
        CORTEZA_ADULTA.add("LISA");
        CORTEZA_ADULTA.add("GRANULOSA");
        CORTEZA_ADULTA.add("RESTOS-DE-LOS-PECIOLOS");
        CORTEZA_ADULTA.add("LISA-ANILLADA");
        CORTEZA_ADULTA.add("LISA-ANILLADA");
        CORTEZA_ADULTA.add("LISA-ANILLADA");
        CORTEZA_ADULTA.add("ESCAMOSA");
        CORTEZA_ADULTA.add("FISURADA");
        CORTEZA_ADULTA.add("ESCAMOSA");
        CORTEZA_ADULTA.add("AGRIETADA");
        CORTEZA_ADULTA.add("LISA");
        CORTEZA_ADULTA.add("LISA");
        CORTEZA_ADULTA.add("LISA-SURCADA");
        CORTEZA_ADULTA.add("LISA");
        CORTEZA_ADULTA.add("FISURADA");
        CORTEZA_ADULTA.add("FISURADA");
        CORTEZA_ADULTA.add("FISURADA");
        CORTEZA_ADULTA.add("FISURADA");
        CORTEZA_ADULTA.add("LISA");
        CORTEZA_ADULTA.add("ESCAMOSA");
        CORTEZA_ADULTA.add("LISA");
        CORTEZA_ADULTA.add("ANILLADA");
        CORTEZA_ADULTA.add("FISURADA");
        CORTEZA_ADULTA.add("LISA");
        CORTEZA_ADULTA.add("LISA");
        CORTEZA_ADULTA.add("LISA");
        CORTEZA_ADULTA.add("LISA");
        CORTEZA_ADULTA.add("ESCAMOSA");
        CORTEZA_ADULTA.add("FISURADA");
        CORTEZA_ADULTA.add("LISA");
        CORTEZA_ADULTA.add("FISURADA");
        CORTEZA_ADULTA.add("LISA");
        CORTEZA_ADULTA.add("SURCADA");
        CORTEZA_ADULTA.add("GRANULOSA");
        CORTEZA_ADULTA.add("GRANULOSA");
        CORTEZA_ADULTA.add("SURCADA");
        CORTEZA_ADULTA.add("ANILLADA");
        CORTEZA_ADULTA.add("ESCAMOSA");
        CORTEZA_ADULTA.add("LISA");
        CORTEZA_ADULTA.add("LISA");
        CORTEZA_ADULTA.add("ESCAMOSA");
        CORTEZA_ADULTA.add("ANILLADA");
        CORTEZA_ADULTA.add("LISA-ANILLADA");
        CORTEZA_ADULTA.add("ANILLADA,RESTOS-DE-LOS-PECIOLOS");
        CORTEZA_ADULTA.add("ANILLADA");
        CORTEZA_ADULTA.add("EXFOLIADA");
        CORTEZA_ADULTA.add("FISURADA");
        CORTEZA_ADULTA.add("LISA-ESPINOSA");
        CORTEZA_ADULTA.add("ESCAMOSA");
        CORTEZA_ADULTA.add("FISURADA");
        CORTEZA_ADULTA.add("ESCAMOSA");
        CORTEZA_ADULTA.add("LISA");
        CORTEZA_ADULTA.add("FISURADA");
        CORTEZA_ADULTA.add("ESCAMOSA");
        CORTEZA_ADULTA.add("ACOSTILLADA");
        CORTEZA_ADULTA.add("ESCAMOSA");
        CORTEZA_ADULTA.add("LISA");
        CORTEZA_ADULTA.add("ESCAMOSA");
        CORTEZA_ADULTA.add("FISURADA");
        CORTEZA_ADULTA.add("AGRIETADA");
        CORTEZA_ADULTA.add("GRANULOSA");


    }
    private void setTipoHoja() {
        TIPO_DE_HOJA = new ArrayList<>();

        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("SIMPLES-LANCEOLADAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("COMPUESTAS-MULTI-PINNADAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PALMEADAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("SIMPLES-ESCAMOSAS");
        TIPO_DE_HOJA.add("SIMPLES-LOBULADAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("SIMPLES-LANCEOLADAS");
        TIPO_DE_HOJA.add("SIMPLES-LINEARES");
        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PALMEADAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("COMPUESTAS-MULTI-PINNADAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("SIMPLES-LINEARES");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("COMPUESTAS-MULTI-PINNADAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("COMPUESTAS-MULTI-PINNADAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("COMPUESTAS-MULTI-PINNADAS");
        TIPO_DE_HOJA.add("SIMPLES-PALMADAS");
        TIPO_DE_HOJA.add("SIMPLES-PALMADAS");
        TIPO_DE_HOJA.add("SIMPLES-PALMADAS");
        TIPO_DE_HOJA.add("SIMPLES-LOBULADAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PALMEADAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PALMEADAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("SIMPLES-LANCEOLADAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PALMEADAS");
        TIPO_DE_HOJA.add("SIMPLES-LOBULADAS");
        TIPO_DE_HOJA.add("SIMPLES-LANCEOLADAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("SIMPLES-LANCEOLADAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PALMEADAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("SIMPLES-PALMADAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("SIMPLES-PALMADAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PALMEADAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("COMPUESTAS-PINNADAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");
        TIPO_DE_HOJA.add("COMPUESTAS-MULTI-PINNADAS");
        TIPO_DE_HOJA.add("SIMPLES-LANCEOLADAS");
        TIPO_DE_HOJA.add("SIMPLES-ANCHAS");



    }

    private void setPermanenciaHojas() {

        PERMANENCIA_DE_LAS_HOJAS = new ArrayList<>();
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("SUB-PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("SUB-PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("SUB-PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("SUB-PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("SUB-PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("SUB-PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("SUB-PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("SUB-PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("SUB-PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("CADUCO");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");
        PERMANENCIA_DE_LAS_HOJAS.add("PERENNE");



    }

    private void setTallaImagen() {

        TALLA_P_IMAGEN = new ArrayList<>();

        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("CHICO");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("CHICO");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("CHICO");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("CHICO");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("CHICO");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("CHICO");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("CHICO");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("CHICO");
        TALLA_P_IMAGEN.add("CHICO");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("CHICO");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("CHICO");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("CHICO");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("CHICO");
        TALLA_P_IMAGEN.add("CHICO");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("CHICO");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("CHICO");
        TALLA_P_IMAGEN.add("GRANDE");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("MEDIANO");
        TALLA_P_IMAGEN.add("GRANDE");



    }

    public void setNOM(){

        NOM = new ArrayList<>();
        

    }

    public void setOrigen(){

        ORIGEN = new ArrayList<>();

        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("NATURALIZADA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATURALIZADA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("ENDÉMICA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("NATIVA");
        ORIGEN.add("INTRODUCIDA");
        ORIGEN.add("NATIVA");

    }

    public void setFamilia(){
        FAMILIA = new ArrayList<>();

        FAMILIA.add("FABACEAE");
        FAMILIA.add("MALVACEAE");
        FAMILIA.add("LAURACEAE");
        FAMILIA.add("APOCYNACEAE");
        FAMILIA.add("MORACEAE");
        FAMILIA.add("FABACEAE");
        FAMILIA.add("COMBRETACEAE");
        FAMILIA.add("MALVACEAE");
        FAMILIA.add("BORAGINACEAE");
        FAMILIA.add("ANNONACEAE");
        FAMILIA.add("ARAUCARIACEAE");
        FAMILIA.add("FABACEAE");
        FAMILIA.add("ARECACEAE");
        FAMILIA.add("FABACEAE");
        FAMILIA.add("SAPOTACEAE");
        FAMILIA.add("APOCYNACEAE");
        FAMILIA.add("MELIACEAE");
        FAMILIA.add("MUNTINGIACEAE");
        FAMILIA.add("OXALIDACEAE");
        FAMILIA.add("FABACEAE");
        FAMILIA.add("MELIACEAE");
        FAMILIA.add("MALVACEAE");
        FAMILIA.add("SAPOTACEAE");
        FAMILIA.add("FABACEAE");
        FAMILIA.add("ANACARDIACEAE");
        FAMILIA.add("ARECACEAE");
        FAMILIA.add("ANNONACEAE");
        FAMILIA.add("ARECACEAE");
        FAMILIA.add("RUBIACEAE");
        FAMILIA.add("NOLINACEAE");
        FAMILIA.add("POLYGONACEAE");
        FAMILIA.add("FABACEAE");
        FAMILIA.add("FABACEAE");
        FAMILIA.add("APOCYNACEAE");
        FAMILIA.add("PHYLLANTHACEAE");
        FAMILIA.add("MALVACEAE");
        FAMILIA.add("FABACEAE");
        FAMILIA.add("ANNONACEAE");
        FAMILIA.add("FABACEAE");
        FAMILIA.add("ARECACEAE");
        FAMILIA.add("ARECACEAE");
        FAMILIA.add("ARECACEAE");
        FAMILIA.add("URTICACEAE");
        FAMILIA.add("MYRTACEAE");
        FAMILIA.add("BIGNONIACEAE");
        FAMILIA.add("ZYGOPHYLLACEAE");
        FAMILIA.add("BIGNONIACEAE");
        FAMILIA.add("SAPINDACEAE");
        FAMILIA.add("MORACEAE");
        FAMILIA.add("SAPINDACEAE");
        FAMILIA.add("MORACEAE");
        FAMILIA.add("FABACEAE");
        FAMILIA.add("SAPINDACEAE");
        FAMILIA.add("BIGNONIACEAE");
        FAMILIA.add("BIGNONIACEAE");
        FAMILIA.add("SAPOTACEAE");
        FAMILIA.add("ARECACEAE");
        FAMILIA.add("MORACEAE");
        FAMILIA.add("MORACEAE");
        FAMILIA.add("RUTACEAE");
        FAMILIA.add("RUTACEAE");
        FAMILIA.add("FABACEAE");
        FAMILIA.add("BIGNONIACEAE");
        FAMILIA.add("BIXACEAE");
        FAMILIA.add("SAPOTACEAE");
        FAMILIA.add("RUTACEAE");
        FAMILIA.add("ANACARDIACEAE");
        FAMILIA.add("CAPPARACEAE");
        FAMILIA.add("MORACEAE");
        FAMILIA.add("MORINGACEAE");
        FAMILIA.add("FABACEAE");
        FAMILIA.add("BORAGINACEAE");
        FAMILIA.add("EBENACEAE");
        FAMILIA.add("FABACEAE");
        FAMILIA.add("FABACEAE");
        FAMILIA.add("ARECACEAE");
        FAMILIA.add("MALPIGHIACEAE");
        FAMILIA.add("RUTACEAE");
        FAMILIA.add("RUTACEAE");
        FAMILIA.add("MELIACEAE");
        FAMILIA.add("ARECACEAE");
        FAMILIA.add("ARECACEAE");
        FAMILIA.add("ARECACEAE");
        FAMILIA.add("ARECACEAE");
        FAMILIA.add("BURSERACEAE");
        FAMILIA.add("SIMAROUBACEAE");
        FAMILIA.add("MALVACEAE");
        FAMILIA.add("MORACEAE");
        FAMILIA.add("BORAGINACEAE");
        FAMILIA.add("ANNONACEAE");
        FAMILIA.add("BORAGINACEAE");
        FAMILIA.add("FABACEAE");
        FAMILIA.add("BIGNONIACEAE");
        FAMILIA.add("FABACEAE");
        FAMILIA.add("FABACEAE");
        FAMILIA.add("POLYGONACEAE");
        FAMILIA.add("FABACEAE");
        FAMILIA.add("AGAVACEAE");
        FAMILIA.add("EBENACEAE");

    }
    public void setOtrosNombresComunes(){
        OTROS_NOMBRES_COMUNES = new ArrayList<>();

        OTROS_NOMBRES_COMUNES.add("ÁRBOL-DE-SIRIS, CABELLOS-DE-ÁNGEL");
        OTROS_NOMBRES_COMUNES.add("JONOTE");
        OTROS_NOMBRES_COMUNES.add("AGUACATE-DEL-PAÍS");
        OTROS_NOMBRES_COMUNES.add("AKITS-AKITS-DE-PLAYA, CAMPANILLA");
        OTROS_NOMBRES_COMUNES.add("AMATE-NEGRO");
        OTROS_NOMBRES_COMUNES.add("SAMÁN");
        OTROS_NOMBRES_COMUNES.add("NA");
        OTROS_NOMBRES_COMUNES.add("COQUITO, CLAVELLINA");
        OTROS_NOMBRES_COMUNES.add("ANACAHUITE, SIRICOTE-DE-PLAYA");
        OTROS_NOMBRES_COMUNES.add("CHIRIMOYA");
        OTROS_NOMBRES_COMUNES.add("PINO DE NORFOLK");
        OTROS_NOMBRES_COMUNES.add("PATA-DE-VACA");
        OTROS_NOMBRES_COMUNES.add("PALMA-DE-FRUTOS-DE-ORO");
        OTROS_NOMBRES_COMUNES.add("NA");
        OTROS_NOMBRES_COMUNES.add("NA");
        OTROS_NOMBRES_COMUNES.add("NI'KEEH (MAYA)");
        OTROS_NOMBRES_COMUNES.add("CAMPANILLA (ESPAÑOL); SAK-IITS (MAYA)");
        OTROS_NOMBRES_COMUNES.add("CAOBO (ESPAÑOL); KANAK-CHE' (MAYA)");
        OTROS_NOMBRES_COMUNES.add("CAPULINCILLO");
        OTROS_NOMBRES_COMUNES.add("CARAMBOLO");
        OTROS_NOMBRES_COMUNES.add("BOX-KASSIM, BOX-CATZIN, CATZIM, KAATSIM, KATSIM, YA'AX-KASSIM, YAXCATZIM (MAYA)");
        OTROS_NOMBRES_COMUNES.add("CEDRO-COLORADO (ESPAÑOL); K'UUY-CHE' (MAYA)");
        OTROS_NOMBRES_COMUNES.add("POCHOTE");
        OTROS_NOMBRES_COMUNES.add("CHICLE, ZAPOTE (ESPAÑOL); CHI'-KÉEJ, YA' (MAYA)");
        OTROS_NOMBRES_COMUNES.add("NA");
        OTROS_NOMBRES_COMUNES.add("CIRUELO");
        OTROS_NOMBRES_COMUNES.add("PALMA-DE-COCO");
        OTROS_NOMBRES_COMUNES.add("PALO-DE-CORCHO (ESPAÑOL); MAK'CHE, HMAAK' (MAYA)");
        OTROS_NOMBRES_COMUNES.add("COCOYOL");
        OTROS_NOMBRES_COMUNES.add("TINTA-CHE', CRUZ-K'IIX (ESPAÑOL-MAYA); KAJAL-K'AAX, PEECH-KITAM, PUUTS'-CHE' (MAYA)");
        OTROS_NOMBRES_COMUNES.add("PATA-DE-ELEFANTE");
        OTROS_NOMBRES_COMUNES.add("SAK-TS'IITS'ILCHE' (MAYA)");
        OTROS_NOMBRES_COMUNES.add("TABACHÍN, MALINCHE");
        OTROS_NOMBRES_COMUNES.add("FLAMBOYÁN-DORADO");
        OTROS_NOMBRES_COMUNES.add("NA");
        OTROS_NOMBRES_COMUNES.add("NA");
        OTROS_NOMBRES_COMUNES.add("GUÁCIMO (ESPAÑOL); KABAL-PIXOY (MAYA)");
        OTROS_NOMBRES_COMUNES.add("NA");
        OTROS_NOMBRES_COMUNES.add("CABEZA-DE-NEGRO, ANONO");
        OTROS_NOMBRES_COMUNES.add("OREJÓN, CONACASTE, PAROTA");
        OTROS_NOMBRES_COMUNES.add("NA");
        OTROS_NOMBRES_COMUNES.add("CH'IIT-XA'AN (MAYA)");
        OTROS_NOMBRES_COMUNES.add("GUANO (ESPAÑOL); XA'AN (MAYA), HUANO MACHO");
        OTROS_NOMBRES_COMUNES.add("SAK-K'OOCH, K'OOCH-LE' (MAYA)");
        OTROS_NOMBRES_COMUNES.add("GUAYABO");
        OTROS_NOMBRES_COMUNES.add("PALO-SANTO");
        OTROS_NOMBRES_COMUNES.add("MAKULIS-AMARILLO");
        OTROS_NOMBRES_COMUNES.add("PRIMAVERA (ESPAÑOL); MAUCHE', K'AN-LOOL, L'AN-LOOL-K'AAX (MAYA)");
        OTROS_NOMBRES_COMUNES.add("MAMONCILLO");
        OTROS_NOMBRES_COMUNES.add("ÁLAMO (ESPAÑOL); KOPO'-CH'IIN (MAYA)");
        OTROS_NOMBRES_COMUNES.add("GUAYA, HUAYA-PAÍS, HUAYA-DE-MONTE (ESPAÑOL); HUAYUM (MAYA)");
        OTROS_NOMBRES_COMUNES.add("GOMERO, ÁRBOL-DE-CAUCHO");
        OTROS_NOMBRES_COMUNES.add("BARBASCO");
        OTROS_NOMBRES_COMUNES.add("SIIJUM (MAYA)");
        OTROS_NOMBRES_COMUNES.add("GÜIRO (ESPAÑOL); WAAS (MAYA)");
        OTROS_NOMBRES_COMUNES.add("GUIRO-DE-LOS-PETENES, CABEZA-DE-GUIRO");
        OTROS_NOMBRES_COMUNES.add("K'AB-CHE', XANOB-CHE' (MAYA)");
        OTROS_NOMBRES_COMUNES.add("MAMEY-DE-CAMPECHE, ZAPOTE-AMARILLO (ESPAÑOL); JA'AS-CHE', CHI'KÉEJ (MAYA)");
        OTROS_NOMBRES_COMUNES.add("K'AN-LOOL");
        OTROS_NOMBRES_COMUNES.add("PALMA-DE-MANILA, PALMERA-NAVIDEÑA");
        OTROS_NOMBRES_COMUNES.add("KITAM-CHE'");
        OTROS_NOMBRES_COMUNES.add("YUCATECO");
        OTROS_NOMBRES_COMUNES.add("NA");
        OTROS_NOMBRES_COMUNES.add("LIMA");
        OTROS_NOMBRES_COMUNES.add("NA");
        OTROS_NOMBRES_COMUNES.add("CAÑA-FÍSTULA");
        OTROS_NOMBRES_COMUNES.add("ROBLE, PALO-DE-ROSA (ESPAÑOL); JOKAB (MAYA)");
        OTROS_NOMBRES_COMUNES.add("NA");
        OTROS_NOMBRES_COMUNES.add("ZAPOTE-MAMEY, MAMEY-COLORADO");
        OTROS_NOMBRES_COMUNES.add("NA");
        OTROS_NOMBRES_COMUNES.add("NA");
        OTROS_NOMBRES_COMUNES.add("TRES-MARÍAS (ESPAÑOL); YUUY, KIS, KOOK-CHE' (MAYA)");
        OTROS_NOMBRES_COMUNES.add("PALO-MORAL");
        OTROS_NOMBRES_COMUNES.add("NA");
        OTROS_NOMBRES_COMUNES.add("KNACÁS, PALMERA-PLATEADA ");
        OTROS_NOMBRES_COMUNES.add("NANCE-AMARILLO");
        OTROS_NOMBRES_COMUNES.add("NA");
        OTROS_NOMBRES_COMUNES.add("NA");
        OTROS_NOMBRES_COMUNES.add("NIM");
        OTROS_NOMBRES_COMUNES.add("PALMA-BUCANERO, PALMA-DE-GUINEA (ESPAÑOL); YA'AX JALALCHE'(MAYA).");
        OTROS_NOMBRES_COMUNES.add("PALMA-BOTELLA");
        OTROS_NOMBRES_COMUNES.add("PALMA-BLANCA");
        OTROS_NOMBRES_COMUNES.add("DATILERA");
        OTROS_NOMBRES_COMUNES.add("NA");
        OTROS_NOMBRES_COMUNES.add("NEGRITO (ESPAÑOL); PAJ-SAK-IIL (MAYA)");
        OTROS_NOMBRES_COMUNES.add("NA");
        OTROS_NOMBRES_COMUNES.add("NUEZ-MAYA");
        OTROS_NOMBRES_COMUNES.add("NA");
        OTROS_NOMBRES_COMUNES.add("SAK-BOJ (MAYA)");
        OTROS_NOMBRES_COMUNES.add("SARAMUYO-BLANCO");
        OTROS_NOMBRES_COMUNES.add("CIRICOTE, CÓMPITE (ESPAÑOL); K'AN-K'OOPTE (MAYA)");
        OTROS_NOMBRES_COMUNES.add("NA");
        OTROS_NOMBRES_COMUNES.add("SAUCO-AMARILLO");
        OTROS_NOMBRES_COMUNES.add("NA");
        OTROS_NOMBRES_COMUNES.add("GUAJE (ESPAÑOL); HUAXIM (MAYA)");
        OTROS_NOMBRES_COMUNES.add("UVA-DE-PLAYA, UVA DE MAR");
        OTROS_NOMBRES_COMUNES.add("BRAZIL, BRAZILETO");
        OTROS_NOMBRES_COMUNES.add("IZOTE, IZOTL (ESPAÑOL); SAK-TUK, X-TUK (MAYA)");
        OTROS_NOMBRES_COMUNES.add("ZAPOTE-PRIETO");




    }

    public void setNombreComun(){
        NOMBRE_COMUN = new ArrayList<>();

        NOMBRE_COMUN.add("ACACIA-AMARILLA");
        NOMBRE_COMUN.add("ADÁN");
        NOMBRE_COMUN.add("AGUACATE");
        NOMBRE_COMUN.add("AKITS");
        NOMBRE_COMUN.add("ÁLAMO");
        NOMBRE_COMUN.add("ALGARROBO-NEGRO");
        NOMBRE_COMUN.add("ALMENDRO");
        NOMBRE_COMUN.add("AMAPOLA");
        NOMBRE_COMUN.add("ANACAHUITA");
        NOMBRE_COMUN.add("ANONA");
        NOMBRE_COMUN.add("ARAUCARIA");
        NOMBRE_COMUN.add("ÁRBOL-DE-ORQUÍDEA");
        NOMBRE_COMUN.add("ARECA");
        NOMBRE_COMUN.add("BALCHÉ");
        NOMBRE_COMUN.add("TAKINCHÉ");
        NOMBRE_COMUN.add("CAIMITO");
        NOMBRE_COMUN.add("CAMPANITA");
        NOMBRE_COMUN.add("CAOBA");
        NOMBRE_COMUN.add("CAPULÍN");
        NOMBRE_COMUN.add("CARAMBOLA");
        NOMBRE_COMUN.add("CATZIM-NEGRO");
        NOMBRE_COMUN.add("CEDRO");
        NOMBRE_COMUN.add("CEIBA");
        NOMBRE_COMUN.add("ZAPOTE");
        NOMBRE_COMUN.add("CHUKUM");
        NOMBRE_COMUN.add("CIRUELA");
        NOMBRE_COMUN.add("COCOTERO");
        NOMBRE_COMUN.add("CORCHO");
        NOMBRE_COMUN.add("COCOYOL");
        NOMBRE_COMUN.add("CRUZ-KIX");
        NOMBRE_COMUN.add("DESPEINADA");
        NOMBRE_COMUN.add("DZIDZILCHÉ");
        NOMBRE_COMUN.add("FLAMBOYÁN");
        NOMBRE_COMUN.add("FLAMBOYÁN-AMARILLO");
        NOMBRE_COMUN.add("FLOR-DE-MAYO");
        NOMBRE_COMUN.add("GROSELLA");
        NOMBRE_COMUN.add("PIXOY");
        NOMBRE_COMUN.add("TSIUCHÉ");
        NOMBRE_COMUN.add("GUANÁBANA");
        NOMBRE_COMUN.add("PICH");
        NOMBRE_COMUN.add("HUANO-BON");
        NOMBRE_COMUN.add("CHIT");
        NOMBRE_COMUN.add("HUANO-JULOK");
        NOMBRE_COMUN.add("GUARUMBO");
        NOMBRE_COMUN.add("GUAYABA");
        NOMBRE_COMUN.add("GUAYACÁN");
        NOMBRE_COMUN.add("GUAYACÁN-AMARILLO");
        NOMBRE_COMUN.add("AJAWCHÉ (MAKULÍS-AMARILLO)");
        NOMBRE_COMUN.add("HUAYA-CUBANA");
        NOMBRE_COMUN.add("HIGO-GRANDE");
        NOMBRE_COMUN.add("HUAYA INDIA");
        NOMBRE_COMUN.add("HULE");
        NOMBRE_COMUN.add("JABÍN");
        NOMBRE_COMUN.add("JABONCILLO");
        NOMBRE_COMUN.add("JÍCARA");
        NOMBRE_COMUN.add("JICARITO");
        NOMBRE_COMUN.add("KAKALCHÉ");
        NOMBRE_COMUN.add("KANISTÉ");
        NOMBRE_COMUN.add("KANJABÍN");
        NOMBRE_COMUN.add("KERPIS");
        NOMBRE_COMUN.add("KITAMCHÉ");
        NOMBRE_COMUN.add("LAUREL");
        NOMBRE_COMUN.add("LAUREL-DE-LA-INDIA");
        NOMBRE_COMUN.add("LIMÓN");
        NOMBRE_COMUN.add("LIMÓN-PERSA");
        NOMBRE_COMUN.add("LLUVIA-DE-ORO");
        NOMBRE_COMUN.add("MAKULÍS");
        NOMBRE_COMUN.add("CHUUN");
        NOMBRE_COMUN.add("MAMEY");
        NOMBRE_COMUN.add("MANDARINA");
        NOMBRE_COMUN.add("MANGO");
        NOMBRE_COMUN.add("KOLOMAX");
        NOMBRE_COMUN.add("MORA");
        NOMBRE_COMUN.add("MORINGA");
        NOMBRE_COMUN.add("NAKAX");
        NOMBRE_COMUN.add("NANCE");
        NOMBRE_COMUN.add("NARANJA-AGRIA");
        NOMBRE_COMUN.add("NARANJA-DULCE");
        NOMBRE_COMUN.add("NIM");
        NOMBRE_COMUN.add("KUKÁ");
        NOMBRE_COMUN.add("PALMA-REAL");
        NOMBRE_COMUN.add("PALMERA-WASHINGTONIA");
        NOMBRE_COMUN.add("PALMERA-DATILERA");
        NOMBRE_COMUN.add("CHAKÁ");
        NOMBRE_COMUN.add("PASAK");
        NOMBRE_COMUN.add("POCHOTE");
        NOMBRE_COMUN.add("RAMÓN");
        NOMBRE_COMUN.add("ROBLE");
        NOMBRE_COMUN.add("BAKALCHÉ");
        NOMBRE_COMUN.add("SARAMUYO");
        NOMBRE_COMUN.add("SIRICOTE");
        NOMBRE_COMUN.add("TAMARINDO");
        NOMBRE_COMUN.add("XKANLOL");
        NOMBRE_COMUN.add("TSALAM");
        NOMBRE_COMUN.add("WAXIM");
        NOMBRE_COMUN.add("UVA-PLAYERA");
        NOMBRE_COMUN.add("CHAKTÉ-VIGA");
        NOMBRE_COMUN.add("TUK");
        NOMBRE_COMUN.add("ZAPOTE-NEGRO");




    }

    public void setNombreComunMaya(){

        NOMBRE_COMUN_MAYA = new ArrayList<>();

        NOMBRE_COMUN_MAYA.add("NA");
        NOMBRE_COMUN_MAYA.add("JOOLOL");
        NOMBRE_COMUN_MAYA.add("ON");
        NOMBRE_COMUN_MAYA.add("AAK'ITS");
        NOMBRE_COMUN_MAYA.add("KOPO'");
        NOMBRE_COMUN_MAYA.add("NA");
        NOMBRE_COMUN_MAYA.add("NA");
        NOMBRE_COMUN_MAYA.add("K'UUY-CHE'");
        NOMBRE_COMUN_MAYA.add("SAK-K'OOPTE'");
        NOMBRE_COMUN_MAYA.add("K'AN-OP");
        NOMBRE_COMUN_MAYA.add("NA");
        NOMBRE_COMUN_MAYA.add("NA");
        NOMBRE_COMUN_MAYA.add("NA");
        NOMBRE_COMUN_MAYA.add("BAAL-CHE'");
        NOMBRE_COMUN_MAYA.add("TAA-K'IN-CHE'");
        NOMBRE_COMUN_MAYA.add("CHI'KÉEJ");
        NOMBRE_COMUN_MAYA.add("AAK'ITS");
        NOMBRE_COMUN_MAYA.add("PUNAB");
        NOMBRE_COMUN_MAYA.add("NA");
        NOMBRE_COMUN_MAYA.add("NA");
        NOMBRE_COMUN_MAYA.add("BOX-KAATSIM");
        NOMBRE_COMUN_MAYA.add("KU-CHE'");
        NOMBRE_COMUN_MAYA.add("YA'AX-CHE'");
        NOMBRE_COMUN_MAYA.add("CHAK-YA'");
        NOMBRE_COMUN_MAYA.add("CHUKUM");
        NOMBRE_COMUN_MAYA.add("CHAK-ABAL");
        NOMBRE_COMUN_MAYA.add("NA");
        NOMBRE_COMUN_MAYA.add("MAK'");
        NOMBRE_COMUN_MAYA.add("TUK'");
        NOMBRE_COMUN_MAYA.add("KAJAL-K'AAX, PEECH-KITAM, PUUTS'-CHE' (MAYA)");
        NOMBRE_COMUN_MAYA.add("TS'IIPIL");
        NOMBRE_COMUN_MAYA.add("TS'IITS'ILCHE'");
        NOMBRE_COMUN_MAYA.add("NA");
        NOMBRE_COMUN_MAYA.add("NA");
        NOMBRE_COMUN_MAYA.add("CHAK-NIKTE'");
        NOMBRE_COMUN_MAYA.add("NA");
        NOMBRE_COMUN_MAYA.add("PIXOY");
        NOMBRE_COMUN_MAYA.add("TS'IUCHE'");
        NOMBRE_COMUN_MAYA.add("TAK'OB");
        NOMBRE_COMUN_MAYA.add("PIICH");
        NOMBRE_COMUN_MAYA.add("BON-XA'AN");
        NOMBRE_COMUN_MAYA.add("CH'IIT");
        NOMBRE_COMUN_MAYA.add("JULOK'-XA'AN");
        NOMBRE_COMUN_MAYA.add("K'OOCH-K'AAX");
        NOMBRE_COMUN_MAYA.add("PICHI");
        NOMBRE_COMUN_MAYA.add("NA");
        NOMBRE_COMUN_MAYA.add("NA");
        NOMBRE_COMUN_MAYA.add("JAJAUCHE'");
        NOMBRE_COMUN_MAYA.add("NA");
        NOMBRE_COMUN_MAYA.add("AKÚUN");
        NOMBRE_COMUN_MAYA.add("WAYUM");
        NOMBRE_COMUN_MAYA.add("NA");
        NOMBRE_COMUN_MAYA.add("JA'ABIN");
        NOMBRE_COMUN_MAYA.add("SIBUL");
        NOMBRE_COMUN_MAYA.add("LUUCH");
        NOMBRE_COMUN_MAYA.add("NA");
        NOMBRE_COMUN_MAYA.add("K'AAKALCHE'");
        NOMBRE_COMUN_MAYA.add("K'ANISTE'");
        NOMBRE_COMUN_MAYA.add("K'AAN-JA'ABIN");
        NOMBRE_COMUN_MAYA.add("NA");
        NOMBRE_COMUN_MAYA.add("KITIM-CHE'");
        NOMBRE_COMUN_MAYA.add("NA");
        NOMBRE_COMUN_MAYA.add("NA");
        NOMBRE_COMUN_MAYA.add("NA");
        NOMBRE_COMUN_MAYA.add("NA");
        NOMBRE_COMUN_MAYA.add("NA");
        NOMBRE_COMUN_MAYA.add("JOK'-AB-MAK'ULIS");
        NOMBRE_COMUN_MAYA.add("CHUUN");
        NOMBRE_COMUN_MAYA.add("CHAKAL-JA'AS");
        NOMBRE_COMUN_MAYA.add("NA");
        NOMBRE_COMUN_MAYA.add("NA");
        NOMBRE_COMUN_MAYA.add("K'OLO'MA'AX");
        NOMBRE_COMUN_MAYA.add("CHAK-OOX");
        NOMBRE_COMUN_MAYA.add("NA");
        NOMBRE_COMUN_MAYA.add("NÁAJ-K'AAX");
        NOMBRE_COMUN_MAYA.add("CHI'");
        NOMBRE_COMUN_MAYA.add("SU'UTS'-PAK'AAL");
        NOMBRE_COMUN_MAYA.add("PAK'-AAL");
        NOMBRE_COMUN_MAYA.add("NA");
        NOMBRE_COMUN_MAYA.add("KUKA'");
        NOMBRE_COMUN_MAYA.add("NA");
        NOMBRE_COMUN_MAYA.add("NA");
        NOMBRE_COMUN_MAYA.add("NA");
        NOMBRE_COMUN_MAYA.add("CHAKAJ");
        NOMBRE_COMUN_MAYA.add("PA'-SAK'");
        NOMBRE_COMUN_MAYA.add("PÍIN");
        NOMBRE_COMUN_MAYA.add("OOX");
        NOMBRE_COMUN_MAYA.add("BEEK");
        NOMBRE_COMUN_MAYA.add("BAKAL-CHE'");
        NOMBRE_COMUN_MAYA.add("TS'ALMUY");
        NOMBRE_COMUN_MAYA.add("CHAK-K'OOPTE");
        NOMBRE_COMUN_MAYA.add("PAH'CH'UHUK");
        NOMBRE_COMUN_MAYA.add("XK'ANLOL");
        NOMBRE_COMUN_MAYA.add("TSALAM");
        NOMBRE_COMUN_MAYA.add("WAAXIM");
        NOMBRE_COMUN_MAYA.add("NI'-CHE'");
        NOMBRE_COMUN_MAYA.add("CHAK-TE'");
        NOMBRE_COMUN_MAYA.add("TUK");
        NOMBRE_COMUN_MAYA.add("TA'UCH");


    }

    public void setNombreCientifico(){
        NOMBRE_CIENTIFICO = new ArrayList<>();

        NOMBRE_CIENTIFICO.add("Albizia-lebbeck");
        NOMBRE_CIENTIFICO.add("Heliocarpus-donnellsmithii");
        NOMBRE_CIENTIFICO.add("Persea-americana");
        NOMBRE_CIENTIFICO.add("Cascabela-gaumeri");
        NOMBRE_CIENTIFICO.add("Ficus-cotinifolia");
        NOMBRE_CIENTIFICO.add("Samanea-saman");
        NOMBRE_CIENTIFICO.add("Terminalia-catappa");
        NOMBRE_CIENTIFICO.add("Pseudobombax-ellipticum");
        NOMBRE_CIENTIFICO.add("Cordia-sebestena");
        NOMBRE_CIENTIFICO.add("Annona-reticulata");
        NOMBRE_CIENTIFICO.add("Araucaria-heterophylla");
        NOMBRE_CIENTIFICO.add("Bauhinia-variegata");
        NOMBRE_CIENTIFICO.add("Dypsis-lutescens");
        NOMBRE_CIENTIFICO.add("Lonchocarpus-punctatus");
        NOMBRE_CIENTIFICO.add("Caesalpinia-yucatanensis");
        NOMBRE_CIENTIFICO.add("Chrysophyllum-cainito");
        NOMBRE_CIENTIFICO.add("Cascabela-thevetia");
        NOMBRE_CIENTIFICO.add("Swietenia-macrophylla");
        NOMBRE_CIENTIFICO.add("Muntingia-calabura");
        NOMBRE_CIENTIFICO.add("Averrhoa-carambola");
        NOMBRE_CIENTIFICO.add("Senegalia-gaumeri");
        NOMBRE_CIENTIFICO.add("Cedrela-odorata");
        NOMBRE_CIENTIFICO.add("Ceiba-pentandra");
        NOMBRE_CIENTIFICO.add("Manilkara-zapota");
        NOMBRE_CIENTIFICO.add("Havardia-albicans");
        NOMBRE_CIENTIFICO.add("Spondias-purpurea");
        NOMBRE_CIENTIFICO.add("Cocos-nucifera");
        NOMBRE_CIENTIFICO.add("Annona-glabra");
        NOMBRE_CIENTIFICO.add("Acrocomia-aculeata");
        NOMBRE_CIENTIFICO.add("Randia-aculeata");
        NOMBRE_CIENTIFICO.add("Beaucarnea-pliabilis");
        NOMBRE_CIENTIFICO.add("Gymnopodium-floribundum");
        NOMBRE_CIENTIFICO.add("Delonix-regia");
        NOMBRE_CIENTIFICO.add("Peltophorum-pterocarpum");
        NOMBRE_CIENTIFICO.add("Plumeria-rubra");
        NOMBRE_CIENTIFICO.add("Phyllantus-acidus");
        NOMBRE_CIENTIFICO.add("Guazuma-ulmifolia");
        NOMBRE_CIENTIFICO.add("Pithecellobium-dulce");
        NOMBRE_CIENTIFICO.add("Annona-muricata");
        NOMBRE_CIENTIFICO.add("Enterolobium-cyclocarpum");
        NOMBRE_CIENTIFICO.add("Sabal-mexicana");
        NOMBRE_CIENTIFICO.add("Thrinax-radiata");
        NOMBRE_CIENTIFICO.add("Sabal-yapa");
        NOMBRE_CIENTIFICO.add("Cecropia-peltata");
        NOMBRE_CIENTIFICO.add("Psidium-guajava");
        NOMBRE_CIENTIFICO.add("Guaiacum-sanctum");
        NOMBRE_CIENTIFICO.add("Tabebuia-guayacan");
        NOMBRE_CIENTIFICO.add("Tabebuia-chrysantha");
        NOMBRE_CIENTIFICO.add("Melicoccus-bijugatus");
        NOMBRE_CIENTIFICO.add("Ficus-maxima");
        NOMBRE_CIENTIFICO.add("Melicoccus-oliviformis");
        NOMBRE_CIENTIFICO.add("Ficus-elastica");
        NOMBRE_CIENTIFICO.add("Piscidia-piscipula");
        NOMBRE_CIENTIFICO.add("Sapindus-saponaria");
        NOMBRE_CIENTIFICO.add("Crescentia-cujete");
        NOMBRE_CIENTIFICO.add("Amphitecna-latifolia");
        NOMBRE_CIENTIFICO.add("Diospyros-anisandra");
        NOMBRE_CIENTIFICO.add("Pouteria-campechiana");
        NOMBRE_CIENTIFICO.add("Senna-racemosa");
        NOMBRE_CIENTIFICO.add("Adonidia-merilli");
        NOMBRE_CIENTIFICO.add("Caesalpinia-gaumeri");
        NOMBRE_CIENTIFICO.add("Ficus-microcarpa");
        NOMBRE_CIENTIFICO.add("Ficus-benjamina");
        NOMBRE_CIENTIFICO.add("Citrus-aurantiaca");
        NOMBRE_CIENTIFICO.add("Citrus-latifolia");
        NOMBRE_CIENTIFICO.add("Cassia-fistula");
        NOMBRE_CIENTIFICO.add("Tabebuia-rosea");
        NOMBRE_CIENTIFICO.add("Cochlospermum-vitifolium");
        NOMBRE_CIENTIFICO.add("Pouteria-sapota");
        NOMBRE_CIENTIFICO.add("Citrus-reticulata");
        NOMBRE_CIENTIFICO.add("Mangifera-indica");
        NOMBRE_CIENTIFICO.add("Crateva-tapia");
        NOMBRE_CIENTIFICO.add("Maclura-tinctoria");
        NOMBRE_CIENTIFICO.add("Moringa-oleifera");
        NOMBRE_CIENTIFICO.add("Coccothrinax-readii");
        NOMBRE_CIENTIFICO.add("Byrsonima-crassifolia");
        NOMBRE_CIENTIFICO.add("Citrus-aurantium");
        NOMBRE_CIENTIFICO.add("Citrus-sinensis");
        NOMBRE_CIENTIFICO.add("Azadirachta-indica");
        NOMBRE_CIENTIFICO.add("Pseudophoenix-sargentii");
        NOMBRE_CIENTIFICO.add("Roystonea-regia");
        NOMBRE_CIENTIFICO.add("Washingtonia-robusta");
        NOMBRE_CIENTIFICO.add("Phoenix-dactylifera");
        NOMBRE_CIENTIFICO.add("Bursera-simaruba");
        NOMBRE_CIENTIFICO.add("Simarouba-amara");
        NOMBRE_CIENTIFICO.add("Ceiba-aesculifolia");
        NOMBRE_CIENTIFICO.add("Brosimum-alicastrum");
        NOMBRE_CIENTIFICO.add("Ehretia-tinifolia");
        NOMBRE_CIENTIFICO.add("Bourreria-pulchra");
        NOMBRE_CIENTIFICO.add("Annona-squamosa");
        NOMBRE_CIENTIFICO.add("Cordia-dodecandra");
        NOMBRE_CIENTIFICO.add("Tamarindus-indica");
        NOMBRE_CIENTIFICO.add("Tecoma-stans");
        NOMBRE_CIENTIFICO.add("Lysiloma-latisiliquum");
        NOMBRE_CIENTIFICO.add("Leucaena-leucocephala");
        NOMBRE_CIENTIFICO.add("Coccoloba-uvifera");
        NOMBRE_CIENTIFICO.add("Caesalpinia-mollis");
        NOMBRE_CIENTIFICO.add("Yucca-elephantipes");
        NOMBRE_CIENTIFICO.add("Diospyros-digyna");
    }


    public ArrayList getNombreCientifico(){

        return NOMBRE_CIENTIFICO;

    }


    public int Buscar(String nombre) {
        int position = -1;

        //buscar en nombre comun
        position = BuscarNOMBRE_COMUN(nombre);
        //buscar en nombre cientifico
        if(position == -1){
            position = BuscarNOMBRE_CIENTIFICO(nombre);
        }
        if(position == -1){
            position = BuscarNOMBRE_MAYA(nombre);
        }
        if(position == -1){
            position = BuscarNOMBRE_OTROS_NOMBRES_COMUNES(nombre);
        }

        return position;

    }

    private int BuscarNOMBRE_OTROS_NOMBRES_COMUNES(String nombre) {
        int position = -1;
        setOtrosNombresComunes();
        for(int i=0;i<OTROS_NOMBRES_COMUNES.size();i++){
            if(OTROS_NOMBRES_COMUNES.get(i).toUpperCase().equals(nombre)){
                position = i;
            }
        }
        return position;
    }

    private int BuscarNOMBRE_MAYA(String nombre) {
        int position = -1;
        setNombreComunMaya();
        for(int i=0;i<NOMBRE_COMUN_MAYA.size();i++){
            if(NOMBRE_COMUN_MAYA.get(i).toUpperCase().equals(nombre)){
                position = i;
            }
        }
        return position;
    }

    public int BuscarNOMBRE_CIENTIFICO(String nombre) {
        int position = -1;
        setNombreCientifico();
        for(int i=0;i<NOMBRE_CIENTIFICO.size();i++){
            if(NOMBRE_CIENTIFICO.get(i).toUpperCase().equals(nombre.toUpperCase())){
                position = i;
            }
        }
        return position;
    }

    private int BuscarNOMBRE_COMUN(String nombre) {
        int position = -1;
        setNombreComun();
        for(int i=0;i<NOMBRE_COMUN.size();i++){
            if(NOMBRE_COMUN.get(i).toUpperCase().equals(nombre)){
                position = i;
            }
        }
        return position;
    }

    public ArrayList<String> getFiltro(String hoja, String corteza, String flor) {
        setNombreCientifico();
        setTipoHoja();
        setCorteza();
        setColorFlor();
        ArrayList<String> arboles = new ArrayList<>();
        ArrayList<Integer> indices = new ArrayList<>();
        //filtrar por tipo de hoja
        if(corteza.equals("NA")){
            if(flor.equals("NA"))
            {
                for (int i = 0; i < TIPO_DE_HOJA.size(); i++) {
                    if (TIPO_DE_HOJA.get(i).equals(hoja)) {
                        indices.add(i);
                        arboles.add(NOMBRE_CIENTIFICO.get(i));
                    }
                }
            }
            else{
                for (int i = 0; i < TIPO_DE_HOJA.size(); i++) {
                    if (TIPO_DE_HOJA.get(i).equals(hoja) && FLOR_COLOR.get(i).contains(flor)) {
                        indices.add(i);
                        arboles.add(NOMBRE_CIENTIFICO.get(i));
                    }
                }

            }
        }
        else {
            if(flor.equals("NA"))
            {
                for (int i = 0; i < TIPO_DE_HOJA.size(); i++) {
                    if (TIPO_DE_HOJA.get(i).equals(hoja) && CORTEZA_ADULTA.get(i).equals(corteza)) {
                        indices.add(i);
                        arboles.add(NOMBRE_CIENTIFICO.get(i));
                    }
                }
            }
            else{
                for (int i = 0; i < TIPO_DE_HOJA.size(); i++) {
                    if (TIPO_DE_HOJA.get(i).equals(hoja) && CORTEZA_ADULTA.get(i).equals(corteza) && FLOR_COLOR.get(i).contains(flor)) {
                        indices.add(i);
                        arboles.add(NOMBRE_CIENTIFICO.get(i));
                    }
                }

            }

        }
        //filtrar por tipo de corteza



        return arboles;
    }

    public String getFLORACION(int position) {
        setFloracion();
        return FLORACION.get(position);
    }

    public String getFRUCTIFICACION(int position) {
        setFructificacion();
        return FRUCTIFICACION.get(position);
    }


    public int getNombreComunIndex(String especie) {
        int indice = 0;
        indice = NOMBRE_COMUN.indexOf(especie);
        return indice;
    }

*/
}
