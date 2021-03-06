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
        return operacionesArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return operacionesArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater miInfladorDeLayouts;
        miInfladorDeLayouts = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = miInfladorDeLayouts.inflate(R.layout.operaciones, viewGroup, false);

        TextView stringOperacion;
        stringOperacion = view.findViewById(R.id.stringoperacion);

        stringOperacion.setText(operacionesArrayList.get(i).getOperacion());

        return view;
    }
}
