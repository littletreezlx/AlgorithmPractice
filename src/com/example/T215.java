package com.example;


/*
 Kth Largest Element in an Array

 */
class T215 {

    public static void main(String[] args) {
        int[] arr = { 3,2,1,5,6,4 };
        System.out.println(new T215().findKthLargest(arr, 2));
    }


    public int findKthLargest(int[] nums, int k) {
        int high = nums.length - 1;
        int low = 0;
        int pivot = partition(nums, low ,high);

        //pivot是第几大的数
        int pth = nums.length - pivot;
        while (k != pth){
            if (k < pth){
                low = pivot + 1;
            }else {
                high = pivot - 1;
            }
            pivot = partition(nums, low ,high);
            pth = nums.length - pivot;
        }

        return nums[pivot];
    }



    //get High nums
    public int partition(int[] nums, int low, int high){
        int temp = nums[low];
        while (low < high){
            while (low < high && nums[high] >= temp){
                high--;
            }
            nums[low] = nums[high];
            while (low < high && nums[low] <= temp){
                low++;
            }
            nums[high] = nums[low];
        }
        nums[low] = temp;
        return low;
    }
}

