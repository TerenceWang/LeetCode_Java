package N131;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<String>> res;
    public boolean isPalindrome(String s){
        int start = 0;
        int end = s.length()-1;
        while (start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public void helper(String s, List<String> pa){
        if(isPalindrome(s)){
            pa.add(s);
            res.add(new ArrayList<>(pa));
            pa.remove(pa.size()-1);
        }
        for (int i = 1; i < s.length(); i++) {
            String s1 = s.substring(0,i);
            String s2 = s.substring(i, s.length());
            // System.out.println(s1);
            if(isPalindrome(s1)){
                pa.add(s1);
                helper(s2,pa);
                pa.remove(pa.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        res  = new ArrayList<>();
        if(s.length()==0){
            return res;
        }
        List<String> tmp = new ArrayList<>();
        helper(s,tmp);
        return res;
    }
}