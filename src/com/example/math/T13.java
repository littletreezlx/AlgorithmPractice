package com.example.math;


import java.util.HashMap;

/*
 Roman to Integer

 */
class T13 {

    public static void main(String[] args) {
        int[] array = {1,2,3};
    }


    public int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("M", 1000);
        map.put("D", 500);
        map.put("C", 100);
        map.put("L", 50);
        map.put("X", 10);
        map.put("V", 5);
        map.put("I", 1);

        map.put("CM", 900);
        map.put("CD", 400);
        map.put("XC", 90);
        map.put("XL", 40);
        map.put("IX", 9);
        map.put("IV", 4);

        int i = 0;
        int res = 0;
        String key;
        while (i < s.length()){
            if (i + 1 < s.length()){
                key = "" + s.charAt(i) + s.charAt(i+ 1);
                if (map.containsKey(key)){
                    res += map.get(key);
                    i += 2;
                    continue;
                }
            }

            key = "" + s.charAt(i);
            if (map.containsKey(key)){
                res += map.get(key);
                i ++;
            }
        }
        return res;
    }
}

