package N41;

/**
 * Created by terence on 1/19/17.
 */
public class Solution {
    public static void main(String[] args){
        int[] a={999,879,897};
        System.out.println(new Solution().firstMissingPositive(a));
    }
    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<=0) nums[i]= nums.length+2;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<nums.length+1&&nums[nums[i]-1] != nums[i]){  //juding by nums[nums[i]-1] != nums[i] also avoid the duplicate
                int index=nums[i]-1;
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                i--;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i+1) return i+1;
        }
        return nums.length+1;
    }
}
