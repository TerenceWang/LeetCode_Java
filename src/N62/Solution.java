package N62;

/**
 * Created by terence on 2/2/17.
 */
public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] path = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                path[i][j] = 0;
            }
        }
        path[0][0]=1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0&&j==0) continue;
                else if(i==0&&j!=0)
                    path[i][j] = path[i][j-1];
                else if(i!=0&&j==0)
                    path[i][j]=path[i-1][j];
                else {
                    path[i][j]=path[i-1][j]+path[i][j-1];
                }
            }
        }
        return path[m-1][n-1];
    }
}
