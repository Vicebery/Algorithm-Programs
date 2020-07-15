package Java;

import java.util.Arrays;

public class Solution279 {
    public static void main(String[] args){
        int[] arg = {1,2};
        Solution279 s = new Solution279();

        System.out.println(s.numSquares(12));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/perfect-squares/
     * @Author: vicebery
     * @Date: 2020/0715
     **/
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        int maxSquaresIndex = (int)Math.sqrt(n) + 1;
        int[] squaresNum = new int[maxSquaresIndex];
        for(int i=1;i<maxSquaresIndex;i++){
            squaresNum[i] = i*i;
        }
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i =1;i<=n;i++){
            for(int j =1;j<maxSquaresIndex;j++){
                if(i<squaresNum[j]){
                    break;
                }
                dp[i] = Math.min(dp[i],dp[i-squaresNum[j]]+1);
            }
        }
        return dp[n];
    }
}