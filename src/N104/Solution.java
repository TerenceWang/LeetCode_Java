package N104;

import util.TreeNode;
/**
 * Created by terence on 6/9/17.
 */
public class Solution {
    public int helper(TreeNode p, int count){
        if(p==null)
            return count;
        return 1+Math.max(helper(p.left,count),helper(p.right,count));
    }
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        int count=0;
        return 1+Math.max(helper(root.left,count),helper(root.right,count));
    }
}
