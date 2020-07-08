package Java;

import java.util.HashMap;
import java.util.Map;

public class Solution659 {
    public static void main(String[] args){
        int[] arg = {1,2,3,3,4,4,5,5};
        Solution659 s = new Solution659();

        System.out.println(s.isPossible(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/split-array-into-consecutive-subsequences/ 分割数组为连续子序列
     * @Author: vicebery
     * @Date: 2020/0628
     **/
    public boolean isPossible(int[] nums) {
        Map<Integer, Integer> hash = new HashMap<>();
        Map<Integer, Integer> tail = new HashMap<>();
        for (int n : nums) {
            if (hash.containsKey(n)) {
                int old = hash.get(n);
                hash.replace(n, old + 1);
            } else {
                hash.put(n, 1);
            }
            tail.put(n,0);
        }
        for (int cur: nums) {
            if (hash.get(cur) == 0) {
                continue;
            } else if (hash.get(cur) > 0 && tail.containsKey(cur-1) && tail.get(cur - 1) > 0) {
                hash.put(cur, hash.get(cur) - 1);
                tail.put(cur - 1, tail.get(cur - 1) - 1);
                tail.put(cur, tail.get(cur) + 1);
            } else if (hash.get(cur) > 0 && hash.containsKey(cur+1) && hash.get(cur + 1) > 0 && hash.containsKey(cur+2) && hash.get(cur + 2) > 0) {
                hash.put(cur, hash.get(cur) - 1);
                hash.put(cur + 1, hash.get(cur + 1) - 1);
                hash.put(cur + 2, hash.get(cur + 2) - 1);
                tail.put(cur + 2, tail.get(cur + 2) + 1);
            } else {
                return false;
            }
        }
        return true;
    }
}