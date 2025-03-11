package org.example.Recursividad.Facil;

public class E6 {
    public static void main(String[] args){
        int numero = 123456789;
        int resultado = contarDigitos(numero);
        System.out.println("El número " +numero+ " tiene " +resultado+ " digitos");
    }

    private static int contarDigitos(int n) {
        if (n < 10 && n > -10){
            return 1;

        } else {
            return 1 + contarDigitos(n/10);
        }
    }
}
