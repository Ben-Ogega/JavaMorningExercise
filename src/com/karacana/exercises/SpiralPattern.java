package com.karacana.exercises;

public class SpiralPattern {
    public static void main(String[] args) {
        int n = 5;
        int[][] arr = new int[n][n];
        int val = 2;
        int minCol = 0;
        int maxCol = n - 1;
        int minRow = 0;
        int maxRow = n - 1;
        while (val <= n * n) {
            for (int i = minCol; i <= maxCol; i++) {
                arr[minRow][i] = val;
                val++;
            }
            for (int i = minRow + 1; i <= maxRow; i++) {
                arr[i][maxCol] = val;
                val++;
            }
            for (int i = maxCol - 1; i >= minCol; i--) {
                arr[maxRow][i] = val;
                val++;
            }
            for (int i = maxRow - 1; i >= minRow + 1; i--) {
                arr[i][minCol] = val;
                val++;
            }
            minCol++;
            minRow++;
            maxCol--;
            maxRow--;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
