package Java;

public class Solution35 {
    public static void main(String[] args){
        int[] arg = {1,2,5,6};
        System.out.println(searchInsert(arg,3));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/search-insert-position/
     * @Author: vicebery
     * @Date: 2020/0507
     **/
    public static int searchInsert(int[] nums, int target) {
        int i = 0;
        for(;i<nums.length;i++){
            if(nums[i]>=target){
                break;
            }
        }
        return i;
    }
}