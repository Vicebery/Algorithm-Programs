package Java;

public class Solution746 {
    public static void main(String[] args){
        int[] A = {2,1,2,4,2,2};
        Solution746 s = new Solution746();

        System.out.println(s.minCostClimbingStairs(A));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/min-cost-climbing-stairs/  使用最小花费爬楼梯
     * @Author: vicebery
     * @Date: 2020/0713
     **/
    public int minCostClimbingStairs(int[] cost) {
        int pre0 = 0;
        int pre1 = 0;
        int cur = 0;
        for(int i=0;i<cost.length;i++){
            cur = cost[i] + Math.min(pre0,pre1);
            pre0 = pre1;
            pre1 = cur;
        }
        return Math.min(pre0,pre1);
    }
}