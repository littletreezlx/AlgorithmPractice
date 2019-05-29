package com.example;


/*
Two Sums

 */
public class T122 {

    public static void main(String[] args) {
    }


    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0 || prices.length == 1){
            return 0;
        }

        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++){
            if (prices[i] < prices[i + 1]){
                profit += prices[i + 1] - prices[i];
            }
        }
        return profit;
    }
}

