package N112;

import util.TreeNode;

/**
 * Created by terence on 6/13/17.
 */
public class Solution {
    public boolean helper(TreeNode p, int count, int sum){
        if(p==null){
            if(count==sum){
                return true;
            }
            else{
                return false;
            }
        }
        count = count + p.val;
        if(p.left==null&&p.right==null){
            if(count==sum)
                return true;
            else
                return false;
        }
        else if(p.left==null)
            return helper(p.right,count,sum);
        else if(p.right==null){
            return helper(p.left,count,sum);
        }
        boolean a = helper(p.left,count,sum);
        boolean b = helper(p.right,count,sum);
        if(a||b)
            return true;
        else
            return false;
    }
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)
            return false;
        int count = 0;
        return helper(root,count,sum);
    }
}
