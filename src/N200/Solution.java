package N200;

/**
 * @author wangtaowxs@hotmail.com
 * @date 2019-05-28 20:50
 */
public class Solution {
    void helper(char [][] grid, int x, int y){
        grid[x][y] = '0';
        if(x-1>-1&&grid[x-1][y]=='1'){
            helper(grid, x-1,y);
        }
        if(x+1<grid.length&&grid[x+1][y]=='1'){
            helper(grid, x+1,y);
        }
        if(y-1>-1&&grid[x][y-1]=='1'){
            helper(grid, x,y-1);
        }
        if(y+1<grid[0].length&&grid[x][y+1]=='1'){
            helper(grid, x,y+1);
        }
    }
    public int numIslands(char[][] grid) {
        int cnt = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    cnt += 1;
                    helper(grid, i, j);
                }
            }
        }
        return cnt;
    }

}
