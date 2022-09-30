package com.example.preguntitasv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NombreJugador extends AppCompatActivity {
    EditText nombre;
    Button btnContinuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nombre_jugador);
        conectar();

        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Nombre = nombre.getText().toString();
                Toast.makeText(NombreJugador.this, Nombre + " si guardo", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(NombreJugador.this, MainActivity.class);
                intent.putExtra("P", Nombre);
                startActivity(intent);

            }
        });
    }




    private void conectar() {
        nombre = findViewById(R.id.nombre);
        btnContinuar = findViewById(R.id.btnContinuar);
    }
}