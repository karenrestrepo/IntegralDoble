package org.example.PreParcial;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class InvertirLista {

    public static <T> List<T> invertirLista(List<T> lista) {
        List<T> copia = new ArrayList<>(lista); // Crear una copia de la lista original
        Collections.reverse(copia); // Invertir la copia
        return copia;
    }

    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        List<Integer> numerosInvertidos = invertirLista(numeros);
        System.out.println("Original: " + numeros);          // Imprime: Original: [1, 2, 3, 4, 5]
        System.out.println("Invertida: " + numerosInvertidos); // Imprime: Invertida: [5, 4, 3, 2, 1]
    }
}
