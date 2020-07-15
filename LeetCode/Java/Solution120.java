package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution120 {
    public static void main(String[] args){
        List<Integer> r1 = new ArrayList<>(1);
        r1.add(2);
        List<Integer> r2 = new ArrayList<>(2);
        r2.add(3);
        r2.add(4);
        List<Integer> r3 = new ArrayList<>(3);
        r3.add(6);
        r3.add(5);
        r3.add(7);
        List<Integer> r4 = new ArrayList<>(4);
        r4.add(4);
        r4.add(1);
        r4.add(8);
        r4.add(3);
        List<List<Integer>> arg = new ArrayList<>();
        arg.add(r1);
        arg.add(r2);
        arg.add(r3);
        arg.add(r4);
        Solution120 s = new Solution120();

        System.out.println(s.minimumTotal(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/triangle/ 三角形最小路径和
     * @Author: vicebery
     * @Date: 2020/0715
     **/
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.get(triangle.size() - 1).size();
        int[] dp = new int[n];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = triangle.get(0).get(0);
        for (int i = 1; i < n; i++) {
            int m = triangle.get(i).size();
            int[] tmp = Arrays.copyOf(dp,n);
            for (int j = 0; j < m; j++) {
                if(j==0){
                    dp[0] = tmp[0] + triangle.get(i).get(0);
                }else{
                    dp[j] = triangle.get(i).get(j) + Math.min(tmp[j],tmp[j-1]);
                }
            }
        }
        Arrays.sort(dp);
        return dp[0];
    }
}