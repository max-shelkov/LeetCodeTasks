public class Solution {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int res = -1;
        int[] input = {1,4};
        int duration = 2;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1; i++)
            res = solution.findPoisonedDuration(input, duration);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));

    }

    public int findPoisonedDuration(int[] timeSeries, int duration) {

        if (timeSeries.length == 0 || duration ==0) return 0;
        int poisonedStart = -1;
        int poisonedFinish = -1;
        int poisonedTime = 0;

        for (int shoot : timeSeries) {
            if (shoot > poisonedFinish) {
                poisonedTime += duration;
            } else {
                poisonedTime += duration - (poisonedFinish - shoot + 1);
            }
            poisonedStart = shoot;
            poisonedFinish = poisonedStart + duration - 1;
        }

        return poisonedTime;
    }

}
