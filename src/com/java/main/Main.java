package com.java.main;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Map<Integer , String> equipo1 = new TreeMap<>();
        equipo1.put(1, "jugador 1");
        equipo1.put(2, "jugador 2");
        equipo1.put(3, "jugador 3");
        equipo1.put(4, "jugador 4");
        equipo1.put(5, "jugador 5");
        equipo1.put(6, "jugador 6");
        equipo1.put(7, "jugador 7");
        equipo1.put(8, "jugador 8");
        equipo1.put(9, "jugador 9");

        Iterator it = equipo1.keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + equipo1.get(key));
        }

    }
}


