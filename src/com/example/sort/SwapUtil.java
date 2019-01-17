package com.example.sort;

import java.lang.reflect.Array;

public class SwapUtil {

    public static void swap(int[] array,int position0,int position1){
        int temp=array[position0];
        array[position0]=array[position1];
        array[position1]=temp;
    }

}
