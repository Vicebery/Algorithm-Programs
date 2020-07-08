package Java;

import java.util.Arrays;

public class Solution870 {
    public static void main(String[] args){
        int[] A = {2,7,11,15};
        int[] B = {1,10,4,11};
        Solution870 s = new Solution870();
        int[] C=s.advantageCount(A,B);
        for(int i:C)
        System.out.println(i+" ");
    }

    /**
     * @Description: https://leetcode-cn.com/problems/advantage-shuffle/ 优势洗牌
     * @Author: vicebery
     * @Date: 2020/0708
     **/
    public int[] advantageCount(int[] A, int[] B) {
        int n = A.length;
        int[][] B_index = new int[n][2];
        for(int i=0;i<n;i++){
            B_index[i][0]=B[i];
            B_index[i][1] = i;
        }
        Arrays.sort(B_index,(o1,o2)->o1[0]-o2[0]);
        Arrays.sort(A);
        int[] ans = new int[n];
        int remain = 0;
        int indexB = 0;
        for(int i=0;i<n;i++){
            if(A[i]<=B_index[indexB][0]){
                remain++;
                ans[B_index[n-remain][1]] = A[i];
            }else{
                ans[B_index[indexB][1]] = A[i];
                indexB++;
            }
        }
        return ans;
    }
}