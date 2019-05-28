package N189;

/**
 * @author wangtaowxs@hotmail.com
 * @date 2019-05-28 20:16
 */
public class Solution {
    public void reservse(int [] nums, int l ,int r){
        while(l < r){
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
            l++;
            r--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reservse(nums, 0, nums.length-1);
        reservse(nums, 0, k-1);
        reservse(nums, k,nums.length-1);
    }
}
