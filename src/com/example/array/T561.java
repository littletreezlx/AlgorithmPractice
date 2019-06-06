package com.example.array;


import java.util.Arrays;

/*
Array Partition I

 */
class T561 {

    public static void main(String[] args) {
        int[] array = {1,2,3};
    }


    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            sum += nums[i * 2];
        }
        return sum;
    }
}

