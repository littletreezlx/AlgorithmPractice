package com.example;


import com.sun.rowset.internal.Row;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*
N-Queens
 */
public class T51 {

    public static void main(String[] args) {

        List<List<String>> list = new T51().solveNQueens(4);

        System.out.println(list);
    }


    private int n;
    private HashSet<Integer> columnSet = new HashSet();
    private HashSet<Integer> pieSet = new HashSet();
    private HashSet<Integer> naSet = new HashSet();


    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        if (n == 0){
            return result;
        }
        this.n = n;
        backTrack(0, new String[n], result);
        return result;
    }


    public void backTrack(int i, String[] row, List<List<String>> result){

        for (int j = 0; j < n; j++){
            int pie = i + j;
            int na = i - j;
            if (!columnSet.contains(j) && !pieSet.contains(pie) && !naSet.contains(na)){
                columnSet.add(j);
                pieSet.add(pie);
                naSet.add(na);

                char[] chars = new char[n];
                Arrays.fill(chars, '.');
                chars[j] = 'Q';
                String str = new String(chars);
                row[i] = str;
                if (i == n -1){
                    result.add(Arrays.asList(row));
                }

                backTrack(i + 1, row, result);

                columnSet.remove(j);
                pieSet.remove(pie);
                naSet.remove(na);

            }
        }
    }



}


