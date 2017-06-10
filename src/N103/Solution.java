package N103;

import util.TreeNode;

import java.util.*;

/**
 * Created by terence on 6/9/17.
 */
public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<List<Integer>> re = new ArrayList<>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        if (root == null) {
            return re;
        }
        s.push(root);
        boolean flag=false;
        while(!s.isEmpty()){
            flag = !flag;
            Stack<TreeNode> tmp = new Stack<TreeNode>();
            ArrayList<Integer> tmplist = new ArrayList<>();
            while(!s.isEmpty()){
                if(flag) {
                    TreeNode t = s.pop();
                    if (t.left != null) {
                        tmp.push(t.left);
                    }
                    if (t.right != null) {
                        tmp.push(t.right);
                    }
                    tmplist.add(t.val);
                }else{
                    TreeNode t = s.pop();
                    if (t.right != null) {
                        tmp.push(t.right);
                    }
                    if (t.left != null) {
                        tmp.push(t.left);
                    }
                    tmplist.add(t.val);
                }
            }
            re.add(tmplist);
            s = tmp;
        }
        return re;

    }
}
