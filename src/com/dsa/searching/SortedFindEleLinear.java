package com.dsa.searching;

public class SortedFindEleLinear {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 6};

        int target = 4;

        int index = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > target) {
                break;
            }

            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        System.out.println(
            index != -1
                ? "Found at index -> " + index
                : "Not Found -> " + index
        );
    }
}