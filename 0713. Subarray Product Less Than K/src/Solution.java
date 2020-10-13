public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int res = -1;
//        int[] inputNums = {10, 5, 2, 6};
        int[] inputNums = new int[50000];
        for (int num=0; num < inputNums.length; num++) {
            inputNums[num] = 1+ (int) (Math.random()*3);
            inputNums[num] = 1;
        }
        int inputK = 100;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1; i++)
            res = solution.numSubarrayProductLessThanK(inputNums, inputK);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));
    }
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if (k <= 1) return 0;
        int res = 0;
        int leftPointer = 0;
        int rightPointer = 0;
        int prod = 1;
        while (rightPointer < nums.length) {
            prod *= nums[rightPointer];
            while (prod >= k) prod /= nums[leftPointer++];
            res += 1 + (rightPointer - leftPointer);
            rightPointer++;
        }
        return res;
    }


/*
    public int numSubarrayProductLessThanK(int[] nums, int k) {
    // time limit exceeded
        int res = 0;
        for (int i = 0; i < nums.length; i++){
            int subProd = 1;
            for (int j = i; j < nums.length; j++){
                subProd *= nums[j];
//                System.out.println("i="+i+" j="+j+" subProd="+subProd);
                if (subProd < k) {
                    res++;
                } else {
                    break;
                }

            }
        }
        return res;
    }
*/

}
