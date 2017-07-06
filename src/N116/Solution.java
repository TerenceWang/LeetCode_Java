package N116;
import util.TreeLinkNode;
/**
 * Created by terence on 7/6/17.
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root==null)
            return;
        TreeLinkNode cur;
        while (root.left!=null){
            cur = root;
            while(cur!=null){
                cur.left.next = cur.right;
                if(cur.next!=null){
                    cur.right.next = cur.next.left;
                }
                cur = cur.next;
            }
            root = root.left;
        }
    }
}
