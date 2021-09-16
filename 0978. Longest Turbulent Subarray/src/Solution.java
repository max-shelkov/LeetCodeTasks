public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] input1 = {9,4,2,10,7,8,8,1,9};
        int[] input2 = {4,8,12,16};
        int[] input3 = {100};
        int[] input4 = {2,0,2,4,2,5,0,1,2,3};


        long start = System.currentTimeMillis();
        int res = solution.maxTurbulenceSize(input4);
        long finish = System.currentTimeMillis();

        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));


    }
    public int maxTurbulenceSize(int[] arr) {
        if (arr==null || arr.length == 0) return 0;
        if (arr.length == 1) return 1;
        int res1 = 1, res2 = 1;
        int max1 = 1, max2 = 1;
        for (int k = 0; k < arr.length-1; k++) {
            if ( checkPairCondition1(k, arr) ) {
                res1++;
                max1 = Math.max(max1,res1);
            } else {
                max1 = Math.max(max1,res1);
                res1 = 1;
            }
            System.out.println("pair="+arr[k]+":"+arr[k+1]+" max1 = " + max1);
            if ( checkPairCondition2(k, arr) ) {
                res2++;
                max2 = Math.max(max2,res2);
            } else {
                max2 = Math.max(max2,res2);
                res2 = 1;
            }
            System.out.println("max2 = " + max2);
        }
        
        
        return Math.max(max1,max2);
    }

    private boolean checkPairCondition1(int k, int[] arr){
        return (k % 2 == 1 && arr[k] > arr[k + 1]) || (k % 2 == 0 && arr[k] < arr[k + 1]);
    }

    private boolean checkPairCondition2(int k, int[] arr){
        return ( (k%2==0 && arr[k]>arr[k+1]) || (k%2==1 && arr[k]<arr[k+1]) );
    }


}
