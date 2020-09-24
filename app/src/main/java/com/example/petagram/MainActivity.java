package com.example.petagram;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Datos> Datos;
    int[] like = new int[9];
    private RecyclerView petagram;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        petagram = findViewById(R.id.rvAnimalitos);
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

    public void clik (View view) {

        Toast.makeText(this, "like", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {


            switch (item.getItemId()) {


                case R.id.action_favorite:

                    Intent afavoritos = new Intent(this, favoritos5.class);
                    startActivity(afavoritos);
                    return true;

                default:

                    return super.onOptionsItemSelected(item);

            }
    }


}

