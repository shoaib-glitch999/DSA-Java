package com.dsa.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public static void main(String[] args) {

        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String word : words) {

            char[] chars = word.toCharArray();

            Arrays.sort(chars);

            String key = new String(chars);

            anagramGroups
                .computeIfAbsent(key, k -> new ArrayList<>())
                .add(word);
        }

        System.out.println("Grouped Anagrams:");

        for (List<String> group : anagramGroups.values()) {
            System.out.println(group);
        }
    }
}