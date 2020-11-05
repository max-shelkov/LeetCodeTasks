public class Solution {

    public static void main(String[] args) {

        int[] input = {1,2,3};
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        int res = solution.minCostToMoveChips(input);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));

    }


    public int minCostToMoveChips(int[] position) {
        int odd = 0;
        int pos = 0;
        for (int chips : position) {
            if (chips % 2 == 0) {
                pos++;
            } else {
                odd++;
            }
        }
        return Math.min(odd,pos);
    }


}
