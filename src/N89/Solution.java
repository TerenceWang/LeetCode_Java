package N89;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by terence on 1/21/17.
 */
public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> res=new ArrayList<>();
        res.add(0);
        int s=0;
        for (int i = 0; i < n; i++) {
            int a=1<<i;
            int len=res.size();
            for (int j = len-1; j >-1 ; j--) {
                res.add(a+res.get(j));
            }
        }
        return res;
    }
}
