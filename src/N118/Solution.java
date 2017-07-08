package N118;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by terence on 7/8/17.
 */
public class Solution {
    List<List<Integer>> re = new ArrayList<>();
    public List<List<Integer>> generate(int numRows) {
        for (int i = 0; i < numRows; i++) {
            re.add(helper(i));
        }
        return re;
    }
    public List<Integer> helper(int row){
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);
        if(row == 0){
            return res;
        }
        List<Integer> tmp = re.get(row-1);
        for (int i = 0; i < tmp.size()-1; i++) {
            int x = tmp.get(i)+tmp.get(i+1);
            res.add(x);
        }
        res.add(1);
        return res;
    }
}
