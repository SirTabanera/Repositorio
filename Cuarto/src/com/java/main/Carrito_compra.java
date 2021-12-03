package com.java.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Carrito_compra {

    private Producto carrito;
    HashMap<Integer, Producto> mapa = new HashMap<>();

    public HashMap<Integer, Producto> getMapa(){return mapa;}

    public void setMapa(HashMap<Integer, Producto> mapa){this.mapa=mapa;}

    public Carrito_compra(Producto carrito){
        this.carrito= carrito;
    }
    public Producto getCarrito() {
        return carrito;
    }

    public void setCarrito(Producto carrito) {
        this.carrito = carrito;
    }

    //Añadir producto al carrito de la compra
    public void anadirProducto(Producto p){
        if(mapa.containsKey(p.getId())){
            int pos = p.getPos();
            p.setPos(pos+1); // Porque el mapa empezaria con clave 0 y tiene que empezar por la posicion 1
            mapa.put(carrito.getId(), p);
        }else{
            mapa.put(carrito.getId(), p);
        }
    }
     //Mostrar Carrito de la compra
    public ArrayList<Producto> MostrarCarrito(){
        ArrayList<Producto> lista= new ArrayList<>();
        Iterator it =mapa.keySet().iterator();
        while(it.hasNext()){
            int id = (Integer) it.next();
            Producto producto = mapa.get(id);
            lista.add(producto);
        }return lista;
    }

    // Mostrar el precio del carrito
    public double PrecioCarrito(){
        ArrayList<Producto> precio=new ArrayList<>();
        Iterator it= mapa.keySet().iterator();
        while(it.hasNext()){
            int p = (Integer) it.next();
            Producto producto = mapa.get(p);
        }
    }

    public void limpiarCarrito(){mapa.clear();}



}
