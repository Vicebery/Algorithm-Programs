package Java;

import java.util.Arrays;

public class Solution242 {
    public static void main(String[] args){
        String s = "anagra";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/valid-anagram/
     * @Author: vicebery
     * @Date: 2020/0529
     **/
    public static boolean isAnagram(String s, String t) {
        if(s.equals(t)){
             return true;
         }
         if(s.length()!=t.length()){
             return false;
         }
         char[] sCharList = s.toCharArray();
         char[] tCharList = t.toCharArray();
        Arrays.sort(sCharList);
        Arrays.sort(tCharList);
        for(int i=0;i<sCharList.length;i++){
            if(sCharList[i]!=tCharList[i]){
                return false;
            }
        }
        return true;
    }
}