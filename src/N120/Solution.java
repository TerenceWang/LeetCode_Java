package N120;

import java.util.List;

/**
 * Created by terence on 7/8/17.
 */
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] lengths = new int[triangle.size()];
        for (int i = 0; i < lengths.length; i++) {
            lengths[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < triangle.size(); i++) {
            int[] tmp = new int[triangle.size()];
            for (int k = 0; k < tmp.length; k++) {
                tmp[k] = Integer.MAX_VALUE;
            }
            if(i==0){
                lengths[0] = triangle.get(0).get(0);
                continue;
            }
            tmp[0] = lengths[0]+triangle.get(i).get(0);
            for (int j = 1; j < triangle.get(i).size(); j++) {
                tmp[j] = Math.min(lengths[j],lengths[j-1])+triangle.get(i).get(j);
            }
            lengths = tmp;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < lengths.length; i++) {
            min = Math.min(min,lengths[i]);
        }
        return min;
    }
}
