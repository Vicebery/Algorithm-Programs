package Java;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution139 {
    public static void main(String[] args){
        int[] arg = {1,2};
        Solution139 s = new Solution139();

        System.out.println();
    }

    /**
     * @Description: https://leetcode-cn.com/problems/word-break/
     * @Author: vicebery
     * @Date: 2020/0714
     **/
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet(wordDict);
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}