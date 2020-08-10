package jzoffer;

import java.util.LinkedList;
import java.util.List;

public class Solution34 {
    public static void main(String[] args) {
        int[] arg = {1, 2};
        Solution34 s = new Solution34();

        System.out.println();
    }

    /**
     * @Description: https://leetcode-cn.com/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof/  二叉树中和为某一值的路径
     * @Author: vicebery
     * @Date: 2020/0808
     **/
    // 递归 回溯
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int value) {
            val = value;
        }
    }

    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        recur(root, sum);
        return res;
    }

    void recur(TreeNode root, int tar) {
        if (root == null) {
            return;
        }
        path.add(root.val);
        tar -= root.val;
        if (tar == 0 && root.left == null && root.right == null) {
            res.add(new LinkedList(path));
        }
        recur(root.left, tar);
        recur(root.right, tar);
        path.removeLast();
    }
}