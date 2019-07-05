package com.example.tree;


import com.example.TreeNode;

import java.rmi.MarshalledObject;
import java.util.*;
import java.util.function.BiFunction;

/*
Path Sum III
 */
class T437 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);

        root.right.right = new TreeNode(11);



        System.out.println(new T437().pathSum(root, 8));

    }



    int paths = 0;
    int target = 0;

    public int pathSum(TreeNode root, int sum) {
        target = sum;
        Map<Integer, Integer> map = new HashMap<>();
        dfs(root, map);
        return paths;
    }

    public void dfs(TreeNode root, Map<Integer, Integer> map){
        if (root == null){
            return ;
        }
        if (map.containsKey(root.val)){
            paths += map.get(root.val);
        }
        if (root.val == target){
            paths ++;
        }

        Map<Integer, Integer> newMap = new HashMap<>();
        for (Integer i : map.keySet()){
            newMap.put(i - root.val, map.get(i));
        }
        newMap.merge(target- root.val, 1, (oldVal, newVal) -> oldVal + newVal);


        dfs(root.left, newMap);
        dfs(root.right, newMap);
    }




//    int paths = 0;
//    int target = 0;
//
//    public int pathSum(TreeNode root, int sum) {
//        target = sum;
//        Set<Integer> set = new HashSet<>();
//        set.add(sum);
//        dfs(root, set);
//        return paths;
//    }
//
//    public void dfs(TreeNode root, Set<Integer> set){
//        if (root == null){
//            return ;
//        }
//        if (set.contains(root.val)){
//            paths ++;
//        }
//        if (root.val == target){
//            paths ++;
//        }
//        Set<Integer> newSet = new HashSet<>();
//        newSet.add(target - root.val);
//        for (Integer i : set){
//            newSet.add(i - root.val);
//        }
//
//        dfs(root.left, newSet);
//        dfs(root.right, newSet);
//    }

}

