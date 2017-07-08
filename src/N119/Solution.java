package N119;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by terence on 7/8/17.
 */
public class Solution {
    public List<Integer> helper(List<Integer> tmp){
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);
        if(tmp.size() == 0){
            return res;
        }
        for (int i = 0; i < tmp.size()-1; i++) {
            int x = tmp.get(i)+tmp.get(i+1);
            res.add(x);
        }
        res.add(1);
        return res;
    }
    public List<Integer> getRow(int rowIndex) {
        rowIndex = rowIndex + 1;
        List<Integer> pre = new ArrayList<>();
        for (int i = 0; i < rowIndex; i++) {
            pre = helper(pre);
        }
        return pre;
    }
}
