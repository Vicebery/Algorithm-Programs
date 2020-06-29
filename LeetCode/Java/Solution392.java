package Java;

import java.util.Arrays;

public class Solution392 {
    public static void main(String[] args){
        String ss = "agc";
        String t = "ahbgdc";
        Solution392 s = new Solution392();

        System.out.println(s.isSubsequence(ss,t));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/is-subsequence/
     * @Author: vicebery
     * @Date: 2020/0629
     **/
    public boolean isSubsequence(String s, String t) {
        if(t.length()==1){
            return t.equals(s);
        }
        int start = 0;
        for(int i = 0;i<s.length();i++){
            char cur = s.charAt(i);
            int j = start;
            while(j<t.length()){
                if(cur!=t.charAt(j)){
                    j++;
                }else{
                    start = j+1;
                    break;
                }
            }
            if(j==t.length() && i<s.length()){
                return false;
            }
        }
        return true;
    }
}