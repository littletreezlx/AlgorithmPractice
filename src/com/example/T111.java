package com.example;


import java.util.LinkedList;
import java.util.Queue;

/*
Minimum Depth of Binary Tree
 */
public class T111 {

    public static void main(String[] args) {
    }


    //bfs
    public int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;

        while (!queue.isEmpty()){
            int qSize = queue.size();
            depth++;

            for (int i = 0; i < qSize; i++){
                TreeNode currNode = queue.poll();
                if (currNode.left == null && currNode.right == null){
                    return depth;
                }
                if (currNode.left != null){
                    queue.add(currNode.left);
                }
                if (currNode.right != null){
                    queue.add(currNode.right);
                }
            }
        }

        return -1;
    }



    //dfs
//    public int minDepth(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//        if (root.left == null){
//            return minDepth(root.right) + 1;
//        }
//        if (root.right == null){
//            return minDepth(root.left) + 1;
//        }
//
//        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
//    }
}

