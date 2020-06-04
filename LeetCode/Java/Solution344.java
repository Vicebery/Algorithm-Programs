package Java;


public class Solution344 {
    public static void main(String[] args){
        String s = ",.";

        System.out.println(new Solution344().reverseVowels(s));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/reverse-vowels-of-a-string/ 反转字符串中的元音字符
     * @Author: vicebery  
     * @Date: 2020/0604
     **/


    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int head = 0;
        int tail = sb.length()-1;
        while(head<tail){
            while(head<=sb.length()-1 && !isVowel(sb.charAt(head))) head++;
            while(tail>=0 && !isVowel(sb.charAt(tail))) tail--;
            if(head>=tail) break;
            char tmp = sb.charAt(head);
            sb.setCharAt(head,sb.charAt(tail));
            sb.setCharAt(tail,tmp);
            head++;
            tail--;
        }
        return sb.toString();
    }

    public boolean isVowel(char c){
        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
        for(char i:vowels){
            if(c==i){
                return true;
            }
        }
        return false;
    }
}