package org.example.Recursividad.Facil;

public class E4 {
    public static void main(String[] args){
        int base = 2;
        int exponente = 5;
        int resultado = potencia(base, exponente);
        System.out.println(base + " elevado a la " + exponente + " es: " +resultado);

    }

    public static int potencia(int base, int exponente){
        if(exponente == 0){
            return 1;
        } else {
            return base * potencia(base, exponente-1);
        }
    }
}
