package org.example.Recursividad.Facil;

public class E2 {
    public static void main(String[] args){
        int numero = 10;
        int resultado = fibonacci(numero);
        System.out.println("El " +numero+ " término de la serie de Fibonacci es: " + resultado);

    }

    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        } else if (n == 1) {
            return 1;

        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
