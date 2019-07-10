package com.example.tree;


import com.example.TreeNode;

/*
Convert BST to Greater Tree
 */
class T538 {

    public static void main(String[] args) {
        int[] array = {1,2,3};
    }




    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        backOrder(root);
        return root;
    }

    public void backOrder(TreeNode root){
        if (root == null){
            return;
        }
        backOrder(root.right);
        root.val += sum;
        sum = root.val;
        backOrder(root.left);
    }
}

