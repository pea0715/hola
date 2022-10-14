package com.example.preguntitasv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;

public class administrador extends AppCompatActivity {
    EditText pregunta, opcion1, opcion2, opcion3, OpcionCorrecta, Puntos;
    Button Guardar,preguntas,Regresar;
    String Pregunta,Opcion1, Opcion2, Opcion3, OpcionConrrecta;
    int puntos;
    CrudPreguntas crud = new CrudPreguntas(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrador);
        conectar();

        //ArchivoPlanoPreguntas objAp = new ArchivoPlanoPreguntas(this);
        Guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Pregunta = pregunta.getText().toString();
                Opcion1 = opcion1.getText().toString();
                Opcion2 = opcion2.getText().toString();
                Opcion3 = opcion3.getText().toString();
                OpcionConrrecta = OpcionCorrecta.getText().toString();
                puntos = Integer.parseInt(Puntos.getText().toString());

                //String GuardarPreguntas = Pregunta + "," + Opcion1 +"," + Opcion2 +","+ Opcion3 +","+ OpcionConrrecta + "," + puntos + "/" ;
                 crud.Agregar(Pregunta, Opcion1, Opcion2,Opcion3,OpcionConrrecta, puntos);
                Toast.makeText(administrador.this, "se guardo la pregunta", Toast.LENGTH_SHORT).show();

            }
        });
        preguntas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(administrador.this, MostrarPreguntas.class);
                startActivity(intent);
            }
        });
        Regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(administrador.this, menu.class);
                startActivity(intent);
            }
        });
    }
    private void conectar() {
        pregunta = findViewById(R.id.pregunta);
        opcion1 = findViewById(R.id.opcion1);
        opcion2 = findViewById(R.id.opcion2);
        opcion3 = findViewById(R.id.opcion3);
        OpcionCorrecta = findViewById(R.id.OpcionCorrecta);
        Puntos = findViewById(R.id.Puntos);
        Guardar = findViewById(R.id.Guardar);
        preguntas = findViewById(R.id.preguntas);
        Regresar = findViewById(R.id.Regresar);
    }
}