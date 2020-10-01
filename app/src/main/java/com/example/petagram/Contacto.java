package com.example.petagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Contacto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
    }


    //para enviar el mensaje
    public void click(View view) {

        SendEmailService.text = "servira?? la gran pregunta"; //pues si sirvio

        SendEmailService.getInstance(getApplicationContext()).emailExecutor.execute(new Runnable() {
            @Override
            public void run() {
                SendEmailService.getInstance(getApplicationContext()).SendEmail();
            }
        });

    }
}