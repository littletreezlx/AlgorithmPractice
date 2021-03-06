package com.example.array;


/*
Remove Duplicates from Sorted Array
双指针
 */
class T26 {

    public static void main(String[] args) {
        int[] array = {1,2,3};
    }


    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int blank = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]){
                nums[blank] = nums[i];
                blank++;
            }
        }
        return blank;
    }
}

