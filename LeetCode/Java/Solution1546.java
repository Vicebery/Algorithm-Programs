package Java;

import java.util.HashMap;
import java.util.Map;

public class Solution1546 {
    public static void main(String[] args){
        int[] arg = {1,2};
        Solution1546 s = new Solution1546();

        System.out.println();
    }

    /**
     * @Description: https://leetcode-cn.com/problems/maximum-number-of-non-overlapping-subarrays-with-sum-equals-target/
     * 和为目标值的最大数目不重叠非空子数组数目
     * @Author: vicebery
     * @Date: 2020/0810
     **/
    // 前缀和 由于不能重叠，每次找到后就要初始化
    public int maxNonOverlapping(int[] nums, int target) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int pre = 0;
        map.put(0,1);
        for(int i =0;i<nums.length;i++){
            pre += nums[i];
            if(map.containsKey(pre - target)){
                count++;
                pre = 0;
                map.clear();
                map.put(0,1);
            }
            map.put(pre,1);
        }
        return count;
    }
}