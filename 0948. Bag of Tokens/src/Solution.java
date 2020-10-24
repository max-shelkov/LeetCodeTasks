import java.util.Arrays;

public class Solution {

    //works but too long

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int[] inputTokens = {52,65,35,88,28,1,4,68,56,95};
        int inputP = 94;
//        int[] inputTokens = {100,200,300,400};
//        int inputP = 200;
        long start = System.currentTimeMillis();
        int res = solution.bagOfTokensScore(inputTokens, inputP);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));
    }

    private int maxScore = 0;
    public int bagOfTokensScore(int[] tokens, int P) {
        check(tokens, P, 0);
        return maxScore;
    }

    private void check(int[] tokens, int power, int score){
        maxScore = Math.max(maxScore, score);
        int[] copyArr = null;
        for (int i = 0; i < tokens.length; i++) {
            if (power >= tokens[i] && tokens[i] >= 0) {
                copyArr = Arrays.copyOf(tokens, tokens.length);
                copyArr[i] = -1;
                check(copyArr, power-tokens[i], score+1);
            }
            if (score >= 1 && tokens[i] >= 0){
                if (copyArr == null) {
                    copyArr = Arrays.copyOf(tokens, tokens.length);
                    copyArr[i] = -1;
                }
                check(copyArr, power+tokens[i], score-1);
            }
        }
    }

    private boolean checkArray(int[] arr){
        for (int n: arr) {
            if (n >= 0) return true;
        }
        return false;
    }

}
