package com.example.tree;


import com.example.data_structure.TreeNode;

/*
 Validate Binary Search Tree
 抄的做法，好强啊- -
 */
public class T98 {

    public static void main(String[] args) {


//        boolean a =isValidBST(new TreeNode(0));

    }

    double last = -Double.MAX_VALUE;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (isValidBST(root.left)) {
            if (last < root.val) {
                last = root.val;
                return isValidBST(root.right);
            }
        }
        return false;
    }

}





// [0]测试用例通过，提交却不行。。。
//public class T98 {
//
//    public static void main(String[] args) {
//
//
//        boolean a =isValidBST(new TreeNode(0));
//
//    }
//
//
//    public static class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//
//        TreeNode(int x) {
//            val = x;
//        }
//    }
//
//
//    public static List<Integer> list = new ArrayList();
//    public static List<Integer> initalList = new ArrayList();
//
//
//    public static boolean isValidBST(TreeNode root) {
//        if (root == null){
//            return false;
//        }
//
//        inOrder(root);
//        initalList.addAll(list);
//        list.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        });
//        if (initalList.equals(list)){
//            return true;
//        }
//        return false;
//    }
//
//
//    public static void inOrder(TreeNode root){
//        if (root != null){
//            inOrder(root.left);
//            list.add(root.val);
//            inOrder(root.right);
//        }
//    }
//
//
//}

