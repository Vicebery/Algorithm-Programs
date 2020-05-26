package Java;

public class Solution226 {
    public static void main(String[] args){
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        TreeNode a4 = new TreeNode(4);
        TreeNode a5 = new TreeNode(5);
        TreeNode a6 = new TreeNode(6);
        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right =a5;
        a3.left = a6;
        TreeNode res = invertTree(a1);
        preOrderTraverse1(res);
//        while(res!=null)
//        System.out.println(invertTree(a1));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/invert-binary-tree/ 翻转二叉树
     * @Author: vicebery
     * @Date: 2020/0526
     **/

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public static TreeNode invertTree(TreeNode root) {
       if(root==null){
           return null;
       }
       TreeNode left = invertTree(root.left);
       TreeNode right = invertTree(root.right);
       root.left = right;
       root.right = left;
       return root;
    }

    public static void preOrderTraverse1(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + "  ");
            preOrderTraverse1(root.left);
            preOrderTraverse1(root.right);
        }
    }
}