package N117;

import util.TreeLinkNode;

/**
 * Created by terence on 7/8/17.
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root!=null){
            TreeLinkNode p = root;
            TreeLinkNode q = null;
            TreeLinkNode nextNode = null;
            while (p!=null){
                if(p.left!=null){
                    if(q!=null){
                        q.next = p.left;
                    }
                    q = p.left;
                    if(nextNode==null){
                        nextNode = q;
                    }
                }
                if(p.right!=null){
                    if(q!=null){
                        q.next = p.right;
                    }
                    q = p.right;
                    if(nextNode==null){
                        nextNode = q;
                    }
                }
                p = p.next;
            }
            connect(nextNode);
        }
    }
}
