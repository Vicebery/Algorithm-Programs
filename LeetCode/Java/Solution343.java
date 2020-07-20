package Java;

import java.util.Arrays;

public class Solution343 {
    public static void main(String[] args){
        int[] arg = {1,2};
        Solution343 s = new Solution343();

        System.out.println(s.integerBreak(2));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/integer-break/
     * @Author: vicebery
     * @Date: 2020/0717
     **/
    public int integerBreak(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,1);
        for(int i =3;i<=n;i++){
            for(int j = 1;j<i;j++){
                dp[i] = Math.max(dp[i],Math.max(j*dp[i-j],j*(i-j)));
            }
        }
        return dp[n];
    }
}