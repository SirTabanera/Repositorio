package repositories;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductoTest {

    @Test
    public void crearProductoNull(){
        Producto Producto = new Producto();
        Assert.assertNull(Producto.getId());
        Assert.assertNull(Producto.getName());
    }

    @Test
    public void crearProducto(){
        Producto Producto = new Producto(1, "cosa");
        Assert.assertNotNull(Producto);
    }

}
