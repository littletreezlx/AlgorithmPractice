package com.example.dp;


/*
Burst Balloons
 */
class T312 {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
    }


    public int maxCoins(int[] nums) {
        int[] dp = new int[nums.length + 1];

        dp[0] = Math.max(nums[0], nums[nums.length - 1]);
        dp[1] = dp[0] + nums[0] * nums[nums.length - 1];
        dp[2] = dp[1] + Math.
    }

}

