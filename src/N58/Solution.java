package N58;

/**
 * Created by terence on 1/31/17.
 */
public class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==0){
            return 0;
        }
        String[] strs=s.split(" ");
        if(strs.length==0){
            return 0;
        }
        return strs[strs.length-1].length();
    }
}
