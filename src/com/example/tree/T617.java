package com.example.tree;


import com.example.data_structure.TreeNode;

/*
Merge Two Binary Trees

递归中改引用t1 = t2不生效？


 */
class T617 {

    public static void main(String[] args) {
    }


    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null){
            return t2;
        }
        if(t2 == null){
            return t1;
        }

        TreeNode res = new TreeNode(t1.val + t2.val);

        res.left = mergeTrees(t1.left, t2.left);
        res.right =mergeTrees(t1.right, t2.right);
        return res;
    }

//    public void dfs(TreeNode t1, TreeNode t2, Set<TreeNode> visited){
//
//        if (t2.left == null){
//            return;
//        }
//        if (t1.left != null){
//            t1.left.val += t2.left.val;
//        }else{
//            t1.left = t2.left;
//        }
//
//
//        dfs(t1.left, t2.left, visited);
//        dfs(t1.right, t2.right, visited);
//    }

}

