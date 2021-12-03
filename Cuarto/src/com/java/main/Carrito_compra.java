package com.java.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Carrito_compra {

    private Producto carrito;
    HashMap<Integer,Producto> mapa=new HashMap<Integer,Producto>();

    public Carrito_compra(){

    }
    public Carrito_compra(Producto cart){
        this.carrito=cart;
    }
    public Producto getCarrito(){
        return carrito;
    }
    public void setCarrito(Producto cart){
        this.carrito=cart;
    }


    //Añadir producto al carrito de la compra
    public void anadirProducto(Producto p){
        if(mapa.containsKey(p.getId())){
            int pos = p.getPos();
            p.setPos(pos+1); // Porque el mapa empezaria con clave 0 y tiene que empezar por la posicion 1
            mapa.put(p.getId(), p);
        }else{
            mapa.put(p.getId(), p);
        }
    }
    public void borrarProducto(Producto p){
        if(mapa.containsKey(p.getId())){
            int num=p.getPos();
            p.setCantidad(num-1);
        }

    }
     //Mostrar Carrito de la compra
    public ArrayList<Producto> MostrarCarrito(){
        ArrayList<Producto> lista= new ArrayList<Producto>();
        Iterator it =mapa.keySet().iterator();
        while(it.hasNext()){
            int id = (Integer) it.next();
            Producto producto = mapa.get(id);
            lista.add(producto);
        }
        return lista;
    }

    // Mostrar el precio del carrito
    public double PrecioCarrito(){
        double precioTotal = 0.0;
        ArrayList<Producto> precio=new ArrayList<>();
        Iterator it= mapa.keySet().iterator();
        while(it.hasNext()){
            int p = (Integer) it.next();
            Producto producto = mapa.get(p);
           precioTotal+=producto.getPrecio()*producto.getCantidad();
        }return precioTotal;
    }
        // Vaciar el carrito
    public void limpiarCarrito(){mapa.clear();}




}
