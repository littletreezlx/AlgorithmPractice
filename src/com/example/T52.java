package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*
N-Queens II
 */
public class T52 {

    public static void main(String[] args) {


    }


    private int n;
    private int res = 0;

    private HashSet<Integer> columnSet = new HashSet();
    private HashSet<Integer> pieSet = new HashSet();
    private HashSet<Integer> naSet = new HashSet();


    public int totalNQueens(int n) {
        if (n == 0){
            return 0;
        }
        this.n = n;
        backTrack(0);
        return res;
    }


    public void backTrack(int i){

        for (int j = 0; j < n; j++){
            int pie = i + j;
            int na = i - j;
            if (!columnSet.contains(j) && !pieSet.contains(pie) && !naSet.contains(na)){
                columnSet.add(j);
                pieSet.add(pie);
                naSet.add(na);

                if (i == n -1){
                    res ++;
                }

                backTrack(i + 1);

                columnSet.remove(j);
                pieSet.remove(pie);
                naSet.remove(na);
            }
        }
    }



}


