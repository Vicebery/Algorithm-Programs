package Java;

public class Solution67 {
    public static void main(String[] args){
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a,b));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/add-binary/ 二进制求和
     * @Author: vicebery
     * @Date: 2020/0512
     **/
    public static String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        int remain = 0,curA,curB,sum;
        char cur;
        while (i >= 0 || j >= 0) {
            if(i>=0){
                curA = a.charAt(i) == '1' ? 1 : 0;
                i--;
            }else{
                curA = 0;
            }
            if(j>=0){
                curB = b.charAt(j) == '1' ? 1 : 0;
                j--;
            }else{
                curB = 0;
            }
            sum = curA + curB + remain;
            if (sum >= 2) {
                remain = 1;
                cur = sum % 2 == 0 ? '0' : '1';
                res = res.append(cur);
            } else {
                remain = 0;
                cur = sum == 0 ? '0' : '1';
                res = res.append(cur);
            }
        }
        if(remain==1){
            res = res.append('1');
        }
        //字符串逆转
        return res.reverse().toString();
    }
}