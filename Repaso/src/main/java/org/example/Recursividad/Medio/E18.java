package org.example.Recursividad.Medio;

import java.util.Arrays;
import java.util.List;

public class E18 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5);
        int elemento = 5;
        boolean encontrado = buscarElemento(lista, elemento, 0);
        if (encontrado){
            System.out.println("Se ha encontrado en la lista el elemento " +elemento);
        } else {
            System.out.println("No se ha encontrado en la lista el elemento " +elemento);
        }
    }

    private static boolean buscarElemento(List<Integer> lista, int elemento, int i) {
        if(i == lista.size()){
            return false;
        } else if (lista.get(i) == elemento) {
            return true;
        } else {
            return buscarElemento(lista, elemento, i+1);
        }
    }
}
