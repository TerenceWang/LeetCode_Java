package N376;

/**
 * Created by terence on 1/21/17.
 */
public class Solution {
    public int wiggleMaxLength(int[] nums) {
        int a=1;int b=1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > nums[i-1]) a=b+1;
            else if(nums[i] < nums[i-1]) b=a+1;
        }
        return Math.min(nums.length-1,Math.max(a,b));
    }
}
