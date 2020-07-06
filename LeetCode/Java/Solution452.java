package Java;

import java.util.Arrays;

public class Solution452 {
    public static void main(String[] args){
        int[][] arg = {{1,2}, {1,3}, {3,4}, {1,3}};
        Solution452 s = new Solution452();

        System.out.println(s.findMinArrowShots(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/minimum-number-of-arrows-to-burst-balloons/
     * @Author: vicebery
     * @Date: 2020/0706
     **/
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (o1, o2) -> o1[1] - o2[1] );
        int n = points.length;
        if(n==0){
            return 0;
        }
        int count = 1;
        int tail = points[0][1];
        for (int i = 1; i < n; i++) {
            if (points[i][0] > tail) {
                count++;
                tail = points[i][1];
            }
        }
        return count;
    }
}