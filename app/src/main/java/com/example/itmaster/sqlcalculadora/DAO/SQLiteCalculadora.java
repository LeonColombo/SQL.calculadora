package com.example.itmaster.sqlcalculadora.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.itmaster.sqlcalculadora.Listeners.ListenerSuma;
import com.example.itmaster.sqlcalculadora.Models.Operaciones;

import java.util.ArrayList;

import static android.os.Build.ID;



public class SQLiteCalculadora extends SQLiteOpenHelper{
    private Context context;
    private SQLiteDatabase conexion;
    private ArrayList<Operaciones> operacionesArrayList;

    private static final String DB_NAME = "CALCULADORA";
    private static final Integer DB_VERSION = 1;


    public SQLiteCalculadora(Context context) {
        super(context, DB_NAME , null, DB_VERSION);
        this.context = context; //para que me reemplace el atributo
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String query = "CREATE TABLE `Operaciones` ( `ID` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE, `OPERACION` TEXT NOT NULL)";
        sqLiteDatabase.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    private void conectar(){
        conexion = getWritableDatabase();
    }

    private void desconectar(){
        conexion.close();
    }

    public void guardarOperacionSinSql(Operaciones op){

        this.conectar();
        ContentValues fila = new ContentValues();

        fila.put("OPERACION", op.getOperacion());

        conexion.insert("Operaciones", null, fila);

        this.desconectar();





        ////crear funcion para devolver el ArrrayList de operaciones
        //
        //    public ArrayList<Operacion> getOperaciones(){
        //        ArrayList<Operacion> operacionArrayList = new ArrayList<>();
        //        this.conectar();
        //        String query = "";
        //        query = "select operacion, id from historial";
        //        //hay que crear un objeto cursor donde almacena los datos obtenidos de la db.
        //        //primer parameto la query y segundo null.
        //        //Comando no es execsql, en este caso usamos rawQuery
        //        Cursor cursor = conexion.rawQuery(query, null);
        //        //el while recorre fila a fila, tenga una o mil
        //        while(cursor.moveToNext()) {
        //            //cada dato de las columnas se obtiene con cursor.getString, cursor.getInt. Estas funciones necesitan
        //            //el index del campo (la posición respecto al select que escrbi) arranca de 0 a xx
        //            //hay una funcion que retorna la posicion (index) del campo, cursor.getColumnIndex("nombre campo")
        //
        //            Operacion unaOperacion = new Operacion(cursor.getInt(cursor.getColumnIndex("id")), cursor.getString(cursor.getColumnIndex("operacion")));
        //            //en este luagr creo el objeto del modelo que necesito implementar y le paso los datos obtenidos
        //
        //            operacionArrayList.add(unaOperacion);

    }
    public ArrayList<Operaciones> getOperaciones(){
        operacionesArrayList = new ArrayList<>();
        this.conectar();
        String query = "";
        query = "select OPERACION, ID from Operaciones";
        Cursor cursor = conexion.rawQuery(query, null);
            while(cursor.moveToNext()){
                Operaciones unaOperacion = new Operaciones(cursor.getInt(cursor.getColumnIndex("ID")), cursor.getString(cursor.getColumnIndex("OPERACION")));
                operacionesArrayList.add(unaOperacion);

        }
        return operacionesArrayList;
    }

}

// Primero Creamos el modelo Operaciones
// Segundo Creamos la tabla con DBbrowser. Para hacer tabla de forma visual y sacar el String de creacion
// Tercero Fuimos a DAO y creamos la clase que extiende de OpenHelper.
// Metimos metodo y constructor (del constructor borramos todos los parametros de entrada y queda solo context)
// creamos las dos STATIC FINAL dbVersion & dbName
// Creamos el atributo Context y el atributo SQLiteDatabase para conectar

//desde el Listener llamar al controlador en el OnCreate creando una objeto del Listener
// (Leo lo hizo en el SQLiteDAO:
//