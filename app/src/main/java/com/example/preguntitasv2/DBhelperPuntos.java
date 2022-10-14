package com.example.preguntitasv2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBhelperPuntos extends SQLiteOpenHelper {
    String Tabla = "CREATE table Puntos (Id Integer primary key autoincrement," +
            "nombre text not null," +
            "puntaje text not null)";

    public DBhelperPuntos(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Tabla);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("Drop table Puntos");
        db.execSQL(Tabla);

    }
}
