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
    public static int trailingZeroes(int n) {  // 实质为计算5的个数
        int count = 0;
        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;
    }
}