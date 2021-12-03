package test;
import java.util.*;

import com.java.main.JugadorSeleccion;
import com.sun.source.tree.AssertTree;
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
    public void longitudMapaTest() {
        Map <String, JugadorSeleccion> jugadores = new TreeMap<>();
        jugadores.put("Busquets", new JugadorSeleccion(16, "Busquets", "Medio Centro"));
        Assert.assertEquals(1, jugadores.size());

    }

    @Test
    public void testAssertMap() {
        Map <String, JugadorSeleccion> jugadores = new TreeMap<>();
        mapIsEmptyTest();
        jugadores.put("Casillas", new JugadorSeleccion(1, "Casillas", "Portero"));
        jugadores.put("Ramos", new JugadorSeleccion(15, "Ramos", "Lateral Derecho"));
        jugadores.put("Pique", new JugadorSeleccion(13, "Pique", "Central"));
        jugadores.put("Puyol", new JugadorSeleccion(5, "Puyol", "Central"));
        jugadores.put("Capdevila", new JugadorSeleccion(11, "Capdevila", "Lateral Izquierdo"));
        Assert.assertNotNull(jugadores);
        Assert.assertTrue("Casillas", jugadores.containsKey("Casillas"));
        Assert.assertFalse(jugadores.containsKey("Pepe"));

    }

    @Test
    public void Test () {
        Map <String, JugadorSeleccion> jugadores = new TreeMap<>();
        Assert.assertNotNull(jugadores);
        Throwable exception = Assert.assertThrows(
                IllegalArgumentException.class,
                () -> {
                    throw new IllegalArgumentException("Exception message");
                }
        );
        Assert.assertEquals("Exception message", exception.getMessage());


    }
}
