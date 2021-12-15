package services;

import repositories.Cesta;
import repositories.ProductoSeleccionado;

import java.util.ArrayList;
import java.util.List;


public class CestaServiceImpl implements CestaService {

    ProductoSeleccionado product;
    List<ProductoSeleccionado> cesta = new ArrayList<>();
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
        cesta = new ArrayList<>();

    }

}
