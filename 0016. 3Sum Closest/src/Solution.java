// done
public class Solution {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums = {-1,2,1,-4};
        int target = 1;
        long start = System.currentTimeMillis();
        int res = solution.threeSumClosest(nums, target);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));

    }

    public int threeSumClosest(int[] nums, int target) {
        if (nums==null || nums.length < 3) return 0;
        int dMin = Integer.MAX_VALUE;
        int d;
        int sum =0;
        int tempSum;
        for (int p1 = 0; p1 < nums.length-2; p1++) {
            for (int p2 = p1+1; p2 < nums.length -1; p2++) {
                for (int p3 = p2+1; p3 < nums.length; p3++) {
                    tempSum = nums[p1] + nums[p2] + nums[p3];
                    d = Math.abs(target-tempSum);
                    if (d < dMin ){
                        dMin = d;
                        sum = tempSum;
                    }
                }

            }
            
        }
        return sum;
    }
}