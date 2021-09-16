import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] input1 = {
                            {1,2,3},
                            {4,5,6},
                            {7,8,9}};


        int[][] input2 = {  {1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12}};

        long start = System.currentTimeMillis();
        List<Integer> res = solution.spiralOrder(input1);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> spiral = new ArrayList<>();
        if (matrix == null) return spiral;
        while (matrix!=null) {
            spiral.addAll(getFirstRow(matrix));
            spiral.addAll(getLastColumn(matrix));
            spiral.addAll(getLastRow(matrix));
            spiral.addAll(getFirstColumn(matrix));
            matrix = reduceMatrix(matrix);
        }
//        System.out.println("spiral = " + spiral);
        return spiral;
    }

    private ArrayList<Integer> getFirstRow(int[][] matrix){
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] != 101 )res.add(matrix[0][i]);
            matrix[0][i] = 101;
        }
//        System.out.println("first row = " + res);
        return res;
    }

    private ArrayList<Integer> getLastColumn(int[][] matrix){
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][matrix[0].length-1] != 101) res.add(matrix[i][matrix[0].length-1]);
            matrix[i][matrix[0].length-1] = 101;
        }
//        System.out.println("last column = " + res);
        return res;
    }

    private ArrayList<Integer> getLastRow(int[][] matrix){
        int rowsCount = matrix.length;
        int columnsCount = matrix[0].length;
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = columnsCount-2; i >= 0; i--) {
            if (matrix[rowsCount-1][i] != 101) res.add(matrix[rowsCount-1][i]);
            matrix[rowsCount-1][i] = 101;
        }
//        System.out.println("last row = " + res);
        return res;
    }

    private ArrayList<Integer> getFirstColumn(int[][] matrix){
        int rowsCount = matrix.length;
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = rowsCount-2; i >= 1 ; i--) {
            if (matrix[i][0] != 101) res.add(matrix[i][0]);
            matrix[i][0] = 101;
        }
//        System.out.println("first column = " + res);
        return res;
    }

    private int[][] reduceMatrix(int[][] matrix){
        if (matrix.length-2 <= 0 || matrix[0].length-2<=0) return null;
        int[][] res = new int[matrix.length-2][matrix[0].length-2];
        for (int i = 1; i < matrix.length - 1; i++) {
            res[i-1] = Arrays.copyOfRange(matrix[i], 1, matrix[i].length-1);
        }
        return res;
    }
}
