package com.dsa.arrays.java;

public class ArrayIndexValueDelete {

    public static void main(String[] args) {

        int[] arr1 = {12, 14, 16, 19};

        int deletePos = 2;

        // Create a new array with one less element
        int[] newArr = new int[arr1.length - 1];

        // Copy elements before the deletion position
        for (int i = 0; i < deletePos; i++) {
            newArr[i] = arr1[i];
        }

        // Copy elements after the deletion position
        for (int i = deletePos; i < newArr.length; i++) {
            newArr[i] = arr1[i + 1];
        }

        System.out.println("After deleting the element:");

        for (int value : newArr) {
            System.out.print(value + " ");
        }
    }
}