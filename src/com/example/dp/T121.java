package com.example.dp;


/*
Best Time to Buy and Sell Stock

 */
class T121 {

    public static void main(String[] args) {
        int[] array = {1,2,3};
    }


    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int res = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min){
                min = prices[i];
                continue;
            }
            res = Math.max(prices[i] - min, res);
        }
        return res;
    }
}

