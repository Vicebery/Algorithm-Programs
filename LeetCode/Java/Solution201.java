package Java;

public class Solution201 {
    public static void main(String[] args){
        int[] arg = {1,2};
        System.out.println(rangeBitwiseAnd(0,1));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/bitwise-and-of-numbers-range/ 数字范围按位与
     * @Author: vicebery
     * @Date: 2020/0611
     **/
    public static int rangeBitwiseAnd(int m, int n) {
        int count = 0;
        while(m<n){
            m >>= 1;
            n >>= 1;
            count++;
        }
        return m<<count;
    }

    public static int rangeBitwiseAnd2(int m, int n) {
        while (m < n) {
            // turn off rightmost 1-bit
            n = n & (n - 1);  // 将n的二进制的最右边的1 变为 0
        }
        return m & n;
    }

}