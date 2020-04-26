package Java;

public class Solution7 {
    public static void main(String[] args){
        int[] arg = {1,2};
        System.out.println(reverse(1534236349));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/reverse-integer/
     * @Author: vicebery
     * @Date: 2020/4/24
     **/
    public static int reverse(int x)  {
        int res;
        if(x>=0){
            String tmp = Integer.toString(x);
            String reverseTmp = new StringBuffer(tmp).reverse().toString();
            try{
                res = Integer.parseInt(reverseTmp);
            }catch (NumberFormatException e){
                res =0;
            }
        }else{
            x = -x;
            String tmp = Integer.toString(x);
            String reverseTmp = new StringBuffer(tmp).reverse().toString();
            try{
                res = Integer.parseInt(reverseTmp);
            }catch (NumberFormatException e){
                res = 0;
            }
            res = -res;
        }
        return res;
    }
}