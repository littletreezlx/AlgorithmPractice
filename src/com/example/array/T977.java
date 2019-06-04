package com.example.array;


import java.util.Arrays;

/*
Two Sums

 */
class T977 {

    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println(Arrays.toString(new T977().sortedSquares(array)));

    }

    public int[] sortedSquares(int[] A) {

        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0){
                A[i] = - A[i];
            }
        }
        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }

        return A;
    }


//    public int[] sortedSquares(int[] A) {
//
//        for (int i = 0; i < A.length; i++) {
//            if (A[i] < 0){
//                A[i] = - A[i];
//            }
//        }
//        Arrays.sort(A);
//
//        for (int i = 0; i < A.length; i++) {
//            A[i] = A[i] * A[i];
//        }
//
//        return A;
//    }
}

