package com.example.recursion;


import java.util.ArrayList;
import java.util.List;

/*
Combination Sum
 */
class T39 {

    public static void main(String[] args) {
        int[] c = {2,3,5};
        int t = 8;
        System.out.println(new T39().combinationSum(c,t));
    }


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subRes = new ArrayList<>();
        dp(0, candidates, target, subRes, res);
        return res;
    }

    public void dp(int i, int[] candidates, int target, List<Integer> subRes, List<List<Integer>> res){
        if (target == 0){
            res.add(new ArrayList<>(subRes));
            return;
        }
        if (target < 0){
            return;
        }

        for (int j = i; j < candidates.length; j++) {
            subRes.add(candidates[j]);
            dp(j, candidates, target - candidates[j], subRes, res);
            subRes.remove(subRes.size() - 1);
        }
    }

}

