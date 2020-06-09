package Java;

public class Solution383 {
    public static void main(String[] args){

        System.out.println(canConstruct("ab","abac"));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/ransom-note/
     * @Author: vicebery
     * @Date: 2020/0608
     **/
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] cMagazine = new int[26];
        for(char c : magazine.toCharArray()){
            cMagazine[c-'a']++;
        }
        for(char c: ransomNote.toCharArray()){
            if(cMagazine[c-'a']>0){
                cMagazine[c-'a']--;
            }else{
                return false;
            }
        }
        return true;
    }
}