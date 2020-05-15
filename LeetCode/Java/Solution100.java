package Java;

public class Solution100 {
    public static void main(String[] args){
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        TreeNode b1 = new TreeNode(1);
        TreeNode b2 = new TreeNode(2);
        TreeNode b3 = new TreeNode(3);
        TreeNode b4 = new TreeNode(1);
        a1.left = a2;
        a1.right = a3;
        b1.left = b2;
        b1.right = b3;
//        b2.left =b4;
        System.out.println(isSameTree(a1,b1));
    }

    /**
     * @Description: https://leetcode-cn.com/problems/same-tree/ 判断两二叉树是否相同 递归
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
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p!=null && q!=null ){
            return p.val == q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }else if(p==null && q==null){
            return true;
        }else return false;
    }
}