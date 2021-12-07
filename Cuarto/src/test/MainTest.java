package test;


import com.java.main.Producto;
import org.junit.Assert;
import org.junit.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class MainTest {
    //se declara el mapa con el que haremos los test
    HashMap<Integer,Producto> mapa=new HashMap<Integer,Producto>();

    @Test
    public void añadirElementoTest(){ // Test para comprobar que el elemnto se añade al mapa con un prducto vacio
        Producto p= new Producto();//Se declara un objeto nulo ya que no necesitamos mas paramentros
        if(mapa.containsKey(p.getId())){
            int pos = p.getPos();
            p.setPos(pos+1);
            mapa.put(p.getId(), p);
        }else{
            mapa.put(p.getId(), p);
        }

        Assert.assertEquals(1 , mapa.size());

    }
 @Test
    public void borrarElementoTest(){
     Producto p= new Producto();
     mapa.put(p.getId(), p);
     if(mapa.containsKey(p.getId())){
         int num=p.getPos();
         p.setCantidad(num-1);

         if (p.getCantidad()<=0){//Si la cantidad de dicho producto es menor o igual a 0 se elimina del mapa
             mapa.remove(p.getId());
         }
     }
     Assert.assertEquals(0, mapa.size());
 }

@Test
    public void mostrarCarritoTest(){
        Producto p= new Producto();
        Producto p1 = new Producto(1, "ordenador", "informatica", 1500.95, 1);
        Producto p2 = new Producto(2, "bicicleta", "deportes", 4500.00, 1);
        Producto p3 = new Producto(3, "zapatillas", "deportes", 50.95, 1);

        mapa.put(p.getId(), p);
        mapa. put(p1.getId(), p1);
        mapa. put(p2.getId(), p2);
        mapa. put(p3.getId(), p3);
        Assert.assertEquals(4, mapa.size());
        //pasamos el mapa a un Array ya que es mas sencillo para imprimirlo por pantalla junto con saltos de linea
        ArrayList<Producto> lista= new ArrayList<Producto>();
        Iterator it =mapa.keySet().iterator();
        while(it.hasNext()){
        int id = (Integer) it.next();
        Producto producto = mapa.get(id);
        lista.add(producto );
        }
        // Se comentan estas lineas ya que son las que imprimen la lista y no hay un comando especifico de limpieza de pantalla
        //for (int i = 0; i < lista.size(); i++) {

        //System.out.print(lista.get(i).toString() + "," + "\n");


        //}

    }
    @Test
    public void mostrarPrecioCarritoTest(){
        //declaramos dos productos
        Producto p1 = new Producto(1, "ordenador", "informatica", 1500.95, 1);
        Producto p2 = new Producto(2, "bicicleta", "deportes", 4500.00, 1);

        //añadimos dichos productos
        mapa. put(p1.getId(), p1);
        mapa. put(p2.getId(), p2);

        //para ello crearemos una variable PrecioTotal de caracter double la cual sera un sumatorio de los precios de los productos
        double PrecioTotal = 0.0; // y la iniciamos a 0.0 ya que sera una suma de las demas
        Iterator it= mapa.keySet().iterator();
        while(it.hasNext()){
            int p = (Integer) it.next();
            Producto producto = mapa.get(p);
            PrecioTotal+=producto.getPrecio()*producto.getCantidad();
        }

        Assert.assertEquals(6000.95, PrecioTotal, 0);//se declara una variable delta como precision posible ya que el metodo simple esta deprecado
    }
    @Test
    public void vaciarCarritoTest() {
        Producto  p= new Producto();
        mapa.put(p.getId(),p);
        mapa.clear();
        Assert.assertTrue("true", mapa.isEmpty());
    }
}
