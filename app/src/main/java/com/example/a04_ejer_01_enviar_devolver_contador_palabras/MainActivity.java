package com.example.a04_ejer_01_enviar_devolver_contador_palabras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtFrase;
    private Button btnPalabras;
    private Button btnCaracteres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inicializar vistas
        inicializarVistas();

        btnPalabras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String frase = txtFrase.getText().toString();
                Intent intent = new Intent(MainActivity.this, ActivityContarPalabras.class);
                Bundle bundle = new Bundle();
                bundle.putString("PALABRAS", frase);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        btnCaracteres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String frase = txtFrase.getText().toString();
                Intent intent = new Intent(MainActivity.this, ActivityContarPalabras.class);
                Bundle bundle = new Bundle();
                bundle.putString("CARAC", frase);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }

    private void inicializarVistas() {

        txtFrase = findViewById(R.id.txtFraseMain);
        btnCaracteres = findViewById(R.id.btnCaracteresMain);
        btnPalabras = findViewById(R.id.btnPalabrasMain);
    }
}