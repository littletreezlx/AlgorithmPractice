package com.example;

import java.util.HashMap;
import java.util.Map;

public class Trie {

    TrieNode root;

    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!node.child.containsKey(c)){
                node.child.put(c, new TrieNode());
            }
            node = node.child.get(c);
        }
        node.is_end = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = root;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!node.child.containsKey(c)){
                return false;
            }
            node = node.child.get(c);

        }
        return node.is_end;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = root;

        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if (!node.child.containsKey(c)){
                return false;
            }
            node = node.child.get(c);
        }
        return true;
    }

    class TrieNode{
        Map<Character, TrieNode> child;
        boolean is_end;

        public TrieNode(){
            child = new HashMap<>();
            is_end = false;
        }
    }
}



