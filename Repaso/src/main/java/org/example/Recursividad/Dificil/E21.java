package org.example.Recursividad.Dificil;

public class E21 {
    public static void main(String[] args) {
        int numeroDiscos = 3;
        hanoi(numeroDiscos, 'O', 'D', 'A');
    }

    private static void hanoi(int n, char origen, char destino, char auxiliar) {
        if (n == 1) {
            System.out.println("mover disco 1 de " +origen+ " a " +destino);
        }else {
            hanoi(n-1, origen, auxiliar, destino);
            System.out.println("mover disco" +n+ " de " +origen+ " a " +destino);
            hanoi( n-1, auxiliar, destino, origen);
        }
    }
}
