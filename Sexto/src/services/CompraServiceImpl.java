package services;


import repositories.ProductoSeleccionado;
import services.CestaServiceImpl;
import java.util.ArrayList;



public class CompraServiceImpl implements CompraService {



    @Override
    public void calculatePrice() {
        double totalAmount =0.0;
        for (int i = 0; i< compra.size(); i++){
            totalAmount += product.getCantidad()* product.getPrice();
        }

    }
}
