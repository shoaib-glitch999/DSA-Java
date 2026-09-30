package com.dsa.arrays.java;

public class LeftRotationArr {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int totalLeftRotations = 2;
        int doneLeftRotations = 0;

        while (doneLeftRotations < totalLeftRotations) {

            int temp = arr[0];

            // Shift elements one position to the left
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            // Place the first element at the end
            arr[arr.length - 1] = temp;

            doneLeftRotations++;
        }

        System.out.println("Array after left rotation:");

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}