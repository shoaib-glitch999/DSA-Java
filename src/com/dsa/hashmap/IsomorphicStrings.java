package com.dsa.hashmap;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public static void main(String[] args) {

        String s = "egg";
        String t = "add";

        boolean isIsomorphic = true;

        if (s.length() != t.length()) {
            isIsomorphic = false;
        } else {

            Map<Character, Character> mapST = new HashMap<>();
            Map<Character, Character> mapTS = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {

                char c1 = s.charAt(i);
                char c2 = t.charAt(i);

                if (mapST.containsKey(c1) && mapST.get(c1) != c2) {
                    isIsomorphic = false;
                    break;
                }

                if (mapTS.containsKey(c2) && mapTS.get(c2) != c1) {
                    isIsomorphic = false;
                    break;
                }

                mapST.put(c1, c2);
                mapTS.put(c2, c1);
            }
        }

        System.out.println("Isomorphic = " + isIsomorphic);
    }
}