package com.example.queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;


// 错很多次- -边界条件真重要
// 用多一个list存储了index数组，来比较最大数在框外的情况。
public class T239 {

    public static void main(String[] args) {
        int[] a = {1, -1};
        int[] b = maxSlidingWindow(a, 1);
        System.out.println(Arrays.toString(b));

    }

    public static int[] maxSlidingWindow(int[] nums, int k) {

        //fk
        if (nums == null || nums.length == 0 && k <= 0 ){
            return new int[] {};
        }

        int t = nums.length - k + 1;
        int[] resultIndex =new int[t];
        int[] result =new int[t];
        Deque<Integer> deque = new ArrayDeque<>();
        //
        int n = 0;



        for (int index = 0; index < nums.length; index ++ ){

            //上一个最大数在框外

            if (n > 0 && index - resultIndex[n - 1] > k - 1){
                deque.pollFirst();
            }


            if (deque.size() != 0){
                //大于第一个直接清空
                if (nums[index] > nums[deque.peekFirst()]) {
                    deque.clear();
                }
                //不大于则按从大到小顺序排列；
                else {
                    while (nums[index] > nums[deque.peekLast()]){
                        deque.pollLast();
                    }
                }
            }

            deque.addLast(index);

            //从第一个框开始计数
            if (index > k - 2){
                resultIndex[n] = deque.peekFirst();
                n ++;
            }
        }


        for (int i = 0; i < resultIndex.length; i++){
            result[i] = nums[resultIndex[i]];
        }
        return result;
    }
}
