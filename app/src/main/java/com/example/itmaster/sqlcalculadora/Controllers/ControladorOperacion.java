package com.example.itmaster.sqlcalculadora.Controllers;

import android.content.Context;

import com.example.itmaster.sqlcalculadora.DAO.SQLiteCalculadora;
import com.example.itmaster.sqlcalculadora.Listeners.ListenerSuma;

public class ControladorOperacion {

    private Context context;
    private SQLiteCalculadora sqLiteCalculadora;
    private ListenerSuma listenerSuma;

    public ControladorOperacion(Context context) {
        this.context = context;
        listenerSuma = new ListenerSuma(this);
    }

    public void RegistrarOperacion (String op){
        listenerSuma.guardarOperacion(op);

    }


}
