package com.dsa.arrays.java;

public class MoveZeroesEndArray {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 2};
        int index = 0;
        // Move all non-zero elements to the beginning
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        // Fill the remaining positions with zero
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
        // Display the array
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}