package Java;

public class Solution112 {
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
     * @Description: https://leetcode-cn.com/problems/path-sum/ 路径总和
     * @Author: vicebery
     * @Date: 2020/0515
     **/
    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        sum -= root.val;
        if (root.left == null && root.right == null) {
            return sum == 0;
        }
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }
}