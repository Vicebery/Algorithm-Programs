package Java;

public class Solution1025 {
    public static void main(String[] args){
        int[] arg = {1,2};
        Solution1025 s = new Solution1025();

        System.out.println();
    }

    /**
     * @Description:  https://leetcode-cn.com/problems/divisor-game/
     * @Author: vicebery
     * @Date: 2020/0713
     **/
    public boolean divisorGame(int N) {
        if (N == 1) return false;
        if (N == 2) return true;

        boolean[] dp = new boolean[N + 1];
        dp[1] = false;
        dp[2] = true;

        for (int i = 3; i <= N; i++) {
            dp[i] = false;
            for (int j = 1; j < i; j++) {
                if (i % j == 0 && !dp[i - j]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[N];
    }
}