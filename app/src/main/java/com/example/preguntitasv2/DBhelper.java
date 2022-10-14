package com.example.preguntitasv2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBhelper extends SQLiteOpenHelper {

    String Tabla = "CREATE table Preguntas (Id Integer primary key autoincrement," +
            "pregunta text not null," +
            "opcionUno text not null," +
            "opcionDos text not null," +
            "opcionTres text not null," +
            "Correcta text not null," +
            "puntaje text not null)";

    public DBhelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Tabla);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("Drop table Preguntas");
        db.execSQL(Tabla);

    }
}

