package com.example.itmaster.sqlcalculadora.interfaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.itmaster.sqlcalculadora.Listeners.ListenerResta;
import com.example.itmaster.sqlcalculadora.Listeners.ListenerSuma;
import com.example.itmaster.sqlcalculadora.Listeners.ListenerVerHistorial;
import com.example.itmaster.sqlcalculadora.R;


public class MainActivity extends AppCompatActivity {

    private Button btnSuma, btnResta, btnHistorial;
    private TextView resultado;
    private EditText edtNro1, edtNro2;
    private ListenerSuma listenerSuma;
    private ListenerResta listenerResta;
    private ListenerVerHistorial listenerVerHistorial;

    public Button getBtnSuma() {
        return btnSuma;
    }

    public void setBtnSuma(Button btnSuma) {
        this.btnSuma = btnSuma;
    }

    public Button getBtnResta() {
        return btnResta;
    }

    public void setBtnResta(Button btnResta) {
        this.btnResta = btnResta;
    }

    public TextView getResultado() {
        return resultado;
    }



    public EditText getEdtNro1() {
        return edtNro1;
    }



    public EditText getEdtNro2() {
        return edtNro2;
    }



    public ListenerSuma getListenerSuma() {
        return listenerSuma;
    }

    public void setListenerSuma(ListenerSuma listenerSuma) {
        this.listenerSuma = listenerSuma;
    }

    public ListenerResta getListenerResta() {
        return listenerResta;
    }

    public void setListenerResta(ListenerResta listenerResta) {
        this.listenerResta = listenerResta;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnResta = findViewById(R.id.btnMenos);
        listenerResta = new ListenerResta(this);
        btnResta.setOnClickListener(listenerResta);

        btnSuma = findViewById(R.id.btnSuma);
        listenerSuma = new ListenerSuma(this);
        btnSuma.setOnClickListener(listenerSuma);

        btnHistorial = findViewById(R.id.btnHistorial);
        listenerVerHistorial = new ListenerVerHistorial (this);
        btnHistorial.setOnClickListener(listenerVerHistorial);


        edtNro1 = findViewById(R.id.edtNro1);
        edtNro2 = findViewById(R.id.edtNro2);

        resultado = findViewById(R.id.txtResultado);
    }


}
