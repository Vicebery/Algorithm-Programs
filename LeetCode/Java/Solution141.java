package Java;

public class Solution141 {
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
     * @Description: https://leetcode-cn.com/problems/linked-list-cycle/ 环形链表 快慢指针
     * @Author: vicebery
     * @Date: 2020/0519
     **/
    public static boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) return false;
        ListNode slow = head, fast = head.next;
        while(slow != fast){
            if(fast==null || fast.next==null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}