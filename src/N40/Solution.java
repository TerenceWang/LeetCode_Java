package N40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 * Created by terence on 1/19/17.
 */
public class Solution {
    public static void main(String[] args){

    }
    public void solver(ArrayList<Integer> a, int target,int start, ArrayList<Integer> t, List<List<Integer>> result){
        if(target==0) {
            ArrayList<Integer> p = new ArrayList<Integer>(t);
            result.add(p);
            return;
        }
        if(a.size()==0) return;
        for (int i = start; i < a.size()&& target>=a.get(i); i++) {
            t.add(a.get(i));
            ArrayList<Integer> aa=new ArrayList<Integer>(a);
            aa.remove(aa.size()-1);
            solver(aa,target-a.get(i),i,t,result);
            t.remove(t.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        ArrayList<Integer> t=new ArrayList<>();
        ArrayList<Integer> v=new ArrayList<>();
        for (int i = 0; i < candidates.length; i++) {
            v.add(candidates[i]);
        }
        solver(v,target,0,t,result);
        return result;
    }
}
