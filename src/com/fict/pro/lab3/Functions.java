package com.fict.pro.lab3;

/**
 * Created by WORK on 06.10.2014.
 */
public class Functions extends Data {

    public int[] firstFunc(int[] B, int[][] MB, int[][] MC) {
        return vectorAndMatrixMultiplication(vectorSort(B), matrixMultiplication(MB, MC));
    }

    public int[][] secondFunc(int MA[][], int MB[][], int[][] MC, int[][] MX) {
        return matrixMultiplication(matrixSum(MA, MB), matrixMultiplication(matrixMultiplication(MA, MC), matrixSum(MB, MX)));
    }

    public int[] thirdFunction(int[][] MB, int[][] MM, int[] C) {
        return vectorAndDigitMultiplication(matrixMaxValue(matrixMultiplication(MB, MM)), C);
    }

}
