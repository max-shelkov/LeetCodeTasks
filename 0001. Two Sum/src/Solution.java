import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] input = {2,7,11,15};
        int target = 9;
        long start = System.currentTimeMillis();
        int[] res = solution.twoSum(input, target);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + Arrays.toString(res));
        System.out.println("time = " + (finish - start));

    }

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int x = target - nums[i];
                if (nums[j] == x) return new int[] {i, j};
            }
        }
        return null;
    }


}
