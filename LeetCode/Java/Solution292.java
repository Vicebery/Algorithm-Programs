package Java;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution292 {
    public static void main(String[] args){
        int n = 4;
        System.out.println(canWinNim(n));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/nim-game/
     * @Author: vicebery  
     * @Date: 2020/0603
     **/


    public static boolean canWinNim(int n) {
//        return (n % 4 !=0);
        return (n & 3) != 0;  // 模运算和位运算转换
    }
}