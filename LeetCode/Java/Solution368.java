package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution368 {
    public static void main(String[] args){
        int[] arg = {1,2,4,6,8,10};
        Solution368 s = new Solution368();

        System.out.println(s.largestDivisibleSubset(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/largest-divisible-subset/ DP 最大整除子集
     * @Author: vicebery
     * @Date: 2020/0721
     **/
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        List<ArrayList<Integer>> EDS = new ArrayList<>(n);
        for (int num : nums) {
            ArrayList<Integer> tmp = new ArrayList(1);
            tmp.add(num);
            EDS.add(tmp);
        }
        for (int i = 1; i < n; i++) {
            ArrayList<Integer> maxLenArr = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && EDS.get(j).size() > maxLenArr.size()) {
                    maxLenArr = EDS.get(j);
                }
            }
            EDS.get(i).clear();
            EDS.get(i).addAll(maxLenArr);
            EDS.get(i).add(nums[i]);
        }
        for (int i = 0; i < n; i++) {
            if (res.size() < EDS.get(i).size()) {
                res = EDS.get(i);
            }
        }
        return res;
    }
}