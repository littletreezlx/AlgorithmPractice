package com.example.algorithm_template;

import com.example.data_structure.TreeNode;

import java.util.Set;

public class DFS {


    public void dfsTP(){

    }


    public void dfs(TreeNode node, Set visited){
        visited.add(node);
        // process node here...

        for (TreeNode childNode : node.children){
            if (!visited.contains(childNode)){
                dfs(childNode, visited);
            }
        }
    }
}

