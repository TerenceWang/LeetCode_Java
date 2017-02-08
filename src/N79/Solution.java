package N79;

/**
 * Created by terence on 2/8/17.
 */
public class Solution {
    public boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0)
            return false;
        if(word.length() == 0)
            return true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                boolean res = solver(board,word,i,j,0);
                if(res)
                    return true;
            }
        }
        return false;
    }
    public boolean solver(char[][] board, String word,int i,int j,int depth){
        if(depth==word.length()){
            return true;
        }
        if(i<0||i>board.length-1||j<0||j>board[0].length-1||board[i][j]!=word.charAt(depth)){
            return false;
        }
        board[i][j] = '#';
        boolean rst = solver(board,word, i-1, j,  depth+1)
                || solver(board, word, i, j-1, depth+1)
                || solver(board, word, i+1, j, depth+1)
                || solver(board, word, i, j+1, depth+1);
        board[i][j] = word.charAt(depth);
        return rst;
    }
}
