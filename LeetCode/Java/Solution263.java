package Java;

public class Solution263 {
    public static void main(String[] args){
        int a = 8;
        System.out.println(isUgly(a));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/ugly-number/ 丑数
     * @Author: vicebery
     * @Date: 2020/0601
     **/


    public static boolean isUgly(int num) {
        if(num==0){
            return false;
        }
        if(num==1){
            return true;
        }
        while (num % 2 == 0) {
            num = num / 2;
        }
        while (num % 3 == 0) {
            num = num / 3;
        }
        while (num % 5 == 0) {
            num = num / 5;
        }
        if (num == 1) {
            return true;
        } else {
            return false;
        }
    }
}