package Java;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution435 {
    public static void main(String[] args){
        int[][] arg = {{1,2}, {1,3}, {3,4}, {1,3}};
        Solution435 s = new Solution435();

        System.out.println(s.eraseOverlapIntervals(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/queue-reconstruction-by-height/
     * @Author: vicebery
     * @Date: 2020/0706
     **/
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> o1[1] - o2[1] );
        int n = intervals.length;
        if(n==0){
            return 0;
        }
        int count = 0;
        int tail = intervals[0][1];
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] < tail) {
                count++;
                continue;
            } else {
                tail = intervals[i][1];
            }
        }
        return count;
    }
}