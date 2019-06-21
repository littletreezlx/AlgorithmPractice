package com.example.dp;


import java.util.ResourceBundle;

/*
Maximum Product Subarray
 */
class T152 {

    public static void main(String[] args) {
        int[] array = {2,3,-2,4,10};
        new T152().maxProduct(array);
    }


    public int maxProduct(int[] nums) {
        if (nums.length == 1) return nums[0];

        int[] max = new int[nums.length];
        int[] min = new int[nums.length];
        int res = max[0] = min[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (nums[i] > 0){
                max[i] = Math.max(max[i - 1] * num, num);
                min[i] = Math.min(min[i - 1] * num, min[i]);
            }else {
                min[i] = Math.min(max[i - 1] * num, num);
                max[i] = Math.max(min[i - 1] * num, max[i]);
            }

            if (max[i] > res){
                res = max[i];
            }
        }

        return res;
    }
}

