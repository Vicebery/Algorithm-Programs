package Java;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution290 {
    public static void main(String[] args){
        String pattern = "abba";
        String str = "ab er er ab";
        System.out.println(wordPattern(pattern,str));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/word-pattern/ 单词规律   一种模式映射为另一种模式
     * @Author: vicebery  
     * @Date: 2020/0603
     **/


    public static boolean wordPattern(String pattern, String str) {
        HashMap<Character, Integer>  patternSimplify = new HashMap<>(pattern.length());
        int count = 1;
        String[] wordList = str.split(" ");
        if(pattern.length()!=wordList.length){
            return false;
        }

        StringBuilder patternS = new StringBuilder();
        for(Character c : pattern.toCharArray()){
            if(patternSimplify.containsKey(c)){
                patternS.append(patternSimplify.get(c));
            }else{
                patternSimplify.put(c,count);
                patternS.append(count);
                count++;
            }
        }

        HashMap<String, Integer> strSimplify = new HashMap<>(wordList.length);
        StringBuilder strS = new StringBuilder();
        count = 1;
        for(String s:wordList){
            if(strSimplify.containsKey(s)){
                strS.append(strSimplify.get(s));
            }else{
                strSimplify.put(s,count);
                strS.append(count);
                count++;
            }
        }
        if(patternS!=null && patternS.toString().equals(strS.toString())){
            return true;
        }else{
            return false;
        }
    }

    public boolean wordPattern2(String pattern, String str) {
        if (pattern == null && str == null) {
            return true;
        }
        if (pattern == null || str == null) {
            return false;
        }
        String[] word = str.split(" ");
        if (pattern.length() != word.length) {
            return false;
        }
        Map<Object, Integer> mem = new HashMap<>();
        for (int i = 0; i < word.length; i++) {
            Integer pi = mem.put(pattern.charAt(i), i);   // put的key已存在，则会返回oldValue，并且用新的value覆盖oldValue
            Integer si = mem.put(word[i], i);               // put的key不存在，则返回null
            if (!Objects.equals(pi, si)) {
                return false;
            }
        }

        return true;
    }
}