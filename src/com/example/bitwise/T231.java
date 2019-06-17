package com.example.bitwise;


/*
Power of Two



 */
class T231 {

    public static void main(String[] args) {
        int[] array = {1,2,3};
    }


    public boolean isPowerOfTwo(int n) {

        int count = 0;
        for (int i =0; i < 32; i++){
            if (n % 2 != 0){
                count ++;
            }
            n = n >> 1;
            if (count > 1){
                return false;
            }
        }


        if (count == 1){
            return true;
        }else {
            return false;
        }
    }
}

