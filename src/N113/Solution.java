package N113;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by terence on 7/6/17.
 */
public class Solution {
    List<List<Integer>> re = new ArrayList<List<Integer>>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<Integer> tmp = new ArrayList<>();
        helper(root,tmp,sum);
        return re;
    }
    public void helper(TreeNode n,ArrayList<Integer> tmp, int sum){
        if(n==null)
            return;
        if(n.left==null&&n.right==null&&sum==n.val){
            tmp.add(n.val);
            re.add(new ArrayList<>(tmp));
            tmp.remove(tmp.size()-1);
            return;
        }
        if(n.left==null&&n.right==null&&sum!=n.val){
            return;
        }
        tmp.add(n.val);
        if(n.left!=null)
            helper(n.left,tmp,sum-n.val);
        if(n.right!=null)
            helper(n.right,tmp,sum-n.val);
        tmp.remove(tmp.size()-1);
    }
}
