package Java;

public class Solution125 {
    public static void main(String[] args){
        String arg = "...#@...A.  ....";
        System.out.println(isPalindrome(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/valid-palindrome/ 验证回文串
     * @Author: vicebery
     * @Date: 2020/0519
     **/
    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        s = s.toLowerCase(); // 字符串大写变小写
        StringBuilder strFilter = new StringBuilder();
        // 过滤无用字符
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) { //判断是否是数字或者字母
                strFilter.append(s.charAt(i));
            }
        }

        for (int i = 0; i < strFilter.length() / 2; i++) {
            if (strFilter.charAt(i) != strFilter.charAt(strFilter.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}