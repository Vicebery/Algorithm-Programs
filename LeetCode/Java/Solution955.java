package Java;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_ADDPeer;

public class Solution955 {
    public static void main(String[] args){
        String[] arg = {"xga","xfb","yfa"};
        Solution955 s = new Solution955();
//        StringBuilder sb= new StringBuilder("a");
//        StringBuilder sbb = new StringBuilder("a");
//        if(sb.equals(sbb))

        System.out.println(s.minDeletionSize(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/delete-columns-to-make-sorted-ii/  删列造序 II
     * @Author: vicebery
     * @Date: 2020/
     **/
    public int minDeletionSize(String[] A) {
        int res = 0;
        int n = A.length;
        int m = A[0].length();
        boolean[] sort = new boolean[n - 1];
        for (int i = 0; i < m; i ++) {
            int j;
            for (j = 0; j < n - 1; j ++) {
                if (!sort[j] && A[j].charAt(i) > A[j + 1].charAt(i)) {
                    res ++;
                    break;
                }
            }
            if (j < n - 1) {
                continue;
            }
            // 进入到这儿，那么必然是升序（包含相等的情况）
            // 如果当前位置严格升序，那么下一轮就不用比较，同样也记录了相等的位置，下一轮比较中，会判断
            for (j = 0; j < n - 1; j ++) {
                sort[j] |= A[j].charAt(i) < A[j + 1].charAt(i);
            }
        }
        return res;
    }
}