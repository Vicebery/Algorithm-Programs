package Java;

public class Solution1 {
    public static void main(String[] args){
        int[] arg = {1,2,4,6,9};
        int[] res = twoSum(arg,10);
        System.out.println(res[0]);
    }

    /**
     * @Description: https://leetcode-cn.com/problems/two-sum/
     * @Author: vicebery
     * @Date:  2020/4/24
     **/
    public static int[] twoSum(int[] nums, int target) {
        int[] res= new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }
}