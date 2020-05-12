package Java;

public class Solution28 {
    public static void main(String[] args){
        int[] arg = {1,2};
        System.out.println(strStr("hello","ll"));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/implement-strstr/
     * @Author: vicebery
     * @Date: 2020/0506
     **/
    public static int strStr(String haystack, String needle) {
        int res =-1;
        res = haystack.indexOf(needle);
        return res;
    }
}