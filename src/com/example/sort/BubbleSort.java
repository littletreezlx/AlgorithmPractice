package com.example.sort;


import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

    static int[] array=new int[]{1,3,5,7,9,2,4,6,8,10} ;

    public static void main(String[] args) {
        int[] updatedArray=bubbleSort(array);
        System.out.println(Arrays.toString(updatedArray));

    }

    private static int[] bubbleSort(int[] array){
        int i,j;
        boolean isSwaped=true;
        for (i=0; i<array.length+1 && isSwaped; i++){
            isSwaped=false;
            for (j=0; j<array.length-1-i ;j++){
                if (array[j]>array[j+1]){
                    SwapUtil.swap(array,j,j+1);
                    isSwaped=true;
                }
            }
        }
        return array;

    }


}
