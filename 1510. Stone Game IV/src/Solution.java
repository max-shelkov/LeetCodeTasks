import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int inputN = 3;
        int inputN = 2342;
        long start = System.currentTimeMillis();
        boolean res = solution.winnerSquareGame(inputN);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("Time = " + (finish - start));
    }

    public boolean winnerSquareGame(int n) {

        if (n == 1) return true;
        boolean[] dp = new boolean[n+1];

        for (int i=0; i<=n; i++) {

            for (int num=1; num*num<=i; num++) {
                if (!dp[i - num * num]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];


/*        if (n == 1) return true;
        int num = 1;
        List<Integer> squares = new ArrayList<>();
        int square = 1;
        while (square <= n){
            if (square == n) return true;
            squares.add(square);
            ++num;
            square = num * num;
        }
        return dynamic(squares, n, true);
*/
    }

/*    private boolean dynamic(List<Integer> squares, int n, boolean aliceTurn){
        System.out.println("n = " + (n)+ " alice = "+aliceTurn );
        if (n < 0)
            return false;
        if (aliceTurn && squares.contains(n)) return true;
        for (int square :squares) {

            dynamic(squares, n-square, !aliceTurn);
        }
        return false;
    }
*/
}
