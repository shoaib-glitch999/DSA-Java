package com.dsa.searching;

public class FineEleLinear {

    public static void main(String[] args) {

        int[] arr = {12, 35, 87, 18, 99};

        int target = 18;

        int index = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {

                index = i;
                break;
            }
        }

        System.out.println(
            index != -1
                ? "Found at index -> " + index
                : "Not Found"
        );
    }
}