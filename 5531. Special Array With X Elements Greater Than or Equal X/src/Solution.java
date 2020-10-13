public class Solution {
    // 04.09.2020 Weekly Contest 209
    public static void main(String[] args) {
//        int[] nums = {3,5};
//        int[] nums = {0,0};
//        int[] nums = {0,4,3,0,4};
        int[] nums = {3,6,7,7,0};
        Solution solution = new Solution();
        int res = solution.specialArray(nums);
        System.out.println("res="+res);
    }

    public int specialArray(int[] nums) {
        int res = -1;
        for (int xVariant = 0; xVariant<= nums.length; xVariant++){
            int counter = 0;
            for (int x=0; x<nums.length; x++){
                if (nums[x]>=xVariant) counter++;
            }
            if (counter == xVariant) return xVariant;
        }
        return -1;
    }

}
