package Java;

public class Solution69 {
    public static void main(String[] args){
        int[] arg = {1,2};
        System.out.println(mySqrt(1));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/sqrtx/ x的平方根
     * @Author: vicebery
     * @Date: 2020/0513
     **/
    public static  int mySqrt(int x) {
        if (x <= 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        }
        long head = 0;
        long tail = x;
        // 二分法求平方根
        while(true){
            long cur = (head+ tail)/2;
            if(cur*cur > x){
                tail = cur;
            }else if((cur+1)*(cur+1)<=x){
                head = cur;
            }else if(cur*cur<=x && (cur+1)*(cur+1)>x){
                return (int)cur;
            }
        }
    }
}