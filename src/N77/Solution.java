package N77;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by terence on 2/4/17.
 */
public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer> > res =new ArrayList<List<Integer> >();
        ArrayList<Integer> solution = new ArrayList<Integer>();
        solver(res,solution,n,k,1);
        return res;
    }
    public void solver(List<List<Integer> > res,ArrayList<Integer> solution,int n,int k,int start){
        if(solution.size()==k){
            res.add(new ArrayList<>(solution));
        }
        if(solution.size()>k) //pruning
            return;
        for (int i = start; i <= n; i++) {
            solution.add(i);
            solver(res,solution,n,k,i+1);
            solution.remove(solution.size()-1);
        }
    }
}
