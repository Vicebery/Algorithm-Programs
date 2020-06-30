package Java;

import java.util.*;

public class Solution1403 {
    public static void main(String[] args){
        int[] arg = {8,8};
        Solution1403 s = new Solution1403();

        System.out.println(s.minSubsequence(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/minimum-subsequence-in-non-increasing-order/
     * @Author: vicebery
     * @Date: 2020/0630
     **/
    public List<Integer> minSubsequence(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        if(n==1){
            res.add(nums[0]);
            return res;
        }

        Arrays.sort(nums);
        int[] sum = new int[n];
        for(int i =0;i<n;i++){
            if(i==0){
                sum[i] = nums[i];
            }else{
                sum[i] = sum[i-1]+ nums[i];
            }
        }

        res.add(nums[n-1]);
        for(int i = n-2;i>=0;i--){
            if(sum[n-1]-sum[i]>sum[i]){
                return res;
            }else{
                res.add(nums[i]);
            }
        }
        return res;
    }
}