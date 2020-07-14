package Java;

public class Solution0dp0 {
    public static void main(String[] args){
        int[] arg = {-2,1,-3,4,-1,2,1,-5,4};
        Solution0dp0 s = new Solution0dp0();

        System.out.println(s.maxSubArray(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/  连续子数组的最大和
     * @Author: vicebery
     * @Date: 2020/0714
     **/
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int ans = dp[0];
        for (int i = 1; i < n; ++i) {
            if (dp[i - 1] > 0) {
                dp[i] = dp[i - 1] + nums[i];
            } else {
                dp[i] = nums[i];
            }
            ans = Math.max(ans,dp[i]);
        }
        return ans;
    }
}