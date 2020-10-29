public class Solution {
    public static void main(String[] args) {

        //done

        Solution solution = new Solution();
        int[] input = {1,0,0,0,0,1,0,0,1,0};
//        int[] input = {1,0,0,0};
//        int[] input = {1,0,0,0,1,0,1};
//        int[] input = {};
        int res = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            res = solution.maxDistToClosest(input);
        }

        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time  = " + (finish - start));
    }

    public int maxDistToClosest(int[] seats) {
        if (seats == null || seats.length == 0) return 0;
        int counter = 0;
        int edge = -1;
        int middle = -1;
/*
        int index = 0;
        do {
            if (seats[index] == 0) counter++;
            else {
                if (edge<0) edge = counter;
                else middle = Math.max(middle,counter);
                counter = 0;
            }
            index++;
        }while (index < seats.length);
*/
        for (int seat :
                seats) {
            if (seat == 0) counter++;
            else {
                if (edge<0) edge = counter;
                else middle = Math.max(middle,counter);
                counter = 0;
            }
        }

        edge = Math.max(edge, counter);
        return Math.max(edge, (middle+1)/2);
    }

}
