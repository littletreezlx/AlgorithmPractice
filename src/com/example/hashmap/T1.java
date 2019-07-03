package com.example.hashmap;


import java.util.*;

/*
Two Sums
https://leetcode-cn.com/problems/two-sum/solution/liang-shu-zhi-he-by-leetcode-2/
官方的两边哈希法在给定数组中元素情况的情况下会造成hashmap.put出错
而一遍哈希法是先判断再加入，避免了出错，又能使前2个数就是答案的极端情况下快速出解。
附Hashmap的小心得，把最终需要的值作为value而不是key，把中间需要的值作为key &&  把会有重复的作为value，不会重复的作为key
不坚持这一点会在需要数组下标的时候会造成思维混乱。
 */
class T1 {

    public static void main(String[] args) {
        int a[] = {3,3};
//        System.out.println(Arrays.toString(twoSum(a, 6)));
    }


    public  int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0){
            return new int[]{};
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int val = target - nums[i];
            if (map.containsKey(val)){
                return new int[]{map.get(val), i};
            }
            map.put(nums[i], i);
        }

        return new int[] {};
    }

}

