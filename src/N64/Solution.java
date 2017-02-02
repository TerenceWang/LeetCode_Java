package N64;

/**
 * Created by terence on 2/2/17.
 */
public class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] sum = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = Integer.MAX_VALUE;
            }
        }
        sum[0][0]=grid[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0&&j==0) continue;
                else if(i==0&&j!=0)
                    sum[i][j] = sum[i][j-1]+grid[i][j];
                else if(i!=0&&j==0)
                    sum[i][j]=sum[i-1][j]+grid[i][j];
                else {
                    sum[i][j]=Math.min(sum[i-1][j]+grid[i][j],sum[i][j-1]+grid[i][j]);
                }
            }
        }
        return sum[m-1][n-1];
    }
}
