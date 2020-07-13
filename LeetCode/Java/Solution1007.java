package Java;

public class Solution1007 {
    public static void main(String[] args){
        int[] A = {2,1,2,4,2,2};
        int[] B = {5,2,6,2,3,2};
        Solution1007 s = new Solution1007();

        System.out.println(s.minDominoRotations(A,B));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/minimum-domino-rotations-for-equal-row/
     * @Author: vicebery
     * @Date: 2020/0712
     **/
    public int minDominoRotations(int[] A, int[] B) {
        int[] dic = new int[7];
        if(A.length!=B.length || A.length==0){
            return -1;
        }
        int n = A.length;
        for(int i=0;i<n;i++){
            dic[A[i]]++;
            dic[B[i]]++;
        }
        int target = 0;
        boolean isPossible = false;
        for(int i =1;i<7;i++){
            if(dic[i]>=n){
                target = i;
                isPossible = true;
                break;
            }
        }
        if(!isPossible){
            return -1;
        }else{
            int countA = 0;
            int countB = 0;
            for(int i =0;i<n;i++){
                if(A[i]==target && B[i]!=target){
                    countA++;
                }
                if(B[i]==target && A[i]!=target){
                    countB++;
                }
                if(A[i]!=target && B[i]!=target){
                    return -1;
                }
            }
            return Math.min(countA,countB);
        }
    }
}