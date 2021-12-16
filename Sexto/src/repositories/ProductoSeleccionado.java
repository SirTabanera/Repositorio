package repositories;

import Enum.Familia;
import java.lang.*;

public class ProductoSeleccionado extends Producto {
    private Integer cantidad;
    private double price =0.0;



    public ProductoSeleccionado(Integer id, String name, Integer cantidad, double price, Familia familia){
        super(id, name);
        this.cantidad= cantidad;
        this.price=price;
    }
    public ProductoSeleccionado(Producto producto){
        super(producto.getId(), producto.getName());
    }
    public ProductoSeleccionado (){}

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
    @Override
    public String toString() {
        return "ProductoSeleccionado{" +
                "cantidad=" + cantidad +
                ", price=" + price +
                "} " + super.toString();
    }

}
