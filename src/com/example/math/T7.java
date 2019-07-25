package com.example.math;


/*
Reverse Integer

 */
class T7 {

    public static void main(String[] args) {
        int x = 123;
        System.out.println(new T7().reverse(x));
    }


    public int reverse(int x) {
        int last = 0;
        int res = 0;

        while (Math.abs(x) > 0){
            last = x % 10;
            x = (x - last) / 10;
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && last > 7) ) return 0;
            if (res < Integer.MIN_VALUE / 10
                    || (res == Integer.MIN_VALUE / 10 && last < -8) ) return 0;
            res = res * 10 + last;

        }
        return res;
    }


//    public int reverse(int x) {
//        int bit = 1;
//        int first = Math.abs(x);
//        int last = x % 10;
//
//        while (first > 10){
//            first /= 10;
//            bit ++;
//        }
//        int res = - x ;
//        int mult = first + last;
//        while (bit > 0){
//            res += mult;
//            mult *= 10;
//            bit--;
//        }
//
//        if (x / res < 0 ){
//            return 0;
//        }
//        return res;
//    }
}

