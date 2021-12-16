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

    }

    @Override
    public void removeProduct() {
    }


}
