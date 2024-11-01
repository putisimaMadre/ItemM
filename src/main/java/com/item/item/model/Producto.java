package com.item.item.model;

import java.math.BigInteger;

public class Producto {
    private BigInteger id;
    private String nombre;
    private Double precio;

    public BigInteger getIdProducto() {
        return id;
    }

    public void setIdProducto(BigInteger id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
