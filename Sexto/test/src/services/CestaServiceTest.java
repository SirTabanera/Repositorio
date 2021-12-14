package services;

import org.testng.Assert;
import org.testng.annotations.Test;
import Enum.Familia;
import repositories.ProductoSeleccionado;

import java.util.ArrayList;

public class CestaServiceTest {
    @Test
    public void addProductTest(){
        ArrayList cesta = new ArrayList<>();
        ProductoSeleccionado productoSeleccionado = new ProductoSeleccionado(1,"ordenador", 1,1500,Familia.INFORMATICA);
        CestaService.addProduct();
        Assert.assertEquals(1, cesta.size());
    }
}
