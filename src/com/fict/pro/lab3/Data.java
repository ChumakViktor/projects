package com.fict.pro.lab3;

public class Data {

    private static int n = 3;

    public static int[] vectorInitialize() {
        int[] V = new int[n];
        for (int i = 0; i < V.length; i++)
            V[i] = 1;
        return V;
    }

    public static void vectorOutput(int[] V) {
        if (V.length > 10)
            return;
        for (int i = 0; i < V.length; i++)
            System.out.print(V[i] + "   ");
        System.out.println();
    }

    public static int[][] matrixInitialize() {
        int[][] MX = new int[n][n];
        for (int i = 0; i < MX.length; i++)
            for (int j = 0; j < MX[0].length; j++)
                MX[i][j] = 1;
        return MX;
    }

    public static void matrixOutput(int[][] MX) {
        if (MX.length > 10 || MX[0].length > 10)
            return;
        for (int i = 0; i < MX[0].length; i++) {
            for (int j = 0; j < MX.length; j++)
                System.out.print(MX[i][j] + "   ");
            System.out.println();
        }
    }

    protected int[] vectorMultiplication(int[] V1, int[] V2) {
        if (V1.length != V2.length)
            throw new IllegalArgumentException("V1 length did not mach V2 length");
        int[] R = new int[V1.length];
        for (int i = 0; i < V1.length; i++)
            R[i] = V1[i] * V2[i];
        return R;
    }

    protected int[][] matrixMultiplication(int[][] MX1, int[][] MX2) {
        if (MX1.length != MX2[0].length)
            throw new IllegalArgumentException("MX1 rows did not match MX2 columns");
        int[][] R_MX = new int[MX1.length][MX2[0].length];
        for (int i = 0; i < MX1.length; i++)
            for (int j = 0; j < MX2[0].length; j++)
                for (int k = 0; k < MX1[0].length; k++)
                    R_MX[i][j] += MX1[i][k] * MX2[k][j];
        return R_MX;
    }

    protected int[] vectorAndMatrixMultiplication(int[] V, int[][] MX) {
        if (V.length != MX[0].length)
            throw new IllegalArgumentException("V length did not match MX columns");
        int[] R = new int[MX[0].length];
        for (int i = 0; i < MX.length; i++)
            for (int j = 0; j < MX[0].length; j++)
                R[i] += V[j] * MX[i][j];
        return R;
    }

    protected int[] vectorAndDigitMultiplication(int d, int[] V) {
        int[] R = new int[V.length];
        for (int i = 0; i < V.length; i++)
            R[i] = d * V[i];
        return R;
    }

    protected int[][] matrixSum(int[][] MX1, int[][] MX2) {
        if (MX1.length != MX2.length && MX1[0].length != MX2[0].length)
            throw new IllegalArgumentException("Matrix have different sizes");
        int[][] R_MX = new int[MX1.length][MX1[0].length];
        for (int i = 0; i < MX1.length; i++)
            for (int j = 0; j < MX1[0].length; j++)
                R_MX[i][j] += MX1[i][j] + MX2[i][j];
        return R_MX;
    }

    protected int matrixMaxValue(int[][] MX) {
        int maxValue = MX[0][0];
        for (int i = 1; i < MX.length - 1; i++)
            for (int j = 1; j < MX[0].length - 1; j++)
                if (maxValue < MX[i][j])
                    maxValue = MX[i][j];
        return maxValue;
    }

    protected int[] vectorSort(int[] V) {
        for (int i = V.length - 1; i < 0; i--)
            for (int j = 1; j < i; j++)
                if (V[j - 1] > V[j]) {
                    int buf = V[j - 1];
                    V[j - 1] = V[j];
                    V[j] = buf;
                }
        return V;
    }
}
