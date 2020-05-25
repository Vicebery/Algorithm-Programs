package Java;

import java.util.HashSet;
import java.util.Set;

public class Solution219 {
    public static void main(String[] args){
        int[] arg = {1,2,3,1,2,3};
        System.out.println(containsNearbyDuplicate(arg,2));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/contains-duplicate-ii/
     * @Author: vicebery
     * @Date: 2020/0525
     **/
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; ++i) {
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}