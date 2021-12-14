package services;

import java.util.ArrayList;
import java.util.List;
import repositories.ProductoSeleccionado;
import Enum.Familia;

public class CestaServiceImpl implements CestaService {

    ArrayList cesta = new ArrayList<>();
    ArrayList compra = new ArrayList<>();

    ProductoSeleccionado product = new ProductoSeleccionado(1,"ordenador",1,1500.99, Familia.INFORMATICA);
    @Override
    public void addProduct() {
        if(cesta.contains(product)){
            product.setCantidad(product.getCantidad()+1);
        }else{
            cesta.add(product);
        }
    }

    @Override
    public void removeProduct() {
        if(cesta.contains(product)){
            product.setCantidad(product.getCantidad()-1);
        }if (product.getCantidad()<=0){
            cesta.remove(product);
        }

    }

    @Override
    public void clearCesta() {
        List list = new ArrayList<>();

    }

    @Override
    public void validateCesta() {
        for (int i =0; i<cesta.size();i++){
            compra.add(product);
        }

    }


}
