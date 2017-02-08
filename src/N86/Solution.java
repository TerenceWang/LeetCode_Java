package N86;

import util.ListNode;

/**
 * Created by terence on 2/8/17.
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode start=new ListNode(0);
        ListNode end = new ListNode(0);
        ListNode res1=new ListNode(0);
        ListNode res2=new ListNode(0);
        res1.next=start;
        res2.next=end;

        while (head.next!=null){
            if(head.val<x) {
                start.next = new ListNode(head.val);
                start=start.next;
            }
            else{
                end.next=new ListNode(head.val);
                end=end.next;
            }
            head = head.next;
        }
        start.next=res2.next;
        return res1.next.next;
    }
}
