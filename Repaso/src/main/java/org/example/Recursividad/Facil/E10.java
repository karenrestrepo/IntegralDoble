package org.example.Recursividad.Facil;

public class E10 {
    public static void main(String[] args) {
        String palabra = "holiwi";
        boolean resultado = esPalindromo(palabra);

        if (resultado){
            System.out.println("La palabra " +palabra+ " es un palindromo");
        } else {
            System.out.println("La palabra " +palabra+ " no es un palindromo");
        }
    }

    private static boolean esPalindromo(String palabra) {
        if (palabra.length() <= 1){
            return true;

        }
        if (palabra.charAt(0) != palabra.charAt(palabra.length()-1)){
            return false;

        }
        return esPalindromo(palabra.substring(1, palabra.length()-1));
    }
}
