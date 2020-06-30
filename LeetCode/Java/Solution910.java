package Java;

import java.util.Arrays;

public class Solution910 {
    public static void main(String[] args){
        int[] arg = {1,4,6};
        int k = 7;
        Solution910 s = new Solution910();

        System.out.println(s.smallestRangeII(arg,k));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/smallest-range-ii/
     * @Author: vicebery
     * @Date: 2020/0630
     **/
    public int smallestRangeII(int[] A, int K) {
        int N = A.length;
        Arrays.sort(A);
        int ans = A[N - 1] - A[0];

        for (int i = 0; i < A.length - 1; ++i) {
            int a = A[i], b = A[i + 1];
            int high = Math.max(A[N - 1] - K, a + K);
            int low = Math.min(A[0] + K, b - K);
            ans = Math.min(ans, high - low);
        }
        return ans;
    }
}