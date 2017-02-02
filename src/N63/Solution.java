package N63;

/**
 * Created by terence on 2/2/17.
 */
public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] path = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                path[i][j] = 0;
            }
        }
        path[0][0]=1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(obstacleGrid[i][j]==1){
                    path[i][j]=0;
                    continue;
                }
                if(i==0&&j==0) continue;
                else if(i==0&&j!=0){
                    if(obstacleGrid[i][j-1]==1) path[i][j]=0;
                    else path[i][j] = path[i][j-1];
                }
                else if(i!=0&&j==0)
                    if(obstacleGrid[i-1][j]==1) path[i][j]=0;
                    else path[i][j]=path[i-1][j];
                else {
                    if(obstacleGrid[i-1][j]==1&&obstacleGrid[i][j-1]==1)
                        path[i][j]=0;
                    else if(obstacleGrid[i-1][j]==0&&obstacleGrid[i][j-1]==1)
                        path[i][j]=path[i-1][j];
                    else if(obstacleGrid[i-1][j]==1&&obstacleGrid[i][j-1]==0)
                        path[i][j]=path[i][j-1];
                    else
                        path[i][j]=path[i][j-1]+path[i-1][j];
                }
            }
        }
        return path[m-1][n-1];
    }
}
