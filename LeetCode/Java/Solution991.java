package Java;

public class Solution991 {
    public static void main(String[] args){
        int[] arg = {1,2};
        Solution991 s = new Solution991();

        System.out.println(s.brokenCalc(3,10));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/broken-calculator/ 坏了的计算器
     * @Author: vicebery
     * @Date: 2020/0712
     **/
    public int brokenCalc(int X, int Y) {
        int count = 0;
        while (Y > X) {
            count++;
            if (Y % 2 == 0) {
                Y = Y / 2;
            } else {
                Y++;
            }
        }
        return count + X - Y;
    }
}