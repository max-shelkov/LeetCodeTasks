import java.util.Arrays;


class Solution {

    //done

    public static void main(String[] args) {
//        int[] inputNums = {1,5,2,9};
//        int inputThreshold = 6;
        int[] inputNums = new int[50000];
        for (int i = 0; i < inputNums.length; i++) inputNums[i] = (int) (Math.random()*1000);
        int inputThreshold = 10000;


        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        int res = solution.smallestDivisor(inputNums, inputThreshold);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));

    }

    public int smallestDivisor(int[] nums, int threshold) {

        if (nums == null || nums.length == 0) return 0;
        Arrays.sort(nums);
        int start = 1;
        int finish = nums[nums.length-1];
        while (start<=finish){
            int divisor = start + (finish-start) / 2;
            int sum = 0;
            for (int i = nums.length-1; i >=0 ; i--) {
                sum+=(int) Math.ceil((double) nums[i]/(double) divisor);
                if (sum > threshold){
                    start = divisor+1;
                    break;
                }
            }
            if (sum <= threshold) finish = divisor - 1;
        }
        return start;

    }
}