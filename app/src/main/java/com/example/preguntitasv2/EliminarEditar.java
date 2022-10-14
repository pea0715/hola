package com.example.preguntitasv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.RegexValidator;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class EliminarEditar extends AppCompatActivity {
    EditText pregunta,opcion1,opcion2,opcion3,OpcionCorrecta,Puntos;
    Button Editar,Eliminar,Regresar;
    String Pregunta,Opcion1, Opcion2, Opcion3, OpcionConrrecta;
    int puntos;
    CrudPreguntas crud = new CrudPreguntas(this);
    ArrayList<Preguntas> ObjetoPreguntas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eliminar_editar);
        conectar();

        ObjetoPreguntas = crud.RecuperarRegistro(id());
        pregunta.setText(ObjetoPreguntas.get(0).getPregunta());
        opcion1.setText(ObjetoPreguntas.get(0).getOpcion1());
        opcion2.setText(ObjetoPreguntas.get(0).getOpcion2());
        opcion3.setText(ObjetoPreguntas.get(0).getOpcion3());
        OpcionCorrecta.setText(ObjetoPreguntas.get(0).getCorrecta());
        Puntos.setText(ObjetoPreguntas.get(0).getPuntuacion() + "");


        Editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Pregunta = pregunta.getText().toString();
                Opcion1 = opcion1.getText().toString();
                Opcion2 = opcion2.getText().toString();
                Opcion3 = opcion3.getText().toString();
                OpcionConrrecta = OpcionCorrecta.getText().toString();
                puntos = Integer.parseInt(Puntos.getText().toString());

                crud.UpdateQuestion(id(),Pregunta,Opcion1,Opcion2,Opcion3,OpcionConrrecta,puntos);
                Toast.makeText(EliminarEditar.this, "actualizada", Toast.LENGTH_SHORT).show();
                Intent I = new Intent(getApplicationContext(), MostrarPreguntas.class);
                startActivity(I);
            }
        });

        Eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                crud.delete(id());
                Toast.makeText(EliminarEditar.this, "eliminado correctamente", Toast.LENGTH_SHORT).show();
                Intent I = new Intent(getApplicationContext(), MostrarPreguntas.class);
                startActivity(I);
            }
        });

        Regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(getApplicationContext(), MostrarPreguntas.class);
                startActivity(I);
            }
        });
    }


    public int id(){
        int NumeroPregunta;
        Bundle info = getIntent().getExtras();
        NumeroPregunta = info.getInt("id");
        return NumeroPregunta;
    }

    private void conectar() {
        pregunta = findViewById(R.id.pregunta);
        opcion1 = findViewById(R.id.opcion1);
        opcion2 = findViewById(R.id.opcion2);
        opcion3 = findViewById(R.id.opcion3);
        OpcionCorrecta = findViewById(R.id.OpcionCorrecta);
        Puntos = findViewById(R.id.Puntos);
        Editar = findViewById(R.id.Editar);
        Eliminar = findViewById(R.id.Eliminar);
        Regresar = findViewById(R.id.Regresar);
    }
}