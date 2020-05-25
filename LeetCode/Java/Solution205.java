package Java;

import java.util.HashMap;

public class Solution205 {
    public static void main(String[] args){
        String a = "abbc";
        String b = "baar";
        System.out.println(isIsomorphic(a,b));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/isomorphic-strings/ 同构字符串
     * @Author: vicebery
     * @Date: 2020/0525
     **/
    public static boolean isIsomorphic(String s, String t) {
//        return isIsomorphicHelper(s, t) && isIsomorphicHelper(t, s);
        return isIsomorphicHelper2(s).equals(isIsomorphicHelper2(t));
    }

    public static boolean isIsomorphicHelper(String s, String t) {   // 建立映射对
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;
        HashMap<Character, Character> hash = new HashMap<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (hash.containsKey(c1)) {
                if (hash.get(c1) != c2) {
                    return false;
                }
            } else {
                hash.put(c1, c2);
            }
        }
        return true;
    }

    public static String isIsomorphicHelper2(String s) {  // 转换为一种通用的模式
        int[] map = new int[128];
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map[c] == 0) {
                count++;
                map[c] = count;
            }
            sb.append(map[c]);
        }
        return sb.toString();
    }


}