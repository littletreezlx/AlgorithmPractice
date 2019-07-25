package com.example.binary_search;


/*
Search Insert Position

 */
class T35 {

    public static void main(String[] args) {
        int[] array = {1,3,5,6};
        int t = 7;
        System.out.println(new T35().searchInsert(array,t));
    }


    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if (nums[0] >= target) return 0;
        if (nums[right] == target) return right;
        if (nums[right] < target) return right + 1;

        while (left <= right){
            int mid = (left + right) / 2;

            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] > target){
                if (nums[mid - 1] < target){
                    return mid;
                }
                right = mid;
            }else {
                if (nums[mid + 1] > target){
                    return mid + 1;
                }
                left = mid;
            }
        }

        return 0;
    }
}

