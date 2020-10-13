import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] arr = {1,-2,1};
        int k = 5;
        int res = solution.kConcatenationMaxSum(arr, k);

    }

    public int kConcatenationMaxSum(int[] arr, int k) {

        int sum = 0;
        for (int num : arr) sum +=num;
        int max = Math.max(sum, sum*k);



        return -1;
    }


}
