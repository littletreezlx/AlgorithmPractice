package com.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*
N-Queens
 */
public class T51 {

    public static void main(String[] args) {
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


    }


    public void backTrack(int i, String[] row, List<List<String>> result){

        if (){

        }

        for (int j = 0; j < n; j++){

            int pie = i + j;
            int na = i - j;
            if (!columnSet.contains(j) && !pieSet.contains(pie) && !naSet.contains(na)){

                columnSet.add(j);
                pieSet.add(pie);
                naSet.add(na);

                Arrays.fill(row, ".");
                row[j] = "Q";
                if (i == n -1){
                    result
                }

                String s = new String(char[]);

                backTrack(i + 1, );

                columnSet.remove(j);
                pieSet.remove(pie);
                naSet.remove(na);

            }


        }

    }



}


