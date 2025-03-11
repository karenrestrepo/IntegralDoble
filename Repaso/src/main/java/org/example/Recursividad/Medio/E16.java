package org.example.Recursividad.Medio;

import java.util.Arrays;

public class E16 {
    public static void main(String[] args) {
        int[] arreglo = {10, 7, 8, 9, 1, 5};
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        quickSort(arreglo, 0, arreglo.length-1);
        System.out.println("arreglo ordenado: " + Arrays.toString(arreglo));
    }

    private static void quickSort(int[] arreglo, int inicio, int fin) {
        if (inicio < fin){
            int indicePivote = particion(arreglo, inicio, fin, inicio, inicio-1);
            quickSort(arreglo, inicio, indicePivote-1);
            quickSort(arreglo, indicePivote+1, fin);
        }
    }

    private static int particion(int[] arreglo, int inicio, int fin, int j, int i) {
        if (j == fin){
            intercambiar(arreglo, i+1, fin);
            return i+1;
        }
        int pivote = arreglo[fin];
        if (arreglo[j] <= pivote) { // Si el elemento es menor o igual al pivote
            i++;
            intercambiar(arreglo, i, j); // Intercambiar elementos
        }

        return particion(arreglo, inicio, fin, j + 1, i); // Llamada recursiva para el siguiente elemento
    }

    private static void intercambiar(int[] arreglo, int i, int j) {
        if (i != j) { // Solo intercambiar si son posiciones diferentes
            int temp = arreglo[i];
            arreglo[i] = arreglo[j];
            arreglo[j] = temp;
        }
    }
}
