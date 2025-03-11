package org.example.Recursividad.Facil;

public class E9 {
    public static void main(String[]args){
        int num1 = 56;
        int num2 = 98;
        int resultado = calcularMcd(num1, num2);
        System.out.println("El MCD de " +num1+ " y " +num2+ " es: " +resultado);
    }

    private static int calcularMcd(int num1, int num2) {
        if ( num2 == 0){
            return num1;

        } else {
            return calcularMcd(num2, num1 % num2);
        }
    }
}
