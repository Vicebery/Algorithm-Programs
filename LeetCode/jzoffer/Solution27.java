package jzoffer;

import java.util.Deque;
import java.util.LinkedList;

public class Solution27 {
    public static void main(String[] args){
        int[] arg = {1,2};
        Solution27 s = new Solution27();

        System.out.println();
    }

    /**
     * @Description: https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/
     * @Author: vicebery
     * @Date: 2020/0821
     **/
    class TreeNode{
        int val;
        TreeNode left,right;
        TreeNode(){

        }
    }
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null) return null;
        Deque<TreeNode> stack = new LinkedList<>();
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode cur = stack.poll();
            if(cur.left!=null){
                stack.add(cur.left);
            }
            if(cur.right!=null){
                stack.add(cur.right);
            }
            TreeNode tmp = cur.left;
            cur.left = cur.right;
            cur.right = tmp;
        }
        return root;
    }

    public TreeNode mirrorTree2(TreeNode root) {
        if(root==null) return null;
        TreeNode tmp = root.left;
        root.left = mirrorTree2(root.right);
        root.right = mirrorTree2(tmp);
        return root;
    }
}