package Java;

public class Solution91 {
    public static void main(String[] args){
        String arg = "7206";
        Solution91 s = new Solution91();

        System.out.println(s.numDecodings(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/decode-ways/ 解码方法
     * @Author: vicebery
     * @Date: 2020/0714
     **/
    public int numDecodings(String s) {
        char[] arr = s.toCharArray();
        int n = s.length();
        if (n == 0 || arr[0] == '0') {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n];
        dp[0] = 1;

        if (arr[1] != '0' && isOne(arr[0], arr[1])) {
            dp[1] = 2;
        } else if (arr[1] == '0' && !isOne(arr[0], arr[1])) {
            return 0;
        } else {
            dp[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            if (arr[i] == '0') {
                if (isOne(arr[i - 1], arr[i])) {
                    dp[i] = dp[i - 2];
                    continue;
                } else {
                    return 0;
                }
            }
            if (isOne(arr[i - 1], arr[i])) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1];
            }
        }
        return dp[n - 1];
    }

    public boolean isOne(char a, char b) {
        if (a >= '1' && a <= '9' && b >= '0' && b <= '9') {
            int tmp = (a - '0') * 10 + (b - '0');
            if (tmp >= 1 && tmp <= 26) {
                return true;
            }
        }
        return false;
    }
}