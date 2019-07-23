package com.example.stack;


import java.util.Stack;

//Implement Queue using Stacks
public class T232 {
    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;


    /** Initialize your data structure here. */
    public T232() {
        inputStack = new Stack();
        outputStack = new Stack();

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        inputStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {

        if (outputStack.empty()){
            while (!inputStack.empty()){
                outputStack.push(inputStack.pop());
            }
        }

        return outputStack.pop();
    }

    /** Get the front element. */
    public int peek() {

        if (outputStack.empty()){
            while (!inputStack.empty()){
                outputStack.push(inputStack.pop());
            }
        }

        return outputStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {

        if (inputStack.empty() && outputStack.empty()){
            return true;
        }
        return false;
    }
}
