package Java;

import java.util.List;

public class Solution95 {
    public static void main(String[] args){
        int[] arg = {1,2};
        Solution95 s = new Solution95();

        System.out.println();
    }

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){

        }
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    /**
     * @Description: https://leetcode-cn.com/problems/unique-binary-search-trees-ii/ 不同的二叉搜索树
     * @Author: vicebery
     * @Date: 2020/0714
     **/
//     public List<TreeNode> generateTrees(int n) {
//
//    }
}