package com.java.main;

public class Producto {
    private int id; //Identificador de producto
    private String nombre;
    private String familia;
    private double precio;
    private int cantidad;



    private int pos; //Posicion en el carrito

    public Producto(){}

    public Producto(int id, String nombre, String familia, double precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.familia = familia;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }




@Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", familia='" + familia + '\'' +
                ", precio=" + precio +
                ", posicion='" + pos + '\'' +
                ", cantidad='" + cantidad + '\'' +
                '}';
    }



}