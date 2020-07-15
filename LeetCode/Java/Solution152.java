package Java;

public class Solution152 {
    public static void main(String[] args){
        int[] arg = {2,-1,1,1};
        Solution152 s = new Solution152();

        System.out.println(s.maxProduct2(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/maximum-product-subarray/ 乘积最大连续子数组
     * @Author: vicebery
     * @Date: 2020/0715
     **/
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        long[] dpMax = new long[n];
        long[] dpMin = new long[n];
        dpMax[0] = nums[0];
        dpMin[0] = nums[0];
        for(int i=1;i<n;i++){
            dpMax[i] = Math.max(Math.max(dpMin[i-1]*nums[i],dpMax[i-1]*nums[i]),nums[i]);
            dpMin[i] = Math.min(Math.min(dpMin[i-1]*nums[i],dpMax[i-1]*nums[i]),nums[i]);
        }
        long max = dpMax[0];
        for(int i=1;i<n;i++){
            if(dpMax[i]>max){
                max = dpMax[i];
            }
        }
        return (int)max;
    }

    public int maxProduct2(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        long dpMax = nums[0];
        long dpMin = nums[0];
        long preDpMax = nums[0];
        long preDpMin = nums[0];
        long max = nums[0];
        for(int i=1;i<n;i++){
            dpMax = Math.max(Math.max(preDpMin*nums[i],preDpMax*nums[i]),nums[i]);
            dpMin = Math.min(Math.min(preDpMin*nums[i],preDpMax*nums[i]),nums[i]);
            preDpMax = dpMax;
            preDpMin = dpMin;
            max = Math.max(max,dpMax);
        }
        return (int)max;
    }
}