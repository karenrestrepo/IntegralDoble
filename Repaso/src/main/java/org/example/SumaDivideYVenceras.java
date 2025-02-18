package org.example;

public class SumaDivideYVenceras {
    public static void main(String[] args) {

        int[] arreglo = {1, 2, 3, 4, 5};
        int sumaTotal = sumaDivideYVenceras(arreglo);
        System.out.println("La suma total del arreglo es: " + sumaTotal);
    }


    private static int sumaDivideYVenceras(int[] arreglo){
        int inicio = 0;
        int fin =  arreglo.length - 1;
        return sumaDivideYVenceras(arreglo, inicio, fin);
    }
    private static int sumaDivideYVenceras(int[] arreglo, int inicio, int fin) {
        // Caso base: Si el arreglo tiene un solo elemento
        if (inicio == fin) {
            return arreglo[inicio];
        } else {
            // Dividir el arreglo en dos mitades
            int medio = (inicio + fin) / 2;

            // Llamadas recursivas para las dos mitades
            int sumaIzquierda = sumaDivideYVenceras(arreglo, inicio, medio);
            int sumaDerecha = sumaDivideYVenceras(arreglo, medio + 1, fin);

            // Combinar resultados
            return sumaIzquierda + sumaDerecha;
        }
    }


}

