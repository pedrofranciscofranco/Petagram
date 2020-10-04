package com.example.petagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class Contacto extends AppCompatActivity {
    private MaterialToolbar toolbar;
    private Button enviarmensaje;
    private EditText nombre, email, comentario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
        toolbar     = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        enviarmensaje     = findViewById(R.id.Benviarmensaje);
        nombre            = findViewById(R.id.tiEnombre);
        email             = findViewById(R.id.tiEemail);
        comentario        = findViewById(R.id.tiEmensaje);

    }


    //para enviar el mensaje
    public void click(View view) {

        SendEmailService.text       = comentario.getText().toString(); //pues si sirvio
        SendEmailService.subjet     = "Nombre: " + nombre.getText().toString();
        SendEmailService.to         = email.getText().toString().trim();

        SendEmailService.getInstance(getApplicationContext()).emailExecutor.execute(new Runnable() {
            @Override
            public void run() {
                SendEmailService.getInstance(getApplicationContext()).SendEmail();
            }
        });

    }
}