package Java;

public class Solution122 {
    public static void main(String[] args){
        int[] arg = {7,1,5,3,6,4};
        System.out.println(maxProfit(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/ 买卖股票的最佳时机 多次购买
     * @Author: vicebery
     * @Date: 2020/0518
     **/
    public static int maxProfit(int[] prices) {
        int i = 0, maxProfit = 0;
        int valley, peak;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
                i++;
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            peak = prices[i];
            maxProfit += peak - valley;
        }
        return maxProfit;
    }
}