package repositories;


import java.util.ArrayList;
import java.util.List;

public class Cesta {
private List<ProductoSeleccionado> cesta= new ArrayList<>();

    public void crearCesta(List cesta, ProductoSeleccionado productoSeleccionado){
    this.cesta=cesta;
    cesta.add(productoSeleccionado);
    }

    public List<ProductoSeleccionado> getCesta() {
        return cesta;
    }

    public void setCesta(List<ProductoSeleccionado> cesta) {
        this.cesta = cesta;
    }

    @Override
    public String toString() {
        return "Cesta{" +
                "cesta=" + cesta +
                '}';
    }

}
