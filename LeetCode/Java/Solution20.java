package Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Solution20 {
    public static void main(String[] args){
        String arg = "{[]}";
        System.out.println(isValid(arg));
    }

    /**
     * @Description: 20 https://leetcode.com/problems/valid-parentheses/
     * @param: [s]
     * @Return: boolean
     * @Author: vicebery
     * @Date: 2019/8/30
     **/
    public static boolean isValid(String s) {
        if(s.length()==0 || s.isEmpty()){
            return true;
        }
        Stack<Character> stack = new Stack<Character>();
        int i=0;
        while(i<s.length()){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }else{
                if(bracketsIsValid(stack.peek(), s.charAt(i))){
                    stack.pop();
                }else{
                    stack.push(s.charAt(i));
                }
            }
            i++;
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    static boolean bracketsIsValid(char a, char b){
        if(a == '(' && b == ')' || a == '[' && b == ']' || a == '{' && b == '}')
            return true;
        else {
            return false;
        }
    }

}