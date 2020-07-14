package Java;

public class Solution0dp2 {
    public static void main(String[] args){
        int[] arg = {2,1,4,5,3,1,1,3};
        Solution0dp2 s = new Solution0dp2();

        System.out.println(s.massage(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/the-masseuse-lcci/  按摩师
     * @Author: vicebery
     * @Date: 2020/0714
     **/
    public int massage(int[] nums) {
//        int n = nums.length;
//        int[] dp = new int[n];
//        if(n==0) return 0;
//        if(n==1) return nums[0];
//        if(n==2) return Math.max(nums[0],nums[1]);
//        dp[0] = nums[0];
//        dp[1] = Math.max(nums[0],nums[1]);
//        for(int i=2;i<n;i++){
//            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
//        }
//        return dp[n-1];
        int n = nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        int pre2 = nums[0];
        int pre1 = Math.max(nums[0],nums[1]);
        int ans = 0;
        for(int i=2;i<n;i++){
            ans = Math.max(pre2+nums[i],pre1);
            pre2 = pre1;
            pre1 = ans;
        }
        return ans;
    }
}