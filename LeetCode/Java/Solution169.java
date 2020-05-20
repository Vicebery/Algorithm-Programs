package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution169 {
    public static void main(String[] args){
        int[] arg = {1,2,2,3,4,5,3,4,3};
        System.out.println(majorityElement(arg));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/majority-element/ 多数元素, 找出个数多于一半的元素
     * @Author: vicebery
     * @Date: 2020/0520
     **/
    public static int majorityElement(int[] nums) {  // 求众数  摩尔投票法
        int count=0;
        int res = nums[0];
        for(int num: nums){
            if(count==0){
                res = num;
                count++;
            }else if(res == num){
                count++;
            }else{
                count--;
            }
        }
        return res;
    }

    /**
     * @Description: 229 https://leetcode-cn.com/problems/majority-element-ii/ 多数元素, 找出个数多于三分之一的元素
     * @Author: vicebery
     * @Date: 2020/0520
     **/
    public static List<Integer> majorityElement2(int[] nums) { // 求三分之一众数  摩尔投票法
        List<Integer> res = new ArrayList<>(2);
        int cand1 = 0, cand2 = 0;
        int count1 = 0, count2 = 0;
        for (int num : nums) {     // 确保每轮只有一种操作,要么是选候选人，要么是投票
            if (num == cand1) {
                count1++;
                continue;
            }
            if (num == cand2) {
                count2++;
                continue;
            }
            if (count1 == 0) {
                cand1 = num;
                count1++;
                continue;
            }
            if (count2 == 0) {
                cand2 = num;
                count2++;
                continue;
            }
            count1--;
            count2--;
        }
        count1 = count2 = 0;
        for (int num : nums) {
            if (num == cand1) count1++;
            else if (num == cand2) count2++;
        }
        if (count1 > nums.length / 3) res.add(cand1);
        if (count2 > nums.length / 3) res.add(cand2);
        return res;
    }
}