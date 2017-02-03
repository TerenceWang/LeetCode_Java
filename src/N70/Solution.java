package N70;

/**
 * Created by terence on 2/3/17.
 */
public class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        int []count=new int[n];
        count[0]=1;
        count[1]=2;
        for (int i = 2; i < n; i++) {
            count[i]=count[i-1]+count[i-2];
        }
        return count[n-1];
    }
}
