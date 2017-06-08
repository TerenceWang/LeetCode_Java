package N94;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by terence on 6/8/17.
 */
public class Solution {
    public ArrayList<Integer> result = new ArrayList<>();
    public List<Integer> inorderTraversal2(TreeNode root) {
        if(root==null){
            return result;
        }
        if(root.left != null){
            inorderTraversal2(root.left);
        }
        result.add(root.val);
        if(root.right!=null){
            inorderTraversal2(root.right);
        }
        return result;
    }
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
}
