package org.example.Recursividad.Medio;

public class E15 {
    public static void main(String[]args){
        int[] lista = {1, 11, 1, 5, 6, 1, 8, 1};
        int numero = 1;
        int resultado = conteoOcurrencia(lista, numero, 0);
        System.out.println("En la lista se encuentra " +resultado+ " veces el número " + numero);
    }

    private static int conteoOcurrencia(int[] lista, int numero, int i) {
        int ocurrencia = 0;
        if(i > lista.length-1){
            return 0;
        } else if(lista[i] == numero){
            ocurrencia+=1;
        }
        return ocurrencia + conteoOcurrencia(lista, numero, i+1);
    }


}
