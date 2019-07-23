package com.example.hashmap;


import java.util.HashMap;

public class T242 {

    public static void main(String[] args) {
        if (isAnagram("a","aa")){
            System.out.println("T");
        }else {
            System.out.println("F");

        }
    }

    public static boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map1 = new HashMap();
        HashMap<Character, Integer> map2 = new HashMap();

        for (char c : s.toCharArray()){
            if (map1.get(c) == null){
                map1.put(c, 1);
            }else {
                map1.put(c, map1.get(c) + 1);
            }
        }

        for (char c : t.toCharArray()){
            if (map2.get(c) == null){
                map2.put(c, 1);
            }else {
                map2.put(c, map2.get(c) + 1);
            }
        }

        return map1.equals(map2);
    }

}

