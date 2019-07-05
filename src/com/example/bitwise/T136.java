package com.example.bitwise;


/*
Single Number


 */
class T136 {

    public static void main(String[] args) {
        int[] array = {1,2,3};
    }


    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums){
            res ^= num;
        }
        return res;
    }

}

