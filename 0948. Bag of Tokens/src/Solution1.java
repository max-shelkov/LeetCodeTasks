import java.util.Arrays;

public class Solution1 {

    //done

    public int bagOfTokensScore(int[] tokens, int P){
        if (tokens.length == 0) return 0;
        Arrays.sort(tokens);
        if (P < tokens[0]) return 0;
        int maxScore = 0;
        int currentScore = 0;
        int leftPointer = 0, rightPointer = tokens.length - 1;
        while (leftPointer <= rightPointer) {
            while (leftPointer <= rightPointer && tokens[leftPointer] <= P) {
                P -= tokens[leftPointer];
                currentScore++;
                maxScore = Math.max(maxScore, currentScore);
                leftPointer++;
            }
            while (leftPointer <= rightPointer && currentScore > 0 && tokens[leftPointer] > P) {
                P += tokens[rightPointer];
                currentScore--;
                rightPointer--;
            }
        }
        return maxScore;
    }

}
