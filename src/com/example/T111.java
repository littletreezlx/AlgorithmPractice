package com.example;


/*
Minimum Depth of Binary Tree
 */
public class T111 {

    public static void main(String[] args) {
    }


    //dfs
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }

        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}

