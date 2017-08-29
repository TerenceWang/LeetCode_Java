package N140;
//TLE。。。
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public List<String> res = new ArrayList<>();
    public boolean dp[][];
    public HashSet<String> set;
    public void helper(String s, int i, String tmp){
        if(set.contains(s.substring(0,i+1))&&dp[i+1][dp.length-1]) {
            tmp = tmp + s.substring(0,i+1) +" ";
            if(i+1>=s.length()) {
                res.add(tmp);
                return;
            }else
                helper(s.substring(i + 1, s.length()), 0, tmp);
        }else{
            helper(s,i+1,tmp);
        }
    }
    //add a word break 1 func(tricky)
    public List<String> wordBreak(String s, List<String> wordDict) {
        /*
            Firstly we need to judge whether s is breakable, which could save a lot of time!!!
            but the code is not so elegant
        */
        set = new HashSet<>();
        set.addAll(wordDict);
        dp = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                dp[i][j] = false;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if(set.contains(s.substring(i,j+1)))
                    dp[i][j] = true;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                for (int k = i; k < j; k++) {
                    if(set.contains(s.substring(k+1,j+1))&&dp[i][k])
                        dp[i][j] = true;
                }
            }
        }
        String tmp_s = "";
        helper(s,0,tmp_s);
        return res;
    }
}
