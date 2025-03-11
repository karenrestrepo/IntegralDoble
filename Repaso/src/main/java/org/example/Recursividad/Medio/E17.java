package org.example.Recursividad.Medio;

import java.util.Arrays;
import java.util.List;

public class E17 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        int suma = sumaLista(lista, 0);
        System.out.println("La suma de la lista es: " +suma);
    }

    private static int sumaLista(List<Integer> lista, int i) {
        if (i >= lista.size()){
            return 0;
        }
        int suma = lista.get(i);
        return suma + sumaLista(lista, i+1);
    }
}
