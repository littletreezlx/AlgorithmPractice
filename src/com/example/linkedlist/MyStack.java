package com.example.linkedlist;


import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;


public class MyStack {

    private Queue<Integer> inputQ;
    private Queue<Integer> outputQ;
    private int size = 0;

    /** Initialize your data structure here. */
    public MyStack() {
        inputQ = new ArrayBlockingQueue<Integer>(20);
        outputQ = new ArrayBlockingQueue<Integer>(20);

    }

    /** Push element x onto stack. */
    public void push(int x) {
        if (inputQ.isEmpty()){
            outputQ.offer(x);
        }else if (outputQ.isEmpty()){
            inputQ.offer(x);
        }
        size += 1;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {

        int n = 0;

        if (outputQ.isEmpty()){
            while (!inputQ.isEmpty() && size - n > 1 ) {
                outputQ.offer(inputQ.poll());
                n += 1;
            }
            size -= 1;
            return inputQ.poll();
        }

        if (inputQ.isEmpty()){
            while (!outputQ.isEmpty() && size - n > 1 ) {
                inputQ.offer(outputQ.poll());
                n += 1;
            }
            size -= 1;
            return outputQ.poll();
        }

        return 0;
    }

    /** Get the top element. */
    public int top() {

        int n = 0;

        if (outputQ.isEmpty()){
            while (!inputQ.isEmpty() && size - n > 1 ) {
                outputQ.offer(inputQ.poll());
                n += 1;
            }
            int m = inputQ.peek();
            outputQ.offer(inputQ.poll());
            return m;
        }

        if (inputQ.isEmpty()){
            while (!outputQ.isEmpty() && size - n > 1 ) {
                inputQ.offer(outputQ.poll());
                n += 1;
            }
            int m = outputQ.peek();
            inputQ.offer(outputQ.poll());
            return m;
        }

        return 0;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        if (inputQ.isEmpty() && outputQ.isEmpty()){
            return true;
        }
        return false;
    }
}



