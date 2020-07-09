package Java;

import java.util.HashMap;

public class Solution166 {
    public static void main(String[] args){
        int[] arg = {1,2};
        Solution166 s = new Solution166();

        System.out.println(s.fractionToDecimal(-50,8));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/fraction-to-recurring-decimal/ 分数到小数 找循环小数的 循环体
     * @Author: vicebery
     * @Date: 2020/0709
     **/
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator==0){
            return "0";
        }
        StringBuilder res = new StringBuilder();
        if (numerator < 0 ^ denominator < 0) {
            res.append("-");
        }
        long dividend = Math.abs(Long.valueOf(numerator));
        long divisor = Math.abs(Long.valueOf(denominator));
        res.append(dividend / divisor);
        long remainder = dividend % divisor;

        if(remainder==0){
            return res.toString();
        }
        res.append(".");
        HashMap<Long,Integer> modMap = new HashMap<>();
        while(remainder !=0){
            if(modMap.containsKey(remainder)){
                res.insert(modMap.get(remainder),"(");
                res.append(')');
                return res.toString();
            }else{
                modMap.put(remainder,res.length());
            }
            remainder = remainder*10;
            long div = remainder/divisor;
            res.append(div);
            remainder = remainder % divisor;
        }
        return res.toString();
    }
}