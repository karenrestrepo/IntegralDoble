package org.example.Recursividad.Medio;

public class E20 {
    public static void main(String[] args) {
        int num1= 20;
        int num2=3;
        int resultado = divisionResta(num1, num2);
        System.out.println("El resultado de la división es: " +resultado);
    }

    private static int divisionResta(int num1, int num2) {

        if (num1 < num2){
            return 0;
        }
        return 1 + divisionResta(num1-num2, num2);
    }
}
