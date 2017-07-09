package N125;

import java.util.Stack;

/**
 * Created by terence on 7/9/17.
 */
public class Solution {
    public boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char k = s.charAt(i);
            if(k<='Z'&&k>='A') k = (char)(k-'A'+'a');
            if((k<='z'&&k>='a')||(k>='0'&&k<='9')) stack.push(k);
        }
        for (int i = 0; i < s.length(); i++) {
            char k = s.charAt(i);
            if(k<='Z'&&k>='A') k = (char)(k-'A'+'a');
            if((k<='z'&&k>='a')||(k>='0'&&k<='9')){
                char kk = stack.pop();
                if(kk-k!=0)
                    return false;
            }
        }
        return true;
    }
}