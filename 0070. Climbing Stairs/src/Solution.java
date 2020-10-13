public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int input = 2;
        long start = System.currentTimeMillis();
        int res = solution.climbStairs(input);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));
    }

    public int climbStairs(int n) {
        if (n==1) return 1;
        int[] ways = new int[n];
        ways[0] = 1;
        ways[1] = 2;
        for (int stair = 2; stair < n; stair++){
            ways[stair] = ways[stair-1]+ways[stair-2];
        }
        return ways[n-1];
    }

}
