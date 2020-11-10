import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
/*
        int[][] input = {
                {1,1,0},
                {1,0,1},
                {0,0,0}};
*/
        int[][] input = {{1}};
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        int[][] res = solution.flipAndInvertImage(input);
        long finish = System.currentTimeMillis();
                System.out.println("res = ");
        for (int[] row:res) {
            for (int num: row) {
                System.out.print(" "+num);
            }
            System.out.println();
        }

        System.out.println("time = " + (finish - start));
    }

    public int[][] flipAndInvertImage(int[][] A) {


        for (int row = 0; row < A.length; row++) {
            for (int num = 0; num < A[row].length / 2; num++) {
                int tmp = A[row][num];
                A[row][num] = A[row][A.length - num - 1];
                A[row][A.length - num - 1] = tmp;
            }
        }
        for (int row = 0; row < A.length; row++) {
            for (int num = 0; num < A[row].length; num++) {
                A[row][num] =  (A[row][num] == 0) ? 1 : 0;
            }
        }



        return A;
    }


}
