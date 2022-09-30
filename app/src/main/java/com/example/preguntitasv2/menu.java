package com.example.preguntitasv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {

    Button btnAbministrador,btnJugador,  prueba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        conectar();
        btnJugador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this, NombreJugador.class);
                startActivity(intent);
            }
        });
        btnAbministrador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this, administrador.class);
                startActivity(intent);
            }
        });

        prueba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this, prueba.class);
                startActivity(intent);
            }
        });
    }
    private void conectar() {
        btnAbministrador = findViewById(R.id.btnAbministrador);
        btnJugador = findViewById(R.id.btnJugador);
        prueba = findViewById(R.id.prueba);
    }
}