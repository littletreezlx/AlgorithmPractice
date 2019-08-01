package com.example.array;


/*
Merge Sorted Array

 */
class T88 {


    public static void main(String[] args) {
        int[] s1 = {1,2,3,0,0,0};
        int[] s2 = {2,5,6};
        int m = 3;
        int n = 3;
        new T88().merge(s1, m, s2, n);
    }


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int len = m + n - 1;

        while (p1 >= 0  || p2 >= 0){
            if (p2 < 0) break;
            if (p1 < 0){
                while (len >= 0){
                    nums1[len] = nums2[len];
                    len--;
                }
                break;
            }

            if (nums2[p2] >= nums1[p1]){
                nums1[len] = nums2[p2];
                p2--;
            }else {
                nums1[len] = nums1[p1];
                p1--;
            }
            len--;
        }
    }
}

