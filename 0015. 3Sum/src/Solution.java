import java.util.*;
//done
public class Solution {
    public static void main(String[] args) {

        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        List<List<Integer>> result = solution.threeSum(new int[] {46,-44,74,79,-86,-4,-60,-6,79,-98,61,-50,-67,74,-92,-92,85,-16,96,-16,-43,24,48,42,87,-45,72,27,40,50,-31,-44,63,-29,85,43,-27,6,14,-14,75,-87,29,-30,-84,28,32,-3,1,-63,-7,55,-14,6,80,-26,2,98,-8,13,-70,16,77,1,-100,-39,34,-38,-20,29,-23,-30,30,-56,-26,-65,-8,8,30,89,74,-16,78,30,-62,26,-99,-47,-5,-18,-99,-66,-88,-72,41,57,26,-8,-30,-8,82,18,-22,82,-91,-41,-99,-57,-46,52,-60,-16,-52,62,-22});
        long finish = System.currentTimeMillis();
        System.out.println("result = " + result);
        System.out.println("result.size = " + result.size());
        System.out.println("time = " + (finish-start));

    }


    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int pointerLeft = i + 1;
            int pointerRight = nums.length - 1;

            while (pointerLeft < pointerRight) {
                if (nums[i] + nums[pointerLeft] + nums[pointerRight] == 0) {
                    res.add(Arrays.asList(nums[i], nums[pointerLeft], nums[pointerRight]));
                    pointerLeft++;

                    while (pointerLeft < pointerRight && nums[pointerLeft] == nums[pointerLeft - 1]) {
                        pointerLeft++;
                    }
                } else if (nums[i] + nums[pointerLeft] + nums[pointerRight] < 0) {
                    pointerLeft++;
                } else {
                    pointerRight--;
                }
            }
        }
        return res;
    }

}