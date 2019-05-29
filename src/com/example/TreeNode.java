package com.example;

public  class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode father;

    TreeNode(int x) {
        val = x;
    }

    TreeNode(int x, TreeNode father) {
        val = x;
        this.father = father;
    }
}