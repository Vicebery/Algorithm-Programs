package Java;

public class Solution0dp1 {
    public static void main(String[] args){

        Solution0dp1 s = new Solution0dp1();

        System.out.println(s.waysToStep(61));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/three-steps-problem-lcci/ 三步问题
     * @Author: vicebery
     * @Date: 2020/0714
     **/
    public int waysToStep(int n) {
//        int[] dp = new int[n+1];
//        dp[1] = 1;
//        dp[2] = 2;
//        dp[3] = 4;
//        for (int i = 4; i <= n; i++) {
//            dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % 1000000007;
//        }
//        return dp[n];
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 4;
        }
        long pre3 = 1;
        long pre2 = 2;
        long pre1 = 4;
        long cur = 0;
        for (int i = 4; i <= n; i++) {
            cur = (pre1 + pre2 + pre3) % 1000000007;
            pre3 = pre2;
            pre2 = pre1;
            pre1 = cur;
        }
        return (int)cur;
    }
}