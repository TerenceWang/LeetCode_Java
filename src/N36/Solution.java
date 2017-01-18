package N36;

/**
 * Created by terence on 1/18/17.
 */
public class Solution {
    public static void main(String args[]) {
        Solution s = new Solution();
        String b[]={".........","......3..","...18....","...7.....","....1.97.",".........","...36.1..",".........",".......2."};
        char board[][]=new char[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++)
                board[i][j]=b[i].charAt(j);
        }
        System.out.println(s.isValidSudoku(board));

    }
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean t=check(board[i]);
            if(!t) return false;
            char temp[]=new char[9];
            for (int j = 0; j < 9; j++) {
                temp[j]=board[j][i];
            }
            t=check(temp);
            if(!t) return false;
            for (int j = 0;j<9;j++){
                temp[j]=board[3*(i/3)+j/3][3*(i%3)+j%3];

            }
            t=check(temp);
            if(!t) {
                return false;}
        }

        return true;
    }
    public boolean check(char[] s){
        boolean []used=new boolean[9];
        for (int i = 0 ;i < 9; i++) used[i]=false;
        for (int i = 0; i < 9; i++) {
            if(s[i]=='.') continue;
            else if(!used[s[i]-'1']) used[s[i]-'1']=true;
            else return false;
        }
        return true;
    }
}
