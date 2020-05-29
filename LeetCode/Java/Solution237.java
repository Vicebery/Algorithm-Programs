package Java;

public class Solution237 {
    public static void main(String[] args){
        int[] arg = {1,2};
        System.out.println();
    }

    /**
     * @Description: https://leetcode-cn.com/problems/delete-node-in-a-linked-list/ 删除链表中的节点
     * @Author: vicebery
     * @Date: 2020/0529
     **/

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

    public static void deleteNode(ListNode node) {
        if(node == null){
            return ;
        }
        if(node.next!=null){
            node.val = node.next.val;
            node.next = node.next.next;
        }else{
            node = null;
        }
    }
}