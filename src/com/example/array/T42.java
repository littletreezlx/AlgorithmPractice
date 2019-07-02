package com.example.array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Trapping Rain Water
 */
class T42 {

    public static void main(String[] args) {
        int[] array = {5,4,1,2};
        System.out.println(new T42().trap(array));
    }


    public int trap(int[] height) {
        if (height.length < 3) return 0;
        List<Integer> list = new ArrayList<>();
        int res = 0;
        if (height[0] > height[1]){
            list.add(0);
        }
        for (int i = 1; i < height.length - 1; i++) {
            if (height[i] > 0 && height[i] >= height[i - 1] && height[i] >= height[i + 1]){
                list.add(i);
            }
        }
        if (height[height.length - 1] > height[height.length - 2]){
            list.add(height.length - 1);
        }
        for (int i = 1; i < list.size() - 1; i++) {
            if (height[list.get(i)] < height[list.get(i - 1)] && height[list.get(i)] < height[list.get(i + 1)]){
                list.remove(i);
            }
        }


        for (int i = 0; i < list.size() - 1; i++) {
            int left = list.get(i);
            int right = list.get(i + 1);
            int depth = Math.min(height[left], height[right]);
            int rain = depth * (right - left - 1);
            for (int j = left + 1; j < right; j++) {
                rain -= Math.min(height[j], depth);
            }
            res += rain;
        }
        return res;
    }
}

