package com.example.recursion;



import com.example.data_structure.Trie;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Word Search II

 */
class T212 {

    public static void main(String[] args) {
        char[][] board = {{'a', 'a'}};
        String[] words = {"aaa"};

        System.out.println(new T212().findWords(board, words));
    }

    Trie trie;
    Set<String> res = new HashSet<>();

    public List<String> findWords(char[][] board, String[] words) {
        trie = new Trie();
        for (String word : words){
            trie.insert(word);
        }

        int n = board.length;
        int m = board[0].length;
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dfs(i, j , "", board, visited);
            }
        }
        List<String> list = new ArrayList<>();
        list.addAll(res);
        return list;
    }


    public void dfs(int i, int j, String word, char[][] board, boolean[][] visited){
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length) return;
        if (visited[i][j]) return;

        word += board[i][j];
        if (!trie.startsWith(word)){
            return;
        }
        if (trie.search(word)){
            res.add(word);
        }

        visited[i][j] = true;
        dfs(i, j - 1, word, board, visited);
        dfs(i, j + 1, word, board, visited);
        dfs(i - 1, j, word, board, visited);
        dfs(i + 1, j, word, board, visited);
        visited[i][j] = false;
    }
}

