package com.example.tree;


import com.example.data_structure.TreeNode;

/*
Symmetric Tree
 */
class T101 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
    }


    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode t1, TreeNode t2){
        if (t1 == null && t2 == null){
            return true;
        }
        if (t1 == null || t2 == null){
            return false;
        }
        return (t1.val == t2.val) && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }

}

