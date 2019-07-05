package com.example.tree;


import com.example.TreeNode;

import java.util.ArrayList;
import java.util.List;

/*
Convert BST to Greater Tree
 */
class T538 {

    public static void main(String[] args) {
        int[] array = {1,2,3};
    }


    public TreeNode convertBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traverse(root, list);

        Integer[] array = (Integer[]) list.toArray();
//        Integer[] array = list.toArray(new Integer[list.size()]);



        for (int i = array.length - 1; i < array.length; i++) {

        }



    }


    public int traverse(TreeNode root, List<Integer> list){
        traverse(root.left, list);
        list.add(root.val);
        traverse(root.right, list);
    }
}

