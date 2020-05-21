package Java;

public class Solution190 {
    public static void main(String[] args){
        int[] arg = {1,2};
        System.out.println();
    }

    /**
     * @Description: https://leetcode-cn.com/problems/reverse-bits/ 颠倒二进制位 位运算
     * @Author: vicebery
     * @Date: 2020/0521
     **/
    public static int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res = (res << 1) + (n & 1); // 取n的最低位的二进制位，放在res当前新出现的低位上，res之前的位都左移
            n >>= 1;  // 右移取下一位
        }
        return res;
    }
}