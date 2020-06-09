package Java;


import java.util.*;

public class Solution283 {
    public static void main(String[] args){
        String a = "AAAAAAAAAAA";

        List<String> res = findRepeatedDnaSequences(a);
        for(String num:res)
            System.out.println(num);
    }

    /**
     * @Description: https://leetcode-cn.com/problems/repeated-dna-sequences/ 重复的DNA序列
     * @Author: vicebery  
     * @Date: 2020/0609
     **/


    public static List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new LinkedList<>();
        Set<String> set = new HashSet<>();
        Set<String> alreadExit = new HashSet<>();
        if(s.length()<=10){
            return res;
        }
        for (int i = 10; i <= s.length(); i++) {
            String cur = s.substring(i-10,i);
            if (!set.contains(cur)) {
                set.add(cur);
            }else{
                if(!alreadExit.contains(cur)){
                    alreadExit.add(cur);
                    res.add(cur);
                }
            }
        }
        return res;
    }
}