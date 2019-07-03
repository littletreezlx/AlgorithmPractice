package com.example.template;

import sun.misc.FpUtils;

public class DP {


    public int dp(){
        //状态定义
        int[]dp = new int[666];

        //初始状态
        dp[0] = 0;

        //DP状态的推导
        for (int i = 0; i < dp.length; i++) {
            dp[i] = dp[i - 1] + 1;
        }

        //最优解
        return dp[dp.length - 1];
    }
}
