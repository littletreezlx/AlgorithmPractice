package com.example.bitwise;


/*
Counting Bits
 */
class T338 {

    public static void main(String[] args) {
        int[] array = {1,2,3};
    }


    public int[] countBits(int num) {
        int[] res = new int[num + 1];

        for (int i = 0; i < num + 1; i++) {
            res[i] = res[i >> 1] + 1 & i;
        }
        return res;
    }
}

