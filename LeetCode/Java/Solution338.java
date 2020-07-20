package Java;

import java.util.Arrays;

public class Solution338 {
    public static void main(String[] args){

        Solution338 s = new Solution338();
        int[] arg = s.countBits(0);
        System.out.println(Arrays.toString(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/counting-bits/
     * @Author: vicebery
     * @Date: 2020/0717
     **/
    public int[] countBits(int num) {
        int[] dp = new int[num + 1];
        dp[0] = 0;
        if (num == 0) {
            return dp;
        }
        dp[1] = 1;
        int pre = 1;
        for (int i = 1; i <= num; i++) {
            if (pre == i) {
                dp[i] = 1;
            } else if (pre < i && i < pre * 2) {
                dp[i] = 1 + dp[i - pre];
            } else if (i == pre * 2) {
                dp[i] = 1;
                pre = pre * 2;
            }
        }
        return dp;
    }

    public int[] countBits2(int num) {
        int[] dp = new int[num + 1];
        dp[0] = 0;
        if (num == 0) {
            return dp;
        }
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                dp[i] = dp[i / 2];
            } else {
                dp[i] = dp[i - 1] + 1;
            }
        }
        return dp;
    }
}