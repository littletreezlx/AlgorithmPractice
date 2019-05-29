package com.example;


/*
Lowest Common Ancestor of a Binary Search Tree
 */
public class T235 {

    public static void main(String[] args) {

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        int v = root.val;
        if (v == p.val || v == q.val){
            return root;
        }
        if ((v - p.val)*(v - q.val) < 0){
            return root;
        }
        if (v > p.val){
            return lowestCommonAncestor(root.left,p,q);
        }else {
            return lowestCommonAncestor(root.right,p,q);
        }
    }


}

