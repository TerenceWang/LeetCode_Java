package N75;

/**
 * Created by terence on 2/4/17.
 */
public class Solution {
    public void sortColors(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int i =0;
        if(nums.length==0)
            return;
        while (i<=right){
            if(nums[i]==0){
                int t=nums[i];
                nums[i]=nums[left];
                nums[left]=t;
                i++;
                left++;
            }
            else if(nums[i]==1){
                i++;
            }else{
                int t=nums[i];
                nums[i]=nums[right];
                nums[right]=t;
                right--;
            }
        }
    }
}
