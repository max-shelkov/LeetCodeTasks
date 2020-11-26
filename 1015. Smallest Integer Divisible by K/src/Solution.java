public class Solution {
    public static void main(String[] args) {
        int input = 1;
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        int res = solution.smallestRepunitDivByK(input);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));

    }

    public int smallestRepunitDivByK(int K) {
        if (K % 2 == 0 || K % 5 == 0) return -1;

        int counter = 0;
        int num = 0;

        while (num <= K) {
            num = (num * 10 + 1) % K;
            counter++;
            if (num == 0) return counter;
        }
        return -1;
    }


}
