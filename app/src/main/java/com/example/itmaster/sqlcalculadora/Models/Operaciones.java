package com.example.itmaster.sqlcalculadora.Models;

public class Operaciones {

    private Integer Id;
    private String operacion;

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
