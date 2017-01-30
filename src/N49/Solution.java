package N49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by terence on 1/30/17.
 */
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<Integer>> t= new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char []temp=strs[i].toCharArray();
            Arrays.sort(temp);
            String tempstr=new String(temp);
            if(!t.containsKey(tempstr)){
                t.put(tempstr,new ArrayList<Integer>());
            }
            t.get(tempstr).add(i);
        }
        List<List<String>> res=new ArrayList<List<String>>();
        for (String key:t.keySet()) {
            ArrayList<Integer> temp = t.get(key);
            List<String> tlist = new ArrayList<String>();
            for (int i = 0; i < temp.size(); i++) {
                tlist.add(strs[temp.get(i)]);
            }
            res.add(tlist);
        }
        return res;
    }
}
