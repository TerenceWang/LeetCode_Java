package N130;

import java.util.Stack;

public class Solution {
    public static int [][]alive;
    public class Point{
        public int x;
        public int y;
        Point(int xx, int yy){
            x = xx;
            y = yy;
        }
    }
    public void dfs(char[][] board, int y, int x){
        Stack<Point> s = new Stack<>();
        s.push(new Point(x,y));

        int size_x = board[0].length;
        int size_y = board.length;
        while (!s.isEmpty()){
            Point p = s.pop();
            alive[p.y][p.x] = 1;
            if(alive[Math.max(p.y-1,0)][p.x]==0&&
                    board[Math.max(p.y-1,0)][p.x]=='O'){
                s.push(new Point(p.x,Math.max(p.y-1,0)));
            }
            if(alive[Math.min(p.y+1,size_y-1)][p.x]==0&&
                    board[Math.min(p.y+1,size_y-1)][p.x]=='O'){
                s.push(new Point(p.x,Math.min(p.y+1,size_y-1)));
            }
            if(alive[p.y][Math.max(0,p.x-1)]==0&&
                    board[p.y][Math.max(0,p.x-1)]=='O'){
                s.push(new Point(Math.max(0,p.x-1),p.y));
            }
            if(alive[p.y][Math.min(size_x-1,p.x+1)]==0&&
                    board[p.y][Math.min(size_x-1,p.x+1)]=='O'){
                s.push(new Point(Math.min(size_x-1,p.x+1),p.y));
            }
        }
    }
    public void solve(char[][] board) {
        int size_y = board.length;
        if(size_y==0){
            return;
        }
        int size_x = board[0].length;
        alive = new int[size_y][size_x];
        for (int i = 0; i < size_x; i++) {
            if(board[0][i]=='X'){
                alive[0][i] = 2;
            }else if(board[0][i]=='O'&&alive[0][i]==0) {
                dfs(board, 0, i);
            }
            if(board[size_y-1][i]=='X'){
                alive[size_y-1][i] = 2;
            }else if(board[size_y-1][i]=='O'&&alive[size_y-1][i]==0) {
                dfs(board, size_y-1, i);
            }
        }
        for (int i = 0; i < size_y; i++) {
            if(board[i][0]=='X'){
                alive[i][0] = 2;
            }else if(board[i][0]=='O'&&alive[i][0]==0) {
                dfs(board, i, 0);
            }
            if(board[i][size_x-1]=='X'){
                alive[i][size_x-1] = 2;
            }else if(board[i][size_x-1]=='O'&&alive[i][size_x-1]==0) {
                dfs(board, i, size_x-1);
            }
        }

        for (int i = 0; i < size_y; i++) {
            for (int j = 0; j < size_x; j++) {
                if(alive[i][j]==1){
                    board[i][j] = 'O';
                }else {
                    board[i][j] = 'X';
                }
            }

        }
    }
}
