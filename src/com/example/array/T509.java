package com.example.array;


/*
Fibonacci Number


blank

 */
class T509 {

    public static void main(String[] args) {
        int[] array = {1,2,3};
    }


    public int fib(int N) {
        if (N == 0){
            return 0;
        }
        if (N == 1){
            return 1;
        }

        return fib(N - 1) + fib(N -2);
    }
}

