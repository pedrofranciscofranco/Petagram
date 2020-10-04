package com.example.petagram;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class eladaptador2 extends RecyclerView.Adapter<eladaptador2.DatosViewHolder>{

    ArrayList<Datos> Datos;

    public eladaptador2(ArrayList<Datos> Datos){

        this.Datos = Datos;
    }


    @NonNull
    @Override
    public DatosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.card2, parent, false);

        return new DatosViewHolder(V);
    }

    @Override
    public void onBindViewHolder(@NonNull final DatosViewHolder holder, int position) {

        final Datos datos = Datos.get(position);
        holder.imganimales.setImageResource(datos.getFoto());
        holder.tvlike.setText(datos.getLike());

    }

    @Override
    public int getItemCount() {
        return Datos.size();
    }

    public static class DatosViewHolder extends RecyclerView.ViewHolder{
//aqui se declara todos los elementos que se modifican del card que en este caso seria

        private ImageView imganimales;
        private TextView tvlike;



        public DatosViewHolder(@NonNull View itemView) {
            super(itemView);
            imganimales = itemView.findViewById(R.id.imgAnimalesperfilmascota);
            tvlike = itemView.findViewById(R.id.Tvlikeperfilmascota);



        }
    }


}