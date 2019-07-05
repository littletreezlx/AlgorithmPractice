package com.example.bitwise;


/*
Hamming Distance

 */
class T461 {

    public static void main(String[] args) {
        int[] array = {1,2,3};
    }


    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}

