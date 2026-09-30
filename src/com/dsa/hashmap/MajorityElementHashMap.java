package com.dsa.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementHashMap {

    public static void main(String[] args) {

        int[] arr = {2, 2, 1, 1, 1, 2, 2};

        Map<Integer, Integer> frequency = new HashMap<>();

        int majorityElement = -1;

        for (int value : arr) {

            frequency.put(
                value,
                frequency.getOrDefault(value, 0) + 1
            );
        }

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {

            if (entry.getValue() > arr.length / 2) {

                majorityElement = entry.getKey();
                break;
            }
        }

        System.out.println("Majority element = " + majorityElement);
    }
}