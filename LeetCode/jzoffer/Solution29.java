package jzoffer;

import java.util.Arrays;

public class Solution29 {
    public static void main(String[] args){
        int[][] arg = {{1,2,3},{4,5,6},{7,8,9}};
        Solution29 s = new Solution29();
        int[] res = s.spiralOrder(arg);
        System.out.println(Arrays.toString(res));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/ 顺时针打印矩阵
     * @Author: vicebery
     * @Date: 2020/0805
     **/
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int len = row * col;
        int[] res = new int[len];
        boolean[][] visited = new boolean[row][col];
        int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int directionIndex = 0;
        int index = 0, i = 0, j = 0;

        while (index < len) {
            res[index++] = matrix[i][j];
            visited[i][j] = true;
            int nextRow = i + direction[directionIndex][0], nextColumn = j + direction[directionIndex][1];
            if (nextRow < 0 || nextRow >= row || nextColumn < 0 || nextColumn >= col || visited[nextRow][nextColumn]) {
                directionIndex = (directionIndex + 1) % 4;
            }
            i += direction[directionIndex][0];
            j += direction[directionIndex][1];
        }
        return res;
    }
}