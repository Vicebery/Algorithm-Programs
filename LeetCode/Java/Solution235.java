package Java;

public class Solution235 {
    public static void main(String[] args){
        int[] arg = {1,2};
        System.out.println();
    }

    /**
     * @Description: https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/ 二叉搜索树的最近祖先节点
     * @Author: vicebery
     * @Date: 2020/0529
     **/

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || p==null || q==null) {
            return null;
        }
        int rootVal = root.val;
        int pVal = p.val;
        int qVal = q.val;
        if(pVal > rootVal && qVal > rootVal){
            return lowestCommonAncestor(root.right,p,q);
        }else if(pVal < rootVal && qVal < rootVal){
            return lowestCommonAncestor(root.left,p,q);
        }else{
            return root;
        }
    }
}