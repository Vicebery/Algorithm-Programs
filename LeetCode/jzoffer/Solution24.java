package jzoffer;

public class Solution24 {
    public static void main(String[] args){
        int[] arg = {1,2};
        Solution24 s = new Solution24();

        System.out.println();
    }

    /**
     * @Description: https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/ 反转链表
     * @Author: vicebery
     * @Date: 2020/
     **/
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        ListNode curNext = head.next;
        cur.next = null;
        while (curNext != null) {
            ListNode tmp = curNext.next;
            curNext.next = cur;
            cur = curNext;
            curNext = tmp;
        }
        return cur;
    }
}