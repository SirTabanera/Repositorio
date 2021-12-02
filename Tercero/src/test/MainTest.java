package test;
import java.util.*;

import com.java.main.JugadorSeleccion;
import org.junit.*;

public class MainTest  {
    @Test
    public void mapIsEmptyTest (){
        Map <String, JugadorSeleccion> jugadores = new TreeMap<>();
        Assert.assertEquals(1,1);
        Assert.assertTrue("true", jugadores.isEmpty() );

    }
    @Test
    public void mapIsNotEmptyTest (){
        Map <String, JugadorSeleccion> jugadores = new TreeMap<>();
        jugadores.put("Busquets", new JugadorSeleccion(16, "Busquets", "Medio Centro"));
        Assert.assertEquals(1,1);
        Assert.assertFalse("false", jugadores.isEmpty() );

    }
    @Test
    public void longitudMapa() {
        Map <String, JugadorSeleccion> jugadores = new TreeMap<>();
        jugadores.put("Busquets", new JugadorSeleccion(16, "Busquets", "Medio Centro"));
        Assert.assertEquals(1, jugadores.size());

    }

}
