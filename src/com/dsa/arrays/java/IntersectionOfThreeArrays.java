package com.dsa.arrays.java;

public class IntersectionOfThreeArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 6};
        int[] arr3 = {2, 3, 4, 7};

        System.out.println("Intersection of three arrays:");

        for (int i = 0; i < arr1.length; i++) {
            boolean alreadyPrinted = false;
            // Avoid printing duplicate elements
            for (int k = 0; k < i; k++) {
                if (arr1[k] == arr1[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (alreadyPrinted) {
                continue;
            }
            boolean foundInArr2 = false;
            boolean foundInArr3 = false;
            // Check in second array
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    foundInArr2 = true;
                    break;
                }
            }
            // Check in third array
            for (int j = 0; j < arr3.length; j++) {
                if (arr1[i] == arr3[j]) {
                    foundInArr3 = true;
                    break;
                }
            }
            if (foundInArr2 && foundInArr3) {
                System.out.println(arr1[i]);
            }
        }
    }
}