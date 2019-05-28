package N173;

import util.TreeNode;

import java.util.Stack;

public class BSTIterator {
    public Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        while(root!=null){
            stack.push(root);
            root = root.left;
        }
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode t = stack.pop();
        int res = t.val;
        if (t.right != null){
            t = t.right;
            while(t!=null){
                stack.push(t);
                t = t.left;
            }
        }
        return res;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}
