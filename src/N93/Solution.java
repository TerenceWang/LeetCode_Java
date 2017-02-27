package N93;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by terence on 2/27/17.
 */
public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<String>();
        List<String> temp = new ArrayList<String>();
        helper(result,temp,s,0);
        return result;
    }
    public void helper(List<String> result, List<String> tempstring, String s, int depth){
        if(depth==4){
            if(tempstring.get(0).length()>1&&tempstring.get(0).charAt(0)=='0')
                return;
            String a = tempstring.get(0) ;
            for (int i = 1; i < tempstring.size(); i++) {
                if(tempstring.get(i).length()>1&&tempstring.get(i).charAt(0)=='0')
                    return;
                a = a + "."+tempstring.get(i);
            }
            // a = a  + tempstring.get(tempstring.size()-1);
            result.add(a);
            return;
        }
        if(depth==3){
            if(s.length()>3)
                return;
            if (Integer.parseInt(s)>=256){
                return;
            }
            if(s.length()==0){
                return;
            }

            tempstring.add(s);
            helper(result,tempstring,"",4);
            tempstring.remove(tempstring.size()-1);
            return;
        }

        for (int i = 1; i < 4; i++) {
            if(i>=s.length())
                return;
            String t = s.substring(0,i);
            // System.out.println(s.substring(0,i));
            // System.out.println(s.substring(i,s.length()));
            if(Integer.parseInt(t)>=256)
                return;
            tempstring.add(t);
            String k;
            if(i>=s.length())
                k="";
            else
                k = s.substring(i,s.length());
            helper(result,tempstring,k,depth+1);
            tempstring.remove(tempstring.size()-1);
        }
    }
}