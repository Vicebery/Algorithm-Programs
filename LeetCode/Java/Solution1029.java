package Java;

import java.util.Arrays;
import java.util.Comparator;

public class Solution1029 {
    public static void main(String[] args){
        int[] arg = {1,2};
        Solution1029 s = new Solution1029();

        System.out.println();
    }

    /**
     * @Description: https://leetcode-cn.com/problems/two-city-scheduling/
     * @Author: vicebery
     * @Date: 2020/0630
     **/
    public int twoCitySchedCost(int[][] costs) {
//        Arrays.sort(costs, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] t0, int[] t1) {
//                return t0[0]-t0[1]-(t1[0]-t1[1]);
//            }
//        });
        Arrays.sort(costs,(n1,n2)->n1[0]-n1[1]-(n2[0]-n2[1]));
        int n = costs.length/2;
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum+= costs[i][0] + costs[i+n][1];
        }
        return sum;
    }
}