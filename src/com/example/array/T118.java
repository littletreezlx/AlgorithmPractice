package com.example.array;


import java.util.ArrayList;
import java.util.List;

/*
Pascal's Triangle

 */
class T118 {

    public static void main(String[] args) {
        new T118().generate(5);
    }


    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 0){
            return res;
        }
        List<Integer> list0 = new ArrayList<>();
        list0.add(1);
        res.add(list0);

        for (int i = 1; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for (int j = 1; j < i; j++) {
                list.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }
            list.add(1);
            res.add(list);
        }

        return res;
    }
}

