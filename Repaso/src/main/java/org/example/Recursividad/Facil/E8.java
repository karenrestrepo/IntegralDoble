package org.example.Recursividad.Facil;

public class E8 {
    public static void main(String[] args) {
        int numero = 5;
        int resultado = sumaNaturales(numero);
        System.out.println("La suma de los primeros " +numero+" números naturales es "+resultado);
    }

    private static int sumaNaturales(int numero) {
        if(numero == 0) {
            return 0;
        } else {
            return numero + sumaNaturales(numero-1);
        }
    }
}
