package com.java.main;

class Producto {
    private int id; //Identificador de producto
    private String nombre;
    private String familia;
    private int precio;



    private int pos; //Posicion en el carrito



    public Producto(int id, String nombre, String familia, int precio, int pos) {
        this.id = id;
        this.nombre = nombre;
        this.familia = familia;
        this.precio = precio;
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

    public int getPrecio() {
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


    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", familia='" + familia + '\'' +
                ", precio=" + precio +
                ", posicion='" + pos + '\'' +
                '}';
    }



}