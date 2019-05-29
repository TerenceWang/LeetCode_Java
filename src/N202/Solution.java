package N202;

import java.util.HashSet;

/**
 * @author wangtaowxs@hotmail.com
 * @date 2019-05-29 15:41
 */
public class Solution {
    int helper(int n){
        int res = 0;
        while(n>9){
            int tmp = (n%10);
            res += tmp*tmp;
            n = n/10;
        }
        res += n*n;
        return res;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> h = new HashSet<>();
        while(!h.contains(n)){
            h.add(n);
            n = helper(n);
        }
        return n == 1;
    }
}
