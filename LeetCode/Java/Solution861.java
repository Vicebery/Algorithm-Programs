package Java;

public class Solution861 {
    public static void main(String[] args){
        int[] arg = {1,2};
        Solution861 s = new Solution861();

        System.out.println();
    }

    /**
     * @Description: https://leetcode-cn.com/problems/score-after-flipping-matrix/
     * @Author: vicebery
     * @Date: 2020/0630
     **/
    public  int matrixScore(int[][] A) {
        int res = 0;
        int col = A[0].length;
        int row = A.length;
        // 第一列一定全为1
        res = 1<<col * row;
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                if(j==0 && A[i][j]==1){
                    break;
                }else{
                    A[i][j] = A[i][j]^1;
                }
            }
        }
        for(int i = 1;i<col;i++){
            int count = 0;
            for(int j=0;j<row;j++){
                if(A[j][i]==1){
                    count++;
                }
            }
            if(count>row/2){
                res += 1<<(col-i)*count;
            }else{
                res += 1<<(col-i)*(row-count);
            }
        }
        return res;
    }
}