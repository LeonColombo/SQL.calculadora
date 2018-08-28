package com.example.itmaster.sqlcalculadora.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.itmaster.sqlcalculadora.Models.Operaciones;
import com.example.itmaster.sqlcalculadora.R;
import com.example.itmaster.sqlcalculadora.interfaz.ActivityList;

import java.util.ArrayList;

import static java.lang.String.valueOf;

public class AdapterOperaciones extends BaseAdapter {
    private ArrayList<Operaciones> operacionesArrayList;
    private ActivityList context;

    public AdapterOperaciones(ArrayList<Operaciones> operacionesArrayList, ActivityList context) {
        this.operacionesArrayList = operacionesArrayList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater miInfladorDeLayouts;
        miInfladorDeLayouts = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = miInfladorDeLayouts.inflate(R.layout.activity_list, viewGroup, false);

        TextView stringOperacion;
        stringOperacion = view.findViewById(R.id.listaOper);

        stringOperacion.setText((CharSequence) operacionesArrayList);

        return view;
    }
}
