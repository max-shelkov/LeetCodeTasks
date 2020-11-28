import java.util.Arrays;
import java.util.Collections;

public class Solution {

    //done

    public static void main(String[] args) {
        int[] input = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        int[] res = solution.maxSlidingWindow(input, k);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        for (int n: res) {
            System.out.print(" "+n);

        }
        System.out.println();
        System.out.println("time = " + (finish - start));

    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int left = 0;
        int right = k-1;
        int[] res = new int[nums.length-k+1];
        res[0] = getMax(nums, left, right);
        left++;
        right++;
        for (int i = 1; i<nums.length-k+1; i++){
            if (nums[left-1] == res[i-1]) {
                res[i] = getMax(nums, left, right);
            }else {
                res[i] = Math.max(nums[right], res[i - 1]);
            }
            left++;
            right++;
        }
        return res;
    }

    private int getMax(int[] nums, int s, int f){
        int res = Integer.MIN_VALUE;
        for (int i = s; i<=f; i++) {
            res = Math.max(res, nums[i]);
        }
        return res;
    }
}
