import java.util.HashMap;
import java.util.Map;

public class Solution {

    //done

    public static void main(String[] args) {
        Solution solution = new Solution();

        long start = System.currentTimeMillis();
        int res = solution.minDominoRotations(Input.inputA, Input.inputB);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start) + "ms");


    }
    public int minDominoRotations(int[] A, int[] B) {
        if (A.length == 0 || A.length != B.length) return -1;
        int a = 0;
        int b = 0;
        int variant = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
            if (B[i] != A[i]) {
                map.put(B[i], map.getOrDefault(B[i], 0) + 1);
            }

            if (map.get(A[i]) == A.length) variant = A[i];
            if (map.get(B[i]) == A.length) variant = B[i];
        }
        if (variant < 0) return -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != variant) a++;
            if (B[i] != variant) b++;
        }
        return Math.min(a, b);
    }

}
