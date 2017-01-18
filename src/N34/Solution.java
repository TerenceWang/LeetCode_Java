package N34;

/**
 * Created by terence on 1/18/17.
 */
public class Solution {
    public static void main(String[] args){
        int []a = {5,7,7,8,8,10};
        int tar=8;
        int []b=new Solution().searchRange(a,tar);
        System.out.println(b[1]);
    }
    public int[] searchRange(int[] nums, int target) {
        int[] result={-1,-1};
        int start=0;
        int end=nums.length-1;
        while(end>start && nums[(end+start)/2]!=target){
            if (nums[(end+start)/2]<target){
                start=(end+start)/2+1;
            }
            else{
                end=(end+start)/2-1;
            }
        }
        while(start<nums.length && nums[start]!=target) start++;
        while (end>-1 && nums[end]!=target) end--;
        result[0]=start!=nums.length?start:-1;
        result[1]=end!=-1?end:-1;
        return result;
    }
}
