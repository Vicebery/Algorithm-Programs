package Java;

import java.util.*;

public class Solution199 {
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
     * @Description: https://leetcode-cn.com/problems/binary-tree-right-side-view/
     * @Author: vicebery
     * @Date: 2020/0609
     **/
    // 广度优先遍历 队列 BFS
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> depthQueue = new LinkedList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int maxDepth = -1;
        queue.offer(root);
        depthQueue.offer(0);
        while(!queue.isEmpty()){
            TreeNode cur = queue.remove();
            int depth = depthQueue.remove();
            if(cur!=null){
                maxDepth = Math.max(depth,maxDepth);
                map.put(depth,cur.val);
                if(cur.left!=null){
                    queue.offer(cur.left);
                    depthQueue.offer(depth+1);
                }
                if(cur.right!=null){
                    queue.offer(cur.right);
                    depthQueue.offer(depth+1);
                }
            }
        }
        for(int key:map.keySet()){
            res.add(map.get(key));
        }
        return res;
    }

    // DFS 深度优先搜索 栈
    public List<Integer> rightSideView2(TreeNode root) {
        Map<Integer, Integer> rightmostValueAtDepth = new HashMap<Integer, Integer>();
        int max_depth = -1;

        Stack<TreeNode> nodeStack = new Stack<TreeNode>();
        Stack<Integer> depthStack = new Stack<Integer>();
        nodeStack.push(root);
        depthStack.push(0);

        while (!nodeStack.isEmpty()) {
            TreeNode node = nodeStack.pop();
            int depth = depthStack.pop();

            if (node != null) {
                // 维护二叉树的最大深度
                max_depth = Math.max(max_depth, depth);

                // 如果不存在对应深度的节点我们才插入
                if (!rightmostValueAtDepth.containsKey(depth)) {
                    rightmostValueAtDepth.put(depth, node.val);
                }

                nodeStack.push(node.left);
                nodeStack.push(node.right);
                depthStack.push(depth + 1);
                depthStack.push(depth + 1);
            }
        }

        List<Integer> rightView = new ArrayList<Integer>();
        for (int depth = 0; depth <= max_depth; depth++) {
            rightView.add(rightmostValueAtDepth.get(depth));
        }

        return rightView;
    }
}