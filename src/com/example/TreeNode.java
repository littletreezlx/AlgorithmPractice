package com.example;

import java.util.Set;

public  class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode father;

    public Set<TreeNode> children;

    public TreeNode(int x) {
        val = x;
    }

    TreeNode(int x, TreeNode father) {
        val = x;
        this.father = father;
    }
}