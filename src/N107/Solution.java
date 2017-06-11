package N107;

import util.TreeNode;

import java.util.*;

/**
 * Created by terence on 6/11/17.
 */
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q = new LinkedList();
        List<List<Integer>> re = new ArrayList<>();

        q.offer(root);
        if (root == null) {
            return re;
        }
        Stack<ArrayList<Integer>> s = new Stack<>();
        while(!q.isEmpty()){
            Queue<TreeNode> tmp = new LinkedList();
            ArrayList<Integer> arr = new ArrayList<>();
            while(!q.isEmpty()) {
                TreeNode tmpnode  = q.poll();
                if(tmpnode.left!=null){
                    tmp.offer(tmpnode.left);
                }
                if(tmpnode.right!=null){
                    tmp.offer(tmpnode.right);
                }
                arr.add(tmpnode.val);
            }
            s.push(arr);
            q = tmp;
        }
        while(!s.isEmpty()){
            ArrayList<Integer> k = s.pop();
            re.add(k);
        }
        return re;

    }
}
