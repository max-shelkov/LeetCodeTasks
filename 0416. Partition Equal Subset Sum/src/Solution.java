import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7};
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        boolean res = solution.canPartition(input);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));


    }

/*

    */
/* Top down dp. Caching. We have stored the calculated results in a map.  TC - O(numberof elements ^ target) *//*

    Map<String, Boolean> map= new HashMap<>();
    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        return sum%2==1?false: helper(nums, sum/2, 0);
    }
    public boolean helper(int[] nums, int target, int currIndex){
        if(target == 0) return true;
        if(target< 0) return false;
        if(currIndex>=nums.length) return false;
        String key = target+" "+ currIndex;
        if(!map.containsKey(key)){
            map.put(key, helper(nums, target-nums[currIndex], currIndex+1) || helper(nums, target, currIndex+1));
        }
        return map.get(key);
    }
*/

    Map<String, Boolean> map= new HashMap<>();
    public boolean canPartition(int[] nums) {
        if (nums == null) return false;
        int sum = 0;
        for (int n: nums) sum += n;
        if (sum % 2 != 0) return false;
        int subSum = sum / 2;
        return calculate(nums, subSum, 0);
    }

    public boolean calculate(int[] nums, int target, int currIndex){
        if(target == 0) return true;
        if(target< 0 || currIndex>=nums.length) return false;
        String key = new StringBuilder().append(target).append(" ").append(currIndex).toString();
        if(!map.containsKey(key)){
            map.put(key, calculate(nums, target-nums[currIndex], currIndex+1) || calculate(nums, target, currIndex+1));
        }
        return map.get(key);
    }



}
