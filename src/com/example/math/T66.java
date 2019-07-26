package com.example.math;


import java.util.Arrays;

/*
Plus One

 */
class T66 {

    public static void main(String[] args) {
        int[] array = {1,2,3};
    }


    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9){
                digits[i]  = 0;
            }else {
                digits[i] += 1;
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        Arrays.fill(digits, 0);
        digits[0] = 1;
        return digits;
    }
}

