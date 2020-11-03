public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String input = "cc";
        long start = System.currentTimeMillis();
        int res = solution.maxPower(input);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));
    }

    public int maxPower(String s) {
        if (s==null || s.isEmpty()) return 0;
        char c = 0;
        short counter = 0;
        short max = 1;
        for (char ch: s.toCharArray()) {
            if (c == 0) {
                c = ch;
                counter++;
                continue;
            }
            if (c==ch){
                counter++;
                max = (short) Math.max(max, counter);
            } else {
                max = (short) Math.max(max, counter);
                counter = 1;
                c = ch;
            }

        }
        return max;
    }

}
