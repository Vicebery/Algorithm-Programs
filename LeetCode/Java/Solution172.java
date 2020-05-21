package Java;

public class Solution172 {
    public static void main(String[] args){
        int[] arg = {1,2};
        System.out.println(trailingZeroes(1808548329));
    }

    /**
     * @Description:  https://leetcode-cn.com/problems/factorial-trailing-zeroes/  阶乘后的零
     * @Author: vicebery
     * @Date: 2020/
     **/
    public static int trailingZeroes(int n) {
        int fiveCount = 0;
        for (int i = 5; i <= n; i += 5) {
            int cur = i;
            while (cur % 5 == 0) {
                fiveCount++;
                cur /= 5;
            }
        }
        return fiveCount;
    }
}