package Java;

import java.util.Arrays;

public class Solution16 {
    public static void main(String[] args) {
        int[] arg = {1, 2};
        Solution16 s = new Solution16();

        System.out.println();
    }

    /**
     * @Description: https://leetcode-cn.com/problems/3sum-closest/ 最接近的三数之和
     * @Author: vicebery
     * @Date: 2020/0624
     **/
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        if(nums.length<3) {
            return -1;
        }
        int res = nums[0] + nums[1] + nums[2];
        if(target <= res){
            return res;
        }
        for (int i = 0; i < nums.length; i++) {
            int head = i + 1;
            int tail = nums.length - 1;

            while (head < tail) {
                int curSum = nums[i] + nums[head] + nums[tail];
                if(curSum==target){
                    return curSum;
                }
                if(Math.abs(curSum-target)< Math.abs(res-target)){
                    res = curSum;
                }
                if(curSum<target){
                    head++;
                }
                if(curSum>target){
                    tail--;
                }
            }
        }
        return res;
    }
}