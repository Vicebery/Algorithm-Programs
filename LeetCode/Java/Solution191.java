package Java;

public class Solution191 {
    public static void main(String[] args){
        int[] arg = {1,2};
        System.out.println();
    }

    /**
     * @Description: https://leetcode-cn.com/problems/number-of-1-bits/ 位1的个数  与运算
     * @Author: vicebery
     * @Date: 2020/0522
     **/
    public static int hammingWeight(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            if((n & 1)==1){
                res++;
            }
            n >>= 1;  // 右移取下一位
        }
        return res;
    }

    public static int hammingWeight2(int n) {
        // 在二进制表示中，数字 n 中最低位的 1 总是对应 n−1 中的 0 。
        // 因此，将 (n & n−1) 总是能把 n 中最低位的 1 变成 0 ，并保持其他位不变。
        int sum = 0;
        while (n != 0) {
            sum++;
            n &= (n - 1);
        }
        return sum;
    }

}