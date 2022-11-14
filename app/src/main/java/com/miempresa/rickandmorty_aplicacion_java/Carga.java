package com.miempresa.rickandmorty_aplicacion_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class Carga extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carga);
        String ubicacion = "fuente/MagicMushroom.otf";
        Typeface tf = Typeface.createFromAsset(Carga.this.getAssets(),ubicacion);

        final int DURACION = 6000;
        new Handler().postDelayed(new Runnable() {
            @Override
            // intent de app de carga a main activity del admin
            public void run() {
                Intent intent = new Intent(Carga.this, MainActivityAdministrador.class);
                startActivity(intent);
                finish();
            }
        },DURACION);


    }
}