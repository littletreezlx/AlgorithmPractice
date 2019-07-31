package com.example.array;


/*
Maximum Average Subarray I

 */
class T643 {

    public static void main(String[] args) {
        int[] array = {1,12,-5,-6,50,3};
        System.out.println(new T643().findMaxAverage(array, 4));
    }


    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double max = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k];
            max = Math.max(max, sum);
        }
        return max / k;
    }
}

