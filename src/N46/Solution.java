package N46;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by terence on 1/20/17.
 */
public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums==null) return result;
        if(nums.length==0) result.add(new ArrayList<Integer>());
        ArrayList<Integer> s=new ArrayList<Integer>();
        solver(nums,s,result);
        return result;
    }
    public void solver(int[] nums, ArrayList<Integer> s,ArrayList<List<Integer>> result){
        if(s.size()==nums.length){
            result.add(new ArrayList<Integer>(s));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(s.contains(nums[i])) continue;
            s.add(nums[i]);
            solver(nums,s,result);
            s.remove(s.size()-1);
        }
    }
}
