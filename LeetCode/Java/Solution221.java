package Java;

import java.util.Arrays;

public class Solution221 {
    public static void main(String[] args){
        char[][] arg = {{'0','0','0','1'},{'1','1','0','1'},{'1','1','1','1'},{'0','1','1','1'},{'1','1','1','1'}};
        Solution221 s = new Solution221();

        System.out.println(s.maximalSquare(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/maximal-square/ 最大正方形
     * @Author: vicebery
     * @Date: 2020/0715
     **/
    public int maximalSquare(char[][] matrix) {
        int n = matrix.length;
        boolean isExit1 = false;
        for(char[] cs:matrix){
            if(isExit1) break;
            for(char c:cs){
                if(c=='1'){
                    isExit1 = true;
                    break;
                }
            }
        }
        if(n==0 || !isExit1){
            return 0;
        }
        int m = matrix[0].length;
        if(n==1 || m==1){
            return isExit1?1:0;
        }
        int max = isExit1?1:0;
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                int tmp = matrix[i-1][j-1] - '0';
                if(matrix[i][j]=='0' || tmp==0){
                    continue;
                }else{
                    boolean isScale = true;
                    int k;
                    for(k=1;k<=tmp;k++){
                        if(matrix[i-k][j]=='0' || matrix[i][j-k]=='0'){
                            isScale = false;
                            break;
                        }
                    }
                    if(isScale==true){
                        matrix[i][j] = (char)(matrix[i-1][j-1] + 1);
                    }else{
                        matrix[i][j] = (char)(matrix[i][j] + k-1);
                    }
                }
                max = Math.max(max,matrix[i][j]-'0');
            }
        }
        return max*max;
    }
}