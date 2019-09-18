package com.example;


import java.util.*;

/*
Top K Frequent Elements

 */
class T347 {

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        System.out.println(new T347().topKFrequent(arr, 2));
    }

    //动态
//        PriorityQueue<Entry> heap = new PriorityQueue<>(new Comparator<Entry>() {
//            @Override
//            public int compare(Entry o1, Entry o2) {
//                return o1.times - o2.times;
//            }
//        });

    public class Entry{
        public Entry(int key, int times) {
            this.key = key;
            this.times = times;
        }
        public int key;
        public int times;
    }


    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap(nums.length);
        for (int n : nums){
            if (!map.containsKey(n)){
                map.put(n,1);
            }else {
                map.put(n, map.get(n) + 1);
            }
        }
        Entry[] array = new Entry[map.keySet().size()];
        int i = -1;
        for (int key : map.keySet()){
            i ++;
            array[i] = new Entry(key, map.get(key));
        }
        return findKthLargest(array, k);
    }


    public List<Integer> findKthLargest(Entry[] nums, int k) {
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

        List<Integer> list = new LinkedList<>();
        for (int i = pivot; i < nums.length; i++) {
            list.add(nums[i].key);
        }
        return list;
    }



    //get High nums
    public int partition(Entry[] nums, int low, int high){
        Entry temp = nums[low];
        while (low < high){
            while (low < high && nums[high].times >= temp.times){
                high--;
            }
            nums[low] = nums[high];
            while (low < high && nums[low].times <= temp.times){
                low++;
            }
            nums[high] = nums[low];
        }
        nums[low] = temp;
        return low;
    }

}

