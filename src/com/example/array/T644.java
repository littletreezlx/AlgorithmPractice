package com.example.array;


/*
Maximum Average Subarray I

 */
class T644 {

    public static void main(String[] args) {
//        int[] array = {1,12,-5,-6,50,3};

        int[] array = {7,4,5,8,8,3,9,8,7,6};
        int k =7;
        System.out.println(new T644().findMaxAverage(array, k));
    }


    public double findMaxAverage(int[] nums, int k) {
        double isum = 0;
        int n = k;
        for (int i = 0; i < k; i++) {
            isum += nums[i];
        }
        double curMean = isum / k;
        double maxMean = curMean;

        for (int i = k; i < nums.length; i++) {
            curMean = (curMean * n + nums[i]) / (n + 1);
            n++;
            double sum = curMean * n;
            int toDel = 0;
            for (int j = 1; j <= n - k; j++) {
                sum -= nums[i - n  + j];
                double tempMean = sum / (n - j);
                if (tempMean >= curMean){
                    toDel = j;
                    curMean = tempMean;
                }
            }
            n -= toDel;
            maxMean = Math.max(maxMean, curMean);
        }
        return maxMean;
    }


}

