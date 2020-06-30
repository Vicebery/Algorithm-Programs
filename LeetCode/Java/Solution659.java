package Java;

public class Solution659 {
    public static void main(String[] args){
        int[] arg = {1,2,3,3,4,4,5,5};
        Solution659 s = new Solution659();

        System.out.println(s.isPossible(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/split-array-into-consecutive-subsequences/
     * @Author: vicebery
     * @Date: 2020/0628
     **/
    public boolean isPossible(int[] nums) {
        for(int i=1;i<nums.length;i++){
            int start = i-1;
            while(i<nums.length){
                if(nums[i-1]==nums[i]-1 || nums[i-1]==nums[i]){
                    i++;
                }else{
                    break;
                }
            }
            if(i-start<3){
                return false;
            }
        }
        return true;
    }
}