package com.dsa.searching;

public class PeakElement {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1};

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] < arr[mid + 1]) {

                low = mid + 1;

            } else {

                high = mid;
            }
        }

        System.out.println("Peak element index = " + low);
        System.out.println("Peak element = " + arr[low]);
    }
}