package Java;

public class Solution5 {
    public static void main(String[] args){
        String s = "";
        System.out.println(longestPalindrome(s));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/longest-palindromic-substring/  最长回文子字符串 动态规划
     * @Author: vicebery
     * @Date: 2020/0529
     **/

    // TODO
    public static String longestPalindrome(String s) {
        if (s == null || "".equals(s) || s.length() == 1) {
            return s;
        }

        char[] array = s.toCharArray();
        String result = s.substring(0, 1);

        if (s.length() == 2) {
            if (array[0] == array[1]) {
                return s;
            } else {
                return s.substring(0, 1);
            }

        }

        boolean[][] flag = new boolean[s.length()][s.length()];

        //初始化
        for (int i = 0; i < s.length(); i++) {
            flag[i][i] = true;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (array[i] == array[i + 1]) {
                flag[i][i + 1] = true;
                result = s.substring(i, i + 2);

            } else {
                flag[i][i + 1] = false;
            }
        }

        //动态规划
        for (int i = s.length() - 2; i >= 0; i--) {
            for (int j = i + 2; j < s.length(); j++) {
                if (array[i] == array[j]) {
                    flag[i][j] = flag[i + 1][j - 1];
                } else {
                    flag[i][j] = false;
                }
                if (flag[i][j]) {
                    if (result.length() <= j - i) {
                        result = s.substring(i, j + 1);
                    }
                }

            }
        }
        return result;
    }
}