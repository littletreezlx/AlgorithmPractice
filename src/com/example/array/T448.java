package com.example.array;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Find All Numbers Disappeared in an Array
 */
class T448 {

    public static void main(String[] args) {
        int[] array = {1,2,3};
    }


    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int target = nums[Math.abs(nums[i]) - 1];
            if (target > 0){
                nums[Math.abs(nums[i]) - 1] = - target;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0){
                res.add(i + 1);
            }
        }
        return res;
    }


//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        List<Integer> res = new ArrayList<>();
//        Set<Integer> set = new HashSet<>();
//        for (int num : nums){
//            set.add(num);
//        }
//        for (int i = 1; i < nums.length + 1; i++) {
//            if (!set.contains(i)){
//                res.add(i);
//            }
//        }
//        return res;
//    }
}

