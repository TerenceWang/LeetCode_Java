package N139;

import java.util.HashSet;
import java.util.List;

public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean dp[] = new boolean[s.length()+1];

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < s.length()+1; i++) {
            dp[i] = false;
        }
        dp[0] = true;
        for (int i = 0; i < wordDict.size(); i++) {
            set.add(wordDict.get(i));
        }
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if(set.contains(s.substring(j,i))&&dp[j]){
                    dp[i] = true;
                }
            }
        }
        return dp[s.length()];
    }
}
