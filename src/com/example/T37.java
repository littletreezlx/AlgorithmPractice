package com.example;


import java.util.*;
import java.util.List;

/*
Sudoku Solver
好难。。。
 */
public class T37 {

    public static void main(String[] args) {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        new T37().solveSudoku(board);


        List<List> list = new ArrayList<>();
        for (int i=0;i<9;i++){
            List subList = new ArrayList<>();
            for (int j=0;j<9;j++) {
                subList.add(board[i][j]);
            }
            list.add(subList);
        }
        System.out.println(list);

    }


    HashMap<Integer, Set> map;

    public void solveSudoku(char[][] board) {
        if (board == null){
            return;
        }

         map = new HashMap<>();

        for (int i = 0; i < 9; i++){
            Set set = new HashSet();
            for (int j = 0; j < 9; j++){
                if (board[i][j] != '.'){
                    set.add(board[i][j]);
                }
            }
            map.put(i, set);
        }

        for (int j = 0; j < 9; j++){
            Set set = new HashSet();
            for (int i = 0; i < 9; i++){
                if (board[i][j] != '.'){
                    set.add(board[i][j]);
                }
            }
            map.put(j + 10, set);
        }

        for (int k = 0; k < 3; k++){
            for (int m = 0; m < 3; m++) {
                Set set = new HashSet();
                for (int i = 3 * k; i < 3 * k +3; i++){
                    for (int j = 3 * m; j < 3 * m + 3; j++){
                        if (board[i][j] != '.'){
                            set.add(board[i][j]);
                        }
                    }
                }
                map.put(k * 3 + m + 20, set);
            }
        }

        dfs(board, 0, 0);
    }


    public boolean dfs(char[][] board, int i, int j){

        if (i == 8 && j == 6){
            int k =1;
        }

        if (i == 8 && j == 9){
            return true;
        }

        if (j > 8 && i < 8){
            j = 0;
            i ++;
        }

        if (board[i][j] == '.'){
            for (int k = 1; k < 10; k++){
                char c = String.valueOf(k).charAt(0);

                if (!map.get(i).contains(c) && !map.get(j + 10).contains(c) && !map.get(i / 3 * 3 + j / 3 + 20).contains(c)){
                    board[i][j] = c;
                    map.get(i).add(c);
                    map.get(j + 10).add(c);
                    map.get(i / 3 * 3 + j / 3 + 20).add(c);


                    if (dfs(board, i, j + 1)){
                        return true;
                    }else {
                        board[i][j] = '.';
                        map.get(i).remove(c);
                        map.get(j + 10).remove(c);
                        map.get(i / 3 * 3 + j / 3 + 20).remove(c);
                    }

//                            dfs(board, i, j + 1);
//
//                            board[i][j] = '.';
//                            map.get(i).remove(c);
//                            map.get(j + 10).remove(c);
//                            map.get(i / 3 * 3 + j / 3 + 20).remove(c);
                }
            }
        }else {
           if(dfs(board, i ,j+1)){
               return true;
           }
        }


        return false;
    }




}

