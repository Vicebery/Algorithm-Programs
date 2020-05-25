package Java;

public class Solution203 {
    public static void main(String[] args){
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(6);
        ListNode l3 = new ListNode(5);
        ListNode l4 = new ListNode(7);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        ListNode res = removeElements(l1,6);
        if(res!=null){
            while(true){
                if(res.next==null){
                    System.out.print(res.val);
                    break;
                }
                System.out.print(res.val+"->");
                res = res.next;
            }
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
     * @Description: https://leetcode-cn.com/problems/remove-linked-list-elements/ 移除链表元素
     * @Author: vicebery
     * @Date: 2020/0521
     **/
    public static ListNode removeElements(ListNode head, int val) {
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode pre = res;
        ListNode cur = head;
        while(cur!=null){
            if(cur.val == val){
                pre.next = cur.next;
            }else{
                pre = cur;
            }
            cur = cur.next;
        }
        return res.next;
    }
}