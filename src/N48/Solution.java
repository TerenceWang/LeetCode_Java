package N48;

/**
 * Created by terence on 1/30/17.
 */
public class Solution {
    public void rotate(int[][] matrix) {
        if(matrix.length==0)
            return;
        int n = matrix.length;
        for (int i = 0; i < matrix.length/2; i++) {
            for (int j = i; j < matrix.length-i-1;j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[n-j-1][i];
                matrix[n-j-1][i]=matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1]=matrix[j][n-i-1];
                matrix[j][n-i-1]=temp;
            }
        }

    }
}
