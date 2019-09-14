package com.example.string;


import java.util.HashSet;
import java.util.Set;

/*
Longest Substring Without Repeating Characters

 */
class T3 {

    public static void main(String[] args) {
        int[] array = {1,2,3};
    }


    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;

        Set set = new HashSet();
        int left = 0;
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                maxLen = Math.max(maxLen, set.size());
            }else {
                set.remove(s.charAt(left));
                left++;
                i--;
            }
        }
        return maxLen;
    }
}

