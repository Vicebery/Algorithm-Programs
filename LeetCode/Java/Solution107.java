package Java;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution107 {
    public static void main(String[] args){
        TreeNode root = new TreeNode(31);
        TreeNode a1 = new TreeNode(61);
        TreeNode a2 = new TreeNode(1);
        TreeNode a3 = new TreeNode(53);
        TreeNode a4 = new TreeNode(18);
        TreeNode a5 = new TreeNode(2);
        TreeNode a6 = new TreeNode(5);
        TreeNode b4 = new TreeNode(21);
        root.left = a1;
        root.right = a4;
        a1.left = a2;
        a1.right = a3;
        a4.left = a5;
        a4.right = a6;
        a5.left =b4;
        System.out.println(levelOrderBottom(root));
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
        nodeQueue.offer(root);
        int size;
        while(!nodeQueue.isEmpty()){
            size = nodeQueue.size();
            List<Integer> curlevel = new LinkedList<>();
            for(int i=0;i<size;i++){

                TreeNode cur = nodeQueue.poll();
                curlevel.add(cur.val);
                if(cur.left!=null){
                    nodeQueue.offer(cur.left);
                }
                if(cur.right!=null){
                    nodeQueue.offer(cur.right);
                }
            }
            if(curlevel!=null)
                res.add(0,curlevel);
        }
        return res;
    }
}