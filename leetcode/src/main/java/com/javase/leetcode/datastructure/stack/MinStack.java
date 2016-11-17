package com.javase.leetcode.datastructure.stack;

import java.util.Stack;

/**
 * Created by DD240 on 2016/10/25.
 */
public class MinStack {

    /** initialize your data structure here. */
    Stack stack = new Stack<Integer>();
    Stack minStack = new Stack<Integer>();
    public MinStack() {

    }

    public void push(int x) {
        if(stack.isEmpty()) {
            stack.push(x);
            minStack.push(x);
        } else {
            stack.push(x);
            int min = Math.min(x, (int)minStack.peek());
            minStack.push(min);
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return (int)stack.peek();
    }

    public int getMin() {
        return (int)minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */