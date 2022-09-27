package com.example.a04_ejer_01_enviar_devolver_contador_palabras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class ActivityContarPalabras extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contar_palabras);

        //RECUpERAR EL INTENT
        Intent intent = getIntent();
        //RECUPERAR BUNDLE
        Bundle bundle = intent.getExtras();

        if (bundle!=null){
            if(bundle.containsKey("PALABRAS")){


                String frase = bundle.getString("PALABRAS");
                String[] palabras = frase.trim().split("");

                Toast.makeText(this, palabras.length+" PALABRAS", Toast.LENGTH_SHORT).show();
            }

            if (bundle.containsKey("CARAC")){
                String frase = bundle.getString("CARAC");
                Toast.makeText(this, frase.length()+" CARACTERES", Toast.LENGTH_SHORT).show();
            }




        }
    }
}