package com.example.bitwise;


/*
Number of 1 Bits
 */
class T191 {

    public static void main(String[] args) {
        new T191().hammingWeight(-10);

        System.out.println(-3 % 2);
    }


    public int hammingWeight(int n) {
        if (n == 0) return 0;
        int count = 0;

        for (int i =0; i < 32; i++){
            if (n % 2 != 0){
                count ++;
            }
            n = n >> 1;
        }
        return count;
    }
}

