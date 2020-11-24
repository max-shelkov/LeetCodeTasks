import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
//        String input = "3+2 * 2";
//        String input = "1-1+1";
//        String input = "14/3*2";
        String input = "1*2+3*4-5*6+7*8-9*10";
//        String input = "";
        Solution1 solution = new Solution1();
        long start = System.currentTimeMillis();
        int res = solution.calculate(input);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));
    }


}
