package Java;

public class Solution357 {
    public static void main(String[] args){
        int[] arg = {1,2};
        Solution357 s = new Solution357();

        System.out.println(s.countNumbersWithUniqueDigits(2));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/count-numbers-with-unique-digits/
     * @Author: vicebery
     * @Date: 2020/0720
     **/
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0){
            return 1;
        }
        int first = 10;
        int sum = 9*9;
        n = Math.min(10,n);
        for(int i =2;i<=n;i++){
            first += sum;
            sum *= (10-i);
        }
        return first;
    }
}