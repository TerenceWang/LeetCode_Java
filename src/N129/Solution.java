package N129;

import util.TreeNode;

public class Solution {
    public static int res = 0;
    public void helper(TreeNode r, int s){
        if(r.left==null&&r.right==null){
            res = s*10 + r.val + res;
            return;
        }
        if(r.left!=null)
            helper(r.left,s*10+r.val);
        if(r.right!=null)
            helper(r.right,s*10+r.val);
    }
    public int sumNumbers(TreeNode root) {
        res = 0;
        if(root==null)
            return 0;
        helper(root,0);
        return res;
    }
}
