package Java;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Solution350 {
    public static void main(String[] args){
        int[] arr1 = {1,2};
        int[] arr2 = {1,1};
        int[] res = new Solution350().intersect(arr1,arr2);
        for(int i:res)
            System.out.print(i+" ");
    }

    /**
     * @Description: https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/ 两数组的交集
     * @Author: vicebery  
     * @Date: 2020/0604
     **/


    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int n : nums1) {
            m.put(n, m.getOrDefault(n, 0) + 1);  // map 中有 n 对应的 value,则返回该 value，没有则用返回 0
        }
        int k = 0;
        for (int n : nums2) {
            int cnt = m.getOrDefault(n, 0);
            if (cnt > 0) {
                nums1[k++] = n;
                m.put(n, cnt - 1);
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }
}