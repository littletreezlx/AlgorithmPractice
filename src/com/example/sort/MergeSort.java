package com.example.sort;

import java.util.Arrays;

public class MergeSort {


    static int[] array=new int[]{1,3,5,7,9,2,4,6,8,10} ;

    public static void main(String[] args) {
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

    }

    private static void mergeSort(int[] array, int p, int r){


        if (p >= r) return;
        //middle index
//        int q = (p + r) / 2;

        //!
        int q = p + (r - p) /2;

        mergeSort(array, p, q);
        mergeSort(array, q+1, r);



        merge(array, p, q, r);
    }


    private static void merge(int[] array, int p, int q, int r){
        int i = p;
        int j = q+1;
        int k = 0;
        int[] tmp = new int[r-p+1];

        while (i <= q && j <= r){
            if (array[i] <= array[j]){
                tmp[k++] = array[i++];
            }else {
                tmp[k++] = array[j++];
            }
        }

        int start =i;
        int end = q;
        if (j <= r){
            start = j;
            end = r;
        }

        while (start <= end ){
            tmp[k++] = array[start++];
        }

        for (i=0; i<= r-p; ++i){
            array[p+i] = tmp[i];
        }


    }




}
