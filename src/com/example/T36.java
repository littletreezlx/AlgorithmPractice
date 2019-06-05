package com.example;


import java.time.chrono.IsoChronology;
import java.util.HashSet;
import java.util.Set;

/*
Valid Sudoku
 */
public class T36 {

    public static void main(String[] args) {

        char[][] board = {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        new T36().isValidSudoku(board);
    }


    public boolean isValidSudoku(char[][] board) {
        if (board == null){
            return false;
        }
        int n = 9;

        for (int i = 0; i < 9; i++){
            Set set = new HashSet();
            int num = 0;
            for (int j = 0; j < 9; j++){
                if (board[i][j] != '.'){
                    set.add(board[i][j]);
                    num ++;
                }
            }
            if (set.size() != num){
                return false;
            }
        }

        for (int j = 0; j < 9; j++){
            Set set = new HashSet();
            int num = 0;
            for (int i = 0; i < 9; i++){
                if (board[i][j] != '.'){
                    set.add(board[i][j]);
                    num ++;
                }
            }
            if (set.size() != num){
                return false;
            }
        }


        for (int k = 0; k < 3; k++){
            for (int m = 0; m < 3; m++) {

                Set set = new HashSet();
                int num = 0;
                for (int i = 3 * k; i < 3 * k +3; i++){
                    for (int j = 3 * m; j < 3 * m + 3; j++){
                        if (board[i][j] != '.'){
                            set.add(board[i][j]);
                            num ++;
                        }
                    }
                }
                if (set.size() != num){
                    return false;

                }
            }
        }
        return true;
    }

}

