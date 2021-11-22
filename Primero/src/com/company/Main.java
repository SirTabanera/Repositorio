package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("hola mundo");
        metodos operaciones = new metodos();
        Scanner entrada = new Scanner(System.in);
         int n1, n2, resultados, opcion;
         boolean op= true;
         while (op) {
             System.out.println("+++++++++++++++++++++++++++++");
             System.out.println("Menu");
             System.out.println("1. Sumar");
             System.out.println("2. Restar");
             System.out.println("3. Multiplicar");
             System.out.println("4. Dividir");
             System.out.println("5. salir");
             System.out.println("Seleccione opcion: ");
             opcion = entrada.nextInt();

             if (opcion == 5) {
                 System.out.println("Finalizo....");
                 break;
             } else {
                 switch (opcion){
                     case 1:
                         System.out.println("ingrese el primer valor: ");
                         n1 = entrada.nextInt();
                         System.out.println("ingrese el segundo valor: ");
                         n2 = entrada.nextInt();
                         resultados = operaciones.sumar(n1, n2);
                         System.out.println("La suma es: "+ resultados);
                         break;
                     case 2:
                         System.out.println("ingrese el primer valor: ");
                         n1 = entrada.nextInt();
                         System.out.println("ingrese el segundo valor: ");
                         n2 = entrada.nextInt();
                         resultados = operaciones.restar(n1, n2);
                         System.out.println("La resta es: "+ resultados);
                         break;
                     case 3:
                         System.out.println("ingrese el primer valor: ");
                         n1 = entrada.nextInt();
                         System.out.println("ingrese el segundo valor: ");
                         n2 = entrada.nextInt();
                         resultados = operaciones.multiplicar(n1, n2);
                         System.out.println("La multiplicacion es: "+ resultados);
                         break;
                     case 4:
                         System.out.println("ingrese el primer valor: ");
                         n1 = entrada.nextInt();
                         System.out.println("ingrese el segundo valor: ");
                         n2 = entrada.nextInt();
                         resultados = operaciones.dividir(n1, n2);
                         System.out.println("La division es: "+ resultados);
                         break;
                 }
             }
         }

    }
}
