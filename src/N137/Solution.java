package N137;

public class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < 31; i++) {
            int sum = 0;
            int mask = 1<<i;
            for (int j = 0; j < nums.length; j++) {
                if((nums[j] & mask)!=0)
                    sum++;
            }
            res = res <<1+(sum%3);
        }
        return res;
    }
}
