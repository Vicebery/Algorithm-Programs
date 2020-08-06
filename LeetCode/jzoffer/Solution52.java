package jzoffer;

import java.util.BitSet;
import java.util.HashSet;

public class Solution52 {
    public static void main(String[] args){
        int[] arg = {1,2};
        Solution52 s = new Solution52();

        System.out.println();
    }

    /**
     * @Description: https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/ 两个链表的第一个公共节点
     * @Author: vicebery
     * @Date: 2020/0806
     **/
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        while (curA != curB) {
            if (curA != null) {
                curA = curA.next;
            } else {
                curA = headB;
            }
            if (curB != null) {
                curB = curB.next;
            } else {
                curB = headA;
            }
        }
        return curA;
    }
}