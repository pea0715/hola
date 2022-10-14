package com.example.preguntitasv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class prueba extends AppCompatActivity {
    ArrayList<PuntuacioFinal> Puntos = new ArrayList<>();
    ArrayAdapter adapter;
    ListView Podio;
    Button Regresar;
    //ArchivoPuntuacion objAP = new ArchivoPuntuacion(this);
    CrudPuntaje crud1 = new CrudPuntaje(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba);
        conectar();
        adaptar();

        Regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(prueba.this, menu.class);
                startActivity(intent);
            }
        });
    }

    private void conectar() {
        Podio = findViewById(R.id.Podio);
        Regresar = findViewById(R.id.Regresar);
    }
    public void adaptar(){
        Puntos = crud1.MostrarPuntaje();
        Collections.sort(Puntos, new Comparator<PuntuacioFinal>() {
            @Override
            public int compare(PuntuacioFinal S1, PuntuacioFinal S2) {
                return new Integer(S2.getPuntos()).compareTo(new Integer(S1.getPuntos()));
            }
        });
        adapter = new ArrayAdapter<PuntuacioFinal>(getApplicationContext(), android.R.layout.simple_expandable_list_item_1, Puntos);
        Podio.setAdapter(adapter);
    }
}