package org.example;

public class ValorK {
    public static int Y(int[] A, int B, int C) {
        if (B > C) {
            return 0;
        }
        if (B == C) {
            return A[B];
        }
        int D = (B + C) / 2;
        int E = Y(A, B, D);
        int F = Y(A, D + 1, C);
        return G(E, F);
    }
    private static int G(int H, int I) {
        return H > I ? H : I;
    }
    public static void main(String[] args) {
        int[] J = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int K = Y(J, 0, J.length - 1);
        System.out.println(K);
    }
}
