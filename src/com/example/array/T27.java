package com.example.array;


/*
Remove Element
原地算法可多用指针
 */
class T27 {

    public static void main(String[] args) {
        int[] array = {1,2,3};
    }



    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }



//    public int removeElement(int[] nums, int val) {
//        List<Integer> blank = new ArrayList<>();
//        int n = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == val){
//                blank.add(i);
//                n++;
//            }else {
//                if (blank.size() != 0){
//                    nums[blank.get(0)] = nums[i];
//                    blank.add(i);
//                    blank.remove(0);
//                }
//            }
//        }
//        return nums.length - n;
//    }
}

