package Java;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution316 {
    public static void main(String[] args){
        int[] arg = {1,2};
        Solution316 s = new Solution316();

        System.out.println();
    }

    /**
     * @Description: https://leetcode-cn.com/problems/remove-duplicate-letters/
     * @Author: vicebery
     * @Date: 2020/0706
     **/
    public String removeDuplicateLetters(String text) {
        int slength = text.length();
        if(text==null || slength==0) return "";
        if(slength==1) return text;
        int[] hash = new int[26];
        char[] textList = text.toCharArray();
        for(Character c:textList){
            hash[c-'a']++;
        }
        Deque<Character> stack = new ArrayDeque<>();
        stack.offer(textList[0]);
        hash[textList[0]-'a']--;
        for(int i=1;i<slength;i++){
            if (!stack.contains(textList[i])) { // 不在栈中才进行判断
                while (stack.size() > 0 && hash[stack.peekLast() - 'a'] > 0 && stack.peekLast() >= textList[i]) {
                    stack.pollLast();
                }
                stack.addLast(textList[i]);
            }
            hash[textList[i]-'a']--;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.removeFirst());
        }
        return sb.toString();
    }
}