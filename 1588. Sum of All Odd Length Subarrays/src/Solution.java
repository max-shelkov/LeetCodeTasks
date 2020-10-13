public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int res = -1;
        int[] input = {1,4,2,5,3};
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++)
            res = solution.sumOddLengthSubarrays(input);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));
    }

    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int p1 = 0; p1<arr.length; p1++){
            int subSum = 0;
            for (int p2 = p1; p2<arr.length; p2+=2){
                subSum = (p1==p2)? arr[p1] : subSum + (arr[p2-1] +arr[p2]);
                sum += subSum;
            }
        }
        return sum;
    }

}
