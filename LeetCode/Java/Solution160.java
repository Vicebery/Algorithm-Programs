package Java;

import java.util.HashSet;
import java.util.Set;

public class Solution160 {
    public static void main(String[] args){
        int[] arg = {1,2};
        System.out.println();
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
}
    /**
     * @Description: https://leetcode-cn.com/problems/intersection-of-two-linked-lists/ 相交链表
     * @Author: vicebery
     * @Date: 2020/0519
     **/
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if(headA==null || headB == null)
            return null;
        Set<ListNode> hash = new HashSet<>();
        while(headA!=null){
            hash.add(headA);
            headA = headA.next;
        }
        while(headB!=null){
            if(hash.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}