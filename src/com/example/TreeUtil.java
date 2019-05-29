package com.example;


//缺一个可视化调试
public class TreeUtil {


    int minInt = Integer.MIN_VALUE;


    public static TreeNode arrayToTreeNode(int[] array){
        if (array == null || array.length == 0){
            return null;
        }

        TreeNode treeNode = new TreeNode(array[0]);
        for(int i = 1; i < array.length; i++){
            treeNode = createNode(treeNode, array[i]);
        }

        while (treeNode.father != null){
            treeNode = treeNode.father;
        }
        return treeNode;
    }


    public static TreeNode createNode(TreeNode root, int val){
        if (root.left == null){
            root.left = new TreeNode(val, root);
            return root;
        }else if (root.right == null){
            root.right = new TreeNode(val,root);
            return root;
        }

        return root.left;
    }


}
