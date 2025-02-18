package org.example;

public class BuscarNumero {
    public static void main(String[] args) {
        int [] vector = {3, 4, 7, 9, 12, 13, 21, 29};
        int objetivo = 29;
        int posicion = busquedaBinaria(vector, objetivo);
        if (posicion != -1){
            System.out.println("El número " + objetivo + " fue encontrado en la posición " + posicion);
        } else {
            System.out.println("El número " + objetivo + " no fue encontrado");
        }
    }

    private static int busquedaBinaria(int[] vector, int objetivo) {
        return busquedaBinaria(vector, 0, vector.length-1, objetivo);
    }

    private static int busquedaBinaria(int[] vector, int inicio, int fin, int objetivo) {
        if (inicio > fin) {
            return -1;
        }
        int mitad = (inicio + fin) / 2;
        if (vector[mitad] == objetivo) {
            return mitad;
        }
        if (objetivo < vector[mitad]) {
            return busquedaBinaria(vector, inicio, mitad - 1, objetivo);
        }
        return busquedaBinaria(vector, mitad + 1, fin, objetivo);
    }
}
