public class Solution {
    public static void main(String[] args) {

        Solution solution = new Solution();
        String input1 = "00000010";
        long start = System.currentTimeMillis();
        int res = solution.minFlipsMonoIncr(input1);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));

    }


    public int minFlipsMonoIncr(String s) {
        int flips = 0, ones = 0;

        int zerosPrefixSize = s.indexOf('1');
        if (zerosPrefixSize < 0) return 0;

        for (int i = zerosPrefixSize; i < s.length(); i++) {
            if (s.charAt(i) == '0') flips++;
            else ones++;
            if (flips > ones)  flips = ones;
        }
        return flips;
    }














}