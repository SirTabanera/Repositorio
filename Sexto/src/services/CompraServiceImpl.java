package services;

import repositories.ProductoSeleccionado;
import services.CestaServiceImpl.*;

public class CompraServiceImpl implements CompraService {

    @Override
    public void CalculatePrice() {
        double totalAmount =0.0;
        for (int i = 0; i< compra.size(); i++){
            totalAmount += product.getCantidad()* product.getPrice();
        }

    }
}
