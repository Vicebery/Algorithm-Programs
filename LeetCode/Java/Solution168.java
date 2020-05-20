package Java;

public class Solution168 {
    public static void main(String[] args){
        int[] arg = {1,2};
        System.out.println(titleToNumber("AB"));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/excel-sheet-column-title/  数字转换26字母
     * @Author: vicebery
     * @Date: 2020/0520
     **/
    public static String convertToTitle(int n) {
        char[] helper = {'Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y'};
        StringBuilder sb = new StringBuilder();
        while(n!=0){
            int mod = n % 26;
            int div = n / 26;
            sb.append(helper[mod]);
            if (mod == 0)  // 进位与传统的 进制转换有所不同
                div--;
            n = div;
        }
        return sb.reverse().toString();
    }

    /**
     * @Description:  https://leetcode-cn.com/problems/excel-sheet-column-number/  字母转数字
     * @Author: vicebery
     * @Date: 2020/0520
     **/
    public static int titleToNumber(String s) {
        int i = 0;
        int res = 0;
        while(i < s.length()){
            res = res * 26 + s.charAt(i) - 'A' + 1;
            i++;
        }
        return res;
    }
}