public class Solution {
    public static void main(String[] args) {
        int[] input = {2,5,6,0,0,1,2};
        int target = 0;
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        boolean res = solution.search(input, target);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));

    }

    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0 ) return false;

        int min = 0;
        int max = nums.length - 1;
        int mid;
        while (min <= max) {
            mid = min + (max - min) / 2;
            if (nums[mid] == target) return true;
            else if (nums[mid] > nums[min]) {
                if (target >= nums[min] && target < nums[mid])
                    max = mid - 1;
                else
                    min = mid + 1;
            } else if (nums[mid] < nums[min]) {
                if (target > nums[mid] && target <= nums[max])
                    min = mid + 1;
                else
                    max = mid - 1;
            } else {
                min++;
            }
        }
        return false;
    }

}
