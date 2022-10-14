package com.example.preguntitasv2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class CrudPreguntas {
    public Context ctx;
    public CrudPreguntas(Context ctx) {this.ctx = ctx;}

    public  ArrayList<Preguntas> RecuperarRegistros()
    {
        ArrayList<Preguntas> Aux = new ArrayList<>();
        DBhelper dBhelper = new DBhelper(ctx,"Preguntas",null,1);
        SQLiteDatabase db = dBhelper.getWritableDatabase();
        String SQL = "Select * from Preguntas";
        Cursor C = db.rawQuery(SQL, null);

        if(C.moveToFirst())
        {
            do{
                Aux.add(new Preguntas(C.getInt(0) , C.getString(1) , C.getString(2 )  , C.getString(3 ) , C.getString(4 ) ,C.getString(5 ) , C.getInt(6 )));

            }while (C.moveToNext());

        }
        db.close();
        return Aux;
    }

    public void Agregar( String Pregunta, String Opcion1, String Opcion2, String Opcion3, String Correcta, int Puntos) {
        DBhelper helper = new DBhelper(ctx, "Preguntas", null, 1);
        SQLiteDatabase DB = helper.getWritableDatabase();

        try {
            ContentValues cv = new ContentValues();
            cv.put("pregunta", Pregunta);
            cv.put("opcionUno", Opcion1);
            cv.put("opcionDos", Opcion2);
            cv.put("opcionTres", Opcion3);
            cv.put("Correcta", Correcta);
            cv.put("puntaje", Puntos);

            DB.insert("Preguntas", null, cv);
            DB.close();
        } catch (Exception ex) {
        }
    }


    public void UpdateQuestion(int id, String Pregunta, String Opcion1, String Opcion2, String Opcion3,String Correcta, int Puntos){
        DBhelper helper = new DBhelper(ctx, "Preguntas", null, 1);
        SQLiteDatabase db = helper.getWritableDatabase();
        String SQL = "UPDATE Preguntas " +
                "set pregunta = '" + Pregunta +"'" +
                ", opcionUno = '" + Opcion1 +"' " +
                ", opcionDos = '" + Opcion2 +"' " +
                ", opcionTres = '" + Opcion3 +"' " +
                ", Correcta = '" + Correcta +"' " +
                ", puntaje = '" + Puntos +"' " +

                "where Id = '" + id +"'";
        db.execSQL(SQL);
        db.close();
    }

    public void delete(int id){
        DBhelper helper = new DBhelper(ctx, "Preguntas", null,1);
        SQLiteDatabase db = helper.getWritableDatabase();
        String SQL = "DELETE from Preguntas where Id = '" + id +"'";

        db.execSQL(SQL);
        db.close();
    }
    public  ArrayList<Preguntas> RecuperarRegistro(int id)
    {
        ArrayList<Preguntas> Aux = new ArrayList<>();
        DBhelper dBhelper = new DBhelper(ctx,"Preguntas",null,1);
        SQLiteDatabase db = dBhelper.getWritableDatabase();
        String SQL = "Select * from Preguntas where Id = '" + id +"'";
        Cursor C = db.rawQuery(SQL, null);

        if(C.moveToFirst())
        {
            do{
                Aux.add(new Preguntas(C.getInt(0) , C.getString(1) , C.getString(2 )  , C.getString(3 ) , C.getString(4 ) ,C.getString(5 ) , C.getInt(6 )));

            }while (C.moveToNext());

        }
        db.close();
        return Aux;
    }




}
