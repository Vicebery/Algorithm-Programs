package Java;

public class Solution101 {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        TreeNode b1 = new TreeNode(1);
        TreeNode b2 = new TreeNode(2);
        TreeNode b3 = new TreeNode(3);
        TreeNode b4 = new TreeNode(1);
        root.left = a1;
        root.right = b1;
        a1.left = a2;
        a1.right = a3;
        b1.left = b3;
        b1.right = b2;
        b2.left =b4;
        System.out.println(isSymmetric(root));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/symmetric-tree/ 判断二叉树是否左右对称 递归
     * @Author: vicebery
     * @Date: 2020/0515
     **/
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public static boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }
    public static boolean isMirror(TreeNode left, TreeNode right){
        if(left==null && right==null) return true;
        if(left ==null || right == null) return false;
        return left.val == right.val && isMirror(left.left,right.right) && isMirror(left.right,right.left);
    }
}