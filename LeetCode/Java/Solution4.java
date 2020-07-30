package Java;

public class Solution4 {
    public static void main(String[] args){
        int[] arg1 = {};
        int[] arg2 = {2,3};
        Solution4 s = new Solution4();

        System.out.println(s.findMedianSortedArrays(arg1,arg2));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/median-of-two-sorted-arrays/ 寻找两个正序数组的中位数
     * @Author: vicebery
     * @Date: 2020/0730
     **/
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1==null || nums1.length==0 && nums2!=null){
            int nums2Len = nums2.length;
            if(nums2Len%2==0){
                double res = (nums2[nums2Len/2-1] + nums2[nums2Len/2])/2.0;
                return res;
            }else if(nums2Len==1){
                return nums2[0];
            }else{
                return nums2[nums2Len/2];
            }
        }
        if(nums2==null || nums2.length==0 && nums1!=null){
            int nums1Len = nums1.length;
            if(nums1Len%2==0){
                double res = (nums1[nums1Len/2-1]+nums1[nums1Len/2])/2.0;
                return res;
            }else if(nums1Len==1){
                return nums1[0];
            }else{
                return nums1[nums1Len/2];
            }
        }
        int len1 = nums1.length;
        int len2 = nums2.length;
        int sumLen = len1 + len2;
        int midIndex = sumLen%2==0?sumLen/2:sumLen/2+1;
        int mid=0,midNext=0;
        int index = 0;
        int index1 = 0, index2 = 0;
        while (index < midIndex) {
            if(index1>=len1){
                mid = nums2[index2];
                index2++;
                index++;
                continue;
            }
            if(index2>=len2){
                mid = nums1[index1];
                index1++;
                index++;
                continue;
            }
            if (nums1[index1] < nums2[index2]) {
                mid = nums1[index1];
                index1++;
            } else {
                mid = nums2[index2];
                index2++;
            }
            index++;
        }
        if(index1>=len1){
            midNext = nums2[index2];
        }else if(index2>=len2){
            midNext = nums1[index1];
        }else if (nums1[index1] < nums2[index2]) {
            midNext = nums1[index1];
        } else {
            midNext = nums2[index2];
        }
        if (sumLen % 2 == 0) {
            double res = (mid + midNext) / 2.0;
            return res;
        } else {
            return mid;
        }
    }
    // 二分法
//    public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
//
//    }
}