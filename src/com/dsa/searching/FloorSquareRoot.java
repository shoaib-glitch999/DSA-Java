package com.dsa.searching;

public class FloorSquareRoot {

    public static void main(String[] args) {

        int n = 20;

        int low = 0;
        int high = n;

        int answer = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (mid * mid <= n) {

                answer = mid;
                low = mid + 1;

            } else {

                high = mid - 1;
            }
        }

        System.out.println("Floor square root = " + answer);
    }
}