package com.example;



public class Main {

    public static void main(String[] args) {

        int min = Integer.MIN_VALUE;
        int[] array = {6,2,8,0,4,7,9,min,min,3,5};
        TreeNode treeNode = TreeUtil.arrayToTreeNode(array);

        System.out.println(treeNode);
    }

}
