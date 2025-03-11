package org.example.Recursividad.Facil;

public class E1 {
    public static void main(String[] args){
        int numero= 5;
        int resultado = factorial(numero);
        System.out.println("El factorial de " +numero+ " es: " + resultado);

    }
    public static int factorial(int n){
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}
