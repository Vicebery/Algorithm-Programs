package Java;

public class Solution278 {
    public static void main(String[] args){
        int[] a = {1,2,3,0};
        System.out.println(firstBadVersion(5));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/first-bad-version/   第一个错误版本
     * @Author: vicebery  
     * @Date: 2020/0602
     **/

    // 二分法查找
    public static int firstBadVersion(int n){
        int head=1, tail = n;
        int mid;
        while(head<tail){
            mid = head + (tail - head) / 2;  // 直接head + tail 可能溢出
            if(!isBadVersion(mid)){
                head = mid+1;
            }else{
                tail = mid;
            }
        }
        return head;
    }

    public static boolean isBadVersion(int n){
        if(n>=4) return true;
        return false;
    }
}