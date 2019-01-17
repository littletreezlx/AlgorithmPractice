package com.example.sort;


import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.Arrays;

public class ShellSort {

    static int[] array=new int[]{1,3,5,7,9,2,4,6,8,10} ;

    public static void main(String[] args) {
        int[] updatedArray=shellSort(array);
        System.out.println(Arrays.toString(updatedArray));

    }

    private static int[] shellSort(int[] array){

        int i,j;
        int increment=array.length;
        do {
            increment=increment/3+1;
            for (i=increment; i<array.length; i++){
                if (array[i-increment]>array[i]){
                    SwapUtil.swap(array,i-increment,i);
                }
            }

        }while (increment>1);

        return array;

    }


}
