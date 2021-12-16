package repositories;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cesta {
private List<ProductoSeleccionado> cesta;

    /*public void crearCesta(List<ProductoSeleccionado> cesta, ProductoSeleccionado productoSeleccionado){
    this.cesta=cesta;
    cesta.add(productoSeleccionado);
    }*/

    public List<ProductoSeleccionado> getCesta() {
        return cesta;
    }

    @Override
    public String toString() {
        return "Cesta{" +
                "cesta=" + cesta +
                '}';
    }

    public Cesta(){
        this.cesta= new ArrayList<>();
    }
    public Cesta(List<ProductoSeleccionado> cesta){
        this.cesta=cesta;
    }
    public Cesta(ProductoSeleccionado producto){
        this.cesta= Arrays.asList(producto);
    }
    public void addProduct(ProductoSeleccionado producto){
        cesta.add(producto);
        if (cesta.contains(producto)){
            producto.setCantidad(producto.cantidad++);
        }
    }
    public void removeProduct(ProductoSeleccionado producto){
        if (cesta.contains(producto)){
            producto.setCantidad(producto.cantidad--);
        }if (producto.getCantidad()<=0){
            cesta.remove(producto);
        }
    }
}
