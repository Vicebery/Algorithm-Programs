package Java;

public class Solution104 {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(1);
        TreeNode a3 = new TreeNode(23);
        TreeNode b1 = new TreeNode(1);
        TreeNode b2 = new TreeNode(42);
        TreeNode b3 = new TreeNode(53);
        TreeNode b4 = new TreeNode(21);
        root.left = a1;
        root.right = b1;
        a1.left = a2;
        a1.right = a3;
        b1.left = b3;
        b1.right = b2;
//        b2.left =b4;
        System.out.println(maxDepth(root));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/ 二叉树的最大深度
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
    public static int maxDepth(TreeNode root) {
        if(root==null) return 0;
        else return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}