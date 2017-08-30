package N144;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()){
            TreeNode tmp = stack.pop();
            if(tmp.left==null&&tmp.right==null){
                list.add(tmp.val);
            }else {
                if(tmp.left!=null){
                    stack.push(tmp.left);
                }else{
                    list.add(tmp.val);
                    stack.push(tmp.right);
                }
            }
        }
        return list;
    }
}
