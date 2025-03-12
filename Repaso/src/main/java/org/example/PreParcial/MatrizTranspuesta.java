package org.example.PreParcial;

public class MatrizTranspuesta {

    public static int[][] transponer(int[][] matriz, int i, int j, int[][] resultado) {
        if (i >= matriz.length) {
            return resultado;
        }
        if (j >= matriz[0].length) {
            return transponer(matriz, i + 1, 0, resultado);
        }

        resultado[j][i] = matriz[i][j];
        return transponer(matriz, i, j + 1, resultado);
    }

    public static int[][] obtenerTranspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] resultado = new int[columnas][filas];
        return transponer(matriz, 0, 0, resultado);
    }

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] transpuesta = obtenerTranspuesta(matriz);

        for (int i = 0; i < transpuesta.length; i++) {
            for (int j = 0; j < transpuesta[0].length; j++) {
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
}

