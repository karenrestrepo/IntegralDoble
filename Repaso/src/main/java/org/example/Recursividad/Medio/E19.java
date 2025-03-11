package org.example.Recursividad.Medio;

public class E19 {
    public static void main(String[] args){
        int altura = 5;
        imprimirTriangulo(altura);
    }

    private static void imprimirTriangulo(int n) {
        if(n > 0){
            imprimirTriangulo(n - 1);
            imprimirLinea(n);
            System.out.println();
        }
    }

    private static void imprimirLinea(int n) {
        if (n > 0){
            System.out.print("*");
            imprimirLinea(n-1);
        }
    }
}
