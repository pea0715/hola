package com.example.preguntitasv2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView tvPreguntas, tvPuntaje;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;               /////// numero de preguntas
    Button btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20;     //////// numero de preguntas
    Button btnOp1,btnOp2,btnOp3;                                           //////// opciones de preguntas
    int puntos ;
    public String Correcta;
    public int Puntucion;
    public Button btnAux;
    Random random = new Random();
    ArrayList<Preguntas> NumeroPreguntas = new ArrayList();
    public int PreguntasBuenas ;
    ArchivoPuntuacion objAp = new ArchivoPuntuacion(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        conectar();
        CrearPreguntas();
        puntos = 0;
        PreguntasBuenas = 0;

        btnOp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Comprobar(btnOp1);
                Activar(false);
            }
        });
        btnOp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Comprobar(btnOp2);
                Activar(false);
            }
        });
        btnOp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Comprobar(btnOp3);
                Activar(false);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PintarPreguntas(btn1);
            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PintarPreguntas(btn2);
            }

        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PintarPreguntas(btn3);
            }

        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PintarPreguntas(btn4);
            }

        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PintarPreguntas(btn5);
            }

        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PintarPreguntas(btn6);
            }

        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PintarPreguntas(btn7);
            }

        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PintarPreguntas(btn8);
            }

        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PintarPreguntas(btn9);
            }

        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PintarPreguntas(btn10);
            }

        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PintarPreguntas(btn11);
            }

        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PintarPreguntas(btn12);
            }

        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PintarPreguntas(btn13);
            }

        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PintarPreguntas(btn14);
            }

        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PintarPreguntas(btn15);
            }

        });
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PintarPreguntas(btn16);
            }

        });
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PintarPreguntas(btn17);
            }

        });
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PintarPreguntas(btn18);
            }

        });
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PintarPreguntas(btn19);

            }

        });
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PintarPreguntas(btn20);
            }

        });

    }

    private void conectar() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);
        btn13 = findViewById(R.id.btn13);
        btn14 = findViewById(R.id.btn14);
        btn15 = findViewById(R.id.btn15);
        btn16 = findViewById(R.id.btn16);
        btn17 = findViewById(R.id.btn17);
        btn18 = findViewById(R.id.btn18);
        btn19 = findViewById(R.id.btn19);
        btn20 = findViewById(R.id.btn20);
        tvPreguntas = findViewById(R.id.tvPreguntas);
        btnOp1 = findViewById(R.id.btnOp1);
        btnOp2 = findViewById(R.id.btnOp2);
        btnOp3 = findViewById(R.id.btnOp3);
        tvPuntaje =findViewById(R.id.tvPuntaje);

    }

    public void CrearPreguntas(){

        ArchivoPlanoPreguntas plano = new ArchivoPlanoPreguntas(this);
        NumeroPreguntas = plano.GuardarPreguntas();


        /**
        NumeroPreguntas.add(new Preguntas("¿La ballena qué tipo de animal es?","mamífero","Reptiles","Aves","mamífero",1)); /// 1
        NumeroPreguntas.add(new Preguntas("¿Quién pintó “La última cena”?","DIEGO VELÁZQUEZ ","Leonardo da Vinci","MIGUEL ÁNGEL","Leonardo da Vinci",1)); //// 2
        NumeroPreguntas.add(new Preguntas("100 - 60","40","23","87","40",1));  ///// 1

        NumeroPreguntas.add(new Preguntas("¿Cuál es el país más grande del mundo?","Brazil","U.S.A","Rusia","Rusia",1)); ///// 3
        NumeroPreguntas.add(new Preguntas("¿Cual es país más poblado de la Tierra?","China","colombia","kenia","China",1)); //// 1
        NumeroPreguntas.add(new Preguntas("¿Cuál es el metal más caro del mundo?","rodio","oro","platino","rodio",1)); /// 1

        NumeroPreguntas.add(new Preguntas("¿Cuál es la capital de Suecia?","francia ","Estocolmo","suecia","Estocolmo",1)); //// 2
        NumeroPreguntas.add(new Preguntas("¿Cómo se llama la estación espacial rusa?","MIR","URRS ","U.S.A","MIR",1)); //// 1
        NumeroPreguntas.add(new Preguntas("¿Cuál es la capital de Suecia?","francia","Estocolmo","suecia","Estocolmo",1)); //// 2

        NumeroPreguntas.add(new Preguntas("¿Cuál es la capital de Irán?","Teherán","yazd","kerman","Teherán",1)); //// 1
        NumeroPreguntas.add(new Preguntas(" 10 + 10","20","56","87","20",1)); //// 1
        NumeroPreguntas.add(new Preguntas("30 / 10","esta no es ","3","te pasaste","3",1)); //// 2


        NumeroPreguntas.add(new Preguntas("cual es el pais mas pequeño del mundo?","Malta ","Vaticano","Nauru","Vaticano",1)); //// 2
        NumeroPreguntas.add(new Preguntas("¿Cuántos decimales tiene el número pi π? ","Infinitos","Veinte","Mil","Infinitos",1)); //// 1
        NumeroPreguntas.add(new Preguntas("¿Cuántos jugadores por equipo participan en un partido de voleibol?","6","3","5","6",1)); //// 1

        NumeroPreguntas.add(new Preguntas("¿Quién pintó la obra Guernica?","Kahlo ","Rivera","Picasso","Picasso",1)); //// 3
        NumeroPreguntas.add(new Preguntas("¿Cuánto tiempo tarda la luz del Sol en llegar a la Tierra?","12 minutos ","56 minutos","8 minutos","8 minutos",1)); //// 3
        NumeroPreguntas.add(new Preguntas(" ¿En qué periodo de la prehistoria fue descubierto el fuego?","paleolítico","Neolítico","Edad media","paleolítico",1)); //// 1

        NumeroPreguntas.add(new Preguntas(" 11 + 12","23","56","87","23",1)); //// 1
        NumeroPreguntas.add(new Preguntas(" 140 + 610","752","750","754","750",1)); //// 2
        NumeroPreguntas.add(new Preguntas(" 101 * 8","808","810","807","808",1)); //// 1

        NumeroPreguntas.add(new Preguntas("7 * 8 ","54","56","232","56",1)); //// 2
        NumeroPreguntas.add(new Preguntas(" 101 - 101","0","3","2","0",1)); //// 1
        NumeroPreguntas.add(new Preguntas("Dios griego del rayo ? ","Ares ","Zeus","Hades","Zeus",1)); //// 2

        NumeroPreguntas.add(new Preguntas(" 16 + 12","28","27","29","28",1)); //// 1
        NumeroPreguntas.add(new Preguntas(" 765 - 130","620 ","631","635","635",1)); //// 3
        NumeroPreguntas.add(new Preguntas(" 23 - 2","20","21","87","21",1)); //// 1

 **/

    }


    public void MostrarPregunta(Button numeropreguntas){
        btnAux = numeropreguntas;
        int intRandom = random.nextInt(NumeroPreguntas.size());
        tvPreguntas.setText(NumeroPreguntas.get(intRandom).getPregunta());
        btnOp1.setText(NumeroPreguntas.get(intRandom).getOpcion1());
        btnOp2.setText(NumeroPreguntas.get(intRandom).getOpcion2());
        btnOp3.setText(NumeroPreguntas.get(intRandom).getOpcion3());
        Correcta = NumeroPreguntas.get(intRandom).getCorrecta();
        Puntucion = NumeroPreguntas.get(intRandom).getPuntuacion();
        NumeroPreguntas.remove(intRandom);
    }

    public void Comprobar(Button Seleccion){

        if(Integer.parseInt(Seleccion.getText().toString()) == Integer.parseInt(Correcta)){
            puntos += Puntucion;
            tvPuntaje.setText(puntos + " " );
            PreguntasBuenas += 1;
            Seleccion.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
            btnAux.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
            btnAux.setEnabled(false);
        } else {
            Seleccion.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
            btnAux.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
        }
        if((NumeroPreguntas.size() + PreguntasBuenas) < 20 ){
            CrearPuntos(Nombre(),puntos + "");
            Intent intent = new Intent(getApplicationContext(),FinJuego.class);
            startActivity(intent);
        }
        else if (PreguntasBuenas == 20){
            CrearPuntos(Nombre(),puntos + "" );
            Intent intent = new Intent(getApplicationContext(),FinJuego.class);
            startActivity(intent);
        }
    }

    public void Activar(Boolean Desabilitar){
        btnOp1.setEnabled(Desabilitar);
        btnOp2.setEnabled(Desabilitar);
        btnOp3.setEnabled(Desabilitar);
    }

    public void ReiniciarColor(){
        btnOp1.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.XD));
        btnOp2.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.XD));
        btnOp3.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.XD));
    }

    public void PintarPreguntas(Button NQuiz){
        MostrarPregunta(NQuiz);
        Activar(true);
        ReiniciarColor();
    }

    public String Nombre(){
        String NombreDelPendejo;
        Bundle info = getIntent().getExtras();
        if (info != null) {
            NombreDelPendejo = info.getString("P");
        }else NombreDelPendejo = "nn";
        return NombreDelPendejo;

    }

    public void CrearPuntos(String n , String p) {
        String GuardarPuntos = n + "," + p + "/" ;
        try{
            objAp.Escribir(GuardarPuntos);
        }
        catch ( IOException ex)
        {
            ex.getMessage();
        }

    }



}