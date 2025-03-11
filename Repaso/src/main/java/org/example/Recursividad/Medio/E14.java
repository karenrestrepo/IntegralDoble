package org.example.Recursividad.Medio;

public class E14 {
    public static void main(String[] args) {
        String palabra = "colombiana";
        char letra = 'a';
        String resultado = eliminarLetra(palabra, letra);
        System.out.println("La palabra sin la letra " + letra+ " quedaría: " +resultado);
    }

    private static String  eliminarLetra(String palabra, char letra) {
        if (palabra.isEmpty()){
            return "";

        }
        char caracter1 = palabra.charAt(0);
        String resto = eliminarLetra(palabra.substring(1), letra);

        if (caracter1 == letra){
            return resto;

        } else {
            return caracter1 + resto;
        }
    }
}
