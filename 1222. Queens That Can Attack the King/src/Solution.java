import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> res = null;
//        int[][] inputQ = {{0,1},{1,0},{4,0},{0,4},{3,3},{2,4}};
//        int[] inputK = {0,0};
//        int[][] inputQ = {{0,0},{1,1},{2,2},{3,4},{3,5},{4,4},{4,5}};
//        int[] inputK = {3,3};
        int[][] inputQ = {{5,6},{7,7},{2,1},{0,7},{1,6},{5,1},{3,7},{0,3},{4,0},{1,2},{6,3},{5,0},{0,4},{2,2},{1,1},{6,4},{5,4},{0,0},{2,6},{4,5},{5,2},{1,4},{7,5},{2,3},{0,5},{4,2},{1,0},{2,7},{0,1},{4,6},{6,1},{0,6},{4,3},{1,7}};
        int[] inputK = {3,4};
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++)
            res = solution.queensAttacktheKing(inputQ, inputK);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));

    }

    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        char[][] chessboard = new char[8][8];
        for (int y=0; y<chessboard.length; y++){
            for (int x=0; x<chessboard[y].length; x++) {
                chessboard[x][y] = '-';
            }
        }
        chessboard[king[0]][king[1]] = 'K';
        for (int[] piece: queens) {
            chessboard[piece[0]][piece[1]] = 'Q';
        }


        for (int direction = 0; direction<8; direction++){
            int[] q = check(chessboard, king[0], king[1], direction);
            if (q!=null){
                ArrayList<Integer> item = new ArrayList<>();
                item.add(q[0]);
                item.add(q[1]);
                res.add(item);
            }
        }
        return res;
    }

    private int[] check(char[][] board, int x, int y, int d){
        if (x < 0 || y < 0
                || x >= board.length || y >= board.length) return null;

        if (board[x][y] == 'Q') return new int[] {x,y};

        if (d == 2) return check(board, x,y+1, d);
        if (d == 4) return check(board, x,y-1, d);
        if (d == 0) return check(board, x+1,y, d);
        if (d == 6) return check(board, x-1,y, d);

        if (d == 5) return check(board, x-1,y-1, d);
        if (d == 7) return check(board, x-1,y+1, d);
        if (d == 1) return check(board, x+1,y+1, d);
        if (d == 3) return check(board, x+1,y-1, d);
        return null;
    }
}
