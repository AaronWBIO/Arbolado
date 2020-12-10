package wbio.app.arbolado;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class ServerUrl {


    String url;

    ServerUrl(){
        url ="http://arbolmid.monitoreoambiental.org";
    } //direccion del servidor NODE.js
    public String getUrl(){
        return this.url;
    }
    public static String getUrlImage(){return "https://www.plataformaciudadanacovid.com/Imagenes/";} //dirección imagenes "Aprende a Identificar"
    public static String getUrlGaleria(){return "https://www.plataformaciudadanacovid.com/galeria_arbolmid/";}//dirección imagenes "Catálogo árboles"
    public static String getUploadImageServer(){return "https://www.plataformaciudadanacovid.com/Arbolado/upload.php";}
    public static String getUrlServer(){return "http://arbolmid.monitoreoambiental.org";}
    //direccion de la base de datos mongo: mongodb+srv://aaron:root@cluster0.ub4h1.mongodb.net/test

}
