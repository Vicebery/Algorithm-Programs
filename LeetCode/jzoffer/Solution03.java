package jzoffer;

import java.util.BitSet;
import java.util.HashSet;

public class Solution03 {
    public static void main(String[] args){
        int[] arg = {1,2};
        Solution03 s = new Solution03();

        System.out.println();
    }

    /**
     * @Description: https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/ 数组中重复的数字
     * @Author: vicebery
     * @Date: 2020/0805
     **/
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            if(set.contains(i)){
                return i;
            }else{
                set.add(i);
            }
        }
        return -1;
    }
    // bitSet 位图存储出现过的数字
    public int findRepeatNumber2(int[] nums) {
        BitSet bitSet = new BitSet();
        for(int i :nums){
            if(bitSet.get(i)){
                return i;
            }else{
                bitSet.set(i);
            }
        }
        return -1;
    }
}