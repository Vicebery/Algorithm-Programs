package Java;

public class Solution231 {
    public static void main(String[] args){
        int arg = 4;
        System.out.println(isPowerOfTwo(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/power-of-two/ 判断一个数是否为2的幂
     * @Author: vicebery
     * @Date: 2020/0526
     **/
    public static boolean isPowerOfTwo(int n) {
        int cur = 1;
        int count = 1;
        while (count != 32) {
            if (cur == n) {
                return true;
            }
            cur <<= 1;
            count++;
        }
        return false;
    }
}