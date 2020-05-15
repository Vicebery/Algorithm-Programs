package Java;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution107 {
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
     * @Description: https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/ 二叉树的层次遍历
     * @Author: vicebery
     * @Date: 2020/0515
     **/
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if(root==null) return res;
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        return res;
    }
}