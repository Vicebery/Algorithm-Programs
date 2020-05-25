package Java;

import java.util.HashSet;
import java.util.Set;

public class Solution217 {
    public static void main(String[] args){
        int[] arg = {1,2};
        System.out.println();
    }

    /**
     * @Description: https://leetcode-cn.com/problems/contains-duplicate/
     * @Author: vicebery
     * @Date: 2020/0525
     **/
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> alreadyExit = new HashSet<>(nums.length);
        for(int num:nums){
            if(alreadyExit.contains(num)){
                return true;
            }else{
                alreadyExit.add(num);
            }
        }
        return false;
    }
}