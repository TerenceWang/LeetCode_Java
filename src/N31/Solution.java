package N31;

/**
 * Created by terence on 1/18/17.
 */
public class Solution {

    public static void main(String[] args){
        int []a = {1,5,1};
        new Solution().nextPermutation(a);
    }

    public void nextPermutation(int[] nums) {
        int lastone=nums[nums.length-1];
        if(nums.length<2) {
            return;
        }
        boolean flag=false;
        for (int i = nums.length-2; i > -1; i--) {
            if (lastone>nums[i]){
                int index=-1;
                for (int j = i+1; j < nums.length; j++) {

                    if (nums[j]<=nums[i]) {
                        index = j - 1;
                        break;
                    }
                }
                if(index==-1){
                    int temp=nums[nums.length-1];
                    nums[nums.length-1]=nums[i];
                    nums[i]=temp;
                }else{
                    int temp=nums[index];
                    nums[index]=nums[i];
                    nums[i]=temp;
                }
                int start=i+1;
                int end=nums.length-1;
                for (int j = start, k = end; j < k; j++,k--) {
                    int temp=nums[j];
                    nums[j]=nums[k];
                    nums[k]=temp;
                }
                flag=true;
                break;
            }else{
                lastone=nums[i];
            }

        }
        if(!flag){
            for (int j = 0, k = nums.length-1; j < k; j++,k--) {
                int temp=nums[j];
                nums[j]=nums[k];
                nums[k]=temp;
            }
        }
    }
}
