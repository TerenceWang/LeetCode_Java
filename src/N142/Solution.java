package N142;

import util.ListNode;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        if(head==null||head.next==null)
            return null;
        while(p1!=null && p2!=null){
            if(p1.next==null||p2.next==null||p2.next.next==null)
                return null;
            p1 = p1.next;
            p2 = p2.next.next;
            if(p1==p2){
                p1 = head;
                p2 = p2;
                while(p1!=p2){
                    p1 = p1.next;
                    p2 = p2.next;
                }
                return p2;
            }

        }
        return null;
    }
}
