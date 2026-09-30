package com.dsa.arrays.java;

public class AverageOfArray {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        int sum = 0;
        int n = arr.length;

        double avg;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        avg = (double) sum / n;

        System.out.println("Average = " + avg);
    }
}