package N50;

/**
 * Created by terence on 1/30/17.
 */
public class Solution {
    public double mypow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return x;
        }
        if (n<=Integer.MIN_VALUE||n>=Integer.MAX_VALUE){
            if( x == 1){
                return 1;
            }else if(x==-1){
                if(n%2==0) return 1;
                else return -1;
            }
            return 0;
        }
        boolean isNegative = false;
        if (n < 0) {
            isNegative = true;
            n *= -1;
        }

        int k = n / 2;
        int l = n - k * 2;
        double t1 = mypow(x, k);
        double t2 = mypow(x, l);
        if (isNegative) {
            return 1/(t1*t1*t2);
        } else {
            return t1*t1*t2;
        }
    }
}
