package Java;


public class Solution283 {
    public static void main(String[] args){
        int[] a = {0,1,2,0,3,0};
        moveZeroes(a);
        for(int num:a)
        System.out.println(num);
    }

    /**
     * @Description: https://leetcode-cn.com/problems/move-zeroes/  移动0到数组末尾
     * @Author: vicebery  
     * @Date: 2020/0602
     **/


    public static void moveZeroes(int[] nums) {
        int countZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                countZero++;
            } else {
                nums[i - countZero] = nums[i];
            }
        }
        for (int i = 1; i <= countZero; i++) {
            nums[nums.length - i] = 0;
        }
    }
}