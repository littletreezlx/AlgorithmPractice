package com.example.dp;


import java.util.Arrays;

/*
Best Time to Buy and Sell Stock III



 */
class T123 {

    public static void main(String[] args)
    {
        int[] array = {1,2,3,4,5};
        System.out.println(new T123().maxProfit(array));
    }


    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int b1s0 = -prices[0];
        int b1s1 = 0;
        int b2s1 = Integer.MIN_VALUE;
        int b2s2 = 0;

        for (int i = 1; i < prices.length; i++) {
            b1s0 = Math.max(b1s0, -prices[i]);
            b1s1 = Math.max(b1s1, b1s0 + prices[i]);
            b2s1 = Math.max(b2s1, b1s1 - prices[i]);
            b2s2 = Math.max(b2s2, b2s1 + prices[i]);

            int j =1;
        }
        return Math.max(b1s1, b2s2);
    }





//    public int maxProfit(int[] prices) {
//        if (prices == null || prices.length == 0){
//            return 0;
//        }
//
//        int[][][] mp = new int[prices.length][3][2];
//        //!!!
//        mp[0][0][1] = -prices[0];
//        mp[0][1][0] = 0;
//        mp[0][1][1] = Integer.MIN_VALUE;
//        mp[0][2][0] = 0;
//
//        for (int i = 1; i < prices.length; i++) {
//
//            int a = mp[i][0][1] = Math.max(mp[i - 1][0][1],
//                     - prices[i]);
//
//            int b = mp[i][1][0] = Math.max(mp[i - 1][1][0],
//                    mp[i - 1][0][1] + prices[i]);
//
//            int c = mp[i][1][1] = Math.max(mp[i - 1][1][1],
//                    mp[i - 1][1][0] - prices[i]);
//
//            int d =mp[i][2][0] = Math.max(mp[i - 1][2][0],
//                    mp[i - 1][1][1] + prices[i]);
//
//            }
//
//        return Math.max(mp[prices.length - 1][2][0], mp[prices.length - 1][1][0]);
//    }
}

