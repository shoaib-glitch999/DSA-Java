package com.dsa.hashmap;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        int k = 3;

        Map<Integer, Integer> prefixSumCount = new HashMap<>();

        prefixSumCount.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            prefixSum += arr[i];

            int requiredSum = prefixSum - k;

            if (prefixSumCount.containsKey(requiredSum)) {
                count += prefixSumCount.get(requiredSum);
            }

            prefixSumCount.put(
                prefixSum,
                prefixSumCount.getOrDefault(prefixSum, 0) + 1
            );
        }

        System.out.println("Number of subarrays = " + count);
    }
}