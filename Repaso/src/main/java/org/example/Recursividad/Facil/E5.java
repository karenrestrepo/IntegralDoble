package org.example.Recursividad.Facil;

public class E5 {
    public static void main(String[] args){
        int numero = 10;
        System.out.println("Cuenta regresiva: ");
        cuentaRegresiva(numero);
    }

    private static void cuentaRegresiva(int n) {
        if(n < 0){
            return;
        }
        else{
            System.out.println(n);
            cuentaRegresiva(n-1);
        }
    }
}
