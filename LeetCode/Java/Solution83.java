package Java;

public class Solution83 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(7);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        ListNode res = deleteDuplicates(l1);
//        System.out.print(res.val);
        while(res.next!=null){
            System.out.print("->"+res.next.val);
            res = res.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * @Description: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/ 删除排序链表中的重复元素
     * @Author: vicebery
     * @Date: 2020/0513
     **/
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while(cur.next!=null){

        }
        return head;
    }
}