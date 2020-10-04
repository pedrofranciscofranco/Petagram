package com.example.petagram;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    private MaterialToolbar toolbar;
    private TabLayout tabLayout;
    static ViewPager viewPager;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar     = findViewById(R.id.toolbar);
        tabLayout   = findViewById(R.id.tablayout);
        viewPager   = findViewById(R.id.viewpager);




        setUpViewPager();


/*
        petagram = findViewById(R.id.rvAnimalitos);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(RecyclerView.VERTICAL);
        petagram.setLayoutManager(llm);
        cargardatos();
        inicializaradaptador();
*/

        if (toolbar!=null){
            setSupportActionBar(toolbar);
        }

    }


/*
    public void clik (View view) {

        Toast.makeText(this, "like", Toast.LENGTH_SHORT).show();
    }
*/
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

                case R.id.menu_Contacto:

                    Intent aContacto = new Intent(this, Contacto.class);
                    startActivity(aContacto);
                    return true;

                case R.id.menu_Acercade:

                    Intent aAcercade = new Intent(this, bio.class);
                    startActivity(aAcercade);
                    return true;


                default:

                    return super.onOptionsItemSelected(item);

            }
    }


    private ArrayList<Fragment> agregarfragmetn(){
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new fragmentrecycler());
        fragments.add(new PerfilMascota());
        return fragments;
    }

    private void setUpViewPager(){
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), agregarfragmetn()));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.iconhouse);
        tabLayout.getTabAt(1).setIcon(R.drawable.iconpet);

    }


}

