public class Solution {

    //done

    public static void main(String[] args) {
        int[] input = {2,3,2};
//        int[] input = {1,2,3,1};
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        int res = solution.rob(input);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));
    }

    public int rob(int[] nums) {
        if (nums == null || nums.length==0) return 0;
        if (nums.length == 1) return nums[0];
        return Math.max(robHouse(nums, 0, nums.length-2), robHouse(nums, 1, nums.length-1));
    }

    private int robHouse(int[] nums, int left, int right){
        if (right == left) return nums[left];
        int previousHouse = nums[left];
        int currentHouse = Math.max(nums[left], nums[left+1]);
        for (int houseNum = left+2; houseNum <= right; houseNum++){
            int temp = previousHouse;
            currentHouse = Math.max(previousHouse = currentHouse, temp+nums[houseNum]);
        }
        return currentHouse;
    }
}
