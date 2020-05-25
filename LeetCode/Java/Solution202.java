package Java;

import java.util.HashSet;

public class Solution202 {
    public static void main(String[] args){
        int arg = 19;
        System.out.println(isHappy(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/happy-number/ 快乐数
     * @Author: vicebery
     * @Date: 2020/0522
     **/
    public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            n = calculate(n);
        }
        return 1==n;
    }

    public static int calculate(int n){
        int res =0;
        while(n!=0){
            res += (n%10)*(n%10);
            n /=10;
        }
        return res;
    }
    //双指针 快慢指针
    public static boolean isHappy2(int n) {
        int slow = n;
        int fast = calculate(n);
        while (fast != 1 && slow != fast) {
            slow = calculate(n);
            fast = calculate(calculate(n));
        }
        return 1 == n;
    }
}