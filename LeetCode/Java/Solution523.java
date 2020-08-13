package Java;

import java.util.HashMap;
import java.util.Map;

public class Solution523 {
    public static void main(String[] args){
        int[] arg = {1,2};
        Solution523 s = new Solution523();

        System.out.println();
    }

    /**
     * @Description: https://leetcode-cn.com/problems/continuous-subarray-sum/ 连续的子数组和
     * @Author: vicebery
     * @Date: 2020/0810
     **/
    public  boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (k != 0) {
                sum = sum % k;
            }
            if (map.containsKey(sum)) {
                if (i - map.get(sum) > 1) {
                    return true;
                }
            } else {
                map.put(sum, i);
            }
        }
        return false;
    }
}