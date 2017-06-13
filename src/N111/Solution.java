package N111;

import util.TreeNode;

/**
 * Created by terence on 6/13/17.
 */
public class Solution {
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        if(root.left==null){
            return 1 + minDepth(root.right);
        }else if(root.right==null){
            return 1 + minDepth(root.left);
        }else
            return 1 + Math.min(minDepth(root.left),minDepth(root.right));
    }
}
