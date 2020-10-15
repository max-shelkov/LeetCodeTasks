import java.util.Arrays;

public class Solution {

    //done but was not submitted

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int[] input = { 1,2,3,4,5,6,7   };
        int k = 3;
        solution.rotate(input, k);

    }

    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) return;
        int[] temp = Arrays.copyOf(nums, nums.length);
        k = k % nums.length;
        int pointer;
        for (int i = 0; i < temp.length; i++) {
            pointer = ((i+k) <= temp.length-1) ? i+k  : (i+k) - (temp.length);
            nums[pointer] = temp[i];
        }

        for (int num:nums) {
            System.out.println("num = " + num);
        }

    }

}
