package N136;

public class Solution {
    public int singleNumber(int[] nums) {
        int A = nums[0];
        for (int i = 1; i < nums.length; i++) {
            A = A^nums[i];
        }
        return A;
    }
}
