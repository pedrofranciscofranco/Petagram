package com.example.petagram;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class fragmentrecycler extends Fragment {

    private RecyclerView petagram;
    ArrayList<Datos> Datos;
    int[] like = new int[9];



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        View v = inflater.inflate(R.layout.fragmentrecycler,container,false);

        petagram = v.findViewById(R.id.rvAnimalitos);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(RecyclerView.VERTICAL);
        petagram.setLayoutManager(llm);
        cargardatos();
        inicializaradaptador();


        return v;

    }


    public void inicializaradaptador(){

        eladaptador adaptator = new eladaptador(Datos);
        petagram.setAdapter(adaptator);
//        MainActivity.viewPager.setCurrentItem(1);    //para llamar a un fragmento en especifico de mi viewpager

    }

    public void cargardatos(){

        like[0]=0; //cabrita
        like[1]=1; //cerdito
        like[2]=0; //gatito
        like[3]=1; //perrito
        like[4]=1; //pinguino
        like[5]=1; //pollito
        like[6]=0; //ratoncito
        like[7]=1; //sapito
        like[8]=0; //zorrito

        Datos = new ArrayList<Datos>();

        Datos.add(new Datos(R.drawable.cabrita, ""+like[0], "Cabrita"));
        Datos.add(new Datos(R.drawable.cerdito, ""+like[1], "Cerdito"));
        Datos.add(new Datos(R.drawable.gatito, ""+like[2], "Gatito"));
        Datos.add(new Datos(R.drawable.perrito, ""+like[3], "Perrito"));
        Datos.add(new Datos(R.drawable.pinguino, ""+like[4], "Pinguinin"));
        Datos.add(new Datos(R.drawable.pollilto, ""+like[5], "PioPio"));
        Datos.add(new Datos(R.drawable.raton, ""+like[6], "Ratoncito"));
        Datos.add(new Datos(R.drawable.sapito, ""+like[7], "Sapin"));
        Datos.add(new Datos(R.drawable.zorro, ""+like[8], "Z"));

    }

}
