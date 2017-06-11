package N108;

import util.TreeNode;

/**
 * Created by terence on 6/11/17.
 */
public class Solution {
    public TreeNode helper(int[] nums, int left, int right){
        if(left>right)
            return null;
        int mid = (left+right)/2;
        TreeNode p = new TreeNode(nums[mid]);
        p.left = helper(nums,left,mid-1);
        p.right = helper(nums,mid+1,right);
        return p;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0){
            return null;
        }
        int mid = (0+nums.length-1)/2;
        TreeNode re = helper(nums,0,nums.length-1);

        return re;
    }
}
