package Java;

import java.util.Arrays;

public class Solution204 {
    public static void main(String[] args){
        int[] arg = {1,2};
        System.out.println(countPrimes(499979));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/count-primes/ 计算质数
     * @Author: vicebery
     * @Date: 2020/0521
     **/
    public static int countPrimes(int n) {
        int res = 0;
        boolean[] isPrimes = new boolean[n];
        Arrays.fill(isPrimes, true);
        for (int i = 2; i * i < n; i++) {
            if (isPrimes[i]) {
                for (int j = i * i; j < n; j = j + i) {
                    isPrimes[j] = false;
                }
            }
        }
        for(int i =2;i<n;i++)
            if(isPrimes[i])
                res++;
        return res;
    }
    // 超时
    public static int countPrimes2(int n) {
        int res = 0;
        if(n<=2) return res;
        for(int i = 1;i<n;i+=2){
            if(isPrimes(i)){
                res++;
            }
        }
        return res;
    }
    public static boolean isPrimes(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}