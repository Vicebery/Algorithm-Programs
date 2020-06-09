package Java;

public class Solution200 {
    public static void main(String[] args){
        int[] arg = {1,2};
        System.out.println();
    }

    /**
     * @Description: https://leetcode-cn.com/problems/number-of-islands/ 岛屿数量
     * @Author: vicebery
     * @Date: 2020/0609
     **/

    // 图的深度优先搜索 DFS
    public static int numIslands(char[][] grid) {
        int count = 0;
        if(grid==null || grid.length==0){
            return 0;
        }
        for(int i = 0;i<grid.length;i++){
            for(int j = 0; j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    DFS(grid,i,j);
                }
            }
        }
        return count;
    }

    public static void DFS(char[][] grid, int i, int j){
        if(grid==null){
            return ;
        }
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]=='0'){
            return ;
        }
        grid[i][j] = '0';
        DFS(grid,i-1,j);
        DFS(grid,i+1,j);
        DFS(grid,i,j-1);
        DFS(grid,i,j+1);
    }
}