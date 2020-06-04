package Java;


import java.util.Arrays;
import java.util.HashSet;

public class Solution349 {
    public static void main(String[] args){
        int[] arr1 = {1,2};
        int[] arr2 = {1,1};
        int[] res = new Solution349().intersection(arr1,arr2);
        for(int i:res)
            System.out.print(i+" ");
    }

    /**
     * @Description: https://leetcode-cn.com/problems/intersection-of-two-arrays/ 两数组的交集
     * @Author: vicebery  
     * @Date: 2020/0604
     **/


    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (Integer n : nums1) set1.add(n);
        HashSet<Integer> set2 = new HashSet<>();
        for (Integer n : nums2) set2.add(n);

        set1.retainAll(set2);  // 保留set1中的与set2重合的元素

        int[] output = new int[set1.size()];
        int idx = 0;
        for (int s : set1) output[idx++] = s;
        return output;

    }
}