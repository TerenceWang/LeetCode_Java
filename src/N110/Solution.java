package N110;

import util.TreeNode;

/**
 * Created by terence on 6/13/17.
 */
public class Solution {
    public int depth(TreeNode p){
        if(p==null)
            return 0;
        return 1+ Math.max(depth(p.left),depth(p.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        if(Math.abs(depth(root.left)-depth(root.right))>1)
            return false;
        boolean rootl = isBalanced(root.left);
        boolean rootr = isBalanced(root.right);
        if(rootl&&rootr)
            return true;
        else
            return false;
    }
}
