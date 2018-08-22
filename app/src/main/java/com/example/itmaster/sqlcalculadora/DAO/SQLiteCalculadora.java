package com.example.itmaster.sqlcalculadora.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteCalculadora extends SQLiteOpenHelper {
    private static final String dbName = "CALCULADORA";
    private static final Integer dbVersion = 1;
    private Context context;
    private SQLiteDatabase conexion;

    public SQLiteCalculadora(Context context) {
        super(context, dbName, null, dbVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE `operacion` ( `id` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, `operacion` TEXT NOT NULL )";
        db.execSQL(query); //creamos la tabla para guardar operaciones
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    private void conectar(){
        conexion = getWritableDatabase(); //me da una tabla para escribir

    }
    private void desconectar(){
        conexion = getWritableDatabase();

    public void guardarOperacion (String operacion);
}

// Primero Creamos el modelo Operaciones
// Segundo Creamos la tabla con DBbrowser. Para hacer tabala de forma visual y sacar el String de creacion
// Tercero Fuimos a DAO y creamos la clase que extiende de OpenHelper.
// Metimos metodo y constructor (del constructor borramos todos los parametros de entrada y queda solo context)
// creamos las dos STATIC FINAL dbVersion & dbName
// Creamos el atributo Context y el atributo SQLiteDatabase para conectar

//desde el Listener llamar al controlador en el OnCreate creando una objeto del Listener (Leo lo hizo en el SQLiteDAO:
//