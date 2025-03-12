package org.example.PreParcial;

public class MultiplicacionArray {

    public static int multiplicar(int[] arreglo, int inicio, int fin) {
        if (inicio == fin) { // Caso base: un solo elemento
            return arreglo[inicio];
        }
        int medio = (inicio + fin) / 2;
        int productoIzquierda = multiplicar(arreglo, inicio, medio); // Parte izquierda
        int productoDerecha = multiplicar(arreglo, medio + 1, fin);  // Parte derecha

        return productoIzquierda * productoDerecha; // Combina los resultados
    }

    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int resultado = multiplicar(arreglo, 0, arreglo.length - 1);
        System.out.println("Producto del arreglo: " + resultado); // Debería imprimir 3,628,800
    }
}
