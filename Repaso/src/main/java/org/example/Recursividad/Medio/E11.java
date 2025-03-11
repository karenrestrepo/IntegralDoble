package org.example.Recursividad.Medio;

public class E11 {
    public static void main(String[] args){
        int num1 = 5;
        int num2 = 3;
        int resultado = producto(num1, num2);
        System.out.println("el producto de "+ num1 + " y " +num2+ " es: "+resultado);
    }

    public static int producto(int num1, int num2) {
        if(num2 == 1){
            return num1;
        }else {
            return num1 + producto(num1, num2-1);
        }
    }
}
