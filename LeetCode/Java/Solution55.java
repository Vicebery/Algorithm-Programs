package Java;

public class Solution55 {
    public static void main(String[] args){
        int[] arg = {2,3,1,1,4};
        Solution55 s = new Solution55();

        System.out.println(s.canJump(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/jump-game/
     * @Author: vicebery
     * @Date: 2020/0623
     **/
    public boolean canJump(int[] nums) {
        int rightMost = 0;
        int numsLength = nums.length;
        for (int i = 0; i < numsLength; i++) {
            if (i <= rightMost) {
                rightMost = Math.max(rightMost, i + nums[i]);
                if (rightMost >= numsLength - 1) {
                    return true;
                }
            }
        }
        return false;
    }

}