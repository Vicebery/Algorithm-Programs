package Java;

import java.util.Arrays;

public class Solution948 {
    public static void main(String[] args){
        int[] arg = {};
        Solution948 s = new Solution948();

        System.out.println(s.bagOfTokensScore(arg,50));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/bag-of-tokens/ 令牌放置
     * @Author: vicebery
     * @Date: 2020/0709
     **/
    public int bagOfTokensScore(int[] tokens, int P) {
        Arrays.sort(tokens);
        int n = tokens.length;
        int grade = 0;
        int tail = n-1;
        if(n==0 || P<tokens[0]){
            return 0;
        }
        for(int i =0;i<=tail;){
            if(tokens[i]<=P){
                P = P - tokens[i];
                i++;
                grade++;
            }else{
                if(i==tail){
                    break;
                }
                if(grade>0){
                    P = P + tokens[tail];
                    tail--;
                    grade--;
                }
            }
        }
        return grade;
    }
}