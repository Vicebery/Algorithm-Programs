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
        int res = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (res < prices[i] - minPrice) {
                res = prices[i] - minPrice;
            }
        }
        return res;
    }
}