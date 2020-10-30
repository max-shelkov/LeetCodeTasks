import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] input = {2,8,3,4,5};
        long start = System.currentTimeMillis();
        int res = solution.findNumberOfLIS(input);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));
    }


    public int findNumberOfLIS(int[] nums) {

        if (nums==null || nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int lis = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            lis = Math.max(lis, dp[i]);
        }

        int count = 0;
        for (int i=0; i<nums.length; i++){
            count+=counter(nums, lis, i, dp, new HashMap<>());
        }

        return count;
    }

    private int counter(int[] a, int l, int i, int[] dp, Map<String, Integer> map) {
        if(l == 1) return 1;
        String key = new StringBuilder(l).append(":").append(i).toString();
        if(map.containsKey(key)) return map.get(key);
        int count = 0;
        for (int j = 0; j < i; j++)
            if (a[i] > a[j] && dp[j] == l - 1)
                count += counter(a, l-1, j, dp, map);
        map.put(key, count);
        return map.get(key);
    }

}
