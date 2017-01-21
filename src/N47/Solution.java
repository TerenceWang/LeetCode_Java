package N47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by terence on 1/21/17.
 */
public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums==null) return result;
        if(nums.length==0) result.add(new ArrayList<Integer>());
        ArrayList<Integer> s=new ArrayList<Integer>();
        ArrayList<Integer> v=new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            v.add(0);
        }
        solver(nums,s,result,v);
        return result;
    }
    public void solver(int[] nums, ArrayList<Integer> s,ArrayList<List<Integer>> result,ArrayList<Integer> v){
        if(s.size()==nums.length){
            result.add(new ArrayList<Integer>(s));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if((i>0&&nums[i]==nums[i-1]&&v.get(i-1)==0)||(v.get(i)==1)) continue;

            s.add(nums[i]);
            v.set(i,1);
            solver(nums,s,result,v);
            s.remove(s.size()-1);
            v.set(i,0);
        }
    }
}
