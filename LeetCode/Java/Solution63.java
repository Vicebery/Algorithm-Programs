package Java;

import java.util.Arrays;

public class Solution63 {
    public static void main(String[] args){
        int[][] arg = {{0,0,0},{0,1,0},{0,0,0}};
        Solution63 s = new Solution63();

        System.out.println(s.uniquePathsWithObstacles(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/unique-paths-ii/ dp 不同路径
     * @Author: vicebery
     * @Date: 2020/0714
     **/
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        if(row==0 || col == 0){
            return 0;
        }
        if(row==1 || col==1){
            for(int i=0;i<row;i++){
                for(int j = 0;j<col;j++) {
                    if(obstacleGrid[i][j]==1){
                        return 0;
                    }
                }
            }
            return 1;
        }
        if(obstacleGrid[0][0]==1 ||obstacleGrid[row-1][col-1]==1){
            return 0;
        }
        for(int i=0;i<row;i++){
            for(int j = 0;j<col;j++){
                if(obstacleGrid[i][j]==1){
                    obstacleGrid[i][j] = -1;
                    continue;
                }
                if(i==0){
                    if(j-1>0 && obstacleGrid[0][j-1]==-1){
                        obstacleGrid[0][j]=-1;
                    }else{
                        obstacleGrid[0][j] = 1;
                    }
                }
                if(j==0){
                    if(i-1>0 && obstacleGrid[i-1][0]==-1){
                        obstacleGrid[i][0] = -1;
                    }else{
                        obstacleGrid[i][0] = 1;
                    }
                }
            }
        }
        for(int i = 1;i<row;i++){
            for(int j = 1;j<col;j++){
                if(obstacleGrid[i][j]==-1){
                    continue;
                }
                if(obstacleGrid[i-1][j]==-1 && obstacleGrid[i][j-1]==-1){
                    obstacleGrid[i][j] = -1;
                }else if(obstacleGrid[i-1][j] == -1){
                    obstacleGrid[i][j] = obstacleGrid[i][j-1];
                }else if(obstacleGrid[i][j-1] == -1){
                    obstacleGrid[i][j] = obstacleGrid[i-1][j];
                }else{
                    obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
                }
            }
        }
        if(obstacleGrid[row-1][col-1]==-1){
            return 0;
        }
        return obstacleGrid[row-1][col-1];
    }

}