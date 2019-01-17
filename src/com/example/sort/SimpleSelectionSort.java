package com.example.sort;


import java.util.Arrays;

public class SimpleSelectionSort {

    static int[] array=new int[]{1,3,5,7,9,2,4,6,8,10} ;

    public static void main(String[] args) {
        int[] updatedArray=simpleSelectSort(array);
        System.out.println(Arrays.toString(updatedArray));

    }

    private static int[] simpleSelectSort(int[] array){

        int i,j,min;
        for (i=0; i<array.length+1; i++){
            min=i;
            for (j=i; j<array.length; j++ ){
                if (array[j]<array[min]){
                    min=j;
                }
            }
            if (min != i){
                SwapUtil.swap(array,i,min);
            }
        }
        return array;

    }


}
