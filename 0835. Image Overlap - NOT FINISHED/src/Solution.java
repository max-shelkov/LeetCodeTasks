import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int res = -1;

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1; i++)
            res = solution.largestOverlap(Input.A3, Input.B3);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));
    }

    public int largestOverlap(int[][] img1, int[][] img2) {
        int res = 0;
        System.out.println("original img1");
        printMatrix(img1);
        System.out.println("original img2");
        printMatrix(img2);

        ArrayList<Integer> sums = new ArrayList<>();
        int size = img1.length;
//        sums.add(compareMatrices(img1, img2));
        int[][] m1 = duplicateMatrix(img1);
        int[][] m2 = duplicateMatrix(img2);
        for (int shiftUp=0; shiftUp<size; shiftUp++){
            if (shiftUp>0) {
                m1 = translateUp(m1);
                sums.add(compareMatrices(m1, img2));
                m2 = translateUp(m2);
                sums.add(compareMatrices(m2, img1));
            } else {
                sums.add(compareMatrices(m1, img2));
                sums.add(compareMatrices(m2, img1));
            }
                int[][] m11 = duplicateMatrix(m1);
                int[][] m22 = duplicateMatrix(m2);

            for (int shiftRight=0;  shiftRight<size; shiftRight++){
                 if (shiftRight>0){
                     m11 = translateRight(m11);
                     sums.add(compareMatrices(m11, m2));
                     m22 = translateRight(m22);
                     sums.add(compareMatrices(m22, m1));
                 } else {
                     sums.add(compareMatrices(m11, m2));
                     sums.add(compareMatrices(m22, m1));
                 }

            }
        }


        System.out.println(sums);
        return res;
    }


    private int[][] duplicateMatrix(int[][] matrix){
        int size = matrix.length;
        int[][] res = new int[size][size];
        for (int n=0; n<size; n++){
            for (int m=0; m<size; m++){
                res[m][n] = matrix[m][n];
            }
        }
        return res;
    }

    private int[][] translateUp(int[][] matrixInput){
        int[][] matrix = duplicateMatrix(matrixInput);
        System.out.println("up");
        int[] tmp = matrix[0];
        for (int y = 0; y < matrix.length; y++){
            if (y == matrix.length-1){
                matrix[y] = tmp;
            } else {
                matrix[y] = matrix[y+1];
            }
        }
        Arrays.fill(matrix[2], 0);
        return matrix;
    }

    private int[][] translateDown(int[][] matrixInput){
        int[][] matrix = duplicateMatrix(matrixInput);
        System.out.println("down");
        int[] tmp = matrix[matrix.length-1];
        for (int y = matrix.length-1; y >=0; y--){
            if (y == 0) {
                matrix[y] = tmp;
            } else {
                matrix[y] = matrix[y-1];
            }
        }
        Arrays.fill(matrix[0], 0);
        return matrix;
    }

    private int[][] translateLeft(int[][] matrixInput){
        int[][] matrix = duplicateMatrix(matrixInput);
        System.out.println("left");
        for (int y = 0; y < matrix.length; y++){
            int tmp = -1;
            for (int x = 0; x < matrix[y].length; x++){
                if (x == 0) tmp = matrix[y][x];
                if (x == matrix[y].length-1){
                    matrix[y][x] = tmp;
                } else {
                    matrix[y][x] = matrix[y][x+1];
                }
            }
        }
        for (int y=0; y<matrix.length; y++){
            matrix[y][matrix[y].length-1] = 0;
        }
        return matrix;
    }
    private int[][] translateRight(int[][] matrixInput){
        int[][] matrix = duplicateMatrix(matrixInput);
        System.out.println("right");
        for (int y = 0; y < matrix.length; y++){
            int tmp = -1;
            for (int x = matrix[y].length-1; x >=0; x--){
                if (x == matrix[y].length-1) tmp = matrix[y][x];
                if (x == 0){
                    matrix[y][x] = 0;
                } else {
                    matrix[y][x] = matrix[y][x-1];
                }
            }
        }
        for (int y=0; y<matrix.length; y++){
            matrix[y][0] = 0;
        }
        return matrix;
    }

    private int compareMatrices(int[][] m1, int[][] m2){
        int res = 0;
        for (int y = 0; y < m1.length; y++){
            for (int x = 0; x < m1[y].length; x++) {
                if (m1[y][x]==1 && m2[y][x]==1) res ++;
            }
        }
        return res;
    }

    private void printMatrix(int[][] m){
        for (int y = 0; y < m.length; y++){
            for (int x = 0; x < m[y].length; x++){
                System.out.print(" " + m[y][x] + " ");
            }
            System.out.println();
        }
    }


}
