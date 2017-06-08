package N95;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by terence on 6/9/17.
 */
public class Solution {
    public List<TreeNode> generate(int a, int b){
        List<TreeNode> re = new ArrayList<>();
        if(a>b){
            re.add(null);
            return re;
        }

        for (int i = a; i <= b; i++) {
            List<TreeNode> left = generate(a,i-1);
            List<TreeNode> right = generate(i+1,b);
            for (int j = 0; j < left.size(); j++) {
                for (int k = 0; k < right.size(); k++) {
                    TreeNode tmp = new TreeNode(i + 1);
                    tmp.left = left.get(j);
                    tmp.right = right.get(k);
                    re.add(tmp);
                }
            }
        }
        return re;
    }
    public List<TreeNode> generateTrees(int n) {
        return generate(0,n-1);
    }
}
