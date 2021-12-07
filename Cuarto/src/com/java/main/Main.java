package com.java.main;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    //public HashMap<String,Carrito_compra> items= new HashMap<>();
    public static void main(String[] args) {
        Producto p1 = new Producto(1, "ordenador", "informatica", 1500.95, 1);
        Producto p2 = new Producto(2, "bicicleta", "deportes", 4500.00, 1);
        Producto p3 = new Producto(3, "zapatillas", "deportes", 50.95, 1);
        Producto p4 = new Producto(4, "auriculares", "audio", 100.80, 1);
        Producto p5 = new Producto(5, "television", "audio/video", 1499.99, 1);
        Producto p6 = new Producto(6, "videojuego", "consolas", 70.99, 1);
        Producto p7 = new Producto(7, "Cable Hdmi", "tecnologia", 12.35, 1);
        Producto p8 = new Producto(8, "usb", "informatica", 9.99, 1);


        //iniciamos el Carrito de la compra
        Carrito_compra carrito = new Carrito_compra();

        //   carrito.anadirProducto(p1);
        //   carrito.anadirProducto(p2);
        //   carrito.anadirProducto(p3);
        //   carrito.anadirProducto(p4);
        //   carrito.anadirProducto(p5);
        //   carrito.anadirProducto(p6);
        //   carrito.anadirProducto(p7);
        //   carrito.anadirProducto(p8);


        //creamos un bucle para mostrar en pantalla las opciones de nuestro carrito

        while (true) {
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("Menu Carrito");
            System.out.println("1. Mostrar Carrito");
            System.out.println("2. Añadir producto");
            System.out.println("3. Eliminar Producto");
            System.out.println("4. Examinar precio del carrito");
            System.out.println("5. Vaciar carrito");
            System.out.println("6. salir");
            System.out.println("Seleccione opcion: ");


            //añadimos entrada por teclado al menu del carrito
            Scanner s = new Scanner(System.in);
            String entrada = s.nextLine();

            switch (entrada) {
                case "1": {
                    //Mostrar carrito
                    ArrayList<Producto> lista = carrito.MostrarCarrito();
                    for (int i = 0; i < lista.size(); i++) {

                        System.out.print(lista.get(i).toString() + "," + "\n");

                    }
                    break;
                }
                case "2": {
                    System.out.println("Ingrese el producto para agregar:");
                    entrada = s.nextLine();
                    if (entrada.equals(p1.getNombre())) {
                        carrito.anadirProducto(p1);
                        System.out.println("Agregado con éxito !!");
                        break;
                    } else if (entrada.equals(p2.getNombre())) {
                        carrito.anadirProducto(p2);
                        System.out.println("Agregado con éxito !!");
                        break;
                    } else if (entrada.equals(p3.getNombre())) {
                        carrito.anadirProducto(p3);
                        System.out.println("Agregado con éxito !!");
                        break;
                    } else if (entrada.equals(p4.getNombre())) {
                        carrito.anadirProducto(p4);
                        System.out.println("Agregado con éxito !!");
                        break;
                    }else if (entrada.equals(p5.getNombre())) {
                        carrito.anadirProducto(p5);
                        System.out.println("Agregado con éxito !!");
                        break;
                    } else if (entrada.equals(p6.getNombre())) {
                        carrito.anadirProducto(p6);
                        System.out.println("Agregado con éxito !!");
                        break;
                    } else if (entrada.equals(p7.getNombre())) {
                        carrito.anadirProducto(p7);
                        System.out.println("Agregado con éxito !!");
                        break;
                    } else if (entrada.equals(p8.getNombre())) {
                        carrito.anadirProducto(p8);
                        System.out.println("Agregado con éxito !!");
                        break;
                    }  else {
                        System.out.println("Error de entrada");
                        break;
                    }

                }
                case "3": {
                    System.out.println("Ingrese el nombre del producto que se va a eliminar:");
                    entrada = s.nextLine();
                    if (entrada.equals(p1.getNombre())) {
                        carrito.borrarProducto(p1);
                        System.out.println("¡¡¡Eliminado con éxito !!!");
                        break;
                    } else if (entrada.equals(p2.getNombre())) {
                        carrito.borrarProducto(p2);
                        System.out.println("¡¡¡Eliminado con éxito !!!");
                        break;
                    } else if (entrada.equals(p3.getNombre())) {
                        carrito.borrarProducto(p3);
                        System.out.println("¡¡¡Eliminado con éxito !!!");
                        break;
                    } else if (entrada.equals(p4.getNombre())) {
                        carrito.borrarProducto(p4);
                        System.out.println("¡¡¡Eliminado con éxito !!!");
                        break;
                    } else if (entrada.equals(p5.getNombre())) {
                        carrito.borrarProducto(p5);
                        System.out.println("¡¡¡Eliminado con éxito !!!");
                        break;
                    } else if (entrada.equals(p6.getNombre())) {
                        carrito.borrarProducto(p6);
                        System.out.println("¡¡¡Eliminado con éxito !!!");
                        break;
                    } else if (entrada.equals(p7.getNombre())) {
                        carrito.borrarProducto(p7);
                        System.out.println("¡¡¡Eliminado con éxito !!!");
                        break;
                    } else if (entrada.equals(p8.getNombre())) {
                        carrito.borrarProducto(p8);
                        System.out.println("¡¡¡Eliminado con éxito !!!");
                        break;
                    } else {
                        System.out.println("Error de entrada");
                        break;
                    }

                } case "4":{
                    System.out.println("El precio del carrito es "+ carrito.PrecioCarrito());
                }
                case "5": {
                    carrito.limpiarCarrito();
                }
                case "6": {
                    System.out.println("Finalizando...");
                    return;
                } case "0":{return;}
                default:break;

            }
        }
    }
}