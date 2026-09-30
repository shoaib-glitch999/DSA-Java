package com.dsa.matrix.java;

public class RowSum {

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int totalSum = 0;

        for (int i = 0; i < matrix.length; i++) {

            int rowSum = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }

            totalSum += rowSum;

            System.out.println("Sum of row " + (i + 1) + " = " + rowSum);
        }

        System.out.println("Total sum = " + totalSum);
    }
}