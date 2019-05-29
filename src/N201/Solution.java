package N201;

/**
 * @author wangtaowxs@hotmail.com
 * @date 2019-05-29 15:34
 */
public class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int offset = 0;
        while (m!=n){
            m = m>>1;
            n = n>>1;
            offset++;
        }
        return m << offset ;
    }
}
