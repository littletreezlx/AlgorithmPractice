package com.example.tree;


import com.example.data_structure.TreeNode;

/*
Lowest Common Ancestor of a Binary Tree
对于一个节点r，如果节点p，q分别在其左右子树中，则r一定是p，q的最近公共祖先
 */
public class T236 {

    public static void main(String[] args) {

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null){
            return null;
        }
        if(root == p || root == q){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null){
            return root;
        }
        if (left != null){
            return left;
        }
        if (right != null){
            return right;
        }

        return null;

    }


}

