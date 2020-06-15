package Java;

import java.util.Arrays;

public class Solution213 {
    public static void main(String[] args){
        int[] arg = {2,7};
        System.out.println(rob(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/house-robber-ii/ 打家劫舍2 初级动态规划
     * @Author: vicebery
     * @Date: 2020/0615
     **/
    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        return Math.max(myRob(Arrays.copyOfRange(nums, 0, nums.length - 1)), myRob(Arrays.copyOfRange(nums, 1, nums.length)));

    }

    public static int myRob(int[] nums) {
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