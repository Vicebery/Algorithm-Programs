package Java;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args){
        String[] arg = {"aa","a"};
        System.out.println(longestCommonPrefix(arg));
    }

    /**
     * @Description: https://leetcode.com/problems/longest-common-prefix/
     * @param: [strs]
     * @Return: java.lang.String
     * @Author: vicebery
     * @Date: 2019/8/14
     **/
    public static String longestCommonPrefix(String[] strs) {
        String res="";
        if(strs.length==0)
            return "";
        System.out.println(res.indexOf("av"));
        int index = 0;
        while(index < strs[0].length()){
            int count=1;
            char tmp = strs[0].charAt(index);
            for(;count<strs.length;count++){
                if(strs[count].length()>index ){
                    if(strs[count].charAt(index) != tmp){
                        return res;
                    }
                }else{
                    break;
                }
            }
            if(count==strs.length){
                res += tmp;
            }
            index++;
        }
        return res;
    }

    /**
     * @Description: 658 https://leetcode.com/problems/find-k-closest-elements/
     * @param: [arr, k, x]
     * @Return: java.util.List<java.lang.Integer>
     * @Author: vicebery
     * @Date: 2019/8/29
     **/
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<Integer>(k);

        return res;
    }
}