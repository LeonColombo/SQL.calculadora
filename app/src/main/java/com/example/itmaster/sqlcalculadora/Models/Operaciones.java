package com.example.itmaster.sqlcalculadora.Models;

public class Operaciones {

    private Integer Id;
    private String operacion;

    public Operaciones(Integer id, String operacion) {
        Id = id;
        this.operacion = operacion;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
