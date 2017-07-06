package N114;

import util.TreeNode;

import java.util.ArrayList;

/**
 * Created by terence on 7/6/17.
 */
public class Solution {
    ArrayList<Integer> l = new ArrayList<>();
    public void preorder(TreeNode n){
        if(n==null)
            return;
        l.add(n.val);
        preorder(n.left);
        preorder(n.right);
    }
    public void flatten(TreeNode root) {
        preorder(root);
        TreeNode p = root;
        for (int i = 1; i < l.size(); i++) {
            p.left = null;
            p.right = new TreeNode(l.get(i));
            p = p.right;
        }
    }
}