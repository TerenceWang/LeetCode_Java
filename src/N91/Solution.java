package N91;

/**
 * Created by terence on 2/27/17.
 */
public class Solution {

    public int numDecodings(String s) {
        if(s.equals(""))
            return 0;
        int []results = new int[s.length()+1];
        results[0]=1;
        if (s.charAt(0)=='0')
            results[1]=1;
        else
            results[1]=0;
        for (int i = 2; i < results.length; i++) {
            int temp=0;
            if(Integer.parseInt(""+s.charAt(i-1))!=0)
                results[i]=results[i-1];
            String a=""+s.charAt(i-2)+s.charAt(i-1);
            if(Integer.parseInt(a)<=26 && Integer.parseInt(a)>=10)
                results[i]+=results[i-2];
        }
        return results[results.length-1];
    }
}
