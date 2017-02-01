package N60;

/**
 * Created by terence on 2/1/17.
 */
public class Solution {
    public String getPermutation(int n, int k) {
        int factor=1;
        for (int i = 1; i < n; i++) {
            factor*=i;
        }
        k = k-1; //....
        String res="";
        boolean []used = new boolean[n];
        for (int i = 0; i < n; i++) {
            int number = k /factor;
            k = k%factor;
            for (int j = 0; j < n; j++) {
                if (!used[j]) {
                    if (number == 0) {
                        used[j] = true;
                        char t = (char)('0'+j+1);
                        res=res+t;
                        break;
                    } else {
                        number--;
                    }
                }
            }
            if(i<n-1) factor = factor/(n-i-1);
        }
        return res;
    }
}
