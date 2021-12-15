package repositories;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;
import Enum.Familia;

public class CestaTest {
    @Test
    public void crearCestaTest(){
        Cesta cestaPrueba = new Cesta();
        List<ProductoSeleccionado> lista = new ArrayList<>();
        ProductoSeleccionado producto1 = new ProductoSeleccionado(1,"cosa",1, 1.00, Familia.HOGAR);
        cestaPrueba.crearCesta(lista,producto1);
        Assert.assertNotNull(cestaPrueba);
    }

    @Test
    public void crearCestaVacia(){
        Cesta cestaPrueba = new Cesta();


    }
}
