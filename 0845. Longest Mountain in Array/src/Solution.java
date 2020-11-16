public class Solution {
    public static void main(String[] args) {
        int[] input = {2,1,4,7,3,2,5,6,7,8,9,10,5,3,2,1,3};
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        int res = solution.longestMountain(input);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));
    }

    public int longestMountain(int[] A) {

        int maxLength = 0;
        for(int i=1; i<A.length-1; i++){

            if(A[i-1]<A[i] && A[i]>A[i+1]){
                int rightPointer = i+1;
                int leftPointer = i-1;
                while(leftPointer>0 && A[leftPointer-1]<A[leftPointer]) leftPointer--;
                while(rightPointer<A.length-1 && A[rightPointer+1]<A[rightPointer]) rightPointer++;
                maxLength = Math.max(maxLength, rightPointer-leftPointer+1);
            }
        }
        return maxLength;

    }

}
