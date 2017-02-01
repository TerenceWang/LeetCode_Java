package N66;

import java.util.Stack;

/**
 * Created by terence on 2/1/17.
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        Stack<Integer> res= new Stack<>();
        int first = (digits[digits.length-1]+1)%10;
        res.push(first);
        int addingup = (digits[digits.length-1]+1)/10;
        for (int i = digits.length-2; i >-1 ; i--) {
            res.push((digits[i]+addingup)%10);
            addingup = (digits[i]+addingup)/10;
        }
        if(addingup!=0)
            res.push(addingup);
        int length = res.size();
        int []result= new int[length];
        for (int i = 0; i < length; i++) {
            result[i]=res.pop();
        }
        return result;
    }
}
