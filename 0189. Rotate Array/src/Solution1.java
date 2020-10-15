import java.util.Arrays;

public class Solution1 {

    //done 100% time solution

    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) return;
        k = k % nums.length;
        int[] temp = Arrays.copyOf(nums, nums.length);
        System.arraycopy(temp, 0, nums, k, temp.length-k);
        System.arraycopy(temp, temp.length-k, nums,0, k);

        System.out.println("k = " + k);
        System.out.print("num = " );
        for (int num:nums) {

            System.out.print(num+" ");
        }
        System.out.print("\ntemp = " );
        for (int num:temp) {

            System.out.print(num+" ");
        }

    }


}
