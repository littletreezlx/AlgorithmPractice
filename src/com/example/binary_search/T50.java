package com.example.binary_search;


/*
Pow(x, n)
int的最小值边界没法用n = -n; abs()也太坑爹了把
 */
public class T50 {

    public static void main(String[] args) {
        System.out.println(myPow(2.00000, -2147483648));


    }


    public static double myPow(double x, int n) {
        if (n == 0){
            return 1;
        }
        if (n == 1){
            return x;
        }

        if (n < 0){
            x = 1 / x;
            if (n == Integer.MIN_VALUE){
                n = Math.abs(n/2);
                return Math.pow(myPow(x, n), 2);
            }else {
                n = Math.abs(n);
            }
        }

        if (n % 2 == 0){
            n = n / 2;
            return Math.pow(myPow(x, n), 2);
        }else {
            n = (n - 1) / 2;
            return Math.pow(myPow(x, n), 2) * x;
        }
    }
}

