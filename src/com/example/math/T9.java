package com.example.math;


/*
Palindrome Number

 */
class T9 {

    public static void main(String[] args) {
        int x = 1000021;
        System.out.println(new T9().isPalindrome(x));
    }


    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int div = 1;
        //
        while (x / div >= 10) div *= 10;
        while (x > 0) {
            int left = x / div;
            int right = x % 10;
            if (left != right) return false;
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }



    //wrong, need two param
//    public boolean isPalindrome(int x) {
//        if (x < 0) return false;
//        if (x < 10) return true;
//        int right = x % 10;
//        int left = x;
//        int bit = 0;
//        while (left >= 10){
//            left /= 10;
//            bit ++;
//        }
//        if (left != right) {
//            return false;
//        }
//        else {
//            return isPalindrome((x - (int) (left * Math.pow(10, bit)) - right) / 10);
//        }
//    }

}

