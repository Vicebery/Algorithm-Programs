package Java;

public class Solution111 {
    public static void main(String[] args){
        int[] arg = {1,2};
        System.out.println();
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
     * @Description: https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/ 二叉树的最小深度
     * @Author: vicebery
     * @Date: 2020/0515
     **/
    public static int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        int leftMinDepth = minDepth(root.left);
        int rightMinDepth = minDepth(root.right);
        if (root.left == null || root.right == null) {
            return leftMinDepth + rightMinDepth + 1;
        }
        return Math.min(leftMinDepth, rightMinDepth) + 1;
    }
}