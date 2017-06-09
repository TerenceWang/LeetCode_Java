package N101;

import util.TreeNode;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by terence on 6/9/17.
 */
public class Solution {
    public ArrayList<Integer> preorderTraversal(TreeNode root, ArrayList<Integer> l) {
        if (root == null) {
            l.add(null);
            return new ArrayList<>(l);
        }
        l = preorderTraversal(root.left, l);
        l = preorderTraversal(root.right, l);
        l.add(root.val);
        return l;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<Integer> a =preorderTraversal(p,new ArrayList<Integer>());
        ArrayList<Integer> b =preorderTraversal(q,new ArrayList<Integer>());
        if(a.size()!=b.size()){
            return false;
        }
        for (int i = 0; i < a.size(); i++) {
            if(!Objects.equals(a.get(i), b.get(i))) return false;
        }
        return true;
    }
    public TreeNode reverse(TreeNode p) {
        if(p==null)
            return null;
        TreeNode temp = p.left;
        p.left = p.right;
        p.right = temp;
        reverse(p.left);
        reverse(p.right);
        return p;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        return isSameTree(root.left,reverse(root.right));
    }
}
