package Java;

import java.util.Arrays;

public class Solution322 {
    public static void main(String[] args){
        int[] arg = {1,2};
        Solution322 s = new Solution322();

        System.out.println();
    }

    /**
     * @Description: https://leetcode-cn.com/problems/coin-change/
     * @Author: vicebery
     * @Date: 2020/0716
     **/
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int n = coins.length;
        if (n == 0) {
            return -1;
        }
        int[] dp = new int[max];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= coins[j]) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}