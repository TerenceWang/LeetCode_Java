package N199;


import util.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author wangtaowxs@hotmail.com
 * @date 2019-05-28 20:32
 */
public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        if(root==null){
            return res;
        }
        q1.add(root);
        while (!(q1.isEmpty() && q2.isEmpty())){
            if(!q1.isEmpty()) {
                res.add(q1.peek().val);
                while (!q1.isEmpty()) {
                    TreeNode t = q1.poll();
                    if (t.right != null) {
                        q2.add(t.right);
                    }
                    if (t.left != null) {
                        q2.add(t.left);
                    }
                }
            }
            if(!q2.isEmpty()) {
                res.add(q2.peek().val);
                while (!q2.isEmpty()) {
                    TreeNode t = q2.poll();
                    if (t.right != null) {
                        q1.add(t.right);
                    }
                    if (t.left != null) {
                        q1.add(t.left);
                    }
                }
            }
        }
        return res;
    }
}