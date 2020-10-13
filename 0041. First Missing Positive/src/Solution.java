import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int res=-1;
        int[] input = {0,-1,3,1};
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1; i++)
            res = solution.firstMissingPositive(input);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));
    }

    public int firstMissingPositive(int[] nums) {

        Arrays.sort(nums);
/*        int zero = -1;
        for(int i=0; i<nums.length; i++){
            if (nums[i] == 1) zero=i;
        }
        if (zero<0) return 1;
*/

        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int i = nums[start] - 1;
            if (i == start)
                start++;
            else if (i < 0 || i > end || nums[start] == nums[i])
                nums[start] = nums[end--];
            else {
                nums[start] = nums[i];
                nums[i] = i + 1;
            }
        }
        return start + 1;
    }

}
