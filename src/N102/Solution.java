package N102;

import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by terence on 6/9/17.
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> re = new ArrayList<>();
        Queue<TreeNode> s = new LinkedList<TreeNode>();
        if (root == null) {
            return re;
        }
        s.offer(root);
        while(!s.isEmpty()){
            Queue<TreeNode> tmp = new LinkedList<TreeNode>();
            ArrayList<Integer> tmplist = new ArrayList<>();
            while(!s.isEmpty()){
                TreeNode t = s.poll();
                if(t.left!=null){
                    tmp.offer(t.left);
                }
                if(t.right!=null){
                    tmp.offer(t.right);
                }
                tmplist.add(t.val);
            }
            re.add(tmplist);
            s = tmp;
        }
        return re;

    }
}
