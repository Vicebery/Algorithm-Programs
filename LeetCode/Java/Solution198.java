package Java;

public class Solution198 {
    public static void main(String[] args){
        int[] arg = {2,7,9,3,1};
        System.out.println(rob(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/house-robber/ 打家劫舍 初级动态规划
     * @Author: vicebery
     * @Date: 2020/0522
     **/
    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[nums.length - 1];
    }
}