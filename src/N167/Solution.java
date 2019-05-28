package N167;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int length = numbers.length;
        int left = 0;
        int right = length - 1;
        int [] res = new int[2];
        while (left < right){
            if (numbers[left] + numbers[right] < target){
                left++;
            }else if(numbers[left] + numbers[right] > target) {
                right--;
            }else{
                res[0] = left + 1;
                res[1] = right + 1;
            }
        }
        return res;
    }
}
