package com.example.sort;

public class SwapUtil {

    public static void swap(int[] array,int position0,int position1){
        int temp=array[position0];
        array[position0]=array[position1];
        array[position1]=temp;


        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
