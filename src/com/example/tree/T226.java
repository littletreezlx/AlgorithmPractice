package com.example.tree;


import com.example.data_structure.TreeNode;

/*
Two Sums

 */
class T226 {

    public static void main(String[] args) {
        int[] array = {1,2,3};
    }


    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
        }
        TreeNode l = invertTree(root.right);
        TreeNode r = invertTree(root.left);

        root.left = l;
        root.right = r;
        return root;
    }
}

