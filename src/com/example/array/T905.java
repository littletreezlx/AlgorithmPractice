package com.example.array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Sort Array By Parity
 */
class T905 {

    public static void main(String[] args) {
        int[] array = {3,1,2,4};


    }

    public int[] sortArrayByParity(int[] A) {
        int i = 0;
        int j = A.length - 1;

        while (i < j){
            if (A[i] % 2 == 0){
                i++;
            }else {
                if (A[j] % 2 == 0){
                    int mid = A[i];
                    A[i] = A[j];
                    A[j] = mid;
                    i++;
                    j--;
                }else {
                    j--;
                }
            }
        }
        return A;
    }

//    public int[] sortArrayByParity(int[] A) {
//
//        List<Integer> oddList = new ArrayList();
//        List<Integer> evenList = new ArrayList();
//        int[] fixedA = new int[A.length];
//
//        for (int i = 0; i < A.length; i++) {
//            if (A[i] % 2 == 0){
//                evenList.add(A[i]);
//            }else {
//                oddList.add(A[i]);
//            }
//        }
//        evenList.addAll(oddList);
//        int[] res = new int[A.length];
//
//        for (int i = 0; i < evenList.size(); i++) {
//            res[i] = evenList.get(i);
//        }
//
//        return res;
//    }
}

