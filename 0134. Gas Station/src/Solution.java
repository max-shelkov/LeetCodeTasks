import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int res = -5;
        int[] inputGas = {1,2,3,4,5};
        int[] inputCost = {3,4,5,1,2};
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++)
            res = solution.canCompleteCircuit(inputGas, inputCost);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));

    }

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        int total = 0;
        int j = -1;
        for(int i = 0; i < gas.length ; ++i){
            sum += gas[i]-cost[i];
            total += gas[i]-cost[i];
            if(sum < 0){
                j=i; sum = 0;
            }
        }
        return total>=0 ? j+1 : -1;
    }

}
