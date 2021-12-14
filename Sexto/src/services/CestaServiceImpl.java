package services;

import java.util.ArrayList;
import java.util.List;
import repositories.ProductoSeleccionado;

public class CestaServiceImpl implements CestaService {


    ProductoSeleccionado product = new ProductoSeleccionado();
    ArrayList cesta = new ArrayList<>();
    /*static*/ ArrayList compra = new ArrayList<>();

    public CestaServiceImpl(ProductoSeleccionado product) {
        this.product = product;
    }


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
