public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, -2, 3, -2};
        long start = System.currentTimeMillis();
        int res = solution.maxSubarraySumCircular(nums);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));
    }


    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int tempMax = 0;
        int tempMin = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            tempMax += nums[i];
            tempMin += nums[i];
            max = Math.max(max, tempMax);
            min = Math.min(min, tempMin);
            if (tempMax < 0) tempMax = 0;
            if (tempMin > 0) tempMin = 0;
        }
        return (min == sum) ?  max : Math.max(max, sum-min);

    }

}