package Java;

public class Solution206 {
    public static void main(String[] args){
        ListNode l0 = new ListNode(2);
        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(13);
        ListNode l3 = new ListNode(37);
        ListNode l4 = new ListNode(57);
        l0.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        ListNode res = reverseList2(l0);
        while(res!=null){
            System.out.println(res.val);
            res =res.next;
        }

    }

    /**
     * @Description: https://leetcode-cn.com/problems/reverse-linked-list/ 反转链表
     * @Author: vicebery
     * @Date: 2020/0525
     **/


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public static ListNode reverseList(ListNode head) {
        ListNode tail = null;
        ListNode cur = head;
        ListNode pre;
        while(cur!=null){
            pre = cur.next;
            cur.next = tail;
            tail = cur;
            cur = pre;

        }
        return tail;
    }

    // 递归解法
    public static ListNode reverseList2(ListNode head){
        if(head ==null || head.next ==null) return head;
        ListNode p = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}