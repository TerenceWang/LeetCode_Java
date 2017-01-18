package N35;

/**
 * Created by terence on 1/18/17.
 */
public class Solution {
    public static void main(String[] args){
        int []a = {1,3,5,6};
        int tar=2;
        int b=new Solution().searchInsert(a,tar);
        System.out.println(b);
    }
    public int searchInsert(int[] nums, int target) {
        if(target<nums[0]) return 0;
        if(target>nums[nums.length-1]) return nums.length;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            if(nums[(end+start)/2]<target)
                start=(end+start)/2+1;
            else if(nums[(end+start)/2]>target)
                end=(end+start)/2-1;
            else
                return (end+start)/2;
        }
        if(start==end) return start;
        System.out.println(start+" "+end);
        for (int i = end; i <= start; i++) {
            if(nums[i]>=target)
                return i;
        }
        return -1;
    }
}
