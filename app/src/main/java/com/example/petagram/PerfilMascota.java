package com.example.petagram;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;




public class PerfilMascota extends Fragment {

    private RecyclerView petagram;
    ArrayList<Datos> Datos;
    int[] like = new int[9];
 //   public static String fotitodeperfil;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_perfil_mascota, container, false);
        View v2 = inflater.inflate(R.layout.fragment_perfil_mascota,container,false);
        petagram = v2.findViewById(R.id.rvPerfil);

//        fotitodeperfil = v2.findViewById(R.id.imgAnimalesperfilmascota);
        GridLayoutManager llm = new GridLayoutManager(getActivity(),3);
        petagram.setLayoutManager(llm);
//        Toast.makeText(container.getContext(),fotitodeperfil,Toast.LENGTH_LONG).show();
        cargardatos();
        inicializaradaptador();
        return v2;
    }
/*
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getParentFragmentManager().setFragmentResultListener("key", this, new FragmentResultListener();
    }


 */

    public void inicializaradaptador(){

        eladaptador2 adaptator = new eladaptador2(Datos);
        petagram.setAdapter(adaptator);

    }

    public void cargardatos(){

        like[0]=20; //cabrita
        like[1]=1; //cerdito
        like[2]=0; //gatito
        like[3]=8; //perrito
        like[4]=50; //pinguino
        like[5]=100; //pollito
        like[6]=0; //ratoncito
        like[7]=3; //sapito
        like[8]=4; //zorrito

        Datos = new ArrayList<Datos>();


   //     fotitodeperfil=new eladaptador(Datos, this, new eladaptador.DatosViewHolder())
 /*
        switch (fotitodeperfil){
            case "Cabrita":
                for (int i = 0; i < like.length; i++) {
                    Datos.add(new Datos(R.drawable.cabrita, ""+like[i], "Cabrita"));
                }

            case "Cerdito":
                for (int i = 0; i < like.length; i++) {
                    Datos.add(new Datos(R.drawable.cerdito, ""+like[i], "Cabrita"));
                }


        }
*/
/*        if (fotitodeperfil=="Cabrita"){
           // Toast.makeText(getActivity(),"esta es cabrita",Toast.LENGTH_LONG).show();
            for (int i = 0; i < like.length; i++) {
                Datos.add(new Datos(R.drawable.cabrita, ""+like[i], "Cabrita"));
            }
        }

 */
            // Toast.makeText(getActivity(),"esta es cabrita",Toast.LENGTH_LONG).show();
            for (int i = 0; i < like.length; i++) {
                Datos.add(new Datos(R.drawable.raton, ""+like[i], "Cabrita"));
            }



/*
        Datos.add(new Datos(R.drawable.cabrita, ""+like[0], "Cabrita"));
        Datos.add(new Datos(R.drawable.cerdito, ""+like[1], "Cerdito"));
        Datos.add(new Datos(R.drawable.gatito, ""+like[2], "Gatito"));
        Datos.add(new Datos(R.drawable.perrito, ""+like[3], "Perrito"));
        Datos.add(new Datos(R.drawable.pinguino, ""+like[4], "Pinguinin"));
        Datos.add(new Datos(R.drawable.pollilto, ""+like[5], "PioPio"));
        Datos.add(new Datos(R.drawable.raton, ""+like[6], "Ratoncito"));
        Datos.add(new Datos(R.drawable.sapito, ""+like[7], "Sapin"));
        Datos.add(new Datos(R.drawable.zorro, ""+like[8], "Z"));

 */

    }

}