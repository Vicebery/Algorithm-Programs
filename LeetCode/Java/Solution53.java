package Java;

public class Solution53 {
    public static void main(String[] args){
        int[] arg = {-2};
        System.out.println(maxSubArray2(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/maximum-subarray/
     * @Author: vicebery
     * @Date: 2020/0511
     **/
    public static int maxSubArray(int[] nums) {
        int smin = 0, smax = nums[0], sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sum-smin > smax){
                smax = sum - smin;
            }
            if (sum < smin){
                smin = sum;
            }
        }
        return smax;
    }

    // 最大子序列 动态规划解法
    public static int maxSubArray2(int[] nums) {
        int curMax = nums[0], max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curMax = Math.max(curMax + nums[i], nums[i]);
            max = Math.max(max, curMax);
        }
        return max;
    }
}