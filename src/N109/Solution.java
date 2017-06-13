package N109;

import util.ListNode;
import util.TreeNode;

/**
 * Created by terence on 6/13/17.
 */
public class Solution {
    public TreeNode helper(ListNode head, int left, int right){
        if(left > right){
            return null;
        }
        int mid = (left+right)/2;
        ListNode tmp = head;
        int count = 0;
        while(count<mid-left){
            tmp = tmp.next;
            count++;

        }
        TreeNode p = new TreeNode(tmp.val);
        p.left = helper(head,left,mid-1);
        p.right = helper(tmp.next,mid+1,right);
        return p;

    }
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode tmp = head;
        int count = 0;
        while (tmp!=null){
            tmp=tmp.next;
            count++;
        }
        TreeNode re = helper(head, 0,count-1);
        return re;
    }
}
