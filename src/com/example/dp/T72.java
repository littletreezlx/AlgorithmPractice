package com.example.dp;


/*
Edit Distance





 */
class T72 {

    public static void main(String[] args) {
        int[] array = {1,2,3};
    }


    public int minDistance(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        int[][] dp  = new int[l1 + 1][l2 + 1];
        if (l1 == 0){
            return l2;
        }
        if (l2 == 0){
            return l1;
        }

        if (word1.charAt(0) == word2.charAt(0)){
            dp[0][0] = 0;
        }else {
            dp[0][0] = 1;
        }

        for (int i = 0; i < l1; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j < l2; j++) {
            dp[0][j] = j;
        }


        for (int i = 1; i < l1; i++) {
            for (int j = 1; j < l2; j++) {

                if (word1.charAt(i) == word2.charAt(j)){
                    dp[i][j] = dp[i - 1][j - 1];
                }else {
                    int min = Integer.MAX_VALUE;
                    if (dp[i - 1][j] < min){
                        min = dp[i - 1][j];
                    }
                    if (dp[i][j - 1] < min){
                        min = dp[i - 1][j];
                    }
                    if (dp[i - 1][j] < min){
                        min = dp[i - 1][j - 1];
                    }

                    dp[i][j] = min + 1;
                }
            }
        }

        return dp[l1 - 1][l2 - 1];
    }
}

