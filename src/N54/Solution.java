package N54;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by terence on 1/31/17.
 */
public class Solution {
    public static void main(String[] args){
        int [][]a={{1,2,3},{4,5,6},{7,8,9}};
        new Solution().spiralOrder(a);
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        List<Integer> s = new ArrayList<>();
        if(m==0){
            return s;
        }
        int n=matrix[0].length;
        List<Integer> res = printspiral(matrix,m,n,s);
        return res;
    }
    public List<Integer> printspiral(int[][] matrix,int a, int b,List<Integer> s){
        if(a<1||b<1){
            return new ArrayList<>(s);
        }
        if(a==1){
            int row=(matrix.length-a)/2;
            for (int i = (matrix[0].length-b)/2; i < (matrix[0].length+b)/2; i++) {
                s.add(matrix[row][i]);
            }
            return new ArrayList<>(s);
        }else if(b==1){
            int col=(matrix[0].length-b)/2;
            for (int i = (matrix.length-a)/2; i < (matrix.length+a)/2; i++) {
                s.add(matrix[i][col]);
            }
            return new ArrayList<>(s);
        }
        int row_s = (matrix.length-a)/2;
        int row_e = (matrix.length+a)/2-1;
        int col_s = (matrix[0].length-b)/2;
        int col_e = (matrix[0].length+b)/2-1;
        for(int i=col_s;i<col_e;i++){
            s.add(matrix[row_s][i]);
        }
        for(int i=row_s;i<row_e;i++){
            s.add(matrix[i][col_e]);
        }
        for(int i=col_e;i>col_s;i--){
            s.add(matrix[row_e][i]);
        }
        for(int i=row_e;i>row_s;i--){
            s.add(matrix[i][col_s]);
        }
        return printspiral(matrix,a-2,b-2,s);
    }
}
