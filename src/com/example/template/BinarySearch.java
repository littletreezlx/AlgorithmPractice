package com.example.template;

public class BinarySearch {



    public int binarySearch(int[] array ,int target){
        int left = 0;
        int right = 0;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (mid == target){
                return mid;
            }else if (mid < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
}
