package com.dsa.arrays.java;

public class MajorityEleArr {

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 3, 2, 2, 1, 1};

        int majority = -1;

        int majorityRange = arr.length / 2;

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > majorityRange) {
                majority = arr[i];
                break;
            }
        }

        System.out.println("The majority element: " + majority);
    }
}