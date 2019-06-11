package com.example;


import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] a = {"1","2","3"};
        System.out.println(Arrays.asList(a));

        test(a);
    }


    public static void test(String[] a) {
        a[2] = "4";
        System.out.println(Arrays.asList(a).toString());
    }

}


