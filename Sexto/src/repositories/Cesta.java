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

    public void addProduct(Producto p ) {
        for(ProductoSeleccionado ps: this.getCesta())
        { if (ps.getId() == p.getId()){
            ps.setCantidad(ps.getCantidad()+1);
        }
        else{
        cesta.add(new ProductoSeleccionado(p));
        }
    }
    }
    public void removeProduct(ProductoSeleccionado producto){
        if (cesta.contains(producto)){
            producto.setCantidad(producto.getCantidad()-1);
        }if (producto.getCantidad()<=0){
            cesta.remove(producto);
        }
    }
}
