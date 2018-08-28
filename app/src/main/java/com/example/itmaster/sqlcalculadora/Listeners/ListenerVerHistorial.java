package com.example.itmaster.sqlcalculadora.Listeners;

import android.content.Intent;
import android.view.View;

import com.example.itmaster.sqlcalculadora.Models.Operaciones;
import com.example.itmaster.sqlcalculadora.interfaz.ActivityList;
import com.example.itmaster.sqlcalculadora.interfaz.MainActivity;
//desde el Listener llamar al controlador en el OnCreate creando una objeto del Listener
// (Leo lo hizo en el SQLiteDAO:
//
public class ListenerVerHistorial implements View.OnClickListener {

    MainActivity context;

    public ListenerVerHistorial(MainActivity context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(this.context, ActivityList.class);
        
        context.startActivity(intent);

    }
}
