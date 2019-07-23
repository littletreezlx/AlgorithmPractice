package com.example.tree;


import com.example.data_structure.TreeNode;

/*
Diameter of Binary Tree


 */
class T543 {

    public static void main(String[] args) {
        int[] array = {1,2,3};
    }




    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        recursion(root);
        return res ;
    }

    public int recursion(TreeNode root){
        if (root == null) return 0;
        int l = recursion(root.left);
        int r = recursion(root.right);
        res = Math.max(res, l + r);
        return Math.max(l, r) + 1;
    }
}

