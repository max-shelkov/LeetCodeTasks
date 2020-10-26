public class Solution {

    //too long time

    public static void main(String[] args) {

        Solution1 solution = new Solution1();
        int inputPoured = 100;
        int inputRow = 7;
        int inputGlass = 4;
//        int inputPoured = 2;
//        int inputRow = 1;
//        int inputGlass = 1;
        long start = System.currentTimeMillis();
        double res = solution.champagneTower(inputPoured,inputRow,inputGlass);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));

    }

    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] cups = new double[query_row+1][];

        for (int row = 0; row <= query_row; row++){
            cups[row] = new double[row+1];
        }

        for (int cup = 1; cup <= poured; cup++){
            pour(cups, 0,0, 1);
        }


        return cups[query_row][query_glass];
    }

    private void pour(double[][] cups, int row, int cup, double amount){
        if (row >= cups.length) return;
        cups[row][cup] += amount;
        if (cups[row][cup]>1) {
            double overfill = cups[row][cup] - 1;
            cups[row][cup] = 1;
            pour(cups, row+1, cup, overfill/2);
            pour(cups, row+1, cup+1, overfill/2);
        }
    }



}
