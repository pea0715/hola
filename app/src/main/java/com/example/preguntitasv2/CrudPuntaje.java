package com.example.preguntitasv2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class CrudPuntaje {
    public Context ctx;
    public CrudPuntaje(Context ctx) {this.ctx = ctx;}

    public ArrayList<PuntuacioFinal> MostrarPuntaje()
    {
        ArrayList<PuntuacioFinal> Aux = new ArrayList<>();
        DBhelperPuntos dBhelper = new DBhelperPuntos(ctx,"Puntos",null,1);
        SQLiteDatabase db = dBhelper.getWritableDatabase();
        String SQL = "Select * from Puntos";
        Cursor C = db.rawQuery(SQL, null);

        if(C.moveToFirst())
        {
            do{
                Aux.add(new PuntuacioFinal(C.getInt(0) , C.getString(1) , C.getString(2 )));

            }while (C.moveToNext());

        }
        db.close();
        return Aux;
    }
    public void Agregar( String nombre, String Puntos) {
        DBhelperPuntos helper = new DBhelperPuntos(ctx, "Puntos", null, 1);
        SQLiteDatabase DB = helper.getWritableDatabase();


            ContentValues cv = new ContentValues();
            cv.put("nombre", nombre);
            cv.put("puntaje", Puntos);

            DB.insert("Puntos", null, cv);
            DB.close();

    }

}
