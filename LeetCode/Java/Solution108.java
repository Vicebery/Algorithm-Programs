package Java;

public class Solution108 {
    public static void main(String[] args){
        int[] arg = {1,2,4,5,7,8,9};
        System.out.println(sortedArrayToBST(arg));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    /**
     * @Description: https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/ 数组转换为二叉搜索树
     * @Author: vicebery
     * @Date: 2020/0515
     **/
    public static TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
    }

    public static TreeNode helper(int[] nums, int left, int right){
        if(left>right){
            return null;
        }
        int mid = (left+right)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums,left,mid-1);
        root.right = helper(nums,mid+1,right);
        return root;
    }
}