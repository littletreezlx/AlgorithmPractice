package com.example.stack;


import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/*
Two Sums

 */
class T155 {

    public static void main(String[] args) {
        MinStack s = new MinStack();
        s.push(512);
        s.push(-1024);
        s.push(-1024);
        s.push(512);

    }


    static class MinStack {

        /** initialize your data structure here. */
        Stack<Integer> minStack = new Stack<>();
        Stack<Integer> stack = new Stack<>();
        public MinStack() {
        }

        public void push(int x) {
            stack.push(x);
            if (minStack.empty()){
                minStack.push(x);
            }else {
                if (x <= minStack.peek()){
                    minStack.push(x);
                }
            }
        }

        public void pop() {
            if (!minStack.empty() && stack.peek().equals(minStack.peek())){
                minStack.pop();
            }
            stack.pop();

        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }


}

