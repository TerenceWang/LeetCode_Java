package N145;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();

        ArrayList<Integer> list = new ArrayList<>();
        if(root==null)
            return list;
        stack.push(root);
        TreeNode pre = null;
        while (!stack.isEmpty()){
            TreeNode tmp = stack.peek();
            if(pre == null||pre.left == tmp||pre.right == tmp){
                if(tmp.left!=null)
                    stack.push(tmp.left);
                else if(tmp.right!=null)
                    stack.push(tmp.right);
            } else if(tmp.left == pre){
                if(tmp.right!=null){
                    stack.push(tmp.right);
                }
            }else{
                list.add(tmp.val);
                stack.pop();
            }
            pre = tmp;
        }
        return list;

    }
}
