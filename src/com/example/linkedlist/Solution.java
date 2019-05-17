package com.example.linkedlist;


import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack();

        for (int i = 0; i < s.length(); i++){

            switch (s.charAt(i)){

                case '(':
                    stack.push('(');
                    break;
                case ')':
                    if (!stack.isEmpty() && stack.peek() == '('){
                        stack.pop();
                    }else {
                        return false;
                    }
                    break;

                case '{':
                    stack.push('{');
                    break;
                case '}':
                    if (!stack.isEmpty() && stack.peek() == '{'){
                        stack.pop();
                    }else {
                        return false;
                    }
                    break;

                case '[':
                    stack.push('[');
                    break;
                case ']':
                    if (!stack.isEmpty() && stack.peek() == '['){
                        stack.pop();
                    }else {
                        return false;
                    }
                    break;

            }
        }
        if (stack.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
