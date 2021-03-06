package com.example.itmaster.sqlcalculadora.Listeners;

import android.content.ContentValues;
import android.content.Context;
import android.view.View;

import com.example.itmaster.sqlcalculadora.DAO.SQLiteCalculadora;
import com.example.itmaster.sqlcalculadora.Models.Operaciones;
import com.example.itmaster.sqlcalculadora.interfaz.MainActivity;

public class ListenerSuma implements View.OnClickListener {
    private MainActivity context;
    private SQLiteCalculadora sqliteCalculadora;


    public ListenerSuma(MainActivity context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {

        Integer resultadoSuma = Integer.valueOf(context.getEdtNro1().getText().toString()) + Integer.valueOf(context.getEdtNro2().getText().toString());

        context.getResultado().setText(resultadoSuma.toString());



        sqliteCalculadora = new SQLiteCalculadora (context);
        Operaciones operacion = new Operaciones (null, String.valueOf(context.getEdtNro1().getText()) + " + " + String.valueOf(context.getEdtNro2().getText()) + " = " + String.valueOf(context.getResultado().getText()));
        sqliteCalculadora.guardarOperacionSinSql(operacion);


    }
}



