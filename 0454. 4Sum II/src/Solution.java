import java.util.HashMap;
import java.util.Map;

public class Solution {

    //done

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] inputA = {-10,-3,-10,-4,-7,-7,8,9,4,-8,-8,-4,-6,-4,1,-2,-9,9,-9,-1,1,8,3,1,-10,-10,8,0,-2,7,-7,6,1,8,-8,9,6,7,8,-3,3,-2,-7,-8,-2,-4,-10,-6,-6,-3};
        int[] inputB = {-9,-1,-3,0,-7,5,2,-2,-2,-4,-4,2,7,6,3,-8,10,-5,-3,5,-5,1,-10,-7,10,-7,-4,-9,-1,2,8,0,-8,-7,-9,-7,-6,-9,-4,10,-6,8,0,-9,-3,3,4,-7,1,-6};
        int[] inputC = {-1,-5,-9,6,-1,-7,6,-1,6,9,-10,0,-4,10,-3,-4,-3,-9,3,9,5,-5,-9,4,1,-6,10,9,-5,9,1,3,-2,7,1,7,7,3,1,8,2,1,3,6,2,8,2,-2,-10,6};
        int[] inputD = {5,-1,-9,-1,1,-7,-4,4,-10,-7,-2,4,2,4,-3,4,0,-5,9,-6,-5,-1,-3,3,-5,-1,-2,9,-3,10,-3,-8,-2,0,10,-8,7,-6,7,7,-4,1,9,9,5,7,-6,4,4,10};
/*
        int[] inputA = {1,2};
        int[] inputB = {-2,-1};
        int[] inputC = {-1,2};
        int[] inputD = {0,2};
*/
        int res = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1; i++) {
            res = solution.fourSumCount(inputA, inputB, inputC, inputD);
        }
            long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time  = " + (finish - start));
    }

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        if (A.length == 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int a : A) {
            for (int b: B) {
                int ab = a+b;
                map.put(ab, map.getOrDefault(ab, 0) +1);
            }
        }
        for (int c : C) {
            for (int d : D) {
                int cd = c+d;
                res+= map.getOrDefault(-cd, 0);
            }
        }
        return res;
/*
        int counter = 0;
        int ab;
        int abc;
        for (int a : A) {
            for (int b : B) {
                ab = a+b;
                for (int c : C) {
                    abc = ab+c;
                    for (int d : D) {
                        if (abc+d == 0) ++counter;
                    }
                }
            }
        }

        return counter;
*/

    }

}
