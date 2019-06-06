package com.example.array;


import java.util.Arrays;

/*
Height Checker
 */
class T1051 {

    public static void main(String[] args) {
        int[] array = {1,2,3};
    }


    public int heightChecker(int[] heights) {
        int[] fixedHeights = heights.clone();
        Arrays.sort(fixedHeights);

        int times = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != fixedHeights[i]){
                times++ ;
            }
        }
        return times;
    }
}

