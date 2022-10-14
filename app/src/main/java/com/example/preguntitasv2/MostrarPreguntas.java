package com.example.preguntitasv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class MostrarPreguntas extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView preguntasvistas;
    Button Regresar;
    ArrayAdapter adapter;
    ArrayList<Preguntas> fe = new ArrayList();
    //ArchivoPlanoPreguntas plano = new ArchivoPlanoPreguntas(this);
    CrudPreguntas crud = new CrudPreguntas(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_preguntas);
        conectar();
        fe = crud.RecuperarRegistros();
        adapter = new ArrayAdapter<Preguntas>(getApplicationContext(), android.R.layout.simple_expandable_list_item_1, fe);
        preguntasvistas.setAdapter(adapter);

        Regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MostrarPreguntas.this, administrador.class);
                startActivity(intent);
            }
        });

    }

    private void conectar() {
        preguntasvistas = findViewById(R.id.preguntasvistas);
        Regresar = findViewById(R.id.Regresar);
        preguntasvistas.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent I = new Intent(getApplicationContext(),EliminarEditar.class);
        I.putExtra("id",fe.get(i).getId());
        startActivity(I);
    }
}