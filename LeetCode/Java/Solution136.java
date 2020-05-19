package Java;

public class Solution136 {
    public static void main(String[] args){
        int[] arg = {1,2};
        System.out.println();
    }

    /**
     * @Description: https://leetcode-cn.com/problems/single-number/ 只出现一次的数字 异或运算
     * @Author: vicebery
     * @Date: 2020/0519
     **/
    public static int singleNumber(int[] nums) {
        int res = 0;
        for(int num:nums){
            res ^= num;
        }
        return res;
    }
}