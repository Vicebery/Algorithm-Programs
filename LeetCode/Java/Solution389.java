package Java;

public class Solution389 {
    public static void main(String[] args){

        System.out.println(findTheDifference("loveleetcofde","lovelefqetcode"));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/find-the-difference/
     * @Author: vicebery
     * @Date: 2020/0608
     **/
    public static char findTheDifference(String s, String t) {
        int[] hash = new int[26];
        for(char c: s.toCharArray()){
            hash[c-'a']++;
        }
        for(char c : t.toCharArray()){
            hash[c-'a']--;
            if(hash[c-'a']==-1){
                return c;
            }
        }
        return 'a';
    }

    // 异或运算
    public static char findTheDifference2(String s, String t) {
        char res = 0;
        int lens = s.length();
        for (int i = 0; i < lens; i ++) {
            res ^= s.charAt(i)^ t.charAt(i);
        }
        res ^= t.charAt(lens);
        return res;
    }

}