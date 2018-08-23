package com.example.itmaster.sqlcalculadora.Listeners;

import android.content.ContentValues;
import android.content.Context;
import android.view.View;

import com.example.itmaster.sqlcalculadora.interfaz.MainActivity;

public class ListenerSuma implements View.OnClickListener {
    private MainActivity context;
    private Context context;

    public ListenerSuma(MainActivity context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {

        Integer resultadoSuma = Integer.valueOf(context.getEdtNro1().getText().toString()) + Integer.valueOf(context.getEdtNro2().getText().toString());

        context.getResultado().setText(resultadoSuma.toString());


    }


    public void guardarOperacion(String operacion);{
        ContentValues row = new ContentValues();

        row.put("operaciones", oper);
        conexion.insert("operaciones", null, row);
    }
}