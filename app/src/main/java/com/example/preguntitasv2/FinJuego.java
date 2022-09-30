package com.example.preguntitasv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FinJuego extends AppCompatActivity {
    Button btnRegresarmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fin_juego);
        conectar();
        btnRegresarmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FinJuego.this, menu.class);
                startActivity(intent);
            }
        });
    }

    private void conectar() {
        btnRegresarmenu = findViewById(R.id.btnRegresarmenu);
    }
}