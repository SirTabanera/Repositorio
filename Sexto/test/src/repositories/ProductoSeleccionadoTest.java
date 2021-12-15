package repositories;

import org.junit.*;
import Enum.Familia;

public class ProductoSeleccionadoTest {
    @Test
    public void crearProductoSeleccionadoNull(){
        ProductoSeleccionado productoTest = new ProductoSeleccionado();
        Assert.assertNull(productoTest.getCantidad());
        Assert.assertNull(productoTest.getId());
        Assert.assertNull(productoTest.getName());
    }

    @Test
    public void crearProductoSeleccionado(){
        ProductoSeleccionado ProductoTest = new ProductoSeleccionado(1,"cosa",10,50.99, Familia.HOGAR);
        Assert.assertNotNull(ProductoTest);
    }

}
