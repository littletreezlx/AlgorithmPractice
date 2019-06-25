package com.example.dp;


import com.sun.xml.internal.bind.v2.model.core.ID;
import sun.misc.FpUtils;

import java.util.jar.JarEntry;

/*
Coin Change
 */
class T322 {

    public static void main(String[] args) {
        int[] array = {1};
        int i = 0;

        System.out.println(new T322().coinChange(array, i));
    }


    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i = 0; i < amount + 1; i++) {
            dp[i] = amount + 1;
        }
        dp[0] = 0;

        for (int i = 0; i < amount + 1; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j]){
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);

//                    int front = Math.min(dp[i], dp[i - coins[j]]);
//                    if (front != Integer.MAX_VALUE){
//                        dp[i] = Math.min(dp[i], dp[i - coins[j]]) + 1;
//                    }
                }
            }
        }

        if (dp[amount] > amount || dp[amount] ==0){
            return -1;
        }else return dp[amount];
    }



}

