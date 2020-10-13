import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[][] inputTrips = {{2,1,5},{3,3,7}};
//        int inputCapacity = 4;
//        int[][] inputTrips = {{3,2,7},{3,7,9},{8,3,9}};
//        int inputCapacity = 11;
        int[][] inputTrips = {};
        int inputCapacity = 11;
        long start = System.currentTimeMillis();
        boolean res = solution.carPooling(inputTrips, inputCapacity);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));
    }


    public boolean carPooling(int[][] trips, int capacity) {



        Arrays.sort(trips, (item1, item2) -> {
            if (item1[1]<item2[1]) {
                return -1;
            } else {
                if (item1[1] == item2[1]) return 0;
            } return 1;

        });
        
        int start = Integer.MAX_VALUE;
        int finish = Integer.MIN_VALUE;
        for (int[] trip: trips) {
            start = Math.min(start, trip[1]);
            finish = Math.max(finish, trip[2]);
        }

        int occupied = 0;

        for (int location = start; location <= finish; location++){
            for (int[] trip : trips) {
                if (trip[1]>location && trip[2]>location) break;
                if (trip[2] == location) occupied -= trip[0];
                if (trip[1] == location) occupied += trip[0];
                if (occupied > capacity) return false;
            }
        }

        return true;
    }

}
