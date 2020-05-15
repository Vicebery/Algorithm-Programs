package Java;

public class Solution88 {
    public static void main(String[] args){
        int[] nums1 = {1,2,5,0,0};
        int[] nums2 = {-12,-4};
        merge(nums1,3,nums2,2);
        for(int i=0;i<nums1.length;i++)
        System.out.print(nums1[i]+"-->");
    }

    /**
     * @Description: https://leetcode-cn.com/problems/merge-sorted-array/ 合并两个有序数组
     * @Author: vicebery
     * @Date: 2020/0515
     **/
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index0 = m + n - 1;
        int index1 = m - 1;
        int index2 = n - 1;
        while (index2 >= 0) {
            if (index1 >= 0 && nums1[index1] >= nums2[index2]) {
                nums1[index0--] = nums1[index1--];
            } else {
                nums1[index0--] = nums2[index2--];
            }
        }
    }
}