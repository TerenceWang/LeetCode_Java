package N78;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by terence on 2/8/17.
 */
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> res=new ArrayList<List<Integer>>();
        ArrayList<Integer> solution=new ArrayList<>();
        solver(nums,res,solution,0);
        return res;
    }
    public void solver(int[] nums,ArrayList<List<Integer>> res,ArrayList<Integer> solution,int depth){
        res.add(new ArrayList<>(solution));
        for (int i = depth; i < nums.length; i++) {
            solution.add(nums[i]);
            solver(nums,res,solution,i+1);
            solution.remove(solution.size()-1);
        }
    }
}
