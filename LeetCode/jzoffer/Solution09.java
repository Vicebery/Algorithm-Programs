package jzoffer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Solution09 {
    public static void main(String[] args){
        int[] arg = {1,2};
        Solution09 s = new Solution09();
        CQueue cQueue = new CQueue();
        cQueue.appendTail(1);
        cQueue.appendTail(2);
        System.out.println(cQueue.deleteHead());
        cQueue.appendTail(3);
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
    }

    /**
     * @Description: https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/ 两个栈实现队列
     * @Author: vicebery
     * @Date: 2020/0806
     **/

}

class CQueue {

    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public CQueue() {
        /**
         * 双端队列 的 两种实现方式：
         * 推荐使用双端队列的链表实现 Deque<Integer> stack1 = new LinkedList<Integer>();
         *  不使用变长数组实现， 是因为队列大小未知。Deque<Integer> stack1 = new ArrayDeque<Integer>();
         *  不推荐使用 Stack<Integer> stack1= new Stack<>();, 是因为其 实现是变长数组。
         */
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                int tmp = stack1.pop();
                stack2.push(tmp);
            }
        }
        if(stack2.isEmpty()){
            return -1;
        }
        return stack2.pop();
    }
}