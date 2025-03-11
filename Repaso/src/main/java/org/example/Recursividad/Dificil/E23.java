package org.example.Recursividad.Dificil;

import java.util.ArrayList;
import java.util.List;

public class E23 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");

        int n = 3;
        generarCombinaciones(lista, "", 0, n);
    }

    private static void generarCombinaciones(List<String> lista, String combinacionActual, int i, int n) {
        if(combinacionActual.length() == n){
            System.out.println(combinacionActual);
            return;
        }
        if(i == lista.size()){
            return;
        }

        generarCombinaciones(lista, combinacionActual + lista.get(i), i+1, n);
        generarCombinaciones(lista, combinacionActual, i+1, n);
    }
}
