package repositories;

import Enum.Familia;

public class ProductoSeleccionado extends Producto {
    Integer cantidad;
    double price =0.0;

    public ProductoSeleccionado(Integer id, String name, Integer cantidad, double price, Familia familia){
        super();
    }
    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
