package org.example.PreParcial;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class UnionListas {

    public static <T> LinkedList<T> unirListas(List<T> lista1, List<T> lista2) {
        LinkedHashSet<T> conjuntoUnido = new LinkedHashSet<>();
        conjuntoUnido.addAll(lista1);
        conjuntoUnido.addAll(lista2);
        return new LinkedList<>(conjuntoUnido);
    }

    public static void main(String[] args) {
        List<Integer> lista1 = List.of(1, 2, 3, 4);
        List<Integer> lista2 = List.of(3, 4, 5, 6);

        LinkedList<Integer> listaUnida = unirListas(lista1, lista2);
        System.out.println(listaUnida);  // Debería imprimir: [1, 2, 3, 4, 5, 6]
    }
}
