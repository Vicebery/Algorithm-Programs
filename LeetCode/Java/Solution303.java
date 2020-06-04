package Java;


public class Solution303 {
    public static void main(String[] args){
        int[] a = {0,1,2,0,3,0};

        System.out.println(new Solution303().sumRange(0,5));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/range-sum-query-immutable/  区域和检索 - 数组不可变
     * @Author: vicebery  
     * @Date: 2020/0604
     **/
    int[] nums = {-2, 0, 3, -5, 2, -1};

    public int sumRange(int i, int j) {
        int[] numSum = new int[nums.length];
        numSum[0] = nums[0];
        for (int k = 1; k < nums.length; k++) {
            numSum[k] = numSum[k - 1] + nums[k];
        }
        return i == 0 ? numSum[j] : numSum[j] - numSum[i - 1];
    }
}