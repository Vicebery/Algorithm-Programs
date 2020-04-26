package Java;

public class Solution9 {
    public static void main(String[] args){
        int[] arg = {1,2};
        System.out.println(isPalindrome(-121));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/palindrome-number/
     * @Author: vicebery
     * @Date: 2020/4/24
     **/
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String value = String.valueOf(x);
        String reverseStr = new StringBuffer(value).reverse().toString();
        if (value.equals(reverseStr)) {
            return true;
        }else{
            return false;
        }
    }
}