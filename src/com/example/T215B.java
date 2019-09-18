package com.example;


import java.util.PriorityQueue;

/*
 Kth Largest Element in an Array

 */
class T215B {

    public static void main(String[] args) {
        int[] arr = { 3,2,1,5,6,4 };
        System.out.println(new T215B().findKthLargest(arr, 2));
    }


    public int findKthLargest(int[] nums, int k) {
        // init heap 'the smallest element first'
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>((n1, n2) -> n1 - n2);

        // keep k largest elements in the heap
        for (int n: nums) {
            heap.add(n);
            if (heap.size() > k)
                heap.poll();
        }

        // output
        return heap.poll();
    }


}

