package Java;

public class Solution268 {
    public static void main(String[] args){
        int[] a = {1,2,3,0};
        System.out.println(missingNumber(a));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/missing-number/ 缺失的常数
     * @Author: vicebery  
     * @Date: 2020/0602
     **/


    public static int missingNumber(int[] nums) {
        int expectedSum = nums.length*(nums.length + 1)/2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;

    }


    /**
     * @Description: 异或运算 由于异或运算（XOR）满足结合律，
     *               并且对一个数进行两次完全相同的异或运算会得到原来的数，
     *               因此我们可以通过异或运算找到缺失的数字
     * @param: [nums]
     * @Return: int
     * @Author: vicebery
     * @Date: 2020/6/2
     **/
    public int missingNumber2(int[] nums) {

        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }

}