package com.example.recursion;


import java.util.ArrayList;
import java.util.List;

/*
Subsets
 */
class T78 {

    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println(new T78().subsets(array));
    }


    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n =  (int) Math.pow(2, nums.length) - 1;

        for (int i = 0; i <= n; i++) {
            List<Integer> list = new ArrayList<>();
            int t = i;
            for (int j = 0; j < nums.length; j++) {
                if ((t & 1) == 1){
                    list.add(nums[j]);
                }
                t >>= 1;
            }
            res.add(list);
        }
        return res;
    }



//    public List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> ans = new ArrayList<>();
//        getAns(nums, 0, new ArrayList<>(), ans);
//        return ans;
//    }
//
//    private void getAns(int[] nums, int start, ArrayList<Integer> temp, List<List<Integer>> ans) {
//        ans.add(new ArrayList<>(temp));
//        for (int i = start; i < nums.length; i++) {
//            temp.add(nums[i]);
//            getAns(nums, i + 1, temp, ans);
//            temp.remove(temp.size() - 1);
//        }
//    }


}

