package Java;

import java.util.Arrays;

public class Solution27 {
    public static void main(String[] args){
        int[] arg = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(arg,2));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/remove-element/
     * @Author: vicebery
     * @Date: 2020/0506
     **/
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == val){
                count++;
            }else{
                nums[i-count] = nums[i];
            }
        }
        nums = Arrays.copyOf(nums,nums.length - count);
        return nums.length -count;
    }
}