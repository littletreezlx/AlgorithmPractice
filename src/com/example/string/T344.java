package com.example.string;


/*
 Reverse String

 */
class T344 {

    public static void main(String[] args) {
        int[] array = {1,2,3};
    }


    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left ++;
            right --;
        }
    }
}

