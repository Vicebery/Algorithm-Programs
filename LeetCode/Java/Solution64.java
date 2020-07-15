package Java;

public class Solution64 {
    public static void main(String[] args){
        int[][] arg = {{0,0,0},{0,1,0},{0,0,0}};
        Solution64 s = new Solution64();

        System.out.println(s.minPathSum(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/minimum-path-sum/ dp 最小路径和
     * @Author: vicebery
     * @Date: 2020/0714
     **/
    public int minPathSum(int[][] grid) {
//        int[][] dp = new int[grid.length][grid[0].length];
        int row = grid.length;
        int col = grid[0].length;
        for(int i=1;i<row;i++){
            grid[i][0] += grid[i-1][0];
        }
        for(int i=1;i<col;i++){
            grid[0][i] += grid[0][i-1];
        }
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                grid[i][j] += Math.min(grid[i-1][j],grid[i][j-1]);
            }
        }
        return grid[row-1][col-1];
    }

}