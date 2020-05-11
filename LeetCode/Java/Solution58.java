package Java;

public class Solution58 {
    public static void main(String[] args){
        String arg = "hellowordl";

        System.out.println(lengthOfLastWord(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/length-of-last-word/
     * @Author: vicebery
     * @Date: 2020/0511
     **/
    public static int lengthOfLastWord(String s) {
        int res = 0;
        if(s.isEmpty()){
            return res;
        }
        int i = s.length();
        while (--i >= 0) {
            if (s.charAt(i) == ' ' && res == 0) {
                continue;
            }
            if (s.charAt(i) != ' ') {
                res++;
            } else {
                break;
            }
        }
        return res;
    }
}