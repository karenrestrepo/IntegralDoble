package org.example.Recursividad.Medio;

public class E12 {
    public static void main(String[] args) {
        int numero = 8;
        int resultado = padovan(numero);
        System.out.println("El término " + numero + " de la serie de Padovan es: " + resultado);
    }

    private static int padovan(int n) {
        if(n==0 || n==1 || n==2){
            return 1;
        }
        return padovan(n-2) + padovan(n-3);
    }
}
