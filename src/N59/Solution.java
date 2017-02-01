package N59;

/**
 * Created by terence on 2/1/17.
 */
public class Solution {
    public int[][] generateMatrix(int n) {
        int [][] res= new int[n][n];
        int x=0;
        int y=0;
        int count=1;
        while(n>0){
            if(n==1){
                res[y][x]=count;
            }
            for (int i = 0; i < n-1; i++) {
                res[y][x+i]=count++;
            }
            for (int i = 0; i < n-1; i++) {
                res[y+i][x+n-1]=count++;
            }
            for (int i = 0; i < n-1; i++) {
                res[y+n-1][x+n-1-i]=count++;
            }
            for (int i = 0; i < n-1; i++) {
                res[y+n-1-i][x]=count++;
            }
            x++;
            y++;
            n=n-2;

        }
        return res;
    }
}
