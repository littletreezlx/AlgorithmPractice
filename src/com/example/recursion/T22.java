package com.example.recursion;


import java.util.ArrayList;
import java.util.List;

/*
Generate Parentheses

 */
class T22 {

    public static void main(String[] args)
    {
        System.out.println(new T22().generateParenthesis(3));
    }



    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    public void backtrack(List<String> ans, String cur, int open, int close, int max){
        if (cur.length() == max * 2) {
            ans.add(cur);
            return;
        }

        if (open < max)
            backtrack(ans, cur+"(", open+1, close, max);
        if (close < open)
            backtrack(ans, cur+")", open, close+1, max);
    }




//    List<String> res;
//    int n;
//    public List<String> generateParenthesis(int n) {
//        res = new ArrayList<>();
//        this.n = n * 2;
//        if (n == 0){
//            return res;
//        }
//        Stack<Character> stack = new Stack<>();
//        recursion('(', stack, "", 0, 0);
//        return res;
//    }
//
//
//
//    public void recursion(Character c, Stack<Character> stack, String s, int left, int right){
//        if (stack.isEmpty()) {
//            for (int i = 0; i < left - right; i++) {
//                stack.push('(');
//            }
//        }
//
//        if (stack.isEmpty()){
//            if (c == ')'){
//                return;
//            }else {
//                left += 1;
//                stack.push(c);
//            }
//        }else {
//            if (c == ')'){
//                stack.pop();
//                right += 1;
//            }else {
//                if (left == n/2){
//                    return;
//                }
//                left += 1;
//                stack.push(c);
//            }
//        }
//        s = s + c;
//
//        if (s.length() == n){
//            if (stack.isEmpty()){
//                res.add(s);
//                return;
//            }
//        }
//        recursion('(', stack, s, left, right);
//        recursion(')', stack, s, left, right);
//    }






}

