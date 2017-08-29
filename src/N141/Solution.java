package N141;

import util.ListNode;

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        if(head==null||head.next==null)
            return false;
        while(p1!=null && p2!=null){
            if(p1.next==null||p2.next==null||p2.next.next==null)
                return false;
            p1 = p1.next;
            p2 = p2.next.next;
            if(p1==p2)
                return true;

        }
        return false;
    }
}
