package jzoffer;

public class Solution12 {
    public static void main(String[] args){
        int[] arg = {1,2};
        Solution12 s = new Solution12();

        System.out.println();
    }

    /**
     * @Description: https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/ 矩阵中的路径 DFS
     * @Author: vicebery
     * @Date: 2020/0816
     **/
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(dfs(board, words, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, char[] words, int i, int j, int cur){
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || cur >= words.length || board[i][j] != words[cur]) {
            return false;
        }
        if(cur == words.length -1){
            return true;
        }
        char tmp = board[i][j];
        board[i][j] = '*';
        boolean res = dfs(board,words,i+1,j,cur+1) || dfs(board,words,i,j+1,cur+1) || dfs(board,words,i-1,j,cur+1) || dfs(board,words,i,j-1,cur+1);
        board[i][j] = tmp;
        return res;
    }
}