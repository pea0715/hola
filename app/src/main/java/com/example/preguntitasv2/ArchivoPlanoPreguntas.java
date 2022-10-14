/**package com.example.preguntitasv2;

import android.content.Context;
import android.util.Log;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoPlanoPreguntas {
    String Archivo = "preguntas.txt";
    Context ctx;
    FileOutputStream fos;
    FileInputStream fis;

    public ArchivoPlanoPreguntas(Context ctx) {this.ctx = ctx;}

    public void Escribir(String textArchivo) throws IOException{
        try
        {
            fos = ctx.openFileOutput(Archivo, Context.MODE_APPEND);
            fos.write(textArchivo.getBytes());
            fos.close();
        }
        catch (FileNotFoundException e){
            Log.e("",e.getMessage());
        }
        catch (IOException ex){
            Log.e("",ex.getMessage());
        }
    }
    public ArrayList<Preguntas> GuardarPreguntas (){
        ArrayList<String> oi = new ArrayList();
        ArrayList<Preguntas> ao = new ArrayList();

        String Lectura = "";
        try
        {
            fis = ctx.openFileInput(Archivo);
            int i;
            char caracter = 'a';
            do {
                i = fis.read();
                if ( i != '\n')
                {
                    caracter = (char)i;
                    Lectura += caracter;
                }
                if(caracter == ','){
                    oi.add(Lectura.substring(0, Lectura.length()-1));
                    Lectura = "";
                }
                if(caracter =='/'){
                    oi.add(Lectura.substring(0, Lectura.length()-1));
                    ao.add( new Preguntas(oi.get(0), oi.get(1), oi.get(2), oi.get(3), oi.get(4), Integer.parseInt(oi.get(5)) ));
                    oi.clear();
                    Lectura = "";
                }
            } while (i > 0);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ao;
        }

}
*/