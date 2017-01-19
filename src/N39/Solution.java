package N39;

import java.util.*;

/**
 * Created by terence on 1/19/17.
 */
public class Solution {
    public static void main(String[] args){

    }
    public void solver(int []a, int target,int start, ArrayList<Integer> t, List<List<Integer>> result){
        if(target==0) {
            ArrayList<Integer> p = new ArrayList<Integer>(t);
            result.add(p);
            return;
        }
        for (int i = start; i < a.length&& target>=a[i]; i++) {
            t.add(a[i]);
            solver(a,target-a[i],i,t,result);
            t.remove(t.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        ArrayList<Integer> t=new ArrayList<>();
        solver(candidates,target,0,t,result);
        return result;

    }
}
