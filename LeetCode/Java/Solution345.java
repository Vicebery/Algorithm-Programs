package Java;


public class Solution345 {
    public static void main(String[] args){
        char[] s = {'a','b','c','d'};
        new Solution345().reverseString(s);
        for(char c:s)
        System.out.println(c);
    }

    /**
     * @Description: https://leetcode-cn.com/problems/reverse-string/ 反转字符串
     * @Author: vicebery  
     * @Date: 2020/0604
     **/


    public void reverseString(char[] s) {
        int head = 0;
        int tail = s.length-1;
        while(head<tail){
            char tmp = s[head];
            s[head] = s[tail];
            s[tail] = tmp;
            head++;
            tail--;
        }
    }
}