package jzoffer;

public class Solution55 {
    public static void main(String[] args){
        int[] arg = {1,2};
        Solution55 s = new Solution55();

        System.out.println();
    }

    /**
     * @Description: https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/
     * @Author: vicebery
     * @Date: 2020/0821
     **/
    class TreeNode{
        int val;
        TreeNode left,right;
        TreeNode(){

        }
    }
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }
}