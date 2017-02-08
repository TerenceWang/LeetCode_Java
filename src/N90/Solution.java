package N90;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by terence on 2/8/17.
 */
public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<List<Integer>> res=new ArrayList<List<Integer>>();
        ArrayList<Integer> solution=new ArrayList<>();
        Arrays.sort(nums);
        solver(nums,res,solution,0);
        return res;
    }
    public void solver(int[] nums,ArrayList<List<Integer>> res, ArrayList<Integer> solution, int pos){
        res.add(new ArrayList<>(solution));
        for (int i = pos; i < nums.length; i++) {
            if(i>0&&nums[i]==nums[i-1]&&i>pos)
                continue;
            solution.add(nums[i]);
            solver(nums,res,solution,i+1);
            solution.remove(solution.size()-1);
        }
    }
}
