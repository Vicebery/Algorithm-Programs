package Java;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class Solution402 {
    public static void main(String[] args){
        String arg = "5337";
        Solution402 s = new Solution402();

        System.out.println(s.removeKdigits(arg,2));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/remove-k-digits/
     * @Author: vicebery
     * @Date: 2020/0701
     **/
    public String removeKdigits(String num, int k) {
        int n = num.length();
        if (n == k) {
            return "0";
        }
        Deque<Character> stack = new ArrayDeque<>();  //双端队列 做为stack栈使用
        char[] numlist = num.toCharArray();
        stack.offer(numlist[0]);
        for (int i = 1; i < n; i++) {
            while (stack.size() > 0 && k > 0 && stack.peekLast() > numlist[i]) {
                stack.pollLast();
                k--;
            }
            stack.offerLast(numlist[i]);
        }
        while (k > 0) {
            stack.pollLast();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            if (sb.length() == 0 && stack.peekFirst() == '0') {
                stack.pollFirst();
                continue;
            } else {
                sb.append(stack.pollFirst());
            }

        }
        if (sb.length() == 0) {
            sb.append('0');
        }
        return sb.toString();
    }
}