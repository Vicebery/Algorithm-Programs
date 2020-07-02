package Java;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution1081 {
    public static void main(String[] args){
        String arg = "cbaacabcaaccaacababa";
        Solution1081 s = new Solution1081();

        System.out.println(s.smallestSubsequence(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/smallest-subsequence-of-distinct-characters/
     * @Author: vicebery
     * @Date: 2020/0702
     **/
    //
    public String smallestSubsequence(String text) {
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