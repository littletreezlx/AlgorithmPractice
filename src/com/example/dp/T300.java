package com.example.dp;


import java.util.ArrayList;
import java.util.List;

/*
Longest Increasing Subsequence

 */
class T300 {

    public static void main(String[] args) {
        int[] array = {10,9,2,5,3,7,101,18};
        System.out.println(new T300().lengthOfLIS(array));
    }


    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {

            int target = nums[i];
            if (target > list.get(list.size() - 1)){
                list.add(target);
            }else {
                //er fen
//                int left = 0;
//                int right = list.size() - 1;
//                while (){
//                    int mid = (left + right) / 2;
//                    if (list.get(mid) > target &&  target < list.get(mid + 1)){
//                    }
//                }



            }

        }

        return list.size();
    }


//    public int lengthOfLIS(int[] nums) {
//        if (nums == null || nums.length == 0){
//            return 0;
//        }
//
//        int[] l = new int[nums.length];
//        l[0] = 1;
//
//        for (int i = 1; i < nums.length; i++) {
//            l[i] = 1;
//            for (int j = 0; j < i; j++) {
//                if (nums[i] > nums[j]){
//                    l[i] = Math.max(l[i], l[j] + 1);
//                }
//            }
//
//        }
//
//        int res = Integer.MIN_VALUE;
//        for (int i = 0; i < l.length; i++) {
//            if (l[i] > res){
//                res = l[i];
//            }
//        }
//
//        return res;
//    }
}

