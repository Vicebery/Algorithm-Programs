package Java;

public class Solution121 {
    public static void main(String[] args){
        int[] arg = {7,1,5,3,6,4};
        System.out.println(maxProfit2(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/ 买卖股票的最佳时机
     * @Author: vicebery
     * @Date: 2020/0518
     **/
    public static int maxProfit(int[] prices) {
        int res=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i-1]>=prices[i]) continue;
            for(int j=i;j<prices.length;j++){
                if(prices[i-1]<prices[j]){
                    res = Math.max(res,prices[j]-prices[i-1]);
                }
            }
        }
        return res;
    }

    public static int maxProfit2(int[] prices) {
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