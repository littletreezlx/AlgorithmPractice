package com.example.sort;


import java.util.Arrays;

public class StraightInsetionSort {

    static int[] array=new int[]{1,3,5,7,9,2,4,6,8,10} ;

    public static void main(String[] args) {

        int[] updatedArray=straightInsetionSort(array);
        System.out.println(Arrays.toString(updatedArray));

    }

    private static int[] straightInsetionSort(int[] array){

        int i,j,min;
        for (i=1; i<array.length; i++){
            int target=array[i];
            for (j=i-1; j>=0; j--){
                if (array[j]>target){
                    array[j+1]=array[j];
                }else {
                    break;
                }
            }
            array[j+1]=target;

        }
        return array;

    }


}
