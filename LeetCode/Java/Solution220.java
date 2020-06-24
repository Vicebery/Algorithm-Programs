package Java;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Solution220 {
    public static void main(String[] args){
        int[] arg = {1,2,3,1,2,3};
        System.out.println();
    }

    /**
     * @Description:  https://leetcode-cn.com/problems/contains-duplicate-iii/
     * @Author: vicebery
     * @Date: 2020/0622
     **/
    // 二叉搜索树 TreeSet 用法  https://www.cnblogs.com/pony1223/p/7907173.html
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Integer> set = new TreeSet();
        for (int i = 0; i < nums.length; i++) {
            Integer l = set.ceiling(nums[i]);  // 返回大于等于nums[i]的最小元素（最靠近的）
            if (l != null && l <= nums[i] + t) {  // 注意加减法溢出
                return true;
            }
            Integer s = set.floor(nums[i]);   // 返回小于等于 nums[i] 的最大元素（最靠近的）
            if (s != null && nums[i]  <= t + s) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}