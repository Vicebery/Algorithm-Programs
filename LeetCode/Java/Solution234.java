package Java;

public class Solution234 {
    public static void main(String[] args){
        int[] arg = {1,2};
        System.out.println();
    }

    /**
     * @Description:  https://leetcode-cn.com/problems/palindrome-linked-list/ 判断回文链表
     * @Author: vicebery
     * @Date: 2020/0528
     **/

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

    public static boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null){
            if(fast.next==null){
                break;
            }
            if(fast.next!=null && fast.next.next==null){
                slow = slow.next;
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;
        ListNode pre = mid;
        while(mid != null){
            ListNode tmp = mid.next;
            if(mid == slow){
                mid.next = null;
            }else{
                mid.next = pre;
                pre = mid;
            }
            mid = tmp;
        }
        while(pre!=null && head!=null){
            if(head.val!=pre.val){
                return false;
            }
            pre = pre.next;
            head = head.next;
        }
        return true;
    }
}