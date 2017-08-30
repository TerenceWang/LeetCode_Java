package N143;

import util.ListNode;

public class Solution {
    public void reorderList(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2!=null||p2.next!=null){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        p2 = head;
        ListNode p3 = p1.next;
        p1.next = null;
        while (p3!=null){
            ListNode tmp = p3.next;
            p3.next = p1;
            p1 = p3;
            p3 = tmp;
        }
        while (p1!=null&&p2!=null&&p1!=p2.next){
            ListNode tmp1 = p2.next;
            ListNode tmp2 = p1.next;
            p2.next = p1;
            p1.next = tmp1;
            p2 = tmp1;
            p1 = tmp2;
        }
    }
}
