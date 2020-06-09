package Java;

public class Solution367 {
    public static void main(String[] args){

        System.out.println(isPerfectSquare2(2));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/valid-perfect-square/ 完全平方数
     * @Author: vicebery
     * @Date: 2020/0608
     **/
    public static boolean isPerfectSquare(int num) {
        if(num<1){
            return false;
        }
        if(num==1){
            return true;
        }
        long head = 1, tail = num / 2;  // 注意用 int 会溢出
        long guess;
        for (long i = head + (tail - head) / 2; head <= tail; i = head + (tail - head) / 2) {
            guess = i*i;
            if (guess == num) {
                return true;
            } else if (guess > num) {
                tail = i - 1;
            } else if (guess < num) {
                head = i + 1;
            }
        }
        return false;
    }

    public static boolean isPerfectSquare2(int num) {  // 牛顿迭代法
        if(num<1){
            return false;
        }
        if(num==1){
            return true;
        }
        long x = num / 2;
        while (x * x > num) {
            x = (x + num / x) / 2;
        }
        return (x * x == num);
    }
}