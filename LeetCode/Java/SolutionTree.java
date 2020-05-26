package Java;

import java.util.LinkedList;

public class SolutionTree {
    public static void main(String[] args){
        TreeNode a1 = new TreeNode(11);
        TreeNode a2 = new TreeNode(22);
        TreeNode a3 = new TreeNode(33);
        TreeNode a4 = new TreeNode(44);
        TreeNode a5 = new TreeNode(55);
        TreeNode a6 = new TreeNode(66);
        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right =a5;
        a3.left = a6;

        // 前序遍历输出
        preOrderTraverse1(a1);

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // 前序遍历 递归
    public static void preOrderTraverse1(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + "  ");
            preOrderTraverse1(root.left);
            preOrderTraverse1(root.right);
        }
    }
    // 前序遍历 非递归
    public void preOrderTraverse2(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode pNode = root;
        while (pNode != null || !stack.isEmpty()) {
            if (pNode != null) {
                System.out.print(pNode.val + "  ");
                stack.push(pNode);
                pNode = pNode.left;
            } else { //pNode == null && !stack.isEmpty()
                TreeNode node = stack.pop();
                pNode = node.right;
            }
        }
    }

}