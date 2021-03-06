package com.example.itmaster.sqlcalculadora.interfaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.itmaster.sqlcalculadora.Adapters.AdapterOperaciones;
import com.example.itmaster.sqlcalculadora.DAO.SQLiteCalculadora;
import com.example.itmaster.sqlcalculadora.Models.Operaciones;
import com.example.itmaster.sqlcalculadora.R;

import java.util.ArrayList;

//import com.leonardo.ejemplomvc.DAO.DAOPersona;
//import com.leonardo.ejemplomvc.R;
//import com.leonardo.ejemplomvc.adapters.AdapterListaPersona;
//import com.leonardo.ejemplomvc.models.Persona;
//
//import java.util.ArrayList;
//
//public class ActivityListView extends AppCompatActivity {
//    private ArrayList<Persona> arrayList;
//    private DAOPersona daoPersona;
//    private AdapterListaPersona adapterListaPersona;
//    private ListView listViewPersona;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_list_view);
//        daoPersona = new DAOPersona();
//        arrayList = daoPersona.getArrayPersona();
//        adapterListaPersona = new AdapterListaPersona(arrayList, this);
//
//        listViewPersona = findViewById(R.id.listaPersona);
//        listViewPersona.setAdapter(adapterListaPersona);
//
//    }
//}

//

public class ActivityList extends AppCompatActivity {

    private ArrayList<Operaciones> arrayList;
    private SQLiteCalculadora sqLiteCalculadora;
    private AdapterOperaciones adapterOperaciones;
    private ListView listViewOperaciones;
    private Operaciones op;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        sqLiteCalculadora = new SQLiteCalculadora(this);

        arrayList = sqLiteCalculadora.getOperaciones();
        adapterOperaciones = new AdapterOperaciones(arrayList, this);

        listViewOperaciones = findViewById(R.id.listaOper);
        listViewOperaciones.setAdapter(adapterOperaciones);

    }
}
