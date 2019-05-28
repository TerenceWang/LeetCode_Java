package N179;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author wangtaowxs@hotmail.com
 * @date 2019-05-28 19:56
 */
public class Solution {
    public String largestNumber(int[] nums) {
        int length = nums.length;
        String[] nums_string = new String[length];
        for (int i = 0; i < length; i++) {
            nums_string[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(nums_string, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s2.compareTo(s1);
            }
        });
        if(nums_string[0].charAt(0)=='0'){
            return "0";
        }
        String res = "";

        for (int i = 0; i < length; i++) {
            res += nums_string[i];
        }
        return res;
    }
}