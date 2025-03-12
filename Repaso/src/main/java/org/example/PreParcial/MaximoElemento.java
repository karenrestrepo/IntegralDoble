package org.example.PreParcial;
import java.util.Collections;
import java.util.List;

public class MaximoElemento {

    public static <T extends Comparable<T>> T obtenerMaximo(List<T> lista) {
        return Collections.max(lista);
    }

    public static void main(String[] args) {
        List<Integer> numeros = List.of(3, 5, 1, 8, 2);
        System.out.println("Máximo: " + obtenerMaximo(numeros)); // Debería imprimir: Máximo: 8

        List<String> palabras = List.of("manzana", "banana", "pera", "kiwi");
        System.out.println("Máximo: " + obtenerMaximo(palabras)); // Debería imprimir: Máximo: pera
    }
}
