package org.example.Recursividad.Dificil;

import java.util.ArrayList;
import java.util.List;

public class E25 {

    public static void generarPermutaciones(List<String> lista, String resultado) {
        // Caso base: si la lista está vacía, imprimir la permutación generada
        if (lista.isEmpty()) {
            System.out.println(resultado);
            return;
        }

        generarPermutacionRecursiva(lista, resultado, 0);
    }

    private static void generarPermutacionRecursiva(List<String> lista, String resultado, int indice) {
        // Caso base: si el índice supera el tamaño de la lista, retornar
        if (indice >= lista.size()) {
            return;
        }

        // Crear una nueva lista sin el elemento actual
        List<String> nuevaLista = new ArrayList<>(lista);
        String elemento = nuevaLista.remove(indice);

        // Llamada recursiva para seguir generando permutaciones con el elemento actual
        generarPermutaciones(nuevaLista, resultado + elemento);

        // Llamada recursiva para el siguiente índice
        generarPermutacionRecursiva(lista, resultado, indice + 1);
    }

    public static void main(String[] args) {
        List<String> elementos = new ArrayList<>();
        elementos.add("A");
        elementos.add("B");
        elementos.add("C");

        generarPermutaciones(elementos, "");
    }
}

