package Java;

public class Solution2 {
    public static void main(String[] args){
        int[] arg = {1,2};
        Solution2 s = new Solution2();

        System.out.println();
    }

    /**
     * @Description: https://leetcode-cn.com/problems/add-two-numbers/
     * @Author: vicebery
     * @Date: 2020/0730
     **/
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        int carry = 0;
        ListNode cur = res;
        while(l1!=null || l2!=null){
            if(l1!=null && l2!=null){
                int curVal = (l1.val + l2.val + carry)%10;
                ListNode tmp = new ListNode(curVal);
                cur.next = tmp;
                cur = cur.next;
                carry = (l1.val + l2.val + carry)/10;
                l1 = l1.next;
                l2 = l2.next;
            }else if(l1!=null){
                int curVal = (l1.val + carry)%10;
                ListNode tmp = new ListNode(curVal);
                cur.next = tmp;
                cur = cur.next;
                carry = (l1.val + carry)/10;
                l1 = l1.next;
            }else if(l2!=null){
                int curVal = (l2.val + carry)%10;
                ListNode tmp = new ListNode(curVal);
                cur.next = tmp;
                cur = cur.next;
                carry = (l2.val + carry)/10;
                l2 = l2.next;
            }
        }
        if(carry!=0){
            ListNode tmp = new ListNode(carry);
            cur.next = tmp;
        }
        return res.next;
    }
}