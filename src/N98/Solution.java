package N98;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by terence on 6/9/17.
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> re = new ArrayList<>();
        Stack<TreeNode> s = new Stack<TreeNode>();

        while(!s.isEmpty()||root!=null){
            if(root!=null){
                s.push(root);
                root = root.left;
            }else{
                root = s.pop();
                re.add(root.val);
                root = root.right;
            }
        }
        return re;
    }
    public boolean isValidBST(TreeNode root) {
        if(root==null)
            return true;
        List<Integer> re = inorderTraversal(root);
        for (int i = 1; i < re.size(); i++) {
            if(re.get(i-1)>=re.get(i))
                return false;
        }
        return true;

    }
}
