package org.example.Recursividad.Dificil;

public class E22 {
    public static void main (String[] args){
        String conjunto = "ABC";
        subconjunto(conjunto, "", 0);
    }

    public static void subconjunto(String conjunto, String subconjuntoActual, int i){
        if (i == conjunto.length()){
            System.out.println("{" +subconjuntoActual+ "}");
        }else {
            subconjunto(conjunto, subconjuntoActual, i+1);
            subconjunto(conjunto, subconjuntoActual + conjunto.charAt(i), i+1);
        }
    }
}
