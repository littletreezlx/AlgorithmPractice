package com.example;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class T703 {

    public static void main(String[] args){
        int[] a = new int[] {};
        KthLargest obj = new KthLargest(3, a);


        System.out.println(obj.add(3));
        System.out.println(obj.add(5));
        System.out.println(obj.add(10));
        System.out.println(obj.add(9));


    }
}

class KthLargest {
    Queue<Integer> queue;
    int size;

    public KthLargest(int k, int[] nums) {

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        queue = new PriorityQueue(k, comparator);
        for (int i : nums){
            queue.offer(i);
        }

        while (queue.size() > k){
            queue.poll();
        }
        size = k;

    }

    public int add(int val) {
        queue.add(val);
        while (queue.size() > size){
            queue.poll();
        }
        return queue.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
