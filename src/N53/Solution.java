package N53;

/**
 * Created by terence on 1/31/17.
 */
public class Solution {
    public static void main(String[] args){
        int []a={-2};
        System.out.print(new Solution().maxSubArray(a));
    }
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            max=Math.max(sum,max);
            sum=Math.max(sum,0);
        }
        return max;
    }
}
