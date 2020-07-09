package Java;

import java.util.*;

public class Solution921 {
    public static void main(String[] args){
        String arg = ")))";
        Solution921 s = new Solution921();

        System.out.println(s.minAddToMakeValid(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/minimum-add-to-make-parentheses-valid/ 使括号有效的最少添加
     * @Author: vicebery
     * @Date: 2020/0709
     **/
    public int minAddToMakeValid(String S) {
        char[] cs = S.toCharArray();
        if(cs.length<2){
            return cs.length;
        }
        Deque<Character> stack = new ArrayDeque<>();
        int count = 0;
        int i = 1;
        stack.push(cs[0]);
        while( i < cs.length){
            char cur = stack.peekLast();
            if(cur=='('){
                if(cs[i]==')'){
                    stack.pollLast();
                    i++;
                    if(i<cs.length){
                        if(stack.isEmpty()){
                            stack.push(cs[i]);
                            i++;
                        }
                    }
                }else if(cs[i]=='('){
                    stack.push(cs[i]);
                    i++;
                }
            }else if(cur==')'){
                count++;
                stack.pollLast();
                stack.push(cs[i]);
                i++;
            }
        }
        return count+stack.size();
    }

    public int minAddToMakeValid2(String S) {
        int ans = 0, bal = 0;
        for (int i = 0; i < S.length(); ++i) {
            bal += S.charAt(i) == '(' ? 1 : -1;
            if (bal == -1) {
                ans++;
                bal++;
            }
        }
        return ans + bal;
    }
}