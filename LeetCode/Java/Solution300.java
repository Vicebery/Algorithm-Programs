package Java;

import java.util.Arrays;

public class Solution300 {
    public static void main(String[] args){
        int[] arg = {10,9,2,5,3,4};
        Solution300 s = new Solution300();

        System.out.println(s.lengthOfLIS(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/longest-increasing-subsequence/ 最长上升子序列
     * @Author: vicebery
     * @Date: 2020/0715
     **/
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        int ans = 1;
        for(int i = 1;i<n;i++){
            for(int j = 0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}