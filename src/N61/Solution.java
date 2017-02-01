package N61;

import util.ListNode;

/**
 * Created by terence on 2/1/17.
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return head;
        ListNode temp = new ListNode(0);
        temp.next = head;
        int count =0;
        ListNode thead =new ListNode(0);
        thead.next = head;
        while (temp.next!=null){
            temp=temp.next;
            count++;
        }//length

        while(head.next!=null)
            head=head.next;
        head.next=thead.next; //cycle

        k = count - k % count;
        while (k>0){
            head = head.next;
            k--;
        }
        ListNode res = new ListNode(0);

        res.next=head.next;
        head.next=null;

        return res.next;
    }
}
