package com.example.array;


/*
Non-decreasing Array

 */
class T655 {

    public static void main(String[] args) {
        int[] array = {4,2,3};
        System.out.println(new T655().checkPossibility(array));
    }


    public boolean checkPossibility(int[] nums) {
        int wrong = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]){
                wrong ++;
                if (wrong == 2) return false;

                if (i > 0 && i < nums.length - 2){
                    if (nums[i - 1] <= nums[i + 1]){
                        nums[i] = nums[i - 1];
                    }else {
                        nums[i + 1] = nums[i];
                    }
                }

            }
        }
        return true;
    }
}

