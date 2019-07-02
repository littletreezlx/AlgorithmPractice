package com.example.array;


import java.util.Arrays;

/*
Move Zeroes
 */
class T283 {

    public static void main(String[] args) {
        int[] array = {1,2,3};
    }



    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        Arrays.fill(nums, j, nums.length, 0);
    }


    //没法保持顺序。。。
//    public void moveZeroes(int[] nums) {
//        int right = nums.length - 1;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0){
//                while (nums[right] == 0 && right > i){
//                    right --;
//                }
//                //
//                int temp = nums[i];
//                nums[i] = nums[right];
//                nums[right] = temp;
//            }
//        }
//    }
}

