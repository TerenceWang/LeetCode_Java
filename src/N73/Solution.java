package N73;

/**
 * Created by terence on 2/4/17.
 */
public class Solution {
    public void setZeroes(int[][] matrix) {
        boolean setfirstcol=false;
        boolean setfirstrow=false;
        int []col=new int[matrix[0].length];
        int []row=new int[matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            col[i]=matrix[0][i];
            if(matrix[0][i]==0) {
                setfirstrow = true;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            row[i]=matrix[i][0];
            if(matrix[i][0]==0) {
                setfirstcol = true;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==0){
                    row[i]=0;
                    col[j]=0;
                }
            }
        }
        if(setfirstrow){
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i]=0;
            }
        }
        if(setfirstcol){
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0]=0;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if(row[i]==0){
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j]=0;
                }
            }else{
                for (int j = 0; j < matrix[0].length; j++) {
                    if(col[j]==0)
                        matrix[i][j]=0;
                }
            }
        }
    }
}
