package Java;

import java.util.Arrays;

public class Solution66 {
    public static void main(String[] args){
        int[] arg = {9,9};
        int[] res = plusOne(arg);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }

    /**
     * @Description: https://leetcode-cn.com/problems/plus-one/
     * @Author: vicebery
     * @Date: 2020/0512
     **/
    public static int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        while(true){
            digits[index] = digits[index] + 1;
            if(digits[index] >= 10){
                digits[index] = digits[index] % 10;
                index--;
                if(index == -1){
                    break;
                }
            }else{
                break;
            }
        }
        if(index==-1){
            int[] res= new int[digits.length+1];
            res[0] = 1;
            // 数组复制  System.arraycopy(src, srcPos, dest, destPos, length)
            //src: 源数组
            //srcPos: 从源数组复制数据的起始位置
            //dest: 目标数组
            //destPos: 复制到目标数组的起始位置
            //length: 复制的长度

            System.arraycopy(digits, 0, res, 1, digits.length);
            return res;
        }else{
            return digits;
        }

    }
}