package com.example.tree;


import com.example.data_structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/*
Binary Tree Level Order Traversal
bfs + dfs

 */
public class T102 {

    public static void main(String[] args) {
    }



    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null){
            return list;
        }
        dfs(list, root, 1);

        return list;
    }


    public void dfs(List<List<Integer>> list, TreeNode root, int level){
        if (root == null){
            return;
        }

        if (list.size() < level){
            list.add(new ArrayList<>());
        }
        list.get(level - 1).add(root.val);
        dfs(list, root.left, level + 1);
        dfs(list, root.right, level + 1);
    }


    //bfs
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> list = new ArrayList<>();
//        if (root == null){
//            return list;
//        }
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//
//        while (!queue.isEmpty()){
//            int levelSize = queue.size();
//            List<Integer> currentLevel = new ArrayList<>();
//
//            for (int i = 0; i < levelSize; i++){
//                TreeNode currNode = queue.poll();
//                currentLevel.add(currNode.val);
//                if (currNode.left != null){
//                    queue.add(currNode.left);
//                }
//                if (currNode.right != null){
//                    queue.add(currNode.right);
//                }
//            }
//
//            list.add(currentLevel);
//        }
//
//        return list;
//    }
}

