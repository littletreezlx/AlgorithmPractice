package com.example.array;


import java.util.Arrays;

/*
Flipping an Image
两数不同则不变的方法反而要慢？（2ms）

 */
class T832 {

    public static void main(String[] args) {
        int[][] array = {{0,0,0}};
        int[][] fixedrray = new T832().flipAndInvertImage(array);
        System.out.println();
    }



    public int[][] flipAndInvertImage(int[][] A) {

        for (int i = 0; i < A.length; i++){

            int length = A[i].length;
            for (int j = 0; j < length / 2; j++){
                int t = length - 1 - j;
                if (A[i][j] == A[i][t]){
                    A[i][j] = A[i][t] = 1 - A[i][j];
                }
            }
            if (length % 2 == 1){
                A[i][length / 2] = 1 - A[i][length / 2];
            }
        }

        return A;
    }

//    public int[][] flipAndInvertImage(int[][] A) {
//
//        for (int i = 0; i < A.length; i++){
//
//            int length = A[i].length;
//            for (int j = 0; j < length / 2; j++){
//                int mid = A[i][j];
//                A[i][j] = 1 - A[i][length - 1 - j];
//                A[i][length - 1 - j] = 1 - mid;
//            }
//
//            if (length % 2 == 1){
//                A[i][length / 2] = 1 - A[i][length / 2];
//            }
//        }
//
//        return A;
//    }
}

