package com.example.array;


/*
Shortest Unsorted Continuous Subarray

 */
class T581 {

    public static void main(String[] args) {
        int[] array = {2,6,4,8,10,9,15};
        System.out.println(new T581().findUnsortedSubarray(array));
    }

    public int findUnsortedSubarray(int[] nums) {
        int minIndex = -1, maxIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            if (i > 0 && cur < nums[i - 1]){
                if (minIndex == -1 || cur < nums[minIndex]){
                    for (int j = 0; j < nums.length - 1; j++) {
                        if (cur < nums[j]){
                            minIndex = j;
                            break;
                        }
                    }
                }
            }

            if (i < nums.length - 1 && cur > nums[i + 1]) {
                if (maxIndex == -1 || cur > nums[maxIndex]){
                    for (int j = nums.length - 1; j > 0; j--) {
                        if (cur > nums[j]){
                            maxIndex = j;
                            break;
                        }
                    }
                }
            }
        }
        if (minIndex == -1){
            return 0;
        }else return maxIndex - minIndex +1;
    }

//    public int findUnsortedSubarray(int[] nums) {
//        int left = 1, right = nums.length - 1, minIndex = 0, maxIndex = 0, start = 0, end =0;
//
////        int  minIndex = 0, maxIndex = 0, start = 0, end =0;
//        List<Integer> valleys = new ArrayList<>();
//        List<Integer> peaks = new ArrayList<>();
//
//
//
//        for (int i = 1; i < nums.length; i++) {
//            int cur = nums[i];
//            if (cur < nums[i - 1]){
//                if (cur < nums[minIndex] || minIndex == 0){
//                    for (int j = 0; j < nums.length; j++) {
//                        if (cur <= nums[j]){
//                            minIndex = j;
//                            valleys.add(i);
//                            break;
//                        }
//                    }
//                }else {
//                    valleys.add(i);
//                }
//            }
//
//            if (i < nums.length - 1 && cur > nums[i + 1]) {
//                if (cur > nums[maxIndex] || maxIndex == 0){
//                    for (int j = nums.length - 1; j > 0; j--) {
//                        if (cur >= nums[j]){
//                            maxIndex = j;
//                            peaks.add(i);
//                            break;
//                        }
//                    }
//                }else {
//                    peaks.add(i);
//                }
//            }
//        }
//
//
//        if (minIndex == 0){
//            return 0;
//        }else return maxIndex - minIndex +1;
//    }


}

