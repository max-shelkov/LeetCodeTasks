import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        int[][] input = {
                {-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1},
                {-1,35,-1,-1,13,-1},
                {-1,-1,-1,-1,-1,-1},
                {-1,15,-1,-1,-1,-1}};

        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        int res = solution.snakesAndLadders(input);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));
    }

    public int snakesAndLadders(int[][] board) {
        if (board == null || board.length == 0) return -1;
        int n = board.length;

        int[] moves = new int[n * n + 1];
//        how many moves we need to reach each square
        Arrays.fill(moves, Integer.MAX_VALUE);
        moves[1] = 0;

        dfs(1, moves, board);
        return moves[n * n] == Integer.MAX_VALUE? -1 : moves[n * n];
    }
    private int snakeOrLadder(int pointer, int[][] board) {
        int n = board.length;
        int row = (pointer - 1) / n;
        int x = n - 1 - row;
        int y = row % 2 == 0 ? pointer - 1 - row * n : n + row * n - pointer;
        return board[x][y];
    }
    private void dfs(int pointer, int[] moves, int[][] board) {
        int n = board.length;
        for (int i = 1; i <= 6; ++i) {
            int next = pointer + i;
            if (next > n * n) {
                continue;
            }

            int snake = snakeOrLadder(next, board);
            if (snake != -1) {
                if (moves[snake] > moves[pointer] + 1) {
                    moves[snake] = moves[pointer] + 1;
                    dfs(snake, moves, board);
                }
            } else {
                if (moves[pointer] + 1 < moves[next]) {
                    moves[next] = moves[pointer] + 1;
                    dfs(next, moves, board);
                }
            }
        }
    }



}