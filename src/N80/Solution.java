package N80;

/**
 * Created by terence on 2/8/17.
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        int most=1;

        if(nums.length==0)
            return 0;
        int end=nums.length-1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[count]==nums[i]&&most==1){
                most+=1;
            }else if(nums[count]==nums[i]&&most>1){
                continue;
            }else{
                most=1;
            }
            nums[++count]=nums[i];
        }
        return count+1;
    }
}
