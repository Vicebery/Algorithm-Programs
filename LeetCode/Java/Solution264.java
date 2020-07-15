package Java;

import java.util.HashSet;
import java.util.PriorityQueue;

public class Solution264 {
    public static void main(String[] args) {
        int[] arg = {1, 2};
        Solution264 s = new Solution264();

        System.out.println(s.nthUglyNumber(10));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/ugly-number-ii/
     * @Author: vicebery
     * @Date: 2020/0715
     **/
    public int nthUglyNumber(int n) {
        int[] helper = {2, 3, 5};
        HashSet<Long> set = new HashSet<>();
        PriorityQueue<Long> heap = new PriorityQueue<>();
        heap.add(1L);
        Long cur, newUgly;
        for (int i = 1; i < n; i++) {
            cur = heap.poll();
            for (int num : helper) {
                newUgly = cur * num;
                if (!set.contains(newUgly)) {
                    set.add(newUgly);
                    heap.add(newUgly);
                }
            }
        }
        int ans = Math.toIntExact(heap.poll());
        return ans;
    }

    public int nthUglyNumberDP(int n) {
        int[] nums = new int[n];
        nums[0] = 1;
        int ugly, i2 = 0, i3 = 0, i5 = 0;

        for (int i = 1; i < 1690; ++i) {
            ugly = Math.min(Math.min(nums[i2] * 2, nums[i3] * 3), nums[i5] * 5);
            nums[i] = ugly;

            if (ugly == nums[i2] * 2) ++i2;
            if (ugly == nums[i3] * 3) ++i3;
            if (ugly == nums[i5] * 5) ++i5;
        }
        return nums[n - 1];
    }
}