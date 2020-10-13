import java.util.AbstractMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int res = -1;
        int[] inputNums = {3,1,4,1,5,3};
        int inputK = 2;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++)
            res = solution.findPairs(inputNums, inputK);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));
    }

    public int findPairs(int[] nums, int k) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i <nums.length; i++){
            for (int j = i+1; j<nums.length; j++){
                int a = Math.min(nums[i],nums[j]);
                int b = Math.max(nums[i],nums[j]);
                if (b-a==k) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(a).append(":").append(b);
                    set.add(sb.toString());
                }
            }
        }
        return set.size();
    }

}
