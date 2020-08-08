package jzoffer;

public class Solution13 {
    public static void main(String[] args){
        int m = 3;
        int n = 1;
        int k = 0;
        Solution13 s = new Solution13();

        System.out.println(s.movingCount(m,n,k));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/ 机器人的运动范围 dfs 剪枝
     * @Author: vicebery
     * @Date: 2020/0806
     **/

    public int movingCount(int m, int n, int k) {
        int res=0;
        int[][] tag = new int[m][n];
        res = dfs(tag,m, n,0,0,k);
        return res;
    }

    public int dfs(int[][] tag, int m, int n, int i, int j, int k){
        if(i>=m || j>=n || tag[i][j]==1 ||countXY(i,j)>k){
            return 0;
        }
        tag[i][j] = 1;
        return 1 + dfs(tag, m, n, i+1,j,k) + dfs(tag, m, n, i, j+1, k);
    }

    public int countXY(int x, int y){
        return countNum(x) + countNum(y);
    }

    public int countNum(int n){
        int ans = 0;
        while(n!=0){
            ans += n%10;
            n /=10;
        }
        return ans;
    }
}