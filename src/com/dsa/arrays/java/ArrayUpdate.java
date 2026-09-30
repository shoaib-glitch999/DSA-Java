package com.dsa.arrays.java;

public class ArrayUpdate {

    public static void main(String[] args) {

        int[] arr = {10, 20, 40, 50};

        int pos = 2;
        int value = 30;

        // Update the element at the given position
        arr[pos] = value;

        // Display the updated array
        System.out.println("Array after update:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}