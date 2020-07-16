package Java;

public class Solution309 {
    public static void main(String[] args){
        int[] arg = {1,2,3,0,2};
        Solution309 s = new Solution309();

        System.out.println(s.maxProfit(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
     * @Author: vicebery
     * @Date: 2020/0715
     **/
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n==0){
            return 0;
        }
        int[][] dp = new int[n][3];
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        dp[0][2] = 0;
        for(int i=1;i<n;i++){
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]-prices[i]);
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][2]);
            dp[i][2] = dp[i-1][0] + prices[i];
        }
        return Math.max(dp[n-1][1],dp[n-1][2]);
    }
}