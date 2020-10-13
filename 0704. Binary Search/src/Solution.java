public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] input = {-1,1,2};
        int target  = 1;
        long start = System.currentTimeMillis();
        int res = solution.search(input, target);
        long finish = System.currentTimeMillis();
        System.out.println("time = " + (finish-start));
        System.out.println("res = " + res);

    }

    public int search(int[] nums, int target) {
        int minPointer = 0;
        int maxPointer = nums.length-1;
        int pointer;
        do {
            pointer = minPointer + (maxPointer-minPointer)/2;
            if (nums[pointer] == target) return pointer;
            if (nums[pointer] > target) {
                maxPointer = pointer;
            } else {
                minPointer = pointer;
            }
            if (maxPointer-minPointer<=1) {
                if (nums[maxPointer] == target) return maxPointer;
                if (nums[minPointer] == target) return minPointer;
                return -1;
            }
        } while (true);
    }



}
