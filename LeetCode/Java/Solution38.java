package Java;

public class Solution38 {
    public static void main(String[] args){
        int[] arg = {1,2};
        System.out.println(countAndSay(4));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/count-and-say/ 读数字个数，递归调用
     * @Author: vicebery
     * @Date: 2020/
     **/
    public static String countAndSay(int n){
        if(n==1){
            return "1";
        }
        return sayStr(countAndSay(n-1));
    }
    public static String sayStr(String str){
        StringBuilder res = new StringBuilder();
        int count = 1;
        char num = str.charAt(0);
        for(int i=1;i<str.length();i++){
            char currentNum = str.charAt(i);
            if(currentNum == num){
                count++;
            }else{
                res.append(count);
                res.append(num);
                num = currentNum;
                count = 1;
            }
        }
        res.append(count);
        res.append(num);
        return res.toString();
    }
}