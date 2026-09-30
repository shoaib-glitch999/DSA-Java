package com.dsa.searching;

public class LowerBound {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 4, 5, 7};

        int target = 8;

        int low = 0;
        int high = arr.length - 1;

        int answer = arr.length;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {

                answer = mid;
                high = mid - 1;

            } else {

                low = mid + 1;
            }
        }

        System.out.println("Lower bound index = " + answer);
    }
}
