package Java;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Solution662 {
    public static void main(String[] args){
        int[] arg = {1,2};
        Solution662 s = new Solution662();

        System.out.println();
    }

    /**
     * @Description: https://leetcode-cn.com/problems/maximum-width-of-binary-tree/
     * @Author: vicebery
     * @Date: 2020/0821
     **/
    class TreeNode{
        int val;
        TreeNode left,right;
        TreeNode(){

        }
        TreeNode(TreeNode left, TreeNode right){
            this.left = left;
            this.right = right;
        }
    }
    class MyTreeNode{
        TreeNode node;
        int curDepth, pos;

        MyTreeNode(TreeNode node, int curDepth, int pos){
            this.node = node;
            this.curDepth = curDepth;
            this.pos = pos;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        MyTreeNode tmp = new MyTreeNode(root,1,0);
        Queue<MyTreeNode> queue = new LinkedList<>();
        queue.add(tmp);
        int ans = 0,left = 0, curDep = 0;
        while(!queue.isEmpty()){
            MyTreeNode cur = queue.poll();
            if(cur.node!=null){
                // 层序遍历 记录存在的节点 深度以及位置
                if(cur.node.left!=null){
                    queue.add(new MyTreeNode(cur.node.left, cur.curDepth+1,cur.pos*2));
                }
                if(cur.node.right!=null){
                    queue.add(new MyTreeNode(cur.node.right, cur.curDepth+1,cur.pos*2+1));
                }
            }
            // 更新每层第一个出现的位置
            if(curDep != cur.curDepth){
                curDep = cur.curDepth;
                left = cur.pos;
            }
            // 更新最大宽度
            ans = Math.max(ans,cur.pos-left +1);
        }
        return ans;
    }

    public int widthOfBinaryTree2(TreeNode root) {
        if(root==null) return 0;
        root.val = 0;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int ans = 0;
        while(!queue.isEmpty()){
            int curLevelCount = queue.size();
            ans = Math.max(ans, queue.getLast().val - queue.getFirst().val +1);
            while(curLevelCount>0){
                TreeNode cur = queue.poll();
                if(cur.left!=null){
                    cur.left.val = cur.val*2;
                    queue.add(cur.left);
                }
                if(cur.right!=null){
                    cur.right.val = cur.val*2+1;
                    queue.addLast(cur.right);
                }
                curLevelCount--;
            }

        }
        return ans;
    }
}