import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String res = "";
//        int[] input = {3,30,34,5,9};
//        int[] input = {999999998,999999997,999999999};
        int[] input = {0,0};
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1; i++)
            res = solution.largestNumber(input);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));
    }
    public String largestNumber(int[] nums) {
        boolean zeroCheck = true;
        String[] strs = new String[nums.length];
        for (int i=0; i<nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
            if (zeroCheck) zeroCheck = nums[i]==0;
        }
        if (zeroCheck) return "0";

        Arrays.sort(strs, (s1, s2) -> {
            if (s1.equals(s2)) return 0;
            if (Long.parseLong(s1+s2) > Long.parseLong(s2+s1)) return -1;
            else return 1;
        });
        StringBuilder sb = new StringBuilder();
        for (String s: strs) sb.append(s);
        return sb.toString();
    }
}
