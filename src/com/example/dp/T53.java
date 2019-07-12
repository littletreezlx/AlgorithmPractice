package com.example.dp;


/*
Maximum Subarray
 */
class T53 {

    public static void main(String[] args) {
        int[] array = {1,2,3};
    }


    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
            res = dp[i] > res ? dp[i] : res;
        }
        return res;
    }
}

