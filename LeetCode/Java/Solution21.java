package Java;

public class Solution21 {
    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        ListNode l12 = new ListNode(3);
        ListNode l13 = new ListNode(5);
        ListNode l14 = new ListNode(7);
        l1.next = l12;
        l12.next = l13;
        l13.next = l14;
        ListNode l2 = new ListNode(1);
        ListNode l21 = new ListNode(4);
        ListNode l22 = new ListNode(7);
        ListNode l23 = new ListNode(9);
        l2.next = l21;
        l21.next = l22;
        l22.next = l23;

        ListNode res = mergeTwoLists(l1,l2);
        System.out.print(res.val);
        while(res.next!=null){
            System.out.print("->"+res.next.val);
            res = res.next;
        }

    }

    /**
     * @Description: https://leetcode-cn.com/problems/merge-two-sorted-lists/ 合并排序链表
     * @Author: vicebery
     * @Date: 2020/4/24
     **/
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode res = new ListNode(0);
        ListNode cur = res;
        while(l1!=null || l2!= null){
            if(l1==null){
                cur.next = l2;
                break;
            }
            if(l2 == null){
                cur.next = l1;
                break;
            }
            if(l1.val<=l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else{
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        return res.next;
    }

    public static class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
}