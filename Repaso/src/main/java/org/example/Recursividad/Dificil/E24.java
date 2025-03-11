package org.example.Recursividad.Dificil;

public class E24 {
    public static void main(String[] args) {
        int[][] tablero = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (!resolverSudoku(tablero, 0, 0)) {
            System.out.println("No se encontró solución.");
        }
    }

    public static boolean resolverSudoku(int[][] tablero, int fila, int columna) {
        if (fila == 9) { // Se ha completado todo el tablero
            imprimirTablero(tablero, 0, 0);
            return true;
        }

        if (columna == 9) { // Se completó la fila actual, avanzar a la siguiente
            return resolverSudoku(tablero, fila + 1, 0);
        }

        if (tablero[fila][columna] != 0) { // La celda ya está llena, avanzar a la siguiente columna
            return resolverSudoku(tablero, fila, columna + 1);
        }

        return probarNumero(tablero, fila, columna, 1);
    }

    private static boolean probarNumero(int[][] tablero, int fila, int columna, int num) {
        if (num > 9) { // Ya se probaron todos los números
            return false;
        }

        if (esValido(tablero, fila, columna, num, 0, 0)) {
            tablero[fila][columna] = num;

            if (resolverSudoku(tablero, fila, columna + 1)) {
                return true;
            }

            tablero[fila][columna] = 0; // Deshacer movimiento
        }

        return probarNumero(tablero, fila, columna, num + 1);
    }

    public static boolean esValido(int[][] tablero, int fila, int columna, int num, int i, int j) {
        if (i < 9) { // Verificar fila y columna
            if (tablero[fila][i] == num || tablero[i][columna] == num) {
                return false;
            }
            return esValido(tablero, fila, columna, num, i + 1, j);
        }

        if (j < 9) { // Verificar subcuadro 3x3
            int subFila = (fila / 3) * 3 + j / 3;
            int subColumna = (columna / 3) * 3 + j % 3;
            if (tablero[subFila][subColumna] == num) {
                return false;
            }
            return esValido(tablero, fila, columna, num, i, j + 1);
        }

        return true; // Todo está bien
    }

    public static void imprimirTablero(int[][] tablero, int fila, int columna) {
        if (fila == 9) {
            return; // Fin del tablero
        }

        if (columna == 9) {
            System.out.println();
            imprimirTablero(tablero, fila + 1, 0);
            return;
        }

        System.out.print(tablero[fila][columna] + " ");
        imprimirTablero(tablero, fila, columna + 1);
    }



}

