public class Solution1 {

    public double champagneTower(int poured, int query_row, int query_glass) {

        double[][] cups = new double[query_row+1][];
        for (int row = 0; row <= query_row; row++){
            cups[row] = new double[row+1];
        }

        cups[0][0] = poured;
        for (int i = 0; i < query_row; i++){
            for (int j = 0; j <= i; j++){
                if (cups[i][j] > 1){
                    double overfill = (cups[i][j] - 1.0);
                    cups[i + 1][j] += overfill/2;
                    cups[i + 1][j + 1] += overfill/2;
                }
            }
        }

        return (cups[query_row][query_glass] >= 1)? 1 : cups[query_row][query_glass];
    }


}
