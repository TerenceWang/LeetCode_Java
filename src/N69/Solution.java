package N69;

/**
 * Created by terence on 2/3/17.
 */
//current*current might larger than Integer.MAX
public class Solution {
    public int mySqrt(int x) {
        long start=0;
        long end=x/2+1;
        long current=0;
        while(start<=end){
            current=(start+end)/2;
            if(current*current==x) return (int)current;
            else if(current*current<x) start=current+1;
            else end=current-1;
        }
        return (int)end;
    }
}
