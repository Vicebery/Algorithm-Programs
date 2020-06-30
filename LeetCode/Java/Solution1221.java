package Java;

public class Solution1221 {
    public static void main(String[] args){
        String arg = "LLLLRRRR";
        Solution1221 s = new Solution1221();

        System.out.println(s.balancedStringSplit(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/split-a-string-in-balanced-strings/
     * @Author: vicebery
     * @Date: 2020/0630
     **/
    public int balancedStringSplit(String s) {
        if(s==null || s.length()<=1){
            return 0;
        }
        int res = 0;
        int countR = 0, countL = 0;
        for(int i=0;i<s.length();i++){
            char cur = s.charAt(i);
            if(cur =='R'){
                countR++;
            }else if(cur == 'L'){
                countL++;
            }
            if(countL==countR){
               res++;
               countL = 0;
               countR = 0;
            }
        }
        return res;
    }
}