package org.example.Recursividad.Facil;

public class E3 {
    public static void main(String[] args){
        int entero = 123654;
        int resultado = sumaDigitos(entero);
        System.out.println("La suma de los digitos del entero " +entero+ " es:" +resultado);
    }

    public static int sumaDigitos( int e){
        if(e < 10){
            return e;
        } else {
            return (e%10) + sumaDigitos(e/10);
        }
    }
}
