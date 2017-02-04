package N74;

/**
 * Created by terence on 2/4/17.
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        if(row==0)
            return false;
        int col =matrix[0].length;
        if(col==0)
            return false;
        int targetrow=0;
        while (targetrow<row&&matrix[targetrow][0]<=target) targetrow++;
        if(targetrow==0) return false;
        targetrow=targetrow-1;
        for (int i = 0; i < col; i++) {
            if(matrix[targetrow][i]==target){
                return true;
            }
        }
        return false;
    }
}
