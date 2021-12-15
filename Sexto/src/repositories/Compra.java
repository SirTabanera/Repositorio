package repositories;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    private List<Cesta> compra = new ArrayList<Cesta>();


    public void crearCompra(List compra, Usuarios usuarios){
        this.compra=compra;
        usuarios.Usuario(usuarios.getEmail(), usuarios.getNombre());
    }
    public List<Cesta> getCompra() {
        return compra;
    }

    public void setCompra(List<Cesta> compra) {
        this.compra = compra;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "compra=" + compra +
                '}';
    }
}
