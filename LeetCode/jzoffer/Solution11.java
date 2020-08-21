package jzoffer;

public class Solution11 {
    public static void main(String[] args){
        int[] arg = {4,6,7,7,1,2,2,3};
        Solution11 s = new Solution11();

        System.out.println(s.minArray(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/ 旋转数组的最小数字
     * 二分法
     * @Author: vicebery
     * @Date: 2020/
     **/
    public int minArray(int[] numbers) {
        int i = 0, j = numbers.length - 1;
        int mid;
        while (i < j) {
            mid = (i + j) / 2;
            if (numbers[mid] < numbers[j]) {
                j = mid;
            } else if (numbers[mid] > numbers[j]) {
                i = mid + 1;
            } else if (numbers[mid] == numbers[j]) {
                j--;
            }
        }
        return numbers[i];
    }
}