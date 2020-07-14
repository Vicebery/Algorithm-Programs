package Java;

import java.util.Arrays;

public class Solution62 {
    public static void main(String[] args){
        int[] arg = {1,2};
        Solution62 s = new Solution62();

        System.out.println(s.uniquePaths(7,3));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/unique-paths/ dp 不同路径
     * @Author: vicebery
     * @Date: 2020/0714
     **/
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++)
            dp[i][0] = 1;
        for(int i =0;i<n;i++)
            dp[0][i] = 1;
        for(int i=1;i<m;i++){
            for(int j = 1;j<n;j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
    // 优化
    public int uniquePaths2(int m, int n) {
        int[] cur = new int[n];
        Arrays.fill(cur,1);
        for (int i = 1; i < m;i++){
            for (int j = 1; j < n; j++){
                cur[j] += cur[j-1] ;
            }
        }
        return cur[n-1];
    }
}