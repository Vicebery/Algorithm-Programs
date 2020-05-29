package Java;

import java.util.*;

public class Solution257 {
    public static void main(String[] args){
        int a = 9;
        System.out.println("string"+a);
    }

    /**
     * @Description: https://leetcode-cn.com/problems/binary-tree-paths/ 二叉树的所有路径
     * @Author: vicebery
     * @Date: 2020/0529
     **/
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    // 用栈实现 递推 广度优先遍历 层次遍历
    // 用一个栈来同步记录 路径
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new LinkedList<>();
        if(root==null){
            return paths;
        }
        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<String> pathStack = new Stack<>();
        nodeStack.push(root);
        pathStack.push(String.valueOf(root.val));
        TreeNode node;
        String path;
        while(!nodeStack.isEmpty()){
            node = nodeStack.pop();
            path = pathStack.pop();
            if(node.left==null && node.right==null){
                paths.add(path);
            }
            if(node.left!=null){
                nodeStack.push(node.left);
                pathStack.push(path+"->"+node.left.val);
            }
            if(node.right!=null){
                nodeStack.push(node.right);
                pathStack.push(path+"->"+node.right.val);
            }
        }
        return paths;
    }

    // 递归 深度优先遍历
    public static List<String> binaryTreePaths2(TreeNode root) {
        List<String> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        String string = new String("");
        cal(root, string, result);
        return result;
    }
    public static void cal(TreeNode node, String curLevel, List<String> result){
        if(node != null){
            curLevel += node.val;
            if(node.left == null && node.right == null){
                result.add(curLevel);
            }else{
                curLevel += "->";
                cal(node.left, curLevel, result);
                cal(node.right, curLevel, result);
            }
        }
    }
}