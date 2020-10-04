package com.example.petagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.material.appbar.MaterialToolbar;

import java.util.ArrayList;

public class favoritos5 extends AppCompatActivity {

    ArrayList<Datos> Datos;
    int[] like = new int[9];
    private RecyclerView petagram;
    private MaterialToolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos5);
        toolbar     = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        petagram = findViewById(R.id.rvfavoritos);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(RecyclerView.VERTICAL);
        petagram.setLayoutManager(llm);
        cargardatos();
        inicializaradaptador();


    }

    public void inicializaradaptador(){

        eladaptador adaptator = new eladaptador(Datos);
        petagram.setAdapter(adaptator);

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


        Datos.add(new Datos(R.drawable.cerdito, ""+like[1], "Cerdito"));

        Datos.add(new Datos(R.drawable.perrito, ""+like[3], "Perrito"));
        Datos.add(new Datos(R.drawable.pinguino, ""+like[4], "Pinguinin"));
        Datos.add(new Datos(R.drawable.pollilto, ""+like[5], "PioPio"));

        Datos.add(new Datos(R.drawable.sapito, ""+like[7], "Sapin"));


    }


}