package Java;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution258 {
    public static void main(String[] args){
        int a = 2339;
        System.out.println(addDigits(a));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/add-digits/ 各位相加
     * @Author: vicebery
     * @Date: 2020/0529
     **/


    public static int addDigits(int num) {
        while(true){
            int sum =0;
            while(num!=0){
                sum += num%10;
                num /=10;
            }
            if(sum<10){
                return sum;
            }else{
                num = sum;
            }
        }
    }
}