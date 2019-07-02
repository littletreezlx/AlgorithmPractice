package com.example.array;


import java.util.HashSet;
import java.util.Set;

/*
Missing Number
 */
class T268 {

    public static void main(String[] args) {
        int[] array = {3,0,1};
        System.out.println(new T268().missingNumber(array));
    }


    //异或
    public int missingNumber(int[] nums) {
        int res = nums.length;
        for (int i = 0; i < nums.length; ++i){
            res ^= nums[i];
            res ^= i;
        }
        return res;
    }

//    public int missingNumber(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            set.add(nums[i]);
//        }
//        for (int i = 0; i < nums.length + 1; i++) {
//            if (!set.contains(i)){
//                return i;
//            }
//        }
//        return 0;
//    }


//    public int missingNumber(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums.length + 1; i++) {
//            set.add(i);
//        }
//        for (int i = 0; i < nums.length; i++) {
//            set.remove(nums[i]);
//        }
//        return set.iterator().next().intValue();
//    }
}

