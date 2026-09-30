package com.dsa.arrays.java;

public class SecondLargEle {

    public static void main(String[] args) {

        int[] a = {38, 59, 69, 70, 90};

        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = a[i];
            } else if (a[i] > secondHighest && a[i] != firstHighest) {
                secondHighest = a[i];
            }
        }
        System.out.println("First largest: " + firstHighest);
        System.out.println("Second largest: " + secondHighest);
    }
}