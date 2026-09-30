package com.dsa.twopointers;

import java.util.Arrays;

public class RemoveDupSortedArr {
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int slow = 0;
        for (int fast = 1; fast < arr.length; fast++) {
            if (arr[fast] != arr[slow]) {
                slow++;
                arr[slow] = arr[fast];
            }
        }
        return slow + 1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4};
        int uniqueCount = removeDuplicates(arr);
        
        System.out.println("Number of unique elements = " + uniqueCount);
        System.out.println(
            "Array after removing duplicates = "
            + Arrays.toString(Arrays.copyOf(arr, uniqueCount))
        );
    }
}