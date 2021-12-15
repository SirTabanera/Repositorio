package services;


import repositories.Cesta;
import repositories.ProductoSeleccionado;

import java.util.ArrayList;
import java.util.List;


public class CestaServiceImpl implements CestaService {
    List<ProductoSeleccionado> listaProductoSeleccionados= new ArrayList<>();
   Cesta cesta = new Cesta();

    @Override
    public void addProduct() {

        cesta.setCesta(listaProductoSeleccionados);
    }

    @Override
    public void removeProduct() {
        if (cesta.getCesta()==listaProductoSeleccionados){
            cesta=new Cesta();
        }
    }

    @Override
    public void clearCesta() {
    }

}
