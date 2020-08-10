package Java;

import java.util.HashMap;
import java.util.Map;

public class Solution560 {
    public static void main(String[] args){
        int[] arg = {1,2,3};
        Solution560 s = new Solution560();

        System.out.println(s.subarraySum(arg,3));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/subarray-sum-equals-k/ 和为K的子数组 连续
     * @Author: vicebery
     * @Date: 2020/0810
     **/
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = 0;
            for(int end = i;end>=0;end--){
                sum+=nums[end];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }

    // 前缀和
    public int subarraySum2(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        map.put(0,1);
        int pre = 0;
        for(int i = 0;i<nums.length;i++){
            pre += nums[i];
            if(map.containsKey(pre-k)){
                count += map.get(pre-k);
            }
            map.put(pre, map.getOrDefault(pre,0)+1);
        }
        return count;
    }
}