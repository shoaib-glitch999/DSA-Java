package com.dsa.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Sort left half
            mergeSort(arr, left, mid);
            // Sort right half
            mergeSort(arr, mid + 1, right);
            // Merge both sorted halves
            merge(arr, left, mid, right);
        }
    }
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        // Copy elements into left array
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        // Copy elements into right array
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = left;
        // Compare and merge
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        // Copy remaining left elements
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        // Copy remaining right elements
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 3, 7, 4, 6, 11, 13};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
