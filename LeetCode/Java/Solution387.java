package Java;

public class Solution387 {
    public static void main(String[] args){

        System.out.println(firstUniqChar("loveleetcode"));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/first-unique-character-in-a-string/
     * @Author: vicebery
     * @Date: 2020/0608
     **/
    public static int firstUniqChar(String s) {
        int[] cHash = new int[26];
        char[] sChar = s.toCharArray();
        for(char c: sChar){
            cHash[c-'a']++;
        }
        for(int i=0;i<sChar.length;i++){
            char c = sChar[i];
            if(cHash[c-'a']==1){
                return i;
            }
        }
        return -1;
    }
}