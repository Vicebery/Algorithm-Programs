package Java;

import java.util.Stack;

public class MyQueue {
    public static void main(String[] args){
        int[] arg = {1,2};
        System.out.println();
    }

    /**
     * @Description:  https://leetcode-cn.com/problems/implement-queue-using-stacks/submissions/ 两个栈实现队列
     * @Author: vicebery
     * @Date: 2020/0528
     **/

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    /** Initialize your data structure here. */
    MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                int tmp = stack1.pop();
                stack2.push(tmp);
            }
        }
        return stack2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                int tmp = stack1.pop();
                stack2.push(tmp);
            }
        }
        return stack2.peek();
    }

    /** Returns whether the queue is empty. */
    boolean empty() {
        if(stack1.isEmpty() && stack2.isEmpty()) {
            return true;
        }
        return false;
    }
}