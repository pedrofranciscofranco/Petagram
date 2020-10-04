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
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;



public class eladaptador extends RecyclerView.Adapter<eladaptador.DatosViewHolder>{

    ArrayList<Datos> Datos;



    public eladaptador(ArrayList<Datos> Datos){

        this.Datos = Datos;
    }


    @NonNull
    @Override
    public DatosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);

        return new DatosViewHolder(V);
    }

    @Override
    public void onBindViewHolder(@NonNull final DatosViewHolder holder, int position) {

        final Datos datos = Datos.get(position);
        holder.imganimales.setImageResource(datos.getFoto());
        holder.tvnombre.setText(datos.getNombredeanimal());
        holder.tvlike.setText(datos.getLike());
/*
        holder.imganimales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
      //          holder.imgAnimalesperfilmascota.setImageResource(datos.getFoto());
     //           PerfilMascota.fotitodeperfil= datos.getNombredeanimal();
       //         MainActivity.viewPager.setCurrentItem(1);

            }
        });

 */

/*
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PerfilMascota.fotitodeperfil=datos.getFoto();
                MainActivity.viewPager.setCurrentItem(1);
            }
        });

 */

/*

        holder.Iblike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(view.getContext(), "like a "+ datos.getNombredeanimal(), Toast.LENGTH_SHORT).show();

            }
        });

*/


    }

    @Override
    public int getItemCount() {
        return Datos.size();
    }

    public static class DatosViewHolder extends RecyclerView.ViewHolder{
//aqui se declara todos los elementos que se modifican del card que en este caso seria

        private ImageView imganimales;
        private TextView tvnombre;
        private TextView tvlike;
        private ImageButton Iblike;
        private CardView cardView;



        public DatosViewHolder(@NonNull View itemView) {
            super(itemView);
            imganimales = itemView.findViewById(R.id.imgAnimales);
            tvnombre    = itemView.findViewById(R.id.Tvnombre);
            tvlike      = itemView.findViewById(R.id.Tvlike);
            Iblike      = itemView.findViewById(R.id.IbHuesoblanco);
            cardView    = itemView.findViewById(R.id.cardview);




        }
    }


}
