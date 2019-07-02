package com.example;


import java.util.*;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {

        Set<List<Integer>> res = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        res.add(list);
        list.add(2);
        res.add(list);

        System.out.println(res);
    }




}


