package Java;

public class Solution376 {
    public static void main(String[] args){
        int[] arg = {1,7,4,9,2,5};
        Solution376 s = new Solution376();

        System.out.println(s.wiggleMaxLength(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/wiggle-subsequence/
     * @Author: vicebery
     * @Date: 2020/0624
     **/

    // 寻找 峰 和 谷，趋势变化的临界点
    public int wiggleMaxLength(int[] nums) {
        if(nums==null){
            return 0;
        }
        if(nums.length<2){
            return nums.length;
        }
        int maxLen = 1;
        int index = 1;
        while(index<nums.length){
            if(nums[index] == nums[index-1]){
                index++;
            }else if(nums[index] > nums[index-1]){
                index++;
                while (index < nums.length && nums[index] >= nums[index-1]) {
                    index++;
                }
                maxLen++;
            }else if(nums[index] < nums[index-1]){
                index++;
                while(index<nums.length && nums[index] <= nums[index-1]){
                    index++;
                }
                maxLen++;
            }
        }
        return maxLen;
    }
}