package com.dsa.matrix.java;

public class ColumnSum {

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int totalSum = 0;

        for (int j = 0; j < matrix[0].length; j++) {

            int columnSum = 0;

            for (int i = 0; i < matrix.length; i++) {
                columnSum += matrix[i][j];
            }

            totalSum += columnSum;

            System.out.println("Sum of column " + (j + 1) + " = " + columnSum);
        }

        System.out.println("Total column sum = " + totalSum);
    }
}
