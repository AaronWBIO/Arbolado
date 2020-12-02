package wbio.app.arbolado;

import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder> {
    ArrayList<Integer> imagenes; //imagenes
    ArrayList<String> NombreCientifico; //nombres cientificos
    ArrayList<String> NombreComun;


    public MyRecyclerViewAdapter(ArrayList<String> nombreCientifico,ArrayList<String> nombreComun, ArrayList<Integer> arr) {
        this.imagenes = arr;
        this.NombreCientifico = nombreCientifico;
        this.NombreComun = nombreComun;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_view, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        //BaseDatos base = new BaseDatos();
        //int indice = base.BuscarNOMBRE_CIENTIFICO(NombreCientifico.get(position));

        String nombre_comun = NombreComun.get(position);
        String nombrecientifico = NombreCientifico.get(position)+"\n";

        //holder.imageView.setImageResource(arr.get(position));
//----------------------------------------------
        //ServerUrl url = new ServerUrl();
        String cadena =  NombreCientifico.get(position).toLowerCase().replace("-","_")+"_1";
        cadena = cadena.replace("á", "a");
        cadena = cadena.replace("é", "e");
        cadena = cadena.replace("í", "i");
        cadena = cadena.replace("ó", "o");

        String resID = ServerUrl.getUrlGaleria()+cadena+".jpg";
        Picasso.get().load(resID).placeholder(R.drawable.loading).resize(180,180).centerCrop().into(holder.imageView);
//----------------------------------------------
        holder.textView.setText(nombre_comun.replace("-"," "));
        holder.textView_cientifico.setText(nombrecientifico.replace("-"," "));
        //holder.textView.setGravity(Gravity.CENTER);

    }

    @Override
    public int getItemCount() {
        return NombreCientifico.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;
        TextView textView_cientifico;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);

            int ancho = 400;
            int alto = 400;
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ancho, alto);
            imageView.setLayoutParams(params);

            textView = itemView.findViewById(R.id.textView);
            textView_cientifico = itemView.findViewById(R.id.textView_cientifico);

        }
    }
}
