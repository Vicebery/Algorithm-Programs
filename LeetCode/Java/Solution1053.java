package Java;

import java.util.Arrays;

public class Solution1053 {
    public static void main(String[] args){
        int[] A = {5,4,9,8,4,5,3,1,1,3};

        Solution1053 s = new Solution1053();
        int[] res = s.prevPermOpt1(A);
        System.out.println(Arrays.toString(res));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/previous-permutation-with-one-swap/
     * @Author: vicebery
     * @Date: 2020/0712
     **/
    public int[] prevPermOpt1(int[] A) {
        int n = A.length;
        if (n == 0) {
            return new int[0];
        }
        int[] res = Arrays.copyOf(A, n);
        boolean hasRes = false;
        int curMax = Integer.MIN_VALUE;
        int index = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (i - 1 >= 0 && A[i] < A[i - 1]) {
                for (int j = i ; j < n; j++) {
                    if (A[j] < A[i-1]) {
                        hasRes = true;
                        if(A[j]> curMax){
                            curMax = A[j];
                            index = j;
                        }
                    }
                }
                if(hasRes){
                    int tmp = res[i-1];
                    res[i-1] = res[index];
                    res[index] = tmp;
                    return res;
                }
            }
        }
        return res;
    }
}