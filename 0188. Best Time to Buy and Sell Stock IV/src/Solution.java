import java.util.Arrays;
import java.util.Collections;

public class Solution {
    //done
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] input = {3,2,6,5,0,3};
        int k = 2;
        long start = System.currentTimeMillis();
        int res = solution.maxProfit(k, input);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));
    }

    public int maxProfit(int k, int[] prices) {
        if (prices == null || prices.length == 0 || k == 0) return 0;
        int res = 0;
        if ( k>= prices.length / 2){ // if number of deals is not actually limited
            for (int i = 1; i < prices.length; ++i) {
                res += Math.max(0, prices[i] - prices[i - 1]);
            }
        } else { // if number of deals is limited
            int[] buy = new int[k+1];
            Integer[] sell = new Integer[k+1];
            Arrays.fill(buy, Integer.MIN_VALUE / 2);
            Arrays.fill(sell, Integer.MIN_VALUE / 2);
            buy[0] =0;
            sell[0] =0;
            for (int price : prices) {
                int[] buyTmp = buy.clone();
                Integer[] sellTmp = sell.clone();
                for (int j = 1; j <= k; j++) {
                    buy[j] = Math.max(buyTmp[j], sellTmp[j - 1] - price);
                    sell[j] = Math.max(sellTmp[j], buyTmp[j] + price);
                }
            }
            Arrays.sort(sell, Collections.reverseOrder());
            res = sell[0];
        }
        return res;
    }

}
