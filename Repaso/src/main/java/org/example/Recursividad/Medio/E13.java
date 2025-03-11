package org.example.Recursividad.Medio;

public class E13 {
    public static void main(String[] args) {
        int numero = 10;
        String binario = convertirBinario(numero);
        System.out.println("El número " + numero + " en binario es: " + binario);
    }

    private static String convertirBinario(int numero) {
        if (numero == 0){
            return "0";
        }
        if (numero == 1){
            return  "1";
        }
        return convertirBinario(numero / 2) + (numero%2);
    }
}
