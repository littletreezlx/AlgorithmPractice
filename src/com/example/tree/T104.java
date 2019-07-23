package com.example.tree;


import com.example.data_structure.TreeNode;

/*
Maximum Depth of Binary Tree
dfs + bfs

 */
public class T104 {

    public static void main(String[] args) {
    }

    //dfs
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }


    //dfs
//    public int maxDepth(TreeNode root) {
//        if (root == null){
//            return 0;
//        }
//        return dfs(root, 1);
//    }
//
//    public  int dfs (TreeNode root, int depth){
//        if (root == null){
//            return depth - 1;
//        }
//        return Math.max(dfs(root.left, depth + 1), dfs(root.right, depth + 1));
//    }



    //bfs
//    public int maxDepth(TreeNode root) {
//        if (root == null){
//            return 0;
//        }
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//        int depth = 0;
//
//        while (!queue.isEmpty()){
//
//            depth ++;
//            int size = queue.size();
//            for (int i = 0; i < size; i++){
//                TreeNode currNode = queue.poll();
//                if (currNode.left != null){
//                    queue.add(currNode.left);
//                }
//                if (currNode.right != null){
//                    queue.add(currNode.right);
//                }
//            }
//        }
//
//        return depth;
//    }
}

