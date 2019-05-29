package com.example;


import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.Arrays;
import java.util.HashMap;

/*
Majority Element
 */
public class T169 {

    public static void main(String[] args) {
    }


    public int majorityElement(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        HashMap<Integer, Integer> map = new HashMap();
        for (int i : nums){
            if (!map.containsKey(i)){
                map.put(i, 1);
            }else {
                int times = map.get(i) + 1;
                if (times > nums.length / 2){
                    return i;
                }
                map.put(i, times);
            }
        }
        return 0;
    }
}

