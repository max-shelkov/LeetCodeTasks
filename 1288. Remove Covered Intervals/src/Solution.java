public class Solution {
//    done
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[][] input = {{1,4},{3,6},{2,8}};
        int[][] input = {{0,10},{5,12}};
        int res = -1;
        long start = System.currentTimeMillis();
        res = solution.removeCoveredIntervals(input);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time="+(finish-start));

    }

    public int removeCoveredIntervals(int[][] intervals) {
        for (int arrNum = 0; arrNum<intervals.length; arrNum++){
            for (int i = 0; i < intervals.length; i++) {
                if ( i == arrNum) continue;
                if (isCoveredBy(intervals[arrNum], intervals[i])){
                    intervals[arrNum][0] = -1;
                    intervals[arrNum][1] = -1;
                    break;
                }
            }
        }
        int res = 0;
        for (int[] interval: intervals) {
            if (interval[0] >= 0) res++;
        }
        return res;
    }

    private boolean isCoveredBy(int[] arr1, int[] arr2){
        return (arr2[0] <= arr1[0] && arr2[1]>=arr1[1]);
    }

}
