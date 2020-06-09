package Java;

public class Solution371 {
    public static void main(String[] args){

        System.out.println(getSum(0,7));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/sum-of-two-integers/ 两数相加 位运算
     * @Author: vicebery
     * @Date: 2020/0608
     **/
    public static int getSum(int a, int b) {
        while (b != 0) {
            int tmp = a ^ b;
            b = (a & b) << 1;
            a = tmp;
        }
        return a;
    }
}