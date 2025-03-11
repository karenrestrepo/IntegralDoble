package org.example.Recursividad.Facil;

public class E7 {
    public static void main(String[] args) {
        String cadena = "Estructura de datos";
        String resultado = invertirCadena(cadena);
        System.out.println(cadena + " invertida es: " + resultado);
    }

    private static String invertirCadena(String cadena) {
        if (cadena.isEmpty()){
            return cadena;
        }else {
            return invertirCadena(cadena.substring(1)) + cadena.charAt(0);
        }
    }
}
