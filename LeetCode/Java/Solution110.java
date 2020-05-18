package Java;

public class Solution110 {
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
     * @Description: https://leetcode-cn.com/problems/balanced-binary-tree/ 判断是否是平衡二叉树
     * @Author: vicebery
     * @Date: 2020/0515
     **/
    public static boolean isBalanced(TreeNode root) {
        return recur(root) !=-1;
    }

    public static int recur(TreeNode root){  // 计算树高度的同时，保存不平衡的信息
        if(root==null) return 0;
        int leftHieht = recur(root.left);
        if(leftHieht==-1) return -1;
        int rightHieht = recur(root.right);
        if(rightHieht==-1) return -1;
        return Math.abs(leftHieht-rightHieht)<2? Math.max(leftHieht,rightHieht)+1:-1;
    }
}