package repositories;

import org.junit.*;

public class CompraTest {
    @Test
    public void crearUsuarioVacio(){
        Usuarios usuario = new Usuarios();
        Assert.assertNull(usuario.getEmail());
        Assert.assertNull(usuario.getNombre());
    }
    @Test
    public void crearCestaVacio(){
       Cesta cesta = new Cesta();
        System.out.println(cesta);
    }

}
