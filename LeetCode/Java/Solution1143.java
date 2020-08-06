package Java;

public class Solution1143 {
    public static void main(String[] args){
        String t1 ="abcefgt";
        String t2 ="aedfgg";
        Solution1143 s = new Solution1143();

        System.out.println(s.longestCommonSubsequence2(t1,t2));
        System.out.println(s.lcs);
    }

    /**
     * @Description: https://leetcode-cn.com/problems/longest-common-subsequence/ 最长公共子序列
     * @Author: vicebery
     * @Date: 2020/0806
     **/
    public int longestCommonSubsequence(String text1, String text2) {
        char[] t1 = text1.toCharArray();
        char[] t2 = text2.toCharArray();
        int len1 = t1.length;
        int len2 = t2.length;
        int[][] dp = new int[len1+1][len2+1];

        for(int i =1;i<=len1;i++){
            for(int j = 1;j<=len2;j++){
                if(t1[i-1] == t2[j-1]){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[len1][len2];
    }

    // 记录最长公共子序列
    StringBuilder lcs = new StringBuilder();
    public int longestCommonSubsequence2(String text1, String text2) {
        char[] t1 = text1.toCharArray();
        char[] t2 = text2.toCharArray();
        int len1 = t1.length;
        int len2 = t2.length;
        int[][] dp = new int[len1+1][len2+1];
        int[][] path = new int[len1+1][len2+1];
        for(int i =1;i<=len1;i++){
            for(int j = 1;j<=len2;j++){
                if(t1[i-1] == t2[j-1]){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else if(dp[i-1][j] >= dp[i][j-1]){
                    dp[i][j] = dp[i-1][j];
                    path[i][j] = 1;
                }else{
                    dp[i][j] = dp[i][j-1];
                    path[i][j] = -1;
                }
            }
        }

        PrintLCS(path,text1,len1,len2);
        return dp[len1][len2];
    }

    public void PrintLCS(int[][]b,String x,int i,int j){
        if(i == 0 || j == 0){
            return;
        }
        if(b[i][j] == 0){
            PrintLCS(b,x,i-1,j-1);
            lcs.append(x.charAt(i-1));
//            System.out.print(x.charAt(i-1));
        }else if(b[i][j] == 1){
            PrintLCS(b,x,i-1,j);
        }else{
            PrintLCS(b,x,i,j-1);
        }
    }
}