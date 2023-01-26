import java.util.ArrayList;
import java.util.Map;

// works but too long
public class Solution {
    public static void main(String[] args) {
        SolutionX solution = new SolutionX();
//        int n = 4;
//        int[][] flights = {{0,1,100},{1,2,100},{2,0,100},{2,3,200}};
//        int src = 0, dst = 3, k = 1;


        int[][] flights = {{3,4,4},{2,5,6},{4,7,10},{9,6,5},{7,4,4},{6,2,10},{6,8,6},{7,9,4},{1,5,4},{1,0,4},{9,7,3},{7,0,5},{6,5,8},{1,7,6},{4,0,9},{5,9,1},{8,7,3},{1,2,6},{4,1,5},{5,2,4},{1,9,1},{7,8,10},{0,4,2},{7,2,8}};
        int n = 10, src = 6, dst = 0, k = 7;
        int res = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            res = solution.findCheapestPrice(n, flights, src, dst, k);
        }
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));
    }

    private int maxStops;
    private int destinationCity;
    private int globalMinCost = Integer.MAX_VALUE;

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        maxStops = k;
        destinationCity = dst;
        int flightCost = flight(flights, src, 0, new ArrayList<>(), 0);
        return  flightCost  == Integer.MAX_VALUE ? -1 : flightCost;
    }

    private int flight(int[][] flights, int from, int stopsDone, ArrayList<Integer> visitedCities, int cost) {
        if (from == destinationCity) return cost;
        if (cost > globalMinCost) return Integer.MAX_VALUE;
        if (stopsDone > maxStops) return Integer.MAX_VALUE;
        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < flights.length; i++) {
            if (flights[i][0] == from && !visitedCities.contains(flights[i][1])){
//                System.out.println("from "+ from + " to " + flights[i][1] + " done");
                visitedCities.add(from);
                int costToDest = flight(flights, flights[i][1], stopsDone+1, new ArrayList<>(visitedCities), cost+flights[i][2]);
                minCost = Math.min(minCost, costToDest);
            }
        }
        globalMinCost = minCost;
        return minCost;
    }

}