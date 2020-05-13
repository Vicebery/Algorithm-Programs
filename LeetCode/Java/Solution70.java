package Java;

public class Solution70 {
    public static void main(String[] args){
        int[] arg = {1,2};
        System.out.println(climbStairs(45));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/climbing-stairs/ 爬楼梯
     * @Author: vicebery
     * @Date: 2020/0513
     **/
    // 递推解法
    public static int climbStairs(int n) {
        if(n==0||n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int[] res = new int[n];
        res[0] = 1;
        res[1] = 2;
        for(int i=2;i<n;i++){
            res[i] = res[i-1] + res[i-2];
        }
        return res[n-1];
    }
    // 递归解法 超时
    public static int climbStairs2(int n) {
        if(n==0||n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }

}